package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2GetIpSetMod {
  
  @JSImport("@pulumi/aws/wafv2/getIpSet", "getIpSet")
  @js.native
  def getIpSet(args: GetIpSetArgs): js.Promise[GetIpSetResult] = js.native
  @JSImport("@pulumi/aws/wafv2/getIpSet", "getIpSet")
  @js.native
  def getIpSet(args: GetIpSetArgs, opts: InvokeOptions): js.Promise[GetIpSetResult] = js.native
  
  @js.native
  trait GetIpSetArgs extends StObject {
    
    /**
      * The name of the WAFv2 IP Set.
      */
    val name: String = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: String = js.native
  }
  object GetIpSetArgs {
    
    @scala.inline
    def apply(name: String, scope: String): GetIpSetArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpSetArgs]
    }
    
    @scala.inline
    implicit class GetIpSetArgsMutableBuilder[Self <: GetIpSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetIpSetResult extends StObject {
    
    /**
      * An array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
      */
    val addresses: js.Array[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the entity.
      */
    val arn: String = js.native
    
    /**
      * The description of the set that helps with identification.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The IP address version of the set.
      */
    val ipAddressVersion: String = js.native
    
    val name: String = js.native
    
    val scope: String = js.native
  }
  object GetIpSetResult {
    
    @scala.inline
    def apply(
      addresses: js.Array[String],
      arn: String,
      description: String,
      id: String,
      ipAddressVersion: String,
      name: String,
      scope: String
    ): GetIpSetResult = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddressVersion = ipAddressVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpSetResult]
    }
    
    @scala.inline
    implicit class GetIpSetResultMutableBuilder[Self <: GetIpSetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressVersion(value: String): Self = StObject.set(x, "ipAddressVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
