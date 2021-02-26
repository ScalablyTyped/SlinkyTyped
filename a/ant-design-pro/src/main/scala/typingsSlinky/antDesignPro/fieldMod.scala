package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @JSImport("ant-design-pro/lib/Charts/Field", JSImport.Default)
  @js.native
  class default ()
    extends Component[IFieldProps, js.Any, js.Any]
  
  type Field = ReactComponentClass[IFieldProps]
  
  @js.native
  trait IFieldProps extends StObject {
    
    var label: ReactElement = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: ReactElement = js.native
  }
  object IFieldProps {
    
    @scala.inline
    def apply(): IFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFieldProps]
    }
    
    @scala.inline
    implicit class IFieldPropsMutableBuilder[Self <: IFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: ReactElement): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
