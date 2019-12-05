package typingsSlinky.atJimpGif

import typingsSlinky.atJimpCore.typesEtcMod.Bitmap
import typingsSlinky.atJimpCore.typesEtcMod.DecoderFn
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagegifDecoderFn extends js.Object {
  @JSName("image/gif")
  var `image/gif_Original`: DecoderFn = js.native
  def `image/gif`(data: Buffer): Bitmap = js.native
}

