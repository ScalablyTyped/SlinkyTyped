package typingsSlinky.nextReactDevOverlay

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastToastMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Toast/Toast", "Toast")
  @js.native
  val Toast: ReactComponentClass[ToastProps] = js.native
  
  @js.native
  trait ToastProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
  }
  object ToastProps {
    
    @scala.inline
    def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    @scala.inline
    implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* ev */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
