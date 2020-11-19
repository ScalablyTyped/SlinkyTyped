package typingsSlinky.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/ResponseData", JSImport.Namespace)
@js.native
object responseDataMod extends js.Object {
  
  @js.native
  trait ResponseData extends js.Object {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var producedAt: js.Date = js.native
    
    var responderID: js.Any = js.native
    
    var responseExtensions: js.Array[typingsSlinky.pkijs.extensionMod.default] = js.native
    
    var responses: js.Array[typingsSlinky.pkijs.singleResponseMod.default] = js.native
    
    var tds: js.typedarray.ArrayBuffer = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
  }
  
  @js.native
  class default () extends ResponseData {
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
