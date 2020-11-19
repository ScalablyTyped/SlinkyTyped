package typingsSlinky.qrImage.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qr-image", "imageSync")
@js.native
object imageSync extends js.Object {
  
  def apply(text: String): String | Buffer = js.native
  def apply(text: String, level: ecLevel): Buffer = js.native
  def apply(text: String, options: Options): String | Buffer = js.native
}
