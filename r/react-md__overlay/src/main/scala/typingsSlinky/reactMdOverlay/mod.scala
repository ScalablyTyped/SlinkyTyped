package typingsSlinky.reactMdOverlay

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdOverlay.overlayMod.OverlayProps
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_CLASSNAMES")
  @js.native
  val DEFAULT_OVERLAY_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/overlay", "DEFAULT_OVERLAY_TIMEOUT")
  @js.native
  val DEFAULT_OVERLAY_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/overlay", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
