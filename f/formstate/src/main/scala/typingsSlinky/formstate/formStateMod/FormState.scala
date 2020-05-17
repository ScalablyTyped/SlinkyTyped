package typingsSlinky.formstate.formStateMod

import typingsSlinky.formstate.anon.HasError
import typingsSlinky.formstate.anon.HasErrorValue
import typingsSlinky.formstate.formstateStrings.`object`
import typingsSlinky.formstate.formstateStrings.array
import typingsSlinky.formstate.formstateStrings.map
import typingsSlinky.formstate.typesMod.ComposibleValidatable
import typingsSlinky.formstate.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/formState", "FormState")
@js.native
class FormState[TValue /* <: ValidatableMapOrArray */] protected () extends ComposibleValidatable[TValue] {
  def this(/**
    * SubItems can be any Validatable
    */
  $: TValue) = this()
  var _error: js.UndefOr[String | Null] = js.native
  var _validators: js.Array[Validator[TValue]] = js.native
  /**
    * Auto validation
    */
  var autoValidationEnabled: Boolean = js.native
  /**
    * The first error from any sub (if any) or form error
    */
  @JSName("error")
  val error_FormState: js.UndefOr[String | Null] = js.native
  /**
    * Error from some sub field if any
    */
  val fieldError: js.UndefOr[String | Null] = js.native
  /**
    * Error from form if any
    */
  val formError: js.UndefOr[String | Null] = js.native
  /**
    * Does any field have an error
    */
  val hasFieldError: Boolean = js.native
  /**
    * Does form level validation have an error
    */
  val hasFormError: Boolean = js.native
  var mode: `object` | array | map = js.native
  /**
    * You should only show the form error if there are no field errors
    */
  val showFormError: Boolean = js.native
  /**
    * Composible field validation tracking
    */
  var validatedSubFields: js.Array[ComposibleValidatable[_]] = js.native
  /**
    * Call it when you are `reinit`ing child fields
    */
  def clearFormError(): Unit = js.native
  /**
    * Composible fields (fields that work in conjuction with FormState)
    */
  def compose(): this.type = js.native
  def enableAutoValidationAndValidate(): js.Promise[HasError | HasErrorValue[TValue]] = js.native
  /** Get validatable objects from $ */
  /* protected */ def getValues(): js.Array[ComposibleValidatable[_]] = js.native
  def validators(validators: Validator[TValue]*): this.type = js.native
}

