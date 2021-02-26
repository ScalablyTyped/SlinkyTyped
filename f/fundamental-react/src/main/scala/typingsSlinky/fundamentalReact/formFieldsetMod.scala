package typingsSlinky.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldsetMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Forms/FormFieldset", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormFieldsetProps] = js.native
  
  @js.native
  trait FormFieldsetProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
  }
  object FormFieldsetProps {
    
    @scala.inline
    def apply(): FormFieldsetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldsetProps]
    }
    
    @scala.inline
    implicit class FormFieldsetPropsMutableBuilder[Self <: FormFieldsetProps] (val x: Self) extends AnyVal {
      
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
  
  type _To = ReactComponentClass[FormFieldsetProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldsetMod.foo` */
  override def _to: ReactComponentClass[FormFieldsetProps] = default
}
