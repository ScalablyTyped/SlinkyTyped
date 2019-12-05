package typingsSlinky.pem.pemMod

import typingsSlinky.pem.Anon_PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getPublicKey")
@js.native
object getPublicKey extends js.Object {
  def apply(callback: Callback[Anon_PublicKey]): Unit = js.native
  def apply(certificate: String, callback: Callback[Anon_PublicKey]): Unit = js.native
}

