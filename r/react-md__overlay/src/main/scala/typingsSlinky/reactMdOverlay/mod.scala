package typingsSlinky.reactMdOverlay

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdOverlay.overlayMod.OverlayProps
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/overlay", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_OVERLAY_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val DEFAULT_OVERLAY_TIMEOUT: TransitionTimeout = js.native
  
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
