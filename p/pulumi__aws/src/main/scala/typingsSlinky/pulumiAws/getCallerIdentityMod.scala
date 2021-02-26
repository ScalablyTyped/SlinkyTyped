package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCallerIdentityMod {
  
  @JSImport("@pulumi/aws/getCallerIdentity", "getCallerIdentity")
  @js.native
  def getCallerIdentity(): js.Promise[GetCallerIdentityResult] = js.native
  @JSImport("@pulumi/aws/getCallerIdentity", "getCallerIdentity")
  @js.native
  def getCallerIdentity(opts: InvokeOptions): js.Promise[GetCallerIdentityResult] = js.native
  
  @js.native
  trait GetCallerIdentityResult extends StObject {
    
    /**
      * The AWS Account ID number of the account that owns or contains the calling entity.
      */
    val accountId: String = js.native
    
    /**
      * The AWS ARN associated with the calling entity.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The unique identifier of the calling entity.
      */
    val userId: String = js.native
  }
  object GetCallerIdentityResult {
    
    @scala.inline
    def apply(accountId: String, arn: String, id: String, userId: String): GetCallerIdentityResult = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCallerIdentityResult]
    }
    
    @scala.inline
    implicit class GetCallerIdentityResultMutableBuilder[Self <: GetCallerIdentityResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
