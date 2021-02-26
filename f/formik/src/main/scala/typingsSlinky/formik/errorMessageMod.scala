package typingsSlinky.formik

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMessageMod {
  
  @JSImport("formik/dist/ErrorMessage", "ErrorMessage")
  @js.native
  val ErrorMessage: ReactComponentClass[ErrorMessageProps] = js.native
  
  @js.native
  trait ErrorMessageProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* errorMessage */ String, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[String | ReactComponentClass[js.Object]] = js.native
    
    var name: String = js.native
    
    var render: js.UndefOr[js.Function1[/* errorMessage */ String, ReactElement]] = js.native
  }
  object ErrorMessageProps {
    
    @scala.inline
    def apply(name: String): ErrorMessageProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessageProps]
    }
    
    @scala.inline
    implicit class ErrorMessagePropsMutableBuilder[Self <: ErrorMessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* errorMessage */ String => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: String | ReactComponentClass[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: /* errorMessage */ String => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
