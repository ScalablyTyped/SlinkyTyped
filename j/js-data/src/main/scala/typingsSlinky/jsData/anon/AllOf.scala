package typingsSlinky.jsData.anon

import typingsSlinky.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllOf extends js.Object {
  def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def dependencies(value: js.Any, schema: js.Any, opts: js.Any): Unit = js.native
  def enum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def maxItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def maxLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def maximum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def minItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def minLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def minProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def minimum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def not(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def pattern(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def `type`(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
}

object AllOf {
  @scala.inline
  def apply(
    allOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    anyOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    dependencies: (js.Any, js.Any, js.Any) => Unit,
    enum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    items: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    maxItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maxLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maxProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maximum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minimum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    multipleOf: (js.Any, js.Any, js.Any) => SchemaValidationError,
    not: (js.Any, js.Any, js.Any) => SchemaValidationError,
    oneOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    pattern: (js.Any, js.Any, js.Any) => SchemaValidationError,
    properties: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    required: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    `type`: (js.Any, js.Any, js.Any) => SchemaValidationError,
    uniqueItems: (js.Any, js.Any, js.Any) => SchemaValidationError
  ): AllOf = {
    val __obj = js.Dynamic.literal(allOf = js.Any.fromFunction3(allOf), anyOf = js.Any.fromFunction3(anyOf), dependencies = js.Any.fromFunction3(dependencies), enum = js.Any.fromFunction3(enum), items = js.Any.fromFunction3(items), maxItems = js.Any.fromFunction3(maxItems), maxLength = js.Any.fromFunction3(maxLength), maxProperties = js.Any.fromFunction3(maxProperties), maximum = js.Any.fromFunction3(maximum), minItems = js.Any.fromFunction3(minItems), minLength = js.Any.fromFunction3(minLength), minProperties = js.Any.fromFunction3(minProperties), minimum = js.Any.fromFunction3(minimum), multipleOf = js.Any.fromFunction3(multipleOf), not = js.Any.fromFunction3(not), oneOf = js.Any.fromFunction3(oneOf), pattern = js.Any.fromFunction3(pattern), properties = js.Any.fromFunction3(properties), required = js.Any.fromFunction3(required), uniqueItems = js.Any.fromFunction3(uniqueItems))
    __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
    __obj.asInstanceOf[AllOf]
  }
  @scala.inline
  implicit class AllOfOps[Self <: AllOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAnyOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDependencies(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEnum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withItems(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaxItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaxLength(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaxProperties(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProperties")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaximum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMinItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMinLength(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMinProperties(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProperties")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMinimum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMultipleOf(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNot(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOneOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPattern(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withProperties(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequired(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withType(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUniqueItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

