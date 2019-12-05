package typingsSlinky.atJimpPng

import typingsSlinky.atJimpCore.typesEtcMod.Bitmap
import typingsSlinky.atJimpCore.typesEtcMod.DecoderFn
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagepngDecoderFn extends js.Object {
  @JSName("image/png")
  var `image/png_Original`: DecoderFn = js.native
  def `image/png`(data: Buffer): Bitmap = js.native
}

