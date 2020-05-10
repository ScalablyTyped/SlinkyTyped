package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
@js.native
trait JSONSchemaProps extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[Input[String]] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[Input[String]] = js.native
  var additionalItems: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.native
  var additionalProperties: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.native
  var allOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  var anyOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under
    * the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields
    * to be false.
    */
  var default: js.UndefOr[Input[_]] = js.native
  var definitions: js.UndefOr[Input[js.Object]] = js.native
  var dependencies: js.UndefOr[Input[js.Object]] = js.native
  var description: js.UndefOr[Input[String]] = js.native
  var enum: js.UndefOr[Input[js.Array[Input[_]]]] = js.native
  var example: js.UndefOr[Input[_]] = js.native
  var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.native
  var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.native
  var externalDocs: js.UndefOr[Input[ExternalDocumentation]] = js.native
  /**
    * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats
    * are validated:
    *
    * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed
    * by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang
    * net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as
    * defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang
    * net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by
    * Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID
    * that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3
    * that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4
    * that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an
    * UUID5 that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an
    * ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10
    * number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" -
    * creditcard: a credit card number defined by the regex
    * ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$
    * with any non digit characters mixed in - ssn: a U.S. social security number following the
    * regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF:
    * following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like
    * rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of
    * string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 -
    * duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or
    * compatible with Scala duration format - datetime: a date time string like
    * "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
    */
  var format: js.UndefOr[Input[String]] = js.native
  var id: js.UndefOr[Input[String]] = js.native
  var items: js.UndefOr[Input[JSONSchemaProps | js.Array[_]]] = js.native
  var maxItems: js.UndefOr[Input[Double]] = js.native
  var maxLength: js.UndefOr[Input[Double]] = js.native
  var maxProperties: js.UndefOr[Input[Double]] = js.native
  var maximum: js.UndefOr[Input[Double]] = js.native
  var minItems: js.UndefOr[Input[Double]] = js.native
  var minLength: js.UndefOr[Input[Double]] = js.native
  var minProperties: js.UndefOr[Input[Double]] = js.native
  var minimum: js.UndefOr[Input[Double]] = js.native
  var multipleOf: js.UndefOr[Input[Double]] = js.native
  var not: js.UndefOr[Input[JSONSchemaProps]] = js.native
  var nullable: js.UndefOr[Input[Boolean]] = js.native
  var oneOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  var pattern: js.UndefOr[Input[String]] = js.native
  var patternProperties: js.UndefOr[Input[js.Object]] = js.native
  var properties: js.UndefOr[Input[js.Object]] = js.native
  var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var title: js.UndefOr[Input[String]] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
  var uniqueItems: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
    * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
    * further restrict the embedded object. kind, apiVersion and metadata are validated
    * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
    * have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If
    * this is true, an empty type is allowed and type as child of anyOf is permitted if following
    * one of the following patterns:
    *
    * 1) anyOf:
    *    - type: integer
    *    - type: string
    * 2) allOf:
    *    - anyOf:
    *      - type: integer
    *      - type: string
    *    - ... zero or more
    */
  var x_kubernetes_int_or_string: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
    * specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
    * "map". Also, the values specified for this attribute must be a scalar typed field of the
    * child structure (no nesting is supported).
    */
  var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * x-kubernetes-list-type annotates an array to further describe its topology. This extension
    * must only be used on lists and may have 3 possible values:
    *
    * 1) `atomic`: the list is treated as a single entity, like a scalar.
    *      Atomic lists will be entirely replaced when updated. This extension
    *      may be used on any type of list (struct, scalar, ...).
    * 2) `set`:
    *      Sets are lists that must not have multiple items with the same value. Each
    *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
    *      array with x-kubernetes-list-type `atomic`.
    * 3) `map`:
    *      These lists are like maps in that their elements have a non-index key
    *      used to identify them. Order is preserved upon merge. The map tag
    *      must only be used on a list with elements of type object.
    * Defaults to atomic for arrays.
    */
  var x_kubernetes_list_type: js.UndefOr[Input[String]] = js.native
  /**
    * x-kubernetes-map-type annotates an object to further describe its topology. This extension
    * must only be used when type is object and may have 2 possible values:
    *
    * 1) `granular`:
    *      These maps are actual maps (key-value pairs) and each fields are independent
    *      from each other (they can each be manipulated by separate actors). This is
    *      the default behaviour for all maps.
    * 2) `atomic`: the list is treated as a single entity, like a scalar.
    *      Atomic maps will be entirely replaced when updated.
    */
  var x_kubernetes_map_type: js.UndefOr[Input[String]] = js.native
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
    * which are not specified in the validation schema. This affects fields recursively, but
    * switches back to normal pruning behaviour if nested properties or additionalProperties are
    * specified in the schema. This can either be true or undefined. False is forbidden.
    */
  var x_kubernetes_preserve_unknown_fields: js.UndefOr[Input[Boolean]] = js.native
}

object JSONSchemaProps {
  @scala.inline
  def apply(): JSONSchemaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchemaProps]
  }
  @scala.inline
  implicit class JSONSchemaPropsOps[Self <: JSONSchemaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$ref(value: Input[String]): Self = {
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
    def with$schema(value: Input[String]): Self = {
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
    def withAdditionalItems(value: Input[JSONSchemaProps | Boolean]): Self = {
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
    def withAdditionalProperties(value: Input[JSONSchemaProps | Boolean]): Self = {
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
    def withAllOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = {
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
    def withAnyOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = {
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
    def withDefault(value: Input[_]): Self = {
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
    def withDefinitions(value: Input[js.Object]): Self = {
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
    def withDependencies(value: Input[js.Object]): Self = {
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
    def withDescription(value: Input[String]): Self = {
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
    def withEnum(value: Input[js.Array[Input[_]]]): Self = {
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
    def withExample(value: Input[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMaximum(value: Input[Boolean]): Self = {
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
    def withExclusiveMinimum(value: Input[Boolean]): Self = {
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
    def withExternalDocs(value: Input[ExternalDocumentation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Input[String]): Self = {
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
    def withId(value: Input[String]): Self = {
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
    def withItems(value: Input[JSONSchemaProps | js.Array[_]]): Self = {
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
    def withMaxItems(value: Input[Double]): Self = {
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
    def withMaxLength(value: Input[Double]): Self = {
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
    def withMaxProperties(value: Input[Double]): Self = {
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
    def withMaximum(value: Input[Double]): Self = {
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
    def withMinItems(value: Input[Double]): Self = {
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
    def withMinLength(value: Input[Double]): Self = {
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
    def withMinProperties(value: Input[Double]): Self = {
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
    def withMinimum(value: Input[Double]): Self = {
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
    def withMultipleOf(value: Input[Double]): Self = {
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
    def withNot(value: Input[JSONSchemaProps]): Self = {
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
    def withNullable(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(js.undefined)
        ret
    }
    @scala.inline
    def withOneOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = {
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
    def withPattern(value: Input[String]): Self = {
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
    def withPatternProperties(value: Input[js.Object]): Self = {
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
    def withProperties(value: Input[js.Object]): Self = {
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
    def withRequired(value: Input[js.Array[Input[String]]]): Self = {
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
    def withTitle(value: Input[String]): Self = {
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
    def withType(value: Input[String]): Self = {
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
    def withUniqueItems(value: Input[Boolean]): Self = {
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
    @scala.inline
    def withX_kubernetes_embedded_resource(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_embedded_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_kubernetes_embedded_resource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_embedded_resource")(js.undefined)
        ret
    }
    @scala.inline
    def withX_kubernetes_int_or_string(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_int_or_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_kubernetes_int_or_string: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_int_or_string")(js.undefined)
        ret
    }
    @scala.inline
    def withX_kubernetes_list_map_keys(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_list_map_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_kubernetes_list_map_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_list_map_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withX_kubernetes_list_type(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_list_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_kubernetes_list_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_list_type")(js.undefined)
        ret
    }
    @scala.inline
    def withX_kubernetes_map_type(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_map_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_kubernetes_map_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_map_type")(js.undefined)
        ret
    }
    @scala.inline
    def withX_kubernetes_preserve_unknown_fields(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_preserve_unknown_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_kubernetes_preserve_unknown_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_kubernetes_preserve_unknown_fields")(js.undefined)
        ret
    }
  }
  
}

