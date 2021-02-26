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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formsy-react", JSImport.Default)
  @js.native
  class default protected () extends Formsy {
    def this(props: FormsyProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("formsy-react", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react", "default.defaultProps")
    @js.native
    def defaultProps: PartialFormsyProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialFormsyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "default.propTypes")
    @js.native
    def propTypes: Disabled = js.native
    @scala.inline
    def propTypes_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("formsy-react", "addValidationRule")
  @js.native
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = js.native
  
  object propTypes {
    
    @JSImport("formsy-react", "propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formsy-react", "propTypes.innerRef")
    @js.native
    def innerRef: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    @scala.inline
    def innerRef_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.name")
    @js.native
    def name: Validator[String] = js.native
    @scala.inline
    def name_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.required")
    @js.native
    def required: Requireable[String | Boolean | js.Object] = js.native
    @scala.inline
    def required_=(x: Requireable[String | Boolean | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.validations")
    @js.native
    def validations: Requireable[String | js.Object] = js.native
    @scala.inline
    def validations_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validations")(x.asInstanceOf[js.Any])
    
    @JSImport("formsy-react", "propTypes.value")
    @js.native
    def value: Requireable[js.Any] = js.native
    @scala.inline
    def value_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("formsy-react", "validationRules")
  @js.native
  val validationRules: Validations[js.Any] = js.native
  
  @JSImport("formsy-react", "withFormsy")
  @js.native
  def withFormsy[T, V](WrappedComponent: ReactComponentClass[T with PassDownProps[V]]): ReactComponentClass[
    Omit[
      T with WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = js.native
}
