package typingsSlinky.reactMdOverlay

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typingsSlinky.reactMdTransition.typesMod.OverridableCSSTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("@react-md/overlay/types/Overlay", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait OverlayProps
    extends HTMLAttributes[HTMLSpanElement]
       with OverridableCSSTransitionProps
       with RenderConditionalPortalProps {
    
    /**
      * Boolean if the overlay should gain the pointer cursor while it's visible.
      * You normally want this enabled by default except when used as a modal's
      * overlay.
      */
    var clickable: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that should change the `visible` prop to `false`. This is used
      * so that clicking the overlay can hide the overlay.
      */
    def onRequestClose(): Unit = js.native
    
    /**
      * Boolean if the overlay is currently visible. When this prop changes, the
      * overlay will enter/exit with an opacity transition.
      */
    var visible: Boolean = js.native
  }
  object OverlayProps {
    
    @scala.inline
    def apply(onRequestClose: () => Unit, visible: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
