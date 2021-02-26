package typingsSlinky.pkijs

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicKeyInfoMod {
  
  @JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
  @js.native
  class default () extends PublicKeyInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PublicKeyInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PublicKeyInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PublicKeyInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PublicKeyInfo extends StObject {
    
    var algorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def importKey(publicKey: CryptoKey): js.Thenable[Unit] = js.native
    
    var parsedKey: js.UndefOr[
        typingsSlinky.pkijs.ecpublickeyMod.default | typingsSlinky.pkijs.rsapublickeyMod.default
      ] = js.native
    
    var subjectPublicKey: BitString = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PublicKeyInfo {
    
    @scala.inline
    def apply(
      algorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      importKey: CryptoKey => js.Thenable[Unit],
      subjectPublicKey: BitString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PublicKeyInfo = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), importKey = js.Any.fromFunction1(importKey), subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PublicKeyInfo]
    }
    
    @scala.inline
    implicit class PublicKeyInfoMutableBuilder[Self <: PublicKeyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImportKey(value: CryptoKey => js.Thenable[Unit]): Self = StObject.set(x, "importKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParsedKey(value: typingsSlinky.pkijs.ecpublickeyMod.default | typingsSlinky.pkijs.rsapublickeyMod.default): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
      
      @scala.inline
      def setSubjectPublicKey(value: BitString): Self = StObject.set(x, "subjectPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
