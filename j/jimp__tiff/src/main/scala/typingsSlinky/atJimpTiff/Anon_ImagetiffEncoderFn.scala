package typingsSlinky.atJimpTiff

import typingsSlinky.atJimpCore.typesEtcMod.EncoderFn
import typingsSlinky.atJimpCore.typesEtcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagetiffEncoderFn extends js.Object {
  @JSName("image/tiff")
  var `image/tiff_Original`: EncoderFn[Image] = js.native
  def `image/tiff`(image: Image): Buffer = js.native
}

