package typingsSlinky.digibyte.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("digibyte", "PublicKey")
@js.native
class PublicKey protected () extends js.Object {
  def this(source: String) = this()
  
  def toBuffer(): Buffer = js.native
  
  def toDER(): Buffer = js.native
}
/* static members */
@JSImport("digibyte", "PublicKey")
@js.native
object PublicKey extends js.Object {
  
  def fromPrivateKey(privateKey: PrivateKey): PublicKey = js.native
}
