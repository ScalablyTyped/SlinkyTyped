package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: Type
  var files: Required
  @JSName("files.content")
  var filesDotcontent: Type
  var public: Type
}

object Description {
  @scala.inline
  def apply(description: Type, files: Required, filesDotcontent: Type, public: Type): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("files.content")(filesDotcontent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

