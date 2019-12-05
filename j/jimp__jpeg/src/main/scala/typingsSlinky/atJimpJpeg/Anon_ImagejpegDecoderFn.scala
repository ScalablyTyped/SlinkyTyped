package typingsSlinky.atJimpJpeg

import typingsSlinky.atJimpCore.typesEtcMod.Bitmap
import typingsSlinky.atJimpCore.typesEtcMod.DecoderFn
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagejpegDecoderFn extends js.Object {
  @JSName("image/jpeg")
  var `image/jpeg_Original`: DecoderFn = js.native
  def `image/jpeg`(data: Buffer): Bitmap = js.native
}

