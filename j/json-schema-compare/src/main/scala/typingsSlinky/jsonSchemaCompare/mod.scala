package typingsSlinky.jsonSchemaCompare

import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.jsonSchema.mod.JSONSchema6Definition
import typingsSlinky.jsonSchema.mod.JSONSchema7Definition
import typingsSlinky.jsonSchemaCompare.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compare json schemas correctly.
    *
    * - Ignores sort for arrays where sort does not matter, like required, enum, type, anyOf, oneOf, anyOf, dependencies (if array)
    * - Compares correctly type when array or string
    * - Ignores duplicate values before comparing
    * - For schemas and sub schemas `undefined`, `true` and `{}` are equal
    * - For minLength, minItems and minProperties `undefined` and `0` are equal
    * - For uniqueItems, `undefined` and `false` are equal
    */
  @JSImport("json-schema-compare", JSImport.Namespace)
  @js.native
  def apply(a: JSONSchemaComparee, b: JSONSchemaComparee): Boolean = js.native
  @JSImport("json-schema-compare", JSImport.Namespace)
  @js.native
  def apply(a: JSONSchemaComparee, b: JSONSchemaComparee, options: Options): Boolean = js.native
  
  type JSONSchemaComparee = js.UndefOr[JSONSchema4 | JSONSchema6Definition | JSONSchema7Definition]
  
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
    - java.lang.String with typingsSlinky.jsonSchemaCompare.anon._empty
  */
  type JSONSchemaKeys = _JSONSchemaKeys | KnownKeys[JSONSchema4] | (String with _empty)
  
  type KnownKeys[T] = js.Any
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Ignores certain keywords, useful to exclude meta keywords like title,
      * description etc or custom keywords. If all you want to know if they are
      * the same in terms of validation keywords.
      *
      * @default []
      */
    var ignore: js.UndefOr[js.Array[JSONSchemaKeys]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: js.Array[JSONSchemaKeys]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: JSONSchemaKeys*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
  
  trait _JSONSchemaKeys extends StObject
}
