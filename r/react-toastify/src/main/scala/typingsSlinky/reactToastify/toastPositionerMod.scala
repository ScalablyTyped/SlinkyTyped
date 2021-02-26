package typingsSlinky.reactToastify

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastPositionerMod {
  
  @JSImport("react-toastify/dist/components/ToastPositioner", "ToastPositioner")
  @js.native
  val ToastPositioner: ReactComponentClass[ToastPositionerProps] = js.native
  
  /* Inlined std.Pick<react-toastify.react-toastify/dist/types.ToastProps, 'style' | 'in'> & {  className :string | undefined} */
  @js.native
  trait ToastPositionerProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var in: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ToastPositionerProps {
    
    @scala.inline
    def apply(): ToastPositionerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastPositionerProps]
    }
    
    @scala.inline
    implicit class ToastPositionerPropsMutableBuilder[Self <: ToastPositionerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
