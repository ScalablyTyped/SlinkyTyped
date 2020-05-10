package typingsSlinky.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.jsonSchemaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema4
  extends /**
  * @see https://tools.ietf.org/html/draft-zyp-json-schema-04#section-5.6
  */
/* k */ StringDictionary[js.Any] {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema4Version] = js.native
  /**
    * May only be defined when "items" is defined, and is a tuple of JSONSchemas.
    *
    * This provides a definition for additional items in an array instance
    * when tuple definitions of the items is provided.  This can be false
    * to indicate additional items in the array are not allowed, or it can
    * be a schema that defines the schema of the additional items.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.6
    */
  var additionalItems: js.UndefOr[Boolean | JSONSchema4] = js.native
  /**
    * This attribute defines a schema for all properties that are not
    * explicitly defined in an object type definition. If specified, the
    * value MUST be a schema or a boolean. If false is provided, no
    * additional properties are allowed beyond the properties defined in
    * the schema. The default value is an empty schema which allows any
    * value for additional properties.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.4
    */
  var additionalProperties: js.UndefOr[Boolean | JSONSchema4] = js.native
  var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var default: js.UndefOr[JSONSchema4Type] = js.native
  var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  var dependencies: js.UndefOr[StringDictionary[JSONSchema4 | js.Array[String]]] = js.native
  /**
    * This attribute is a string that provides a full description of the of
    * purpose the instance property.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.22
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This provides an enumeration of all possible values that are valid
    * for the instance property. This MUST be an array, and each item in
    * the array represents a possible value for the instance value. If
    * this attribute is defined, the instance value MUST be one of the
    * values in the array in order for the schema to be valid.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.19
    */
  var enum: js.UndefOr[js.Array[JSONSchema4Type]] = js.native
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  /**
    * The value of this property MUST be another schema which will provide
    * a base schema which the current schema will inherit from.  The
    * inheritance rules are such that any instance that is valid according
    * to the current schema MUST be valid according to the referenced
    * schema.  This MAY also be an array, in which case, the instance MUST
    * be valid for all the schemas in the array.  A schema that extends
    * another schema MAY define additional attributes, constrain existing
    * attributes, or add other constraints.
    *
    * Conceptually, the behavior of extends can be seen as validating an
    * instance against all constraints in the extending schema as well as
    * the extended schema(s).
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.26
    */
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var format: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * This attribute defines the allowed items in an instance array, and
    * MUST be a schema or an array of schemas.  The default value is an
    * empty schema which allows any value for items in the instance array.
    *
    * When this attribute value is a schema and the instance value is an
    * array, then all the items in the array MUST be valid according to the
    * schema.
    *
    * When this attribute value is an array of schemas and the instance
    * value is an array, each position in the instance array MUST conform
    * to the schema in the corresponding position for this array.  This
    * called tuple typing.  When tuple typing is used, additional items are
    * allowed, disallowed, or constrained by the "additionalItems"
    * (Section 5.6) attribute using the same rules as
    * "additionalProperties" (Section 5.4) for objects.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.5
    */
  var items: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[JSONSchema4] = js.native
  var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var pattern: js.UndefOr[String] = js.native
  /**
    * This attribute is an object that defines the schema for a set of
    * property names of an object instance. The name of each property of
    * this attribute's object is a regular expression pattern in the ECMA
    * 262/Perl 5 format, while the value is a schema. If the pattern
    * matches the name of a property on the instance object, the value of
    * the instance's property MUST be valid against the pattern name's
    * schema value.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.3
    */
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  /**
    * This attribute is an object with property definitions that define the
    * valid values of instance object property values. When the instance
    * value is an object, the property values of the instance object MUST
    * conform to the property definitions in this object. In this object,
    * each property definition's value MUST be a schema, and the property's
    * name MUST be the name of the instance property that it defines.  The
    * instance property value MUST be valid according to the schema from
    * the property definition. Properties are considered unordered, the
    * order of the instance properties MAY be in any order.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.2
    */
  var properties: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  /**
    * This attribute indicates if the instance must have a value, and not
    * be undefined. This is false by default, making the instance
    * optional.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.7
    */
  var required: js.UndefOr[`false` | js.Array[String]] = js.native
  /**
    * This attribute is a string that provides a short description of the
    * instance property.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.21
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A single type, or a union of simple types
    */
  var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object JSONSchema4 {
  @scala.inline
  def apply(): JSONSchema4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema4]
  }
  @scala.inline
  implicit class JSONSchema4Ops[Self <: JSONSchema4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def with$schema(value: JSONSchema4Version): Self = {
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
    def withAdditionalItems(value: Boolean | JSONSchema4): Self = {
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
    def withAdditionalProperties(value: Boolean | JSONSchema4): Self = {
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
    def withAllOf(value: js.Array[JSONSchema4]): Self = {
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
    def withAnyOf(value: js.Array[JSONSchema4]): Self = {
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
    def withDefault(value: JSONSchema4Type): Self = {
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
    def withDefinitions(value: StringDictionary[JSONSchema4]): Self = {
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
    def withDependencies(value: StringDictionary[JSONSchema4 | js.Array[String]]): Self = {
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
    def withEnum(value: js.Array[JSONSchema4Type]): Self = {
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
    def withExclusiveMaximum(value: Boolean): Self = {
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
    def withExclusiveMinimum(value: Boolean): Self = {
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
    def withExtends(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: JSONSchema4 | js.Array[JSONSchema4]): Self = {
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
    def withNot(value: JSONSchema4): Self = {
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
    def withOneOf(value: js.Array[JSONSchema4]): Self = {
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
    def withPatternProperties(value: StringDictionary[JSONSchema4]): Self = {
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
    def withProperties(value: StringDictionary[JSONSchema4]): Self = {
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
    def withRequired(value: `false` | js.Array[String]): Self = {
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
    def withType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = {
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

