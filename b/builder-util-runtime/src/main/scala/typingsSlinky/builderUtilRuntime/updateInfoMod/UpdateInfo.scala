package typingsSlinky.builderUtilRuntime.updateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfo extends js.Object {
  val files: js.Array[UpdateFileInfo] = js.native
  /** @deprecated */
  val path: String = js.native
  /**
    * The release date.
    */
  var releaseDate: String = js.native
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[String | Null] = js.native
  /**
    * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
    */
  var releaseNotes: js.UndefOr[String | js.Array[ReleaseNoteInfo] | Null] = js.native
  /** @deprecated */
  val sha512: String = js.native
  /**
    * The [staged rollout](/auto-update#staged-rollouts) percentage, 0-100.
    */
  val stagingPercentage: js.UndefOr[Double] = js.native
  /**
    * The version.
    */
  val version: String = js.native
}

object UpdateInfo {
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: String,
    releaseDate: String,
    sha512: String,
    version: String
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
  @scala.inline
  implicit class UpdateInfoOps[Self <: UpdateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[UpdateFileInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
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
    def withReleaseNotes(value: String | js.Array[ReleaseNoteInfo]): Self = {
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
    def withStagingPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagingPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagingPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagingPercentage")(js.undefined)
        ret
    }
  }
  
}

