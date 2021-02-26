package typingsSlinky.reactMdAlert

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  @JSImport("@react-md/alert/types/Snackbar", "Snackbar")
  @js.native
  val Snackbar: ForwardRefExoticComponent[SnackbarProps with RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdAlert.reactMdAlertStrings.bottom
    - typingsSlinky.reactMdAlert.reactMdAlertStrings.top
  */
  trait SnackbarPosition extends StObject
  object SnackbarPosition {
    
    @scala.inline
    def bottom: typingsSlinky.reactMdAlert.reactMdAlertStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactMdAlert.reactMdAlertStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.reactMdAlert.reactMdAlertStrings.top = "top".asInstanceOf[typingsSlinky.reactMdAlert.reactMdAlertStrings.top]
  }
  
  @js.native
  trait SnackbarProps
    extends HTMLAttributes[HTMLDivElement]
       with RenderConditionalPortalProps {
    
    /**
      * The id for the snackbar element. This is required for a11y.
      */
    @JSName("id")
    var id_SnackbarProps: String = js.native
    
    /**
      * The position for the snackbar to be fixed within the viewport or a
      * container element.
      */
    var position: js.UndefOr[SnackbarPosition] = js.native
  }
  object SnackbarProps {
    
    @scala.inline
    def apply(id: String): SnackbarProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarProps]
    }
    
    @scala.inline
    implicit class SnackbarPropsMutableBuilder[Self <: SnackbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: SnackbarPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
