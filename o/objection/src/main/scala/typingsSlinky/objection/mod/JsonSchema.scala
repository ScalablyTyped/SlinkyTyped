package typingsSlinky.objection.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSchema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  /**
    * It is recommended that the meta-schema is
    * included in the root of any JSON Schema
    */
  @JSName("$schema")
  var $schema: js.UndefOr[JsonSchema] = js.undefined
  /////////////////////////////////////////////////
  // Array Validation
  /////////////////////////////////////////////////
  var additionalItems: js.UndefOr[Boolean | JsonSchema] = js.undefined
  var additionalProperties: js.UndefOr[Boolean | JsonSchema] = js.undefined
  /////////////////////////////////////////////////
  // Combining Schemas
  /////////////////////////////////////////////////
  var allOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  /**
    * Default json for the object represented by
    * this schema
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * Holds simple JSON Schema definitions for
    * referencing from elsewhere.
    */
  var definitions: js.UndefOr[StringDictionary[JsonSchema]] = js.undefined
  /**
    * If the key is present as a property then the
    * string of properties must also be present.
    * If the value is a JSON Schema then it must
    * also be valid for the object if the key is
    * present.
    */
  var dependencies: js.UndefOr[StringDictionary[JsonSchema | js.Array[String]]] = js.undefined
  /**
    * Schema description
    */
  var description: js.UndefOr[String] = js.undefined
  /////////////////////////////////////////////////
  // Generic
  /////////////////////////////////////////////////
  /**
    * Enumerates the values that this schema can be
    * e.g.
    * {"type": "string",
    *  "enum": ["red", "green", "blue"]}
    */
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * If true maximum must be > value, >= otherwise
    */
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  /**
    * If true minimum must be < value, <= otherwise
    */
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  /**
    * fallback raw string for custom formats,
    * or formats that aren't in the standard yet
    */
  var format: js.UndefOr[JsonSchemaFormatType | String] = js.undefined
  /////////////////////////////////////////////////
  // Schema Metadata
  /////////////////////////////////////////////////
  /**
    * This is important because it tells refs where
    * the root of the document is located
    */
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[JsonSchema | js.Array[JsonSchema]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  /////////////////////////////////////////////////
  // String Validation
  /////////////////////////////////////////////////
  var maxLength: js.UndefOr[Double] = js.undefined
  /////////////////////////////////////////////////
  // Object Validation
  /////////////////////////////////////////////////
  var maxProperties: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minProperties: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  /////////////////////////////////////////////////
  // Number Validation
  /////////////////////////////////////////////////
  /**
    * The value must be a multiple of the number
    * (e.g. 10 is a multiple of 5)
    */
  var multipleOf: js.UndefOr[Double] = js.undefined
  /**
    * The entity being validated must not match this schema
    */
  var not: js.UndefOr[JsonSchema] = js.undefined
  var oneOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  /**
    * This is a regex string that the value must
    * conform to
    */
  var pattern: js.UndefOr[String] = js.undefined
  /**
    * The key of this object is a regex for which
    * properties the schema applies to
    */
  var patternProperties: js.UndefOr[StringDictionary[JsonSchema]] = js.undefined
  /**
    * The keys that can exist on the object with the
    * json schema that should validate their value
    */
  var properties: js.UndefOr[StringDictionary[JsonSchema]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Title of the schema
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The basic type of this schema, can be one of
    * [string, number, object, array, boolean, null]
    * or an array of the acceptable types
    */
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object JsonSchema {
  @scala.inline
  def apply(
    $ref: String = null,
    $schema: JsonSchema = null,
    additionalItems: Boolean | JsonSchema = null,
    additionalProperties: Boolean | JsonSchema = null,
    allOf: js.Array[JsonSchema] = null,
    anyOf: js.Array[JsonSchema] = null,
    default: js.Any = null,
    definitions: StringDictionary[JsonSchema] = null,
    dependencies: StringDictionary[JsonSchema | js.Array[String]] = null,
    description: String = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    format: JsonSchemaFormatType | String = null,
    id: String = null,
    items: JsonSchema | js.Array[JsonSchema] = null,
    maxItems: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxProperties: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minProperties: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    multipleOf: js.UndefOr[Double] = js.undefined,
    not: JsonSchema = null,
    oneOf: js.Array[JsonSchema] = null,
    pattern: String = null,
    patternProperties: StringDictionary[JsonSchema] = null,
    properties: StringDictionary[JsonSchema] = null,
    required: js.Array[String] = null,
    title: String = null,
    `type`: String | js.Array[String] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): JsonSchema = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxProperties)) __obj.updateDynamic("maxProperties")(maxProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProperties)) __obj.updateDynamic("minProperties")(minProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOf)) __obj.updateDynamic("multipleOf")(multipleOf.get.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonSchema]
  }
}

