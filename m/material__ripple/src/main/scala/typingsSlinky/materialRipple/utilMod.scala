package typingsSlinky.materialRipple

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Event
import typingsSlinky.materialRipple.typesMod.MDCRipplePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/ripple/util", "getNormalizedEventCoords")
  @js.native
  def getNormalizedEventCoords(evt: js.UndefOr[scala.Nothing], pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
  @JSImport("@material/ripple/util", "getNormalizedEventCoords")
  @js.native
  def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
  
  @JSImport("@material/ripple/util", "supportsCssVariables")
  @js.native
  def supportsCssVariables(windowObj: /* globalThis */ js.Any): Boolean = js.native
  @JSImport("@material/ripple/util", "supportsCssVariables")
  @js.native
  def supportsCssVariables(windowObj: /* globalThis */ js.Any, forceRefresh: Boolean): Boolean = js.native
}
