package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userProfileMod {
  
  @JSImport("@pulumi/aws/opsworks/userProfile", "UserProfile")
  @js.native
  class UserProfile protected () extends CustomResource {
    /**
      * Create a UserProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserProfileArgs) = this()
    def this(name: String, args: UserProfileArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether users can specify their own SSH public key through the My Settings page
      */
    val allowSelfManagement: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The users public key
      */
    val sshPublicKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ssh username, with witch this user wants to log in
      */
    val sshUsername: Output_[String] = js.native
    
    /**
      * The user's IAM ARN
      */
    val userArn: Output_[String] = js.native
  }
  /* static members */
  object UserProfile {
    
    /**
      * Get an existing UserProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/opsworks/userProfile", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID]): UserProfile = js.native
    @JSImport("@pulumi/aws/opsworks/userProfile", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserProfile = js.native
    @JSImport("@pulumi/aws/opsworks/userProfile", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserProfileState): UserProfile = js.native
    @JSImport("@pulumi/aws/opsworks/userProfile", "UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserProfileState, opts: CustomResourceOptions): UserProfile = js.native
    
    /**
      * Returns true if the given object is an instance of UserProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/opsworks/userProfile", "UserProfile.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/userProfile.UserProfile */ Boolean = js.native
  }
  
  @js.native
  trait UserProfileArgs extends StObject {
    
    /**
      * Whether users can specify their own SSH public key through the My Settings page
      */
    val allowSelfManagement: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The users public key
      */
    val sshPublicKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ssh username, with witch this user wants to log in
      */
    val sshUsername: Input[String] = js.native
    
    /**
      * The user's IAM ARN
      */
    val userArn: Input[String] = js.native
  }
  object UserProfileArgs {
    
    @scala.inline
    def apply(sshUsername: Input[String], userArn: Input[String]): UserProfileArgs = {
      val __obj = js.Dynamic.literal(sshUsername = sshUsername.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProfileArgs]
    }
    
    @scala.inline
    implicit class UserProfileArgsMutableBuilder[Self <: UserProfileArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSelfManagement(value: Input[Boolean]): Self = StObject.set(x, "allowSelfManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSelfManagementUndefined: Self = StObject.set(x, "allowSelfManagement", js.undefined)
      
      @scala.inline
      def setSshPublicKey(value: Input[String]): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
      
      @scala.inline
      def setSshUsername(value: Input[String]): Self = StObject.set(x, "sshUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserArn(value: Input[String]): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserProfileState extends StObject {
    
    /**
      * Whether users can specify their own SSH public key through the My Settings page
      */
    val allowSelfManagement: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The users public key
      */
    val sshPublicKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ssh username, with witch this user wants to log in
      */
    val sshUsername: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user's IAM ARN
      */
    val userArn: js.UndefOr[Input[String]] = js.native
  }
  object UserProfileState {
    
    @scala.inline
    def apply(): UserProfileState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProfileState]
    }
    
    @scala.inline
    implicit class UserProfileStateMutableBuilder[Self <: UserProfileState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSelfManagement(value: Input[Boolean]): Self = StObject.set(x, "allowSelfManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSelfManagementUndefined: Self = StObject.set(x, "allowSelfManagement", js.undefined)
      
      @scala.inline
      def setSshPublicKey(value: Input[String]): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
      
      @scala.inline
      def setSshUsername(value: Input[String]): Self = StObject.set(x, "sshUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSshUsernameUndefined: Self = StObject.set(x, "sshUsername", js.undefined)
      
      @scala.inline
      def setUserArn(value: Input[String]): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
    }
  }
}
