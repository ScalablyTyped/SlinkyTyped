package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFiles extends js.Object {
  var description: AnonType = js.native
  var files: AnonType = js.native
  @JSName("files.content")
  var filesDotcontent: AnonType = js.native
  @JSName("files.filename")
  var filesDotfilename: AnonType = js.native
  var gist_id: AnonRequired = js.native
}

object AnonFiles {
  @scala.inline
  def apply(
    description: AnonType,
    files: AnonType,
    filesDotcontent: AnonType,
    filesDotfilename: AnonType,
    gist_id: AnonRequired
  ): AnonFiles = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.updateDynamic("files.content")(filesDotcontent.asInstanceOf[js.Any])
    __obj.updateDynamic("files.filename")(filesDotfilename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiles]
  }
  @scala.inline
  implicit class AnonFilesOps[Self <: AnonFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesDotcontent(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files.content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesDotfilename(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files.filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGist_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gist_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

