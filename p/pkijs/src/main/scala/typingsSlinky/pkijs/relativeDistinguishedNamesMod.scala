package typingsSlinky.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/RelativeDistinguishedNames", JSImport.Namespace)
@js.native
object relativeDistinguishedNamesMod extends js.Object {
  
  @js.native
  trait RelativeDistinguishedNames extends js.Object {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Compare two RDN values, or RDN with ArrayBuffer value
      * @param {(RelativeDistinguishedNames|ArrayBuffer)} compareTo The value compare to current
      * @returns {boolean}
      */
    def isEqual(compareTo: RelativeDistinguishedNames): Boolean = js.native
    def isEqual(compareTo: js.typedarray.ArrayBuffer): Boolean = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var typesAndValues: js.Array[typingsSlinky.pkijs.attributeTypeAndValueMod.default] = js.native
    
    var valueBeforeDecode: js.typedarray.ArrayBuffer = js.native
  }
  
  @js.native
  class default () extends RelativeDistinguishedNames {
    def this(params: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    def defaultValues(memberName: String): js.Any = js.native
    
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
}
