package typingsSlinky.pem.mod

import typingsSlinky.pem.anon.Modulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "getModulus")
@js.native
object getModulus extends js.Object {
  
  def apply(certificate: String, callback: Callback[Modulus]): Unit = js.native
  def apply(certificate: String, password: String, callback: Callback[Modulus]): Unit = js.native
}
