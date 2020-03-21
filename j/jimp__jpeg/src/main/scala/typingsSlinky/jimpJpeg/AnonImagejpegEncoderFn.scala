package typingsSlinky.jimpJpeg

import typingsSlinky.jimpCore.etcMod.EncoderFn
import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagejpegEncoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: EncoderFn[Image] = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(image: Image): Buffer = js.native
}

