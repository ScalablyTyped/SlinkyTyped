package typingsSlinky.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "Validators")
@js.native
class Validators () extends js.Object
/* static members */
@JSImport("@angular/forms", "Validators")
@js.native
object Validators extends js.Object {
  
  def compose(validators: js.Array[js.UndefOr[ValidatorFn | Null]]): ValidatorFn | Null = js.native
  /**
    * @description
    * Compose multiple validators into a single function that returns the union
    * of the individual error maps for the provided control.
    *
    * @returns A validator function that returns an error map with the
    * merged error maps of the validators if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def compose(validators: Null): Null = js.native
  
  /**
    * @description
    * Compose multiple async validators into a single function that returns the union
    * of the individual error objects for the provided control.
    *
    * @returns A validator function that returns an error map with the
    * merged error objects of the async validators if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def composeAsync(validators: js.Array[AsyncValidatorFn | Null]): AsyncValidatorFn | Null = js.native
  
  /**
    * @description
    * Validator that requires the control's value pass an email validation test.
    *
    * Tests the value using a [regular
    * expression](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions)
    * pattern suitable for common usecases. The pattern is based on the definition of a valid email
    * address in the [WHATWG HTML
    * specification](https://html.spec.whatwg.org/multipage/input.html#valid-e-mail-address) with
    * some enhancements to incorporate more RFC rules (such as rules related to domain names and the
    * lengths of different parts of the address).
    *
    * The differences from the WHATWG version include:
    * - Disallow `local-part` (the part before the `@` symbol) to begin or end with a period (`.`).
    * - Disallow `local-part` to be longer than 64 characters.
    * - Disallow the whole address to be longer than 254 characters.
    *
    * If this pattern does not satisfy your business needs, you can use `Validators.pattern()` to
    * validate the value against a different pattern.
    *
    * @usageNotes
    *
    * ### Validate that the field matches a valid email pattern
    *
    * ```typescript
    * const control = new FormControl('bad@', Validators.email);
    *
    * console.log(control.errors); // {email: true}
    * ```
    *
    * @returns An error map with the `email` property
    * if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def email(control: AbstractControl): ValidationErrors | Null = js.native
  
  /**
    * @description
    * Validator that requires the control's value to be less than or equal to the provided number.
    * The validator exists only as a function and not as a directive.
    *
    * @usageNotes
    *
    * ### Validate against a maximum of 15
    *
    * ```typescript
    * const control = new FormControl(16, Validators.max(15));
    *
    * console.log(control.errors); // {max: {max: 15, actual: 16}}
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `max` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def max(max: Double): ValidatorFn = js.native
  
  /**
    * @description
    * Validator that requires the length of the control's value to be less than or equal
    * to the provided maximum length. This validator is also provided by default if you use the
    * the HTML5 `maxlength` attribute. Note that the `maxLength` validator is intended to be used
    * only for types that have a numeric `length` property, such as strings or arrays.
    *
    * @usageNotes
    *
    * ### Validate that the field has maximum of 5 characters
    *
    * ```typescript
    * const control = new FormControl('Angular', Validators.maxLength(5));
    *
    * console.log(control.errors); // {maxlength: {requiredLength: 5, actualLength: 7}}
    * ```
    *
    * ```html
    * <input maxlength="5">
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `maxlength` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def maxLength(maxLength: Double): ValidatorFn = js.native
  
  /**
    * @description
    * Validator that requires the control's value to be greater than or equal to the provided number.
    * The validator exists only as a function and not as a directive.
    *
    * @usageNotes
    *
    * ### Validate against a minimum of 3
    *
    * ```typescript
    * const control = new FormControl(2, Validators.min(3));
    *
    * console.log(control.errors); // {min: {min: 3, actual: 2}}
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `min` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def min(min: Double): ValidatorFn = js.native
  
  /**
    * @description
    * Validator that requires the length of the control's value to be greater than or equal
    * to the provided minimum length. This validator is also provided by default if you use the
    * the HTML5 `minlength` attribute. Note that the `minLength` validator is intended to be used
    * only for types that have a numeric `length` property, such as strings or arrays. The
    * `minLength` validator logic is also not invoked for values when their `length` property is 0
    * (for example in case of an empty string or an empty array), to support optional controls. You
    * can use the standard `required` validator if empty values should not be considered valid.
    *
    * @usageNotes
    *
    * ### Validate that the field has a minimum of 3 characters
    *
    * ```typescript
    * const control = new FormControl('ng', Validators.minLength(3));
    *
    * console.log(control.errors); // {minlength: {requiredLength: 3, actualLength: 2}}
    * ```
    *
    * ```html
    * <input minlength="5">
    * ```
    *
    * @returns A validator function that returns an error map with the
    * `minlength` if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def minLength(minLength: Double): ValidatorFn = js.native
  
  /**
    * @description
    * Validator that performs no operation.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def nullValidator(control: AbstractControl): ValidationErrors | Null = js.native
  
  /**
    * @description
    * Validator that requires the control's value to match a regex pattern. This validator is also
    * provided by default if you use the HTML5 `pattern` attribute.
    *
    * @usageNotes
    *
    * ### Validate that the field only contains letters or spaces
    *
    * ```typescript
    * const control = new FormControl('1', Validators.pattern('[a-zA-Z ]*'));
    *
    * console.log(control.errors); // {pattern: {requiredPattern: '^[a-zA-Z ]*$', actualValue: '1'}}
    * ```
    *
    * ```html
    * <input pattern="[a-zA-Z ]*">
    * ```
    *
    * @param pattern A regular expression to be used as is to test the values, or a string.
    * If a string is passed, the `^` character is prepended and the `$` character is
    * appended to the provided string (if not already present), and the resulting regular
    * expression is used to test the values.
    *
    * @returns A validator function that returns an error map with the
    * `pattern` property if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def pattern(pattern: String): ValidatorFn = js.native
  def pattern(pattern: js.RegExp): ValidatorFn = js.native
  
  /**
    * @description
    * Validator that requires the control have a non-empty value.
    *
    * @usageNotes
    *
    * ### Validate that the field is non-empty
    *
    * ```typescript
    * const control = new FormControl('', Validators.required);
    *
    * console.log(control.errors); // {required: true}
    * ```
    *
    * @returns An error map with the `required` property
    * if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def required(control: AbstractControl): ValidationErrors | Null = js.native
  
  /**
    * @description
    * Validator that requires the control's value be true. This validator is commonly
    * used for required checkboxes.
    *
    * @usageNotes
    *
    * ### Validate that the field value is true
    *
    * ```typescript
    * const control = new FormControl('', Validators.requiredTrue);
    *
    * console.log(control.errors); // {required: true}
    * ```
    *
    * @returns An error map that contains the `required` property
    * set to `true` if the validation check fails, otherwise `null`.
    *
    * @see `updateValueAndValidity()`
    *
    */
  def requiredTrue(control: AbstractControl): ValidationErrors | Null = js.native
}
