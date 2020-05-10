package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Project specific details about the content of a YouTube Video.
  */
@js.native
trait SchemaVideoProjectDetails extends js.Object {
  /**
    * A list of project tags associated with the video during the upload.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVideoProjectDetails {
  @scala.inline
  def apply(): SchemaVideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProjectDetails]
  }
  @scala.inline
  implicit class SchemaVideoProjectDetailsOps[Self <: SchemaVideoProjectDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

