package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
@js.native
trait JSONSchemaProps extends StObject {
  
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. CustomResourceDefinitions with defaults must be created using the v1 (or newer) CustomResourceDefinition API.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  @JSName("$ref")
  var $ref: js.UndefOr[Input[String]] = js.native
  
  @JSName("$schema")
  var $schema: js.UndefOr[Input[String]] = js.native
  
  var additionalItems: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.native
  
  var additionalProperties: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.native
  
  var allOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  
  var anyOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  
  var definitions: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps]]]] = js.native
  
  var dependencies: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps | js.Array[Input[String]]]]]] = js.native
  
  var description: js.UndefOr[Input[String]] = js.native
  
  var enum: js.UndefOr[Input[js.Array[_]]] = js.native
  
  var example: js.UndefOr[js.Any] = js.native
  
  var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.native
  
  var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.native
  
  var externalDocs: js.UndefOr[Input[ExternalDocumentation]] = js.native
  
  /**
    * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
    *
    * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
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
  
  var patternProperties: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps]]]] = js.native
  
  var properties: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps]]]] = js.native
  
  var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var title: js.UndefOr[Input[String]] = js.native
  
  var `type`: js.UndefOr[Input[String]] = js.native
  
  var uniqueItems: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
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
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
    *
    * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
    */
  var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:
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
    * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:
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
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
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
  implicit class JSONSchemaPropsMutableBuilder[Self <: JSONSchemaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: Input[String]): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def set$schema(value: Input[String]): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    @scala.inline
    def setAdditionalItems(value: Input[JSONSchemaProps | Boolean]): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
    
    @scala.inline
    def setAdditionalProperties(value: Input[JSONSchemaProps | Boolean]): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: Input[JSONSchemaProps]*): Self = StObject.set(x, "allOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: Input[JSONSchemaProps]*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDefinitions(value: Input[StringDictionary[Input[JSONSchemaProps]]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setDependencies(value: Input[StringDictionary[Input[JSONSchemaProps | js.Array[Input[String]]]]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnum(value: Input[js.Array[_]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExclusiveMaximum(value: Input[Boolean]): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    @scala.inline
    def setExclusiveMinimum(value: Input[Boolean]): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: Input[ExternalDocumentation]): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: Input[JSONSchemaProps | js.Array[_]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMaxItems(value: Input[Double]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Input[Double]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxProperties(value: Input[Double]): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    @scala.inline
    def setMaximum(value: Input[Double]): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinItems(value: Input[Double]): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    @scala.inline
    def setMinLength(value: Input[Double]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMinProperties(value: Input[Double]): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    @scala.inline
    def setMinimum(value: Input[Double]): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setMultipleOf(value: Input[Double]): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    
    @scala.inline
    def setNot(value: Input[JSONSchemaProps]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setNullable(value: Input[Boolean]): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setOneOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: Input[JSONSchemaProps]*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: Input[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternProperties(value: Input[StringDictionary[Input[JSONSchemaProps]]]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setProperties(value: Input[StringDictionary[Input[JSONSchemaProps]]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRequired(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: Input[String]*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: Input[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniqueItems(value: Input[Boolean]): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    
    @scala.inline
    def setX_kubernetes_embedded_resource(value: Input[Boolean]): Self = StObject.set(x, "x_kubernetes_embedded_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_embedded_resourceUndefined: Self = StObject.set(x, "x_kubernetes_embedded_resource", js.undefined)
    
    @scala.inline
    def setX_kubernetes_int_or_string(value: Input[Boolean]): Self = StObject.set(x, "x_kubernetes_int_or_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_int_or_stringUndefined: Self = StObject.set(x, "x_kubernetes_int_or_string", js.undefined)
    
    @scala.inline
    def setX_kubernetes_list_map_keys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "x_kubernetes_list_map_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_list_map_keysUndefined: Self = StObject.set(x, "x_kubernetes_list_map_keys", js.undefined)
    
    @scala.inline
    def setX_kubernetes_list_map_keysVarargs(value: Input[String]*): Self = StObject.set(x, "x_kubernetes_list_map_keys", js.Array(value :_*))
    
    @scala.inline
    def setX_kubernetes_list_type(value: Input[String]): Self = StObject.set(x, "x_kubernetes_list_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_list_typeUndefined: Self = StObject.set(x, "x_kubernetes_list_type", js.undefined)
    
    @scala.inline
    def setX_kubernetes_map_type(value: Input[String]): Self = StObject.set(x, "x_kubernetes_map_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_map_typeUndefined: Self = StObject.set(x, "x_kubernetes_map_type", js.undefined)
    
    @scala.inline
    def setX_kubernetes_preserve_unknown_fields(value: Input[Boolean]): Self = StObject.set(x, "x_kubernetes_preserve_unknown_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_preserve_unknown_fieldsUndefined: Self = StObject.set(x, "x_kubernetes_preserve_unknown_fields", js.undefined)
  }
}
