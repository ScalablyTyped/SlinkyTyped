package typingsSlinky.antd

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorListMod {
  
  @JSImport("antd/lib/form/ErrorList", JSImport.Default)
  @js.native
  def default(hasErrorsHelpOnDomErrorVisibleChange: ErrorListProps): ReactElement = js.native
  
  @js.native
  trait ErrorListProps extends StObject {
    
    var errors: js.UndefOr[js.Array[ReactElement]] = js.native
    
    /** @private Internal usage. Do not use in your production */
    var help: js.UndefOr[ReactElement] = js.native
    
    /** @private Internal usage. Do not use in your production */
    var onDomErrorVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  }
  object ErrorListProps {
    
    @scala.inline
    def apply(): ErrorListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorListProps]
    }
    
    @scala.inline
    implicit class ErrorListPropsMutableBuilder[Self <: ErrorListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: ReactElement*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpReactElement(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setOnDomErrorVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onDomErrorVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDomErrorVisibleChangeUndefined: Self = StObject.set(x, "onDomErrorVisibleChange", js.undefined)
    }
  }
}
