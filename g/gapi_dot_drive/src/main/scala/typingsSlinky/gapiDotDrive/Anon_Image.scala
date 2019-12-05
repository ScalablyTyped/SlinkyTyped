package typingsSlinky.gapiDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: scala.scalajs.js.typedarray.Uint8Array
  var mimType: String
}

object Anon_Image {
  @scala.inline
  def apply(image: scala.scalajs.js.typedarray.Uint8Array, mimType: String): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mimType = mimType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Image]
  }
}

