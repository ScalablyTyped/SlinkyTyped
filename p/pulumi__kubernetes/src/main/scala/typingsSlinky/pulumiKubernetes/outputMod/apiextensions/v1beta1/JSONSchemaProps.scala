package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
@js.native
trait JSONSchemaProps extends js.Object {
  
  @JSName("$ref")
  var $ref: String = js.native
  
  @JSName("$schema")
  var $schema: String = js.native
  
  var additionalItems: JSONSchemaProps | Boolean = js.native
  
  var additionalProperties: JSONSchemaProps | Boolean = js.native
  
  var allOf: js.Array[JSONSchemaProps] = js.native
  
  var anyOf: js.Array[JSONSchemaProps] = js.native
  
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. CustomResourceDefinitions with defaults must be created using the v1 (or newer) CustomResourceDefinition API.
    */
  var default: js.Any = js.native
  
  var definitions: StringDictionary[JSONSchemaProps] = js.native
  
  var dependencies: StringDictionary[JSONSchemaProps | js.Array[String]] = js.native
  
  var description: String = js.native
  
  var enum: js.Array[_] = js.native
  
  var example: js.Any = js.native
  
  var exclusiveMaximum: Boolean = js.native
  
  var exclusiveMinimum: Boolean = js.native
  
  var externalDocs: ExternalDocumentation = js.native
  
  /**
    * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
    *
    * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
    */
  var format: String = js.native
  
  var id: String = js.native
  
  var items: JSONSchemaProps | js.Array[_] = js.native
  
  var maxItems: Double = js.native
  
  var maxLength: Double = js.native
  
  var maxProperties: Double = js.native
  
  var maximum: Double = js.native
  
  var minItems: Double = js.native
  
  var minLength: Double = js.native
  
  var minProperties: Double = js.native
  
  var minimum: Double = js.native
  
  var multipleOf: Double = js.native
  
  var not: JSONSchemaProps = js.native
  
  var nullable: Boolean = js.native
  
  var oneOf: js.Array[JSONSchemaProps] = js.native
  
  var pattern: String = js.native
  
  var patternProperties: StringDictionary[JSONSchemaProps] = js.native
  
  var properties: StringDictionary[JSONSchemaProps] = js.native
  
  var required: js.Array[String] = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
  
  var uniqueItems: Boolean = js.native
  
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  var x_kubernetes_embedded_resource: Boolean = js.native
  
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
  var x_kubernetes_int_or_string: Boolean = js.native
  
  /**
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
    *
    * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
    */
  var x_kubernetes_list_map_keys: js.Array[String] = js.native
  
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
  var x_kubernetes_list_type: String = js.native
  
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
  var x_kubernetes_map_type: String = js.native
  
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
    */
  var x_kubernetes_preserve_unknown_fields: Boolean = js.native
}
object JSONSchemaProps {
  
  @scala.inline
  def apply(
    $ref: String,
    $schema: String,
    additionalItems: JSONSchemaProps | Boolean,
    additionalProperties: JSONSchemaProps | Boolean,
    allOf: js.Array[JSONSchemaProps],
    anyOf: js.Array[JSONSchemaProps],
    default: js.Any,
    definitions: StringDictionary[JSONSchemaProps],
    dependencies: StringDictionary[JSONSchemaProps | js.Array[String]],
    description: String,
    enum: js.Array[_],
    example: js.Any,
    exclusiveMaximum: Boolean,
    exclusiveMinimum: Boolean,
    externalDocs: ExternalDocumentation,
    format: String,
    id: String,
    items: JSONSchemaProps | js.Array[_],
    maxItems: Double,
    maxLength: Double,
    maxProperties: Double,
    maximum: Double,
    minItems: Double,
    minLength: Double,
    minProperties: Double,
    minimum: Double,
    multipleOf: Double,
    not: JSONSchemaProps,
    nullable: Boolean,
    oneOf: js.Array[JSONSchemaProps],
    pattern: String,
    patternProperties: StringDictionary[JSONSchemaProps],
    properties: StringDictionary[JSONSchemaProps],
    required: js.Array[String],
    title: String,
    `type`: String,
    uniqueItems: Boolean,
    x_kubernetes_embedded_resource: Boolean,
    x_kubernetes_int_or_string: Boolean,
    x_kubernetes_list_map_keys: js.Array[String],
    x_kubernetes_list_type: String,
    x_kubernetes_map_type: String,
    x_kubernetes_preserve_unknown_fields: Boolean
  ): JSONSchemaProps = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any], $schema = $schema.asInstanceOf[js.Any], additionalItems = additionalItems.asInstanceOf[js.Any], additionalProperties = additionalProperties.asInstanceOf[js.Any], allOf = allOf.asInstanceOf[js.Any], anyOf = anyOf.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], exclusiveMaximum = exclusiveMaximum.asInstanceOf[js.Any], exclusiveMinimum = exclusiveMinimum.asInstanceOf[js.Any], externalDocs = externalDocs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxProperties = maxProperties.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minProperties = minProperties.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], multipleOf = multipleOf.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternProperties = patternProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniqueItems = uniqueItems.asInstanceOf[js.Any], x_kubernetes_embedded_resource = x_kubernetes_embedded_resource.asInstanceOf[js.Any], x_kubernetes_int_or_string = x_kubernetes_int_or_string.asInstanceOf[js.Any], x_kubernetes_list_map_keys = x_kubernetes_list_map_keys.asInstanceOf[js.Any], x_kubernetes_list_type = x_kubernetes_list_type.asInstanceOf[js.Any], x_kubernetes_map_type = x_kubernetes_map_type.asInstanceOf[js.Any], x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaProps]
  }
  
  @scala.inline
  implicit class JSONSchemaPropsOps[Self <: JSONSchemaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$schema(value: String): Self = this.set("$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalItems(value: JSONSchemaProps | Boolean): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalProperties(value: JSONSchemaProps | Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllOfVarargs(value: JSONSchemaProps*): Self = this.set("allOf", js.Array(value :_*))
    
    @scala.inline
    def setAllOf(value: js.Array[JSONSchemaProps]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyOfVarargs(value: JSONSchemaProps*): Self = this.set("anyOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[JSONSchemaProps]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitions(value: StringDictionary[JSONSchemaProps]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: StringDictionary[JSONSchemaProps | js.Array[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[_]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExample(value: js.Any): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentation): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: JSONSchemaProps | js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxProperties(value: Double): Self = this.set("maxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProperties(value: Double): Self = this.set("minProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleOf(value: Double): Self = this.set("multipleOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot(value: JSONSchemaProps): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfVarargs(value: JSONSchemaProps*): Self = this.set("oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: js.Array[JSONSchemaProps]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternProperties(value: StringDictionary[JSONSchemaProps]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchemaProps]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_embedded_resource(value: Boolean): Self = this.set("x_kubernetes_embedded_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_int_or_string(value: Boolean): Self = this.set("x_kubernetes_int_or_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_list_map_keysVarargs(value: String*): Self = this.set("x_kubernetes_list_map_keys", js.Array(value :_*))
    
    @scala.inline
    def setX_kubernetes_list_map_keys(value: js.Array[String]): Self = this.set("x_kubernetes_list_map_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_list_type(value: String): Self = this.set("x_kubernetes_list_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_map_type(value: String): Self = this.set("x_kubernetes_map_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_kubernetes_preserve_unknown_fields(value: Boolean): Self = this.set("x_kubernetes_preserve_unknown_fields", value.asInstanceOf[js.Any])
  }
}
