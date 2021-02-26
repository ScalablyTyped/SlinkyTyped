package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceProfileMod {
  
  @JSImport("@pulumi/aws/iam/getInstanceProfile", "getInstanceProfile")
  @js.native
  def getInstanceProfile(args: GetInstanceProfileArgs): js.Promise[GetInstanceProfileResult] = js.native
  @JSImport("@pulumi/aws/iam/getInstanceProfile", "getInstanceProfile")
  @js.native
  def getInstanceProfile(args: GetInstanceProfileArgs, opts: InvokeOptions): js.Promise[GetInstanceProfileResult] = js.native
  
  @js.native
  trait GetInstanceProfileArgs extends StObject {
    
    /**
      * The friendly IAM instance profile name to match.
      */
    val name: String = js.native
  }
  object GetInstanceProfileArgs {
    
    @scala.inline
    def apply(name: String): GetInstanceProfileArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceProfileArgs]
    }
    
    @scala.inline
    implicit class GetInstanceProfileArgsMutableBuilder[Self <: GetInstanceProfileArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetInstanceProfileResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the instance profile.
      */
    val arn: String = js.native
    
    /**
      * The string representation of the date the instance profile
      * was created.
      */
    val createDate: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * The path to the instance profile.
      */
    val path: String = js.native
    
    /**
      * The role arn associated with this instance profile.
      */
    val roleArn: String = js.native
    
    /**
      * The role id associated with this instance profile.
      */
    val roleId: String = js.native
    
    /**
      * The role name associated with this instance profile.
      */
    val roleName: String = js.native
  }
  object GetInstanceProfileResult {
    
    @scala.inline
    def apply(
      arn: String,
      createDate: String,
      id: String,
      name: String,
      path: String,
      roleArn: String,
      roleId: String,
      roleName: String
    ): GetInstanceProfileResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceProfileResult]
    }
    
    @scala.inline
    implicit class GetInstanceProfileResultMutableBuilder[Self <: GetInstanceProfileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    }
  }
}
