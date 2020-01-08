package typingsSlinky.atJimpJpeg

import typingsSlinky.atJimpCore.typesEtcMod.EncoderFn
import typingsSlinky.atJimpCore.typesEtcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagejpegEncoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: EncoderFn[Image] = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(image: Image): Buffer = js.native
}

