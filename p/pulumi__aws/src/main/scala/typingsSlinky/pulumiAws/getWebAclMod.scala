package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWebAclMod {
  
  @JSImport("@pulumi/aws/wafregional/getWebAcl", "getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  @JSImport("@pulumi/aws/wafregional/getWebAcl", "getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
  
  @js.native
  trait GetWebAclArgs extends StObject {
    
    /**
      * The name of the WAF Regional Web ACL.
      */
    val name: String = js.native
  }
  object GetWebAclArgs {
    
    @scala.inline
    def apply(name: String): GetWebAclArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWebAclArgs]
    }
    
    @scala.inline
    implicit class GetWebAclArgsMutableBuilder[Self <: GetWebAclArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetWebAclResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetWebAclResult {
    
    @scala.inline
    def apply(id: String, name: String): GetWebAclResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWebAclResult]
    }
    
    @scala.inline
    implicit class GetWebAclResultMutableBuilder[Self <: GetWebAclResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
