package typingsSlinky.classValidator.validationSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.classValidator.AnonAlways
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationSchema extends js.Object {
  /**
    * Schema name. This is required, because we tell validator to validate by this schema using its name.
    */
  var name: String = js.native
  /**
    * Validated properties.
    */
  var properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[AnonAlways]] = js.native
}

object ValidationSchema {
  @scala.inline
  def apply(
    name: String,
    properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[AnonAlways]]
  ): ValidationSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSchema]
  }
  @scala.inline
  implicit class ValidationSchemaOps[Self <: ValidationSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(
      value: /**
      * Name of the object's property to be validated which holds an array of validation constraints.
      */
    StringDictionary[js.Array[AnonAlways]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

