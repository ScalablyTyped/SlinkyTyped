package typingsSlinky.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var image: js.typedarray.Uint8Array
  var mimType: String
}

object Image {
  @scala.inline
  def apply(image: js.typedarray.Uint8Array, mimType: String): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mimType = mimType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

