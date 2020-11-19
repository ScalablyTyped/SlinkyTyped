package typingsSlinky.reactMdPortal

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/portal/types/getContainer", JSImport.Namespace)
@js.native
object getContainerMod extends js.Object {
  
  def default(): HTMLElement | Null = js.native
  def default(into: js.UndefOr[PortalInto], intoId: String): HTMLElement | Null = js.native
  def default(into: PortalInto): HTMLElement | Null = js.native
  
  type PortalInto = (js.Function0[HTMLElement | Null]) | HTMLElement | String | Null
}
