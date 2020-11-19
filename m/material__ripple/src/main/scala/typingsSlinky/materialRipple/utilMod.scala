package typingsSlinky.materialRipple

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.materialRipple.typesMod.MDCRipplePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/ripple/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def getNormalizedEventCoords(evt: js.UndefOr[scala.Nothing], pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
  def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
  
  def supportsCssVariables(windowObj: Window): Boolean = js.native
  def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): Boolean = js.native
}
