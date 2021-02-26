package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationsAccountMod {
  
  @JSImport("@pulumi/aws/organizations/account", "Account")
  @js.native
  class Account protected () extends CustomResource {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN for this account.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
      */
    val email: Output_[String] = js.native
    
    /**
      * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
      */
    val iamUserAccessToBilling: Output_[js.UndefOr[String]] = js.native
    
    val joinedMethod: Output_[String] = js.native
    
    val joinedTimestamp: Output_[String] = js.native
    
    /**
      * A friendly name for the member account.
      */
    val name: Output_[String] = js.native
    
    /**
      * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
      */
    val parentId: Output_[String] = js.native
    
    /**
      * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
      */
    val roleName: Output_[js.UndefOr[String]] = js.native
    
    val status: Output_[String] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Account {
    
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations/account", "Account.get")
    @js.native
    def get(name: String, id: Input[ID]): Account = js.native
    @JSImport("@pulumi/aws/organizations/account", "Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Account = js.native
    @JSImport("@pulumi/aws/organizations/account", "Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountState): Account = js.native
    @JSImport("@pulumi/aws/organizations/account", "Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): Account = js.native
    
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations/account", "Account.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean = js.native
  }
  
  @js.native
  trait AccountArgs extends StObject {
    
    /**
      * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
      */
    val email: Input[String] = js.native
    
    /**
      * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
      */
    val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name for the member account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
      */
    val parentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
      */
    val roleName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AccountArgs {
    
    @scala.inline
    def apply(email: Input[String]): AccountArgs = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountArgs]
    }
    
    @scala.inline
    implicit class AccountArgsMutableBuilder[Self <: AccountArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUserAccessToBilling(value: Input[String]): Self = StObject.set(x, "iamUserAccessToBilling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUserAccessToBillingUndefined: Self = StObject.set(x, "iamUserAccessToBilling", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setRoleName(value: Input[String]): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait AccountState extends StObject {
    
    /**
      * The ARN for this account.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
      */
    val email: js.UndefOr[Input[String]] = js.native
    
    /**
      * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
      */
    val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.native
    
    val joinedMethod: js.UndefOr[Input[String]] = js.native
    
    val joinedTimestamp: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name for the member account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
      */
    val parentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
      */
    val roleName: js.UndefOr[Input[String]] = js.native
    
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AccountState {
    
    @scala.inline
    def apply(): AccountState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountState]
    }
    
    @scala.inline
    implicit class AccountStateMutableBuilder[Self <: AccountState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setIamUserAccessToBilling(value: Input[String]): Self = StObject.set(x, "iamUserAccessToBilling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUserAccessToBillingUndefined: Self = StObject.set(x, "iamUserAccessToBilling", js.undefined)
      
      @scala.inline
      def setJoinedMethod(value: Input[String]): Self = StObject.set(x, "joinedMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinedMethodUndefined: Self = StObject.set(x, "joinedMethod", js.undefined)
      
      @scala.inline
      def setJoinedTimestamp(value: Input[String]): Self = StObject.set(x, "joinedTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinedTimestampUndefined: Self = StObject.set(x, "joinedTimestamp", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setRoleName(value: Input[String]): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
