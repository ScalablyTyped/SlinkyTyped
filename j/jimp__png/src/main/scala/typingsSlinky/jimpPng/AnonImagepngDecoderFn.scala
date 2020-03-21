package typingsSlinky.jimpPng

import typingsSlinky.jimpCore.etcMod.Bitmap
import typingsSlinky.jimpCore.etcMod.DecoderFn
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagepngDecoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: DecoderFn = js.native
  @JSName("image/png")
  def imageSlashpng(data: Buffer): Bitmap = js.native
}

