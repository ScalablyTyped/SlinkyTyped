package typingsSlinky.jqueryValidation

import typingsSlinky.jqueryValidation.JQueryValidation.RulesDictionary
import typingsSlinky.jqueryValidation.JQueryValidation.ValidationOptions
import typingsSlinky.jqueryValidation.JQueryValidation.Validator
import typingsSlinky.jqueryValidation.jqueryValidationStrings.add
import typingsSlinky.jqueryValidation.jqueryValidationStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Remove the specified attributes from the first matched element and return them.
    *
    * @param attributes A space-separated list of attribute names to remove.
    */
  def removeAttrs(attributes: String): js.Any = js.native
  
   // tslint:disable-line unified-signatures
  /**
    * Returns the validation rules for teh first selected element.
    */
  def rules(): js.Any = js.native
  /**
    * Adds the specified rules and returns all rules for the first matched element. Requires that the parent form is validated, that is, $( "form" ).validate() is called first.
    *
    * @param command "remove" or "add"
    * @param rules The rules to add. Accepts the same format as the rules-option of the validate-method.
    */
  @JSName("rules")
  def rules_add(command: add): js.Any = js.native
  @JSName("rules")
  def rules_add(command: add, rules: RulesDictionary): js.Any = js.native
   // tslint:disable-line unified-signatures
  /**
    * Removes the specified rules and returns all rules for the first matched element.
    * @param command "remove"
    * @param rules The space-seperated names of rules to remove and return. If left unspecified, removes and returns all rules. Manipulates only rules specified via rules-option or via rules("add").
    */
  @JSName("rules")
  def rules_remove(command: remove): js.Any = js.native
  @JSName("rules")
  def rules_remove(command: remove, rules: String): js.Any = js.native
  
  /**
    * Checks whether the selected form is valid or whether all selected elements are valid.
    */
  def valid(): Boolean = js.native
  
  /**
    * Validates the selected form.
    *
    * @param options options for validation
    */
  def validate(): Validator = js.native
  def validate(options: ValidationOptions): Validator = js.native
}
