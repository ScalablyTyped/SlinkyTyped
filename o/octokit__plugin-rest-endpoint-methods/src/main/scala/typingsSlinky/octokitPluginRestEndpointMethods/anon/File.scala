package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var data: MapTo
  var file: Alias
  var headers: Required
  @JSName("headers.content-length")
  var `headersDotcontent-length`: Required
  @JSName("headers.content-type")
  var `headersDotcontent-type`: Required
  var label: Type
  var name: Required
  var url: Required
}

object File {
  @scala.inline
  def apply(
    data: MapTo,
    file: Alias,
    headers: Required,
    `headersDotcontent-length`: Required,
    `headersDotcontent-type`: Required,
    label: Type,
    name: Required,
    url: Required
  ): File = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-length")(`headersDotcontent-length`.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-type")(`headersDotcontent-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

