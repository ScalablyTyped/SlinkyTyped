package typingsSlinky.ecdsaSigFormatter

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecdsa-sig-formatter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def derToJose(signature: String, alg: String): String = js.native
  def derToJose(signature: Buffer, alg: String): String = js.native
  
  def joseToDer(signature: String, alg: String): Buffer = js.native
  def joseToDer(signature: Buffer, alg: String): Buffer = js.native
}
