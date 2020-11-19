package typingsSlinky.azureSb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-sb", "createWrapService")
@js.native
object createWrapService extends js.Object {
  
  def apply(acsHost: String): WrapService = js.native
  def apply(acsHost: String, issuer: js.UndefOr[scala.Nothing], accessKey: String): WrapService = js.native
  def apply(acsHost: String, issuer: String): WrapService = js.native
  def apply(acsHost: String, issuer: String, accessKey: String): WrapService = js.native
}
