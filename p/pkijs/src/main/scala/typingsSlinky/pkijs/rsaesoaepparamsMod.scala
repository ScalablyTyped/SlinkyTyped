package typingsSlinky.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaesoaepparamsMod {
  
  @JSImport("pkijs/src/RSAESOAEPParams", JSImport.Default)
  @js.native
  class default () extends RSAESOAEPParams {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RSAESOAEPParams", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RSAESOAEPParams", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RSAESOAEPParams", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RSAESOAEPParams extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    var maskGenAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    var pSourceAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object RSAESOAEPParams {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
      maskGenAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
      pSourceAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RSAESOAEPParams = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], pSourceAlgorithm = pSourceAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RSAESOAEPParams]
    }
    
    @scala.inline
    implicit class RSAESOAEPParamsMutableBuilder[Self <: RSAESOAEPParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskGenAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPSourceAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "pSourceAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
