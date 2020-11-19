package typingsSlinky.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.privateKeyToPem")
@js.native
object privateKeyToPem extends js.Object {
  
  def apply(key: PrivateKey): PEM = js.native
  def apply(key: PrivateKey, maxline: Double): PEM = js.native
}
