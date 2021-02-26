package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLegendMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Forms/FormLegend", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormLegendProps] = js.native
  
  @js.native
  trait FormLegendProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
  }
  object FormLegendProps {
    
    @scala.inline
    def apply(): FormLegendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormLegendProps]
    }
    
    @scala.inline
    implicit class FormLegendPropsMutableBuilder[Self <: FormLegendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormLegendProps]
  
  /* This means you don't have to write `default`, but can instead just say `formLegendMod.foo` */
  override def _to: ReactComponentClass[FormLegendProps] = default
}
