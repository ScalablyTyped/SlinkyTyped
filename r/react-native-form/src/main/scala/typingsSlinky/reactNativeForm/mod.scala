package typingsSlinky.reactNativeForm

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeForm.anon.CallbackProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-form", JSImport.Default)
  @js.native
  class default ()
    extends Component[FormProps, js.Object, js.Any]
  
  type Form = ReactComponentClass[FormProps]
  
  @js.native
  trait FormProps extends ViewProps {
    
    var customFields: js.UndefOr[StringDictionary[CallbackProp]] = js.native
    
    var ref: String = js.native
  }
  object FormProps {
    
    @scala.inline
    def apply(ref: String): FormProps = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormProps]
    }
    
    @scala.inline
    implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomFields(value: StringDictionary[CallbackProp]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
