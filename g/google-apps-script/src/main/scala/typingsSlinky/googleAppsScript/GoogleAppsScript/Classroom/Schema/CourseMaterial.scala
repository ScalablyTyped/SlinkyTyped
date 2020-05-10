package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CourseMaterial extends js.Object {
  var driveFile: js.UndefOr[DriveFile] = js.native
  var form: js.UndefOr[Form] = js.native
  var link: js.UndefOr[Link] = js.native
  var youTubeVideo: js.UndefOr[YouTubeVideo] = js.native
}

object CourseMaterial {
  @scala.inline
  def apply(): CourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseMaterial]
  }
  @scala.inline
  implicit class CourseMaterialOps[Self <: CourseMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveFile(value: DriveFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFile")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: Form): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withYouTubeVideo(value: YouTubeVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youTubeVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYouTubeVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youTubeVideo")(js.undefined)
        ret
    }
  }
  
}

