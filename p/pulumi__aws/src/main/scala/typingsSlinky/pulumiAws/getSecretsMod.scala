package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.kms.GetSecretsSecret
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecretsMod {
  
  @JSImport("@pulumi/aws/kms/getSecrets", "getSecrets")
  @js.native
  def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] = js.native
  @JSImport("@pulumi/aws/kms/getSecrets", "getSecrets")
  @js.native
  def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] = js.native
  
  @js.native
  trait GetSecretsArgs extends StObject {
    
    /**
      * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
      */
    val secrets: js.Array[GetSecretsSecret] = js.native
  }
  object GetSecretsArgs {
    
    @scala.inline
    def apply(secrets: js.Array[GetSecretsSecret]): GetSecretsArgs = {
      val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretsArgs]
    }
    
    @scala.inline
    implicit class GetSecretsArgsMutableBuilder[Self <: GetSecretsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecrets(value: js.Array[GetSecretsSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsVarargs(value: GetSecretsSecret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetSecretsResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Map containing each `secret` `name` as the key with its decrypted plaintext value
      */
    val plaintext: StringDictionary[String] = js.native
    
    val secrets: js.Array[typingsSlinky.pulumiAws.outputMod.kms.GetSecretsSecret] = js.native
  }
  object GetSecretsResult {
    
    @scala.inline
    def apply(
      id: String,
      plaintext: StringDictionary[String],
      secrets: js.Array[typingsSlinky.pulumiAws.outputMod.kms.GetSecretsSecret]
    ): GetSecretsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretsResult]
    }
    
    @scala.inline
    implicit class GetSecretsResultMutableBuilder[Self <: GetSecretsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: StringDictionary[String]): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecrets(value: js.Array[typingsSlinky.pulumiAws.outputMod.kms.GetSecretsSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsVarargs(value: typingsSlinky.pulumiAws.outputMod.kms.GetSecretsSecret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    }
  }
}
