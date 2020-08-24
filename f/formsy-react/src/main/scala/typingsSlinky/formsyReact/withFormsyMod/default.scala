package typingsSlinky.formsyReact.withFormsyMod

import slinky.core.ReactComponentClass
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
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react/dist/withFormsy", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T, V](WrappedComponent: ReactComponentClass[T with PassDownProps[V]]): ReactComponentClass[
    Omit[
      T with WrapperProps[V], 
      /* keyof formsy-react.formsy-react/dist/withFormsy.InjectedProps<V> */ errorMessage | errorMessages | hasValue | isFormDisabled | isFormSubmitted | isPristine | isRequired | isValid | isValidValue | ref | resetValue | setValidations | setValue | showError | showRequired
    ]
  ] = js.native
}

