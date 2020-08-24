package typingsSlinky.formsyReact.withFormsyMod

import typingsSlinky.formsyReact.interfacesMod.RequiredValidation
import typingsSlinky.formsyReact.interfacesMod.ValidationError
import typingsSlinky.formsyReact.interfacesMod.Validations
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedProps[V] extends js.Object {
  var errorMessage: ValidationError = js.native
  var errorMessages: js.Array[ValidationError] = js.native
  var hasValue: Boolean = js.native
  var isFormDisabled: Boolean = js.native
  var isFormSubmitted: Boolean = js.native
  var isPristine: Boolean = js.native
  var isRequired: Boolean = js.native
  var isValid: Boolean = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var showError: Boolean = js.native
  var showRequired: Boolean = js.native
  def isValidValue(value: V): Boolean = js.native
  def resetValue(): Unit = js.native
  def setValidations(validations: Validations[V], required: RequiredValidation[V]): Unit = js.native
  def setValue(value: V): Unit = js.native
  def setValue(value: V, validate: Boolean): Unit = js.native
}

