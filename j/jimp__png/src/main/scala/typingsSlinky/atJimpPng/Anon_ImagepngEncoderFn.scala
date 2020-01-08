package typingsSlinky.atJimpPng

import typingsSlinky.atJimpCore.typesEtcMod.EncoderFn
import typingsSlinky.atJimpCore.typesEtcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagepngEncoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: EncoderFn[Image] = js.native
  @JSName("image/png")
  def imageSlashpng(image: Image): Buffer = js.native
}

