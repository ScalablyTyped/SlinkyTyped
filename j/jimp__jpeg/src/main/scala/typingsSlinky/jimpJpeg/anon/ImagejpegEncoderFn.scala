package typingsSlinky.jimpJpeg.anon

import typingsSlinky.jimpCore.etcMod.EncoderFn
import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagejpegEncoderFn extends js.Object {
  
  @JSName("image/jpeg")
  def imageSlashjpeg(image: Image): Buffer = js.native
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: EncoderFn[Image] = js.native
}
