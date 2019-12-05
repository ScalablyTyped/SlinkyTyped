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
  var `image/png_Original`: EncoderFn[Image] = js.native
  def `image/png`(image: Image): Buffer = js.native
}

