package typingsSlinky.formsyReact

import slinky.core.ReactComponentClass
import typingsSlinky.formsyReact.anon.Disabled
import typingsSlinky.formsyReact.anon.PartialFormsyProps
import typingsSlinky.formsyReact.formsyMod.Formsy
import typingsSlinky.formsyReact.formsyMod.FormsyProps
import typingsSlinky.formsyReact.formsyReactStrings.errorMessage
import typingsSlinky.formsyReact.formsyReactStrings.errorMessages
import typingsSlinky.formsyReact.formsyReactStrings.hasValue
import typingsSlinky.formsyReact.formsyReactStrings.isFormDisabled
import typingsSlinky.formsyReact.formsyReactStrings.isFormSubmitted
import typingsSlinky.formsyReact.formsyReactStrings.isPristine
import typingsSlinky.formsyReact.formsyReactStrings.isRequired
import typingsSlinky.formsyReact.formsyReactStrings.isValid
import typingsSlinky.formsyReact.formsyReactStrings.isValidValue
import typingsSlinky.formsyReact.formsyReactStrings.ref
import typingsSlinky.formsyReact.formsyReactStrings.resetValue
import typingsSlinky.formsyReact.formsyReactStrings.setValidations
import typingsSlinky.formsyReact.formsyReactStrings.setValue
import typingsSlinky.formsyReact.formsyReactStrings.showError
import typingsSlinky.formsyReact.formsyReactStrings.showRequired
import typingsSlinky.formsyReact.interfacesMod.ValidationFunction
import typingsSlinky.formsyReact.validationRulesMod.Validations
import typingsSlinky.formsyReact.withFormsyMod.PassDownProps
import typingsSlinky.formsyReact.withFormsyMod.WrapperProps
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formsy-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = js.native
  
  val validationRules: Validations[js.Any] = js.native
  
  def withFormsy[T, V](WrappedComponent: ReactComponentClass[T with PassDownProps[V]]): ReactComponentClass[
    Omit[
      T with WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = js.native
  
  @js.native
  class default protected () extends Formsy {
    def this(props: FormsyProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: PartialFormsyProps = js.native
    
    var displayName: String = js.native
    
    var propTypes: Disabled = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    var innerRef: Requireable[js.Function1[/* repeated */ _, _]] = js.native
    
    var name: Validator[String] = js.native
    
    var required: Requireable[String | Boolean | js.Object] = js.native
    
    var validations: Requireable[String | js.Object] = js.native
    
    var value: Requireable[_] = js.native
  }
}
