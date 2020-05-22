package typingsSlinky.jsonSchemaCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchemaComparee = js.UndefOr[
    typingsSlinky.jsonSchema.mod.JSONSchema4 | typingsSlinky.jsonSchema.mod.JSONSchema6Definition | typingsSlinky.jsonSchema.mod.JSONSchema7Definition
  ]
  /**
    * The `string & {''?: never}` is a workaround for
    * [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729).
    * It will be removed as soon as it's not needed anymore.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsonSchemaCompare.mod.KnownKeys[typingsSlinky.jsonSchema.mod.JSONSchema4]
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.$id
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.$ref
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.$schema
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.multipleOf
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.maximum
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMaximum
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.minimum
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMinimum
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.maxLength
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.minLength
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.pattern
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.items
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.additionalItems
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.maxItems
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.minItems
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.uniqueItems
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.contains
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.maxProperties
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.minProperties
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.required
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.properties
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.patternProperties
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.additionalProperties
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.dependencies
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.propertyNames
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.enum
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.const
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.`type`
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.allOf
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.anyOf
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.oneOf
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.not
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.definitions
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.title
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.description
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.default
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.examples
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.format
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.$comment
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.`if`
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.`then`
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.`else`
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.contentMediaType
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.contentEncoding
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.readOnly
    - typingsSlinky.jsonSchemaCompare.jsonSchemaCompareStrings.writeOnly
    - java.lang.String with js.Object
  */
  type JSONSchemaKeys = typingsSlinky.jsonSchemaCompare.mod._JSONSchemaKeys | typingsSlinky.jsonSchemaCompare.mod.KnownKeys[typingsSlinky.jsonSchema.mod.JSONSchema4] | (java.lang.String with js.Object)
  type KnownKeys[T] = js.Any
}
