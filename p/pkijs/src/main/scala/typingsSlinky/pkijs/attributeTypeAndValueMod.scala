package typingsSlinky.pkijs

import typingsSlinky.asn1js.mod.ObjectIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeTypeAndValueMod {
  
  @JSImport("pkijs/src/AttributeTypeAndValue", JSImport.Default)
  @js.native
  class default () extends AttributeTypeAndValue {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AttributeTypeAndValue", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/AttributeTypeAndValue", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/AttributeTypeAndValue", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait AttributeTypeAndValue extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def isEqual(compareTo: js.typedarray.ArrayBuffer): Boolean = js.native
    /**
      * Compare two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
      *
      * @param {(AttributeTypeAndValue|ArrayBuffer)} compareTo The value compare to current
      * @returns {boolean}
      *
      * @memberOf AttributeTypeAndValue
      */
    def isEqual(compareTo: AttributeTypeAndValue): Boolean = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    /**
      *
      *
      * @type {ObjectIdentifier}
      * @memberOf AttributeTypeAndValue
      */
    var `type`: ObjectIdentifier = js.native
    
    /**
      *
      *
      * @type {*}
      * @memberOf AttributeTypeAndValue
      */
    var value: js.Any = js.native
  }
}
