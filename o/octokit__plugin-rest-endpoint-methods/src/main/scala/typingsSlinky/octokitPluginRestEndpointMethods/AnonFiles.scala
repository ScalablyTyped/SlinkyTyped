package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles extends js.Object {
  var description: AnonType
  var files: AnonType
  @JSName("files.content")
  var filesDotcontent: AnonType
  @JSName("files.filename")
  var filesDotfilename: AnonType
  var gist_id: AnonRequired
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
}

