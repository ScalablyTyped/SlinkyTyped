package typingsSlinky.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleResponseMod {
  
  @JSImport("pkijs/src/SingleResponse", JSImport.Default)
  @js.native
  class default () extends SingleResponse {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/SingleResponse", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/SingleResponse", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/SingleResponse", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/SingleResponse", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait SingleResponse extends StObject {
    
    var certID: typingsSlinky.pkijs.certIDMod.default = js.native
    
    var certStatus: js.Any = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var nextUpdate: js.UndefOr[js.Date] = js.native
    
    var singleExtensions: js.Array[typingsSlinky.pkijs.extensionMod.default] = js.native
    
    var thisUpdate: js.Date = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object SingleResponse {
    
    @scala.inline
    def apply(
      certID: typingsSlinky.pkijs.certIDMod.default,
      certStatus: js.Any,
      fromSchema: js.Any => Unit,
      singleExtensions: js.Array[typingsSlinky.pkijs.extensionMod.default],
      thisUpdate: js.Date,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): SingleResponse = {
      val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), singleExtensions = singleExtensions.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[SingleResponse]
    }
    
    @scala.inline
    implicit class SingleResponseMutableBuilder[Self <: SingleResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertID(value: typingsSlinky.pkijs.certIDMod.default): Self = StObject.set(x, "certID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertStatus(value: js.Any): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUpdate(value: js.Date): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
      
      @scala.inline
      def setSingleExtensions(value: js.Array[typingsSlinky.pkijs.extensionMod.default]): Self = StObject.set(x, "singleExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleExtensionsVarargs(value: typingsSlinky.pkijs.extensionMod.default*): Self = StObject.set(x, "singleExtensions", js.Array(value :_*))
      
      @scala.inline
      def setThisUpdate(value: js.Date): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
