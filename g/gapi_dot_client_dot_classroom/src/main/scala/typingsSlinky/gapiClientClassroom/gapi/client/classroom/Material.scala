package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Material extends js.Object {
  /** Google Drive file material. */
  var driveFile: js.UndefOr[SharedDriveFile] = js.native
  /** Google Forms material. */
  var form: js.UndefOr[Form] = js.native
  /**
    * Link material. On creation, this is upgraded to a more appropriate type
    * if possible, and this is reflected in the response.
    */
  var link: js.UndefOr[Link] = js.native
  /** YouTube video material. */
  var youtubeVideo: js.UndefOr[YouTubeVideo] = js.native
}

object Material {
  @scala.inline
  def apply(): Material = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Material]
  }
  @scala.inline
  implicit class MaterialOps[Self <: Material] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveFile(value: SharedDriveFile): Self = {
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
    def withYoutubeVideo(value: YouTubeVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoutubeVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeVideo")(js.undefined)
        ret
    }
  }
  
}

