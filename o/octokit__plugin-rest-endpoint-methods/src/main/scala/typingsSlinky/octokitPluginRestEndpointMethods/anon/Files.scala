package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files extends js.Object {
  var description: Type = js.native
  var files: Type = js.native
  @JSName("files.content")
  var filesDotcontent: Type = js.native
  @JSName("files.filename")
  var filesDotfilename: Type = js.native
  var gist_id: Required = js.native
}

object Files {
  @scala.inline
  def apply(description: Type, files: Type, filesDotcontent: Type, filesDotfilename: Type, gist_id: Required): Files = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.updateDynamic("files.content")(filesDotcontent.asInstanceOf[js.Any])
    __obj.updateDynamic("files.filename")(filesDotfilename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesDotcontent(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files.content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesDotfilename(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files.filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGist_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gist_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

