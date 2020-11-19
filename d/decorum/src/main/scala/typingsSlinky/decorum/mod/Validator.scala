package typingsSlinky.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "Validator")
@js.native
class Validator () extends js.Object
/* static members */
@JSImport("decorum", "Validator")
@js.native
object Validator extends js.Object {
  
  /**
    * Adds a validator to the given object prototype for the given property. Meant to be used inside of validation
    * decorators to inject the validation onto the object property.
    * @param targetPrototype A valid object prototype to add to.
    * @param property The property to add the validator for.
    * @param validator The validator to add.
    */
  def addValidator(targetPrototype: js.Object, property: String, validator: BaseValidator): Unit = js.native
  
  /**
    * Decorates the passed class with model validations. Use this when you do not have access to ES7 decorators.
    * The object passed should be a valid class (ES6 class or ES5 function constructor).
    * @param objectType The class to decorate.
    * @param definitions One or more field validation definitions of the form { "fieldName": [ decorators ] }.
    */
  def decorate(objectType: js.Any, definitions: ValidationDefinitions): Unit = js.native
  
  /**
    * Creates a new model validator for the given model. Model should be a valid class that has a valid constructor
    * and a prototype.
    * @param model The model to create the validator for.
    * @returns {ModelValidator} An instance of {ModelValidator}
    */
  def `new`(model: js.Any): ModelValidator = js.native
  
  /**
    * Creates an anonymous validator, immediately validates the model, and returns any validation errors on the
    * model as a result.
    * @param model The model to validate.
    */
  def validate(model: js.Any): IValidationResult = js.native
}
