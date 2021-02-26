package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRoleMod {
  
  @JSImport("@pulumi/aws/iam/getRole", "getRole")
  @js.native
  def getRole(args: GetRoleArgs): js.Promise[GetRoleResult] = js.native
  @JSImport("@pulumi/aws/iam/getRole", "getRole")
  @js.native
  def getRole(args: GetRoleArgs, opts: InvokeOptions): js.Promise[GetRoleResult] = js.native
  
  @js.native
  trait GetRoleArgs extends StObject {
    
    /**
      * The friendly IAM role name to match.
      */
    val name: String = js.native
    
    /**
      * The tags attached to the role.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetRoleArgs {
    
    @scala.inline
    def apply(name: String): GetRoleArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoleArgs]
    }
    
    @scala.inline
    implicit class GetRoleArgsMutableBuilder[Self <: GetRoleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetRoleResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the role.
      */
    val arn: String = js.native
    
    /**
      * The policy document associated with the role.
      */
    val assumeRolePolicy: String = js.native
    
    /**
      * Creation date of the role in RFC 3339 format.
      */
    val createDate: String = js.native
    
    /**
      * Description for the role.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Maximum session duration.
      */
    val maxSessionDuration: Double = js.native
    
    val name: String = js.native
    
    /**
      * The path to the role.
      */
    val path: String = js.native
    
    /**
      * The ARN of the policy that is used to set the permissions boundary for the role.
      */
    val permissionsBoundary: String = js.native
    
    /**
      * The tags attached to the role.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The stable and unique string identifying the role.
      */
    val uniqueId: String = js.native
  }
  object GetRoleResult {
    
    @scala.inline
    def apply(
      arn: String,
      assumeRolePolicy: String,
      createDate: String,
      description: String,
      id: String,
      maxSessionDuration: Double,
      name: String,
      path: String,
      permissionsBoundary: String,
      tags: StringDictionary[String],
      uniqueId: String
    ): GetRoleResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assumeRolePolicy = assumeRolePolicy.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxSessionDuration = maxSessionDuration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permissionsBoundary = permissionsBoundary.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoleResult]
    }
    
    @scala.inline
    implicit class GetRoleResultMutableBuilder[Self <: GetRoleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssumeRolePolicy(value: String): Self = StObject.set(x, "assumeRolePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSessionDuration(value: Double): Self = StObject.set(x, "maxSessionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsBoundary(value: String): Self = StObject.set(x, "permissionsBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
