package typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseInfo extends js.Object {
  /**
    * The release date.
    */
  var releaseDate: js.UndefOr[String] = js.native
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[String | Null] = js.native
  /**
    * The release notes.
    */
  var releaseNotes: js.UndefOr[String | Null] = js.native
  /**
    * The path to release notes file. Defaults to `release-notes-${platform}.md` (where `platform` it is current platform — `mac`, `linux` or `windows`) or `release-notes.md` in the [build resources](#MetadataDirectories-buildResources).
    */
  var releaseNotesFile: js.UndefOr[String | Null] = js.native
}

object ReleaseInfo {
  @scala.inline
  def apply(): ReleaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseInfo]
  }
  @scala.inline
  implicit class ReleaseInfoOps[Self <: ReleaseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseName")(null)
        ret
    }
    @scala.inline
    def withReleaseNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseNotesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotes")(null)
        ret
    }
    @scala.inline
    def withReleaseNotesFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotesFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseNotesFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotesFile")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseNotesFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotesFile")(null)
        ret
    }
  }
  
}

