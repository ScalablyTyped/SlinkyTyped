package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.asn1.Asn1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.certificateFromAsn1")
@js.native
object certificateFromAsn1 extends js.Object {
  
  def apply(obj: Asn1): Certificate = js.native
  def apply(obj: Asn1, computeHash: Boolean): Certificate = js.native
}
