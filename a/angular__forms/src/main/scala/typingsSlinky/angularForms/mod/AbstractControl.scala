package typingsSlinky.angularForms.mod

import typingsSlinky.angularForms.anon.EmitEvent
import typingsSlinky.angularForms.anon.OnlySelf
import typingsSlinky.angularForms.anon.`0`
import typingsSlinky.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "AbstractControl")
@js.native
/**
  * Initialize the AbstractControl instance.
  *
  * @param validators The function or array of functions that is used to determine the validity of
  *     this control synchronously.
  * @param asyncValidators The function or array of functions that is used to determine validity of
  *     this control asynchronously.
  */
abstract class AbstractControl () extends StObject {
  def this(validators: js.Array[ValidatorFn]) = this()
  def this(validators: ValidatorFn) = this()
  def this(validators: js.Array[ValidatorFn], asyncValidators: js.Array[AsyncValidatorFn]) = this()
  def this(validators: js.Array[ValidatorFn], asyncValidators: AsyncValidatorFn) = this()
  def this(validators: Null, asyncValidators: js.Array[AsyncValidatorFn]) = this()
  def this(validators: Null, asyncValidators: AsyncValidatorFn) = this()
  def this(validators: ValidatorFn, asyncValidators: js.Array[AsyncValidatorFn]) = this()
  def this(validators: ValidatorFn, asyncValidators: AsyncValidatorFn) = this()
  
  var _asyncValidationSubscription: js.Any = js.native
  
  var _calculateStatus: js.Any = js.native
  
  var _cancelExistingSubscription: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  var _runAsyncValidator: js.Any = js.native
  
  var _runValidator: js.Any = js.native
  
  var _setInitialStatus: js.Any = js.native
  
  var _updateAncestors: js.Any = js.native
  
  /**
    * The function that is used to determine the validity of this control asynchronously.
    */
  def asyncValidator: AsyncValidatorFn | Null = js.native
  def asyncValidator_=(asyncValidatorFn: AsyncValidatorFn | Null): Unit = js.native
  
  /**
    * Empties out the async validator list.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    */
  def clearAsyncValidators(): Unit = js.native
  
  /**
    * Empties out the sync validator list.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    */
  def clearValidators(): Unit = js.native
  
  /**
    * A control is `dirty` if the user has changed the value
    * in the UI.
    *
    * @returns True if the user has changed the value of this control in the UI; compare `pristine`.
    * Programmatic changes to a control's value do not mark it dirty.
    */
  def dirty: Boolean = js.native
  
  /**
    * Disables the control. This means the control is exempt from validation checks and
    * excluded from the aggregate value of any parent. Its status is `DISABLED`.
    *
    * If the control has children, all children are also disabled.
    *
    * @see {@link AbstractControl.status}
    *
    * @param opts Configuration options that determine how the control propagates
    * changes and emits events after the control is disabled.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control is disabled.
    * When false, no events are emitted.
    */
  def disable(): Unit = js.native
  def disable(opts: EmitEvent): Unit = js.native
  
  /**
    * A control is `disabled` when its `status` is `DISABLED`.
    *
    * Disabled controls are exempt from validation checks and
    * are not included in the aggregate value of their ancestor
    * controls.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if the control is disabled, false otherwise.
    */
  def disabled: Boolean = js.native
  
  /**
    * Enables the control. This means the control is included in validation checks and
    * the aggregate value of its parent. Its status recalculates based on its value and
    * its validators.
    *
    * By default, if the control has children, all children are enabled.
    *
    * @see {@link AbstractControl.status}
    *
    * @param opts Configure options that control how the control propagates changes and
    * emits events when marked as untouched
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control is enabled.
    * When false, no events are emitted.
    */
  def enable(): Unit = js.native
  def enable(opts: EmitEvent): Unit = js.native
  
  /**
    * A control is `enabled` as long as its `status` is not `DISABLED`.
    *
    * @returns True if the control has any status other than 'DISABLED',
    * false if the status is 'DISABLED'.
    *
    * @see {@link AbstractControl.status}
    *
    */
  def enabled: Boolean = js.native
  
  /**
    * An object containing any errors generated by failing validation,
    * or null if there are no errors.
    */
  val errors: ValidationErrors | Null = js.native
  
  def get(path: String): AbstractControl | Null = js.native
  /**
    * Retrieves a child control given the control's name or path.
    *
    * @param path A dot-delimited string or array of string/number values that define the path to the
    * control.
    *
    * @usageNotes
    * ### Retrieve a nested control
    *
    * For example, to get a `name` control nested within a `person` sub-group:
    *
    * * `this.form.get('person.name');`
    *
    * -OR-
    *
    * * `this.form.get(['person', 'name']);`
    */
  def get(path: js.Array[String | Double]): AbstractControl | Null = js.native
  
  /**
    * @description
    * Reports error data for the control with the given path.
    *
    * @param errorCode The code of the error to check
    * @param path A list of control names that designates how to move from the current control
    * to the control that should be queried for errors.
    *
    * @usageNotes
    * For example, for the following `FormGroup`:
    *
    * ```
    * form = new FormGroup({
    *   address: new FormGroup({ street: new FormControl() })
    * });
    * ```
    *
    * The path to the 'street' control from the root form would be 'address' -> 'street'.
    *
    * It can be provided to this method in one of two formats:
    *
    * 1. An array of string control names, e.g. `['address', 'street']`
    * 1. A period-delimited list of control names in one string, e.g. `'address.street'`
    *
    * @returns error data for that particular error. If the control or error is not present,
    * null is returned.
    */
  def getError(errorCode: String): js.Any = js.native
  def getError(errorCode: String, path: String): js.Any = js.native
  def getError(errorCode: String, path: js.Array[String | Double]): js.Any = js.native
  
  /**
    * @description
    * Reports whether the control with the given path has the error specified.
    *
    * @param errorCode The code of the error to check
    * @param path A list of control names that designates how to move from the current control
    * to the control that should be queried for errors.
    *
    * @usageNotes
    * For example, for the following `FormGroup`:
    *
    * ```
    * form = new FormGroup({
    *   address: new FormGroup({ street: new FormControl() })
    * });
    * ```
    *
    * The path to the 'street' control from the root form would be 'address' -> 'street'.
    *
    * It can be provided to this method in one of two formats:
    *
    * 1. An array of string control names, e.g. `['address', 'street']`
    * 1. A period-delimited list of control names in one string, e.g. `'address.street'`
    *
    * If no path is given, this method checks for the error on the current control.
    *
    * @returns whether the given error is present in the control at the given path.
    *
    * If the control is not present, false is returned.
    */
  def hasError(errorCode: String): Boolean = js.native
  def hasError(errorCode: String, path: String): Boolean = js.native
  def hasError(errorCode: String, path: js.Array[String | Double]): Boolean = js.native
  
  /**
    * A control is `invalid` when its `status` is `INVALID`.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if this control has failed one or more of its validation checks,
    * false otherwise.
    */
  def invalid: Boolean = js.native
  
  /**
    * Marks the control and all its descendant controls as `touched`.
    * @see `markAsTouched()`
    */
  def markAllAsTouched(): Unit = js.native
  
  /**
    * Marks the control as `dirty`. A control becomes dirty when
    * the control's value is changed through the UI; compare `markAsTouched`.
    *
    * @see `markAsTouched()`
    * @see `markAsUntouched()`
    * @see `markAsPristine()`
    *
    * @param opts Configuration options that determine how the control propagates changes
    * and emits events after marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsDirty(): Unit = js.native
  def markAsDirty(opts: OnlySelf): Unit = js.native
  
  /**
    * Marks the control as `pending`.
    *
    * A control is pending while the control performs async validation.
    *
    * @see {@link AbstractControl.status}
    *
    * @param opts Configuration options that determine how the control propagates changes and
    * emits events after marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), the `statusChanges`
    * observable emits an event with the latest status the control is marked pending.
    * When false, no events are emitted.
    *
    */
  def markAsPending(): Unit = js.native
  def markAsPending(opts: EmitEvent): Unit = js.native
  
  /**
    * Marks the control as `pristine`.
    *
    * If the control has any children, marks all children as `pristine`,
    * and recalculates the `pristine` status of all parent
    * controls.
    *
    * @see `markAsTouched()`
    * @see `markAsUntouched()`
    * @see `markAsDirty()`
    *
    * @param opts Configuration options that determine how the control emits events after
    * marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsPristine(): Unit = js.native
  def markAsPristine(opts: OnlySelf): Unit = js.native
  
  /**
    * Marks the control as `touched`. A control is touched by focus and
    * blur events that do not change the value.
    *
    * @see `markAsUntouched()`
    * @see `markAsDirty()`
    * @see `markAsPristine()`
    *
    * @param opts Configuration options that determine how the control propagates changes
    * and emits events after marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsTouched(): Unit = js.native
  def markAsTouched(opts: OnlySelf): Unit = js.native
  
  /**
    * Marks the control as `untouched`.
    *
    * If the control has any children, also marks all children as `untouched`
    * and recalculates the `touched` status of all parent controls.
    *
    * @see `markAsTouched()`
    * @see `markAsDirty()`
    * @see `markAsPristine()`
    *
    * @param opts Configuration options that determine how the control propagates changes
    * and emits events after the marking is applied.
    * * `onlySelf`: When true, mark only this control. When false or not supplied,
    * marks all direct ancestors. Default is false.
    */
  def markAsUntouched(): Unit = js.native
  def markAsUntouched(opts: OnlySelf): Unit = js.native
  
  /**
    * The parent control.
    */
  def parent: FormGroup | FormArray | Null = js.native
  
  /**
    * Patches the value of the control. Abstract method (implemented in sub-classes).
    */
  def patchValue(value: js.Any): Unit = js.native
  def patchValue(value: js.Any, options: js.Object): Unit = js.native
  
  /**
    * A control is `pending` when its `status` is `PENDING`.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if this control is in the process of conducting a validation check,
    * false otherwise.
    */
  def pending: Boolean = js.native
  
  /**
    * A control is `pristine` if the user has not yet changed
    * the value in the UI.
    *
    * @returns True if the user has not yet changed the value in the UI; compare `dirty`.
    * Programmatic changes to a control's value do not mark it dirty.
    */
  val pristine: Boolean = js.native
  
  /**
    * Resets the control. Abstract method (implemented in sub-classes).
    */
  def reset(): Unit = js.native
  def reset(value: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
  def reset(value: js.Any): Unit = js.native
  def reset(value: js.Any, options: js.Object): Unit = js.native
  
  /**
    * Retrieves the top-level ancestor of this control.
    */
  def root: AbstractControl = js.native
  
  /**
    * Sets the async validators that are active on this control. Calling this
    * overwrites any existing async validators.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    */
  def setAsyncValidators(): Unit = js.native
  def setAsyncValidators(newValidator: js.Array[AsyncValidatorFn]): Unit = js.native
  def setAsyncValidators(newValidator: AsyncValidatorFn): Unit = js.native
  
  /**
    * Sets errors on a form control when running validations manually, rather than automatically.
    *
    * Calling `setErrors` also updates the validity of the parent control.
    *
    * @usageNotes
    *
    * ### Manually set the errors for a control
    *
    * ```
    * const login = new FormControl('someLogin');
    * login.setErrors({
    *   notUnique: true
    * });
    *
    * expect(login.valid).toEqual(false);
    * expect(login.errors).toEqual({ notUnique: true });
    *
    * login.setValue('someOtherLogin');
    *
    * expect(login.valid).toEqual(true);
    * ```
    */
  def setErrors(): Unit = js.native
  def setErrors(errors: Null, opts: `0`): Unit = js.native
  def setErrors(errors: ValidationErrors): Unit = js.native
  def setErrors(errors: ValidationErrors, opts: `0`): Unit = js.native
  
  def setParent(parent: FormArray): Unit = js.native
  /**
    * @param parent Sets the parent of the control
    */
  def setParent(parent: FormGroup): Unit = js.native
  
  /**
    * Sets the synchronous validators that are active on this control.  Calling
    * this overwrites any existing sync validators.
    *
    * When you add or remove a validator at run time, you must call
    * `updateValueAndValidity()` for the new validation to take effect.
    *
    */
  def setValidators(): Unit = js.native
  def setValidators(newValidator: js.Array[ValidatorFn]): Unit = js.native
  def setValidators(newValidator: ValidatorFn): Unit = js.native
  
  /**
    * Sets the value of the control. Abstract method (implemented in sub-classes).
    */
  def setValue(value: js.Any): Unit = js.native
  def setValue(value: js.Any, options: js.Object): Unit = js.native
  
  /**
    * The validation status of the control. There are four possible
    * validation status values:
    *
    * * **VALID**: This control has passed all validation checks.
    * * **INVALID**: This control has failed at least one validation check.
    * * **PENDING**: This control is in the midst of conducting a validation check.
    * * **DISABLED**: This control is exempt from validation checks.
    *
    * These status values are mutually exclusive, so a control cannot be
    * both valid AND invalid or invalid AND disabled.
    */
  val status: String = js.native
  
  /**
    * A multicasting observable that emits an event every time the validation `status` of the control
    * recalculates.
    *
    * @see {@link AbstractControl.status}
    *
    */
  val statusChanges: Observable_[_] = js.native
  
  /**
    * True if the control is marked as `touched`.
    *
    * A control is marked `touched` once the user has triggered
    * a `blur` event on it.
    */
  val touched: Boolean = js.native
  
  /**
    * True if the control has not been marked as touched
    *
    * A control is `untouched` if the user has not yet triggered
    * a `blur` event on it.
    */
  def untouched: Boolean = js.native
  
  /**
    * Reports the update strategy of the `AbstractControl` (meaning
    * the event on which the control updates itself).
    * Possible values: `'change'` | `'blur'` | `'submit'`
    * Default value: `'change'`
    */
  def updateOn: FormHooks = js.native
  
  /**
    * Recalculates the value and validation status of the control.
    *
    * By default, it also updates the value and validity of its ancestors.
    *
    * @param opts Configuration options determine how the control propagates changes and emits events
    * after updates and validity checks are applied.
    * * `onlySelf`: When true, only update this control. When false or not supplied,
    * update all direct ancestors. Default is false.
    * * `emitEvent`: When true or not supplied (the default), both the `statusChanges` and
    * `valueChanges`
    * observables emit events with the latest status and value when the control is updated.
    * When false, no events are emitted.
    */
  def updateValueAndValidity(): Unit = js.native
  def updateValueAndValidity(opts: EmitEvent): Unit = js.native
  
  /**
    * A control is `valid` when its `status` is `VALID`.
    *
    * @see {@link AbstractControl.status}
    *
    * @returns True if the control has passed all of its validation tests,
    * false otherwise.
    */
  def valid: Boolean = js.native
  
  /**
    * The function that is used to determine the validity of this control synchronously.
    */
  def validator: ValidatorFn | Null = js.native
  def validator_=(validatorFn: ValidatorFn | Null): Unit = js.native
  
  /**
    * The current value of the control.
    *
    * * For a `FormControl`, the current value.
    * * For an enabled `FormGroup`, the values of enabled controls as an object
    * with a key-value pair for each member of the group.
    * * For a disabled `FormGroup`, the values of all controls as an object
    * with a key-value pair for each member of the group.
    * * For a `FormArray`, the values of enabled controls as an array.
    *
    */
  val value: js.Any = js.native
  
  /**
    * A multicasting observable that emits an event every time the value of the control changes, in
    * the UI or programmatically. It also emits an event each time you call enable() or disable()
    * without passing along {emitEvent: false} as a function argument.
    */
  val valueChanges: Observable_[_] = js.native
}
