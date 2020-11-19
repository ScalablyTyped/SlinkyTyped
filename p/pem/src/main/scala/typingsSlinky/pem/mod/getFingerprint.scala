package typingsSlinky.pem.mod

import typingsSlinky.pem.anon.Fingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "getFingerprint")
@js.native
object getFingerprint extends js.Object {
  
  def apply(callback: Callback[Fingerprint]): Unit = js.native
  def apply(certificate: String, callback: Callback[Fingerprint]): Unit = js.native
  def apply(certificate: String, hash: HashFunction, callback: Callback[Fingerprint]): Unit = js.native
}
