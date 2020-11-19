package typingsSlinky.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.certificateFromPem")
@js.native
object certificateFromPem extends js.Object {
  
  def apply(pem: PEM): Certificate = js.native
  def apply(pem: PEM, computeHash: js.UndefOr[scala.Nothing], strict: Boolean): Certificate = js.native
  def apply(pem: PEM, computeHash: Boolean): Certificate = js.native
  def apply(pem: PEM, computeHash: Boolean, strict: Boolean): Certificate = js.native
}
