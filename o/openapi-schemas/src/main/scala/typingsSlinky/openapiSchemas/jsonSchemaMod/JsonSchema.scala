package typingsSlinky.openapiSchemas.jsonSchemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSchema extends js.Object {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var additionalItems: js.UndefOr[Boolean | JsonSchema] = js.undefined
  var additionalProperties: js.UndefOr[Boolean | JsonSchema] = js.undefined
  var allOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var definitions: js.UndefOr[StringDictionary[JsonSchema]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[JsonSchema | js.Array[String]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[String]] = js.undefined
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[JsonSchema | js.Array[JsonSchema]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxProperties: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minProperties: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  var multipleOf: js.UndefOr[Double] = js.undefined
  var not: js.UndefOr[JsonSchema] = js.undefined
  var oneOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var patternProperties: js.UndefOr[StringDictionary[JsonSchema]] = js.undefined
  var properties: js.UndefOr[StringDictionary[JsonSchema]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object JsonSchema {
  @scala.inline
  def apply(
    $schema: String = null,
    additionalItems: Boolean | JsonSchema = null,
    additionalProperties: Boolean | JsonSchema = null,
    allOf: js.Array[JsonSchema] = null,
    anyOf: js.Array[JsonSchema] = null,
    definitions: StringDictionary[JsonSchema] = null,
    dependencies: StringDictionary[JsonSchema | js.Array[String]] = null,
    description: String = null,
    enum: js.Array[String] = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
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
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
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

