package typingsSlinky.jimpTiff.anon

import typingsSlinky.jimpCore.etcMod.EncoderFn
import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagetiffEncoderFn extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff_Original: EncoderFn[Image] = js.native
  @JSName("image/tiff")
  def imageSlashtiff(image: Image): Buffer = js.native
}

