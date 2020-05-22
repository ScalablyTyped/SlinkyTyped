package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var description: Type
  var files: Type
  @JSName("files.content")
  var filesDotcontent: Type
  @JSName("files.filename")
  var filesDotfilename: Type
  var gist_id: Required
}

object Files {
  @scala.inline
  def apply(description: Type, files: Type, filesDotcontent: Type, filesDotfilename: Type, gist_id: Required): Files = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.updateDynamic("files.content")(filesDotcontent.asInstanceOf[js.Any])
    __obj.updateDynamic("files.filename")(filesDotfilename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

