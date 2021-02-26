package typingsSlinky.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kms {
  
  @js.native
  trait GetSecretSecret extends StObject {
    
    var context: js.UndefOr[StringDictionary[String]] = js.native
    
    var grantTokens: js.UndefOr[js.Array[String]] = js.native
    
    var name: String = js.native
    
    var payload: String = js.native
  }
  object GetSecretSecret {
    
    @scala.inline
    def apply(name: String, payload: String): GetSecretSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretSecret]
    }
    
    @scala.inline
    implicit class GetSecretSecretMutableBuilder[Self <: GetSecretSecret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "grantTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokensUndefined: Self = StObject.set(x, "grantTokens", js.undefined)
      
      @scala.inline
      def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "grantTokens", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSecretsSecret extends StObject {
    
    /**
      * An optional mapping that makes up the Encryption Context for the secret.
      */
    var context: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * An optional list of Grant Tokens for the secret.
      */
    var grantTokens: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The name to export this secret under in the attributes.
      */
    var name: String = js.native
    
    /**
      * Base64 encoded payload, as returned from a KMS encrypt operation.
      */
    var payload: String = js.native
  }
  object GetSecretsSecret {
    
    @scala.inline
    def apply(name: String, payload: String): GetSecretsSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretsSecret]
    }
    
    @scala.inline
    implicit class GetSecretsSecretMutableBuilder[Self <: GetSecretsSecret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: StringDictionary[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "grantTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokensUndefined: Self = StObject.set(x, "grantTokens", js.undefined)
      
      @scala.inline
      def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "grantTokens", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GrantConstraint extends StObject {
    
    /**
      * A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
      */
    var encryptionContextEquals: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
      */
    var encryptionContextSubset: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object GrantConstraint {
    
    @scala.inline
    def apply(): GrantConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantConstraint]
    }
    
    @scala.inline
    implicit class GrantConstraintMutableBuilder[Self <: GrantConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionContextEquals(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "encryptionContextEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "encryptionContextEquals", js.undefined)
      
      @scala.inline
      def setEncryptionContextSubset(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "encryptionContextSubset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "encryptionContextSubset", js.undefined)
    }
  }
}
