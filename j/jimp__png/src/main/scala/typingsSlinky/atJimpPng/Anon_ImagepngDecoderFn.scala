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
  var imageSlashpng_Original: DecoderFn = js.native
  @JSName("image/png")
  def imageSlashpng(data: Buffer): Bitmap = js.native
}

