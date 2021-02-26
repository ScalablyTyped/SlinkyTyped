package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.documentsMod.PolicyDocument
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roleMod {
  
  @JSImport("@pulumi/aws/iam/role", "Role")
  @js.native
  class Role protected () extends CustomResource {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the role.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The policy that grants an entity permission to assume the role.
      */
    val assumeRolePolicy: Output_[String] = js.native
    
    /**
      * The creation date of the IAM role.
      */
    val createDate: Output_[String] = js.native
    
    /**
      * The description of the role.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
      */
    val forceDetachPolicies: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
      */
    val maxSessionDuration: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name of the role. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The path to the role.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
      */
    val path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the policy that is used to set the permissions boundary for the role.
      */
    val permissionsBoundary: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of tags for the IAM role
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The stable and unique string identifying the role.
      */
    val uniqueId: Output_[String] = js.native
  }
  /* static members */
  object Role {
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/role", "Role.get")
    @js.native
    def get(name: String, id: Input[ID]): Role = js.native
    @JSImport("@pulumi/aws/iam/role", "Role.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Role = js.native
    @JSImport("@pulumi/aws/iam/role", "Role.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleState): Role = js.native
    @JSImport("@pulumi/aws/iam/role", "Role.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleState, opts: CustomResourceOptions): Role = js.native
    
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/role", "Role.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/role.Role */ Boolean = js.native
  }
  
  @js.native
  trait RoleArgs extends StObject {
    
    /**
      * The policy that grants an entity permission to assume the role.
      */
    val assumeRolePolicy: Input[String | PolicyDocument] = js.native
    
    /**
      * The description of the role.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
      */
    val forceDetachPolicies: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
      */
    val maxSessionDuration: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name of the role. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The path to the role.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the policy that is used to set the permissions boundary for the role.
      */
    val permissionsBoundary: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the IAM role
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RoleArgs {
    
    @scala.inline
    def apply(assumeRolePolicy: Input[String | PolicyDocument]): RoleArgs = {
      val __obj = js.Dynamic.literal(assumeRolePolicy = assumeRolePolicy.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleArgs]
    }
    
    @scala.inline
    implicit class RoleArgsMutableBuilder[Self <: RoleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssumeRolePolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "assumeRolePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setForceDetachPolicies(value: Input[Boolean]): Self = StObject.set(x, "forceDetachPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDetachPoliciesUndefined: Self = StObject.set(x, "forceDetachPolicies", js.undefined)
      
      @scala.inline
      def setMaxSessionDuration(value: Input[Double]): Self = StObject.set(x, "maxSessionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSessionDurationUndefined: Self = StObject.set(x, "maxSessionDuration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPermissionsBoundary(value: Input[String]): Self = StObject.set(x, "permissionsBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsBoundaryUndefined: Self = StObject.set(x, "permissionsBoundary", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait RoleState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the role.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The policy that grants an entity permission to assume the role.
      */
    val assumeRolePolicy: js.UndefOr[Input[String | PolicyDocument]] = js.native
    
    /**
      * The creation date of the IAM role.
      */
    val createDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the role.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
      */
    val forceDetachPolicies: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
      */
    val maxSessionDuration: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The name of the role. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The path to the role.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the policy that is used to set the permissions boundary for the role.
      */
    val permissionsBoundary: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the IAM role
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The stable and unique string identifying the role.
      */
    val uniqueId: js.UndefOr[Input[String]] = js.native
  }
  object RoleState {
    
    @scala.inline
    def apply(): RoleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleState]
    }
    
    @scala.inline
    implicit class RoleStateMutableBuilder[Self <: RoleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAssumeRolePolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "assumeRolePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssumeRolePolicyUndefined: Self = StObject.set(x, "assumeRolePolicy", js.undefined)
      
      @scala.inline
      def setCreateDate(value: Input[String]): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDateUndefined: Self = StObject.set(x, "createDate", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setForceDetachPolicies(value: Input[Boolean]): Self = StObject.set(x, "forceDetachPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDetachPoliciesUndefined: Self = StObject.set(x, "forceDetachPolicies", js.undefined)
      
      @scala.inline
      def setMaxSessionDuration(value: Input[Double]): Self = StObject.set(x, "maxSessionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSessionDurationUndefined: Self = StObject.set(x, "maxSessionDuration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPermissionsBoundary(value: Input[String]): Self = StObject.set(x, "permissionsBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsBoundaryUndefined: Self = StObject.set(x, "permissionsBoundary", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUniqueId(value: Input[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
}
