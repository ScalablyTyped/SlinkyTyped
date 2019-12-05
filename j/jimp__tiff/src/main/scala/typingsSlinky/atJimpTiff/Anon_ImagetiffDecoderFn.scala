package typingsSlinky.atJimpTiff

import typingsSlinky.atJimpCore.typesEtcMod.Bitmap
import typingsSlinky.atJimpCore.typesEtcMod.DecoderFn
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagetiffDecoderFn extends js.Object {
  @JSName("image/tiff")
  var `image/tiff_Original`: DecoderFn = js.native
  def `image/tiff`(data: Buffer): Bitmap = js.native
}

