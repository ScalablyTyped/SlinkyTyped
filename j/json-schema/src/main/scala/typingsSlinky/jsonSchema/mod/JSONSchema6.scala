package typingsSlinky.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema6 extends JSONSchema6Definition {
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema6Version] = js.native
  /**
    * This keyword determines how child instances validate for arrays, and does not directly validate the immediate instance itself.
    * If "items" is an array of schemas, validation succeeds if every instance element
    * at a position greater than the size of "items" validates against "additionalItems".
    * Otherwise, "additionalItems" MUST be ignored, as the "items" schema
    * (possibly the default value of an empty schema) is applied to all elements.
    * Omitting this keyword has the same behavior as an empty schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.10
    */
  var additionalItems: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * This attribute defines a schema for all properties that are not explicitly defined in an object type definition.
    * If specified, the value MUST be a schema or a boolean.
    * If false is provided, no additional properties are allowed beyond the properties defined in the schema.
    * The default value is an empty schema which allows any value for additional properties.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.20
    */
  var additionalProperties: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.26
    */
  var allOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.27
    */
  var anyOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.native
  /**
    * More readible form of a one-element "enum"
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.24
    */
  var const: js.UndefOr[JSONSchema6Type] = js.native
  /**
    * An array instance is valid against "contains" if at least one of its elements is valid against the given schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.14
    */
  var contains: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * This keyword can be used to supply a default JSON value associated with a particular schema.
    * It is RECOMMENDED that a default value be valid against the associated schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.3
    */
  var default: js.UndefOr[JSONSchema6Type] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.1
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.native
  /**
    * This keyword specifies rules that are evaluated if the instance is an object and contains a certain property.
    * Each property specifies a dependency.
    * If the dependency value is an array, each element in the array must be unique.
    * Omitting this keyword has the same behavior as an empty object.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.21
    */
  var dependencies: js.UndefOr[StringDictionary[JSONSchema6Definition | js.Array[String]]] = js.native
  /**
    * This attribute is a string that provides a full description of the of purpose the instance property.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This provides an enumeration of all possible values that are valid
    * for the instance property. This MUST be an array, and each item in
    * the array represents a possible value for the instance value. If
    * this attribute is defined, the instance value MUST be one of the
    * values in the array in order for the schema to be valid.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.23
    */
  var enum: js.UndefOr[js.Array[JSONSchema6Type]] = js.native
  /**
    * Array of examples with no validation effect the value of "default" is usable as an example without repeating it under this keyword
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.4
    */
  var examples: js.UndefOr[js.Array[JSONSchema6Type]] = js.native
  /**
    * Representing an exclusive upper limit for a numeric instance.
    * This keyword validates only if the instance is strictly less than (not equal to) to "exclusiveMaximum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.3
    */
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  /**
    * Representing an exclusive lower limit for a numeric instance.
    * This keyword validates only if the instance is strictly greater than (not equal to) to "exclusiveMinimum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.5
    */
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-8
    */
  var format: js.UndefOr[String] = js.native
  /**
    * This keyword determines how child instances validate for arrays, and does not directly validate the immediate instance itself.
    * Omitting this keyword has the same behavior as an empty schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.9
    */
  var items: js.UndefOr[JSONSchema6Definition | js.Array[JSONSchema6Definition]] = js.native
  /**
    * Must be a non-negative integer.
    * An array instance is valid against "maxItems" if its size is less than, or equal to, the value of this keyword.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.11
    */
  var maxItems: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * A string instance is valid against this keyword if its length is less than, or equal to, the value of this keyword.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.6
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * An object instance is valid against "maxProperties" if its number of properties is less than, or equal to, the value of this keyword.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.15
    */
  var maxProperties: js.UndefOr[Double] = js.native
  /**
    * Representing an inclusive upper limit for a numeric instance.
    * This keyword validates only if the instance is less than or exactly equal to "maximum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.2
    */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * An array instance is valid against "maxItems" if its size is greater than, or equal to, the value of this keyword.
    * Omitting this keyword has the same behavior as a value of 0.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.12
    */
  var minItems: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * A string instance is valid against this keyword if its length is greater than, or equal to, the value of this keyword.
    * Omitting this keyword has the same behavior as a value of 0.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.7
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * An object instance is valid against "maxProperties" if its number of properties is greater than,
    * or equal to, the value of this keyword.
    * Omitting this keyword has the same behavior as a value of 0.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.16
    */
  var minProperties: js.UndefOr[Double] = js.native
  /**
    * Representing an inclusive lower limit for a numeric instance.
    * This keyword validates only if the instance is greater than or exactly equal to "minimum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.4
    */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * Must be strictly greater than 0.
    * A numeric instance is valid only if division by this keyword's value results in an integer.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.1
    */
  var multipleOf: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.29
    */
  var not: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.28
    */
  var oneOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.native
  /**
    * Should be a valid regular expression, according to the ECMA 262 regular expression dialect.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.8
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * This attribute is an object that defines the schema for a set of property names of an object instance.
    * The name of each property of this attribute's object is a regular expression pattern in the ECMA 262, while the value is a schema.
    * If the pattern matches the name of a property on the instance object, the value of the instance's property
    * MUST be valid against the pattern name's schema value.
    * Omitting this keyword has the same behavior as an empty object.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.19
    */
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.native
  /**
    * This keyword determines how child instances validate for objects, and does not directly validate the immediate instance itself.
    * Validation succeeds if, for each name that appears in both the instance and as a name within this keyword's value,
    * the child instance for that name successfully validates against the corresponding schema.
    * Omitting this keyword has the same behavior as an empty object.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.18
    */
  var properties: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.native
  /**
    * Takes a schema which validates the names of all properties rather than their values.
    * Note the property name that the schema is testing will always be a string.
    * Omitting this keyword has the same behavior as an empty schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.22
    */
  var propertyNames: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * Elements of this array must be unique.
    * An object instance is valid against this keyword if every item in the array is the name of a property in the instance.
    * Omitting this keyword has the same behavior as an empty array.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.17
    */
  var required: js.UndefOr[js.Array[String]] = js.native
  /**
    * This attribute is a string that provides a short description of the instance property.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A single type, or a union of simple types
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.25
    */
  var `type`: js.UndefOr[JSONSchema6TypeName | js.Array[JSONSchema6TypeName]] = js.native
  /**
    * If this keyword has boolean value false, the instance validates successfully.
    * If it has boolean value true, the instance validates successfully if all of its elements are unique.
    * Omitting this keyword has the same behavior as a value of false.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.13
    */
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object JSONSchema6 {
  @scala.inline
  def apply(): JSONSchema6 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema6]
  }
  @scala.inline
  implicit class JSONSchema6Ops[Self <: JSONSchema6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$id")(js.undefined)
        ret
    }
    @scala.inline
    def with$ref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(js.undefined)
        ret
    }
    @scala.inline
    def with$schema(value: JSONSchema6Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$schema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$schema")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalItems(value: JSONSchema6Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalProperties(value: JSONSchema6Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withAllOf(value: js.Array[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allOf")(js.undefined)
        ret
    }
    @scala.inline
    def withAnyOf(value: js.Array[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(js.undefined)
        ret
    }
    @scala.inline
    def withConst(value: JSONSchema6Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("const")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("const")(js.undefined)
        ret
    }
    @scala.inline
    def withConstNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("const")(null)
        ret
    }
    @scala.inline
    def withContains(value: JSONSchema6Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: JSONSchema6Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(null)
        ret
    }
    @scala.inline
    def withDefinitions(value: StringDictionary[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: StringDictionary[JSONSchema6Definition | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnum(value: js.Array[JSONSchema6Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.undefined)
        ret
    }
    @scala.inline
    def withExamples(value: js.Array[JSONSchema6Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: JSONSchema6Definition | js.Array[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProperties(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProperties(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleOf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOf")(js.undefined)
        ret
    }
    @scala.inline
    def withNot(value: JSONSchema6Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
    @scala.inline
    def withOneOf(value: js.Array[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternProperties(value: StringDictionary[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[JSONSchema6Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyNames(value: JSONSchema6Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: JSONSchema6TypeName | js.Array[JSONSchema6TypeName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(js.undefined)
        ret
    }
  }
  
}

