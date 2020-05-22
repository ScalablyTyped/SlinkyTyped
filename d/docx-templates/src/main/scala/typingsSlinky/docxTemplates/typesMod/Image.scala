package typingsSlinky.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var data: js.typedarray.ArrayBuffer | String
  var extension: String
}

object Image {
  @scala.inline
  def apply(data: js.typedarray.ArrayBuffer | String, extension: String): Image = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

