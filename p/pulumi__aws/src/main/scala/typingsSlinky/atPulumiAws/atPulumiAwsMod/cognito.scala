package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.cognitoGetUserPoolsMod.GetUserPoolsArgs
import typingsSlinky.atPulumiAws.cognitoGetUserPoolsMod.GetUserPoolsResult
import typingsSlinky.atPulumiAws.cognitoIdentityPoolMod.IdentityPoolArgs
import typingsSlinky.atPulumiAws.cognitoIdentityPoolMod.IdentityPoolState
import typingsSlinky.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs
import typingsSlinky.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
import typingsSlinky.atPulumiAws.cognitoIdentityProviderMod.IdentityProviderArgs
import typingsSlinky.atPulumiAws.cognitoIdentityProviderMod.IdentityProviderState
import typingsSlinky.atPulumiAws.cognitoResourceServerMod.ResourceServerArgs
import typingsSlinky.atPulumiAws.cognitoResourceServerMod.ResourceServerState
import typingsSlinky.atPulumiAws.cognitoUserGroupMod.UserGroupArgs
import typingsSlinky.atPulumiAws.cognitoUserGroupMod.UserGroupState
import typingsSlinky.atPulumiAws.cognitoUserPoolClientMod.UserPoolClientArgs
import typingsSlinky.atPulumiAws.cognitoUserPoolClientMod.UserPoolClientState
import typingsSlinky.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomainArgs
import typingsSlinky.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomainState
import typingsSlinky.atPulumiAws.cognitoUserPoolMod.UserPoolArgs
import typingsSlinky.atPulumiAws.cognitoUserPoolMod.UserPoolState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cognito")
@js.native
object cognito extends js.Object {
  @js.native
  class IdentityPool protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.IdentityPool {
    /**
      * Create a IdentityPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolArgs) = this()
    def this(name: String, args: IdentityPoolArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityPoolRoleAttachment protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.IdentityPoolRoleAttachment {
    /**
      * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolRoleAttachmentArgs) = this()
    def this(name: String, args: IdentityPoolRoleAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityProvider protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.IdentityProvider {
    /**
      * Create a IdentityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityProviderArgs) = this()
    def this(name: String, args: IdentityProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceServer protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.ResourceServer {
    /**
      * Create a ResourceServer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceServerArgs) = this()
    def this(name: String, args: ResourceServerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserGroup protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.UserGroup {
    /**
      * Create a UserGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserGroupArgs) = this()
    def this(name: String, args: UserGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPool protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.UserPool {
    /**
      * Create a UserPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UserPoolArgs) = this()
    def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolClient protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.UserPoolClient {
    /**
      * Create a UserPoolClient resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolClientArgs) = this()
    def this(name: String, args: UserPoolClientArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolDomain protected ()
    extends typingsSlinky.atPulumiAws.cognitoMod.UserPoolDomain {
    /**
      * Create a UserPoolDomain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolDomainArgs) = this()
    def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
  }
  
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  /* static members */
  @js.native
  object IdentityPool extends js.Object {
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoIdentityPoolMod.IdentityPool = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState): typingsSlinky.atPulumiAws.cognitoIdentityPoolMod.IdentityPool = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoIdentityPoolMod.IdentityPool = js.native
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityPoolRoleAttachment extends js.Object {
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): typingsSlinky.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityProvider extends js.Object {
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider = js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState): typingsSlinky.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider = js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider = js.native
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceServer extends js.Object {
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
    def get(name: String, id: Input[ID], state: ResourceServerState): typingsSlinky.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
    def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserGroup extends js.Object {
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
    def get(name: String, id: Input[ID], state: UserGroupState): typingsSlinky.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
    def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPool extends js.Object {
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
    def get(name: String, id: Input[ID], state: UserPoolState): typingsSlinky.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
    def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPoolClient extends js.Object {
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient = js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState): typingsSlinky.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient = js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient = js.native
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPoolDomain extends js.Object {
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState): typingsSlinky.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
  }
  
}

