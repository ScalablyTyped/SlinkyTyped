package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getUserPoolsMod.GetUserPoolsArgs
import typingsSlinky.pulumiAws.getUserPoolsMod.GetUserPoolsResult
import typingsSlinky.pulumiAws.identityPoolMod.IdentityPoolArgs
import typingsSlinky.pulumiAws.identityPoolMod.IdentityPoolState
import typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs
import typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
import typingsSlinky.pulumiAws.identityProviderMod.IdentityProviderArgs
import typingsSlinky.pulumiAws.identityProviderMod.IdentityProviderState
import typingsSlinky.pulumiAws.resourceServerMod.ResourceServerArgs
import typingsSlinky.pulumiAws.resourceServerMod.ResourceServerState
import typingsSlinky.pulumiAws.userGroupMod.UserGroupArgs
import typingsSlinky.pulumiAws.userGroupMod.UserGroupState
import typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClientArgs
import typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClientState
import typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomainArgs
import typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomainState
import typingsSlinky.pulumiAws.userPoolMod.UserPoolArgs
import typingsSlinky.pulumiAws.userPoolMod.UserPoolState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognitoMod {
  
  @JSImport("@pulumi/aws/cognito", "IdentityPool")
  @js.native
  class IdentityPool protected ()
    extends typingsSlinky.pulumiAws.identityPoolMod.IdentityPool {
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
  /* static members */
  object IdentityPool {
    
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.identityPoolMod.IdentityPool = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityPoolMod.IdentityPool = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState): typingsSlinky.pulumiAws.identityPoolMod.IdentityPool = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityPoolMod.IdentityPool = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "IdentityPool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "IdentityPoolRoleAttachment")
  @js.native
  class IdentityPoolRoleAttachment protected ()
    extends typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment {
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
  /* static members */
  object IdentityPoolRoleAttachment {
    
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "IdentityPoolRoleAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "IdentityProvider")
  @js.native
  class IdentityProvider protected ()
    extends typingsSlinky.pulumiAws.identityProviderMod.IdentityProvider {
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
  /* static members */
  object IdentityProvider {
    
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.identityProviderMod.IdentityProvider = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityProviderMod.IdentityProvider = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState): typingsSlinky.pulumiAws.identityProviderMod.IdentityProvider = js.native
    @JSImport("@pulumi/aws/cognito", "IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityProviderMod.IdentityProvider = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "IdentityProvider.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "ResourceServer")
  @js.native
  class ResourceServer protected ()
    extends typingsSlinky.pulumiAws.resourceServerMod.ResourceServer {
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
  /* static members */
  object ResourceServer {
    
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceServerMod.ResourceServer = js.native
    @JSImport("@pulumi/aws/cognito", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceServerMod.ResourceServer = js.native
    @JSImport("@pulumi/aws/cognito", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceServerState): typingsSlinky.pulumiAws.resourceServerMod.ResourceServer = js.native
    @JSImport("@pulumi/aws/cognito", "ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceServerMod.ResourceServer = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "ResourceServer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "UserGroup")
  @js.native
  class UserGroup protected ()
    extends typingsSlinky.pulumiAws.userGroupMod.UserGroup {
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
  /* static members */
  object UserGroup {
    
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.userGroupMod.UserGroup = js.native
    @JSImport("@pulumi/aws/cognito", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.userGroupMod.UserGroup = js.native
    @JSImport("@pulumi/aws/cognito", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupState): typingsSlinky.pulumiAws.userGroupMod.UserGroup = js.native
    @JSImport("@pulumi/aws/cognito", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.userGroupMod.UserGroup = js.native
    
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "UserGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "UserPool")
  @js.native
  class UserPool protected ()
    extends typingsSlinky.pulumiAws.userPoolMod.UserPool {
    /**
      * Create a UserPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UserPoolArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object UserPool {
    
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "UserPool.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.userPoolMod.UserPool = js.native
    @JSImport("@pulumi/aws/cognito", "UserPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.userPoolMod.UserPool = js.native
    @JSImport("@pulumi/aws/cognito", "UserPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolState): typingsSlinky.pulumiAws.userPoolMod.UserPool = js.native
    @JSImport("@pulumi/aws/cognito", "UserPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.userPoolMod.UserPool = js.native
    
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "UserPool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "UserPoolClient")
  @js.native
  class UserPoolClient protected ()
    extends typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClient {
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
  /* static members */
  object UserPoolClient {
    
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    @JSImport("@pulumi/aws/cognito", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    @JSImport("@pulumi/aws/cognito", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState): typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    @JSImport("@pulumi/aws/cognito", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "UserPoolClient.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "UserPoolDomain")
  @js.native
  class UserPoolDomain protected ()
    extends typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomain {
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
  /* static members */
  object UserPoolDomain {
    
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    @JSImport("@pulumi/aws/cognito", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    @JSImport("@pulumi/aws/cognito", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState): typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    @JSImport("@pulumi/aws/cognito", "UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito", "UserPoolDomain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cognito", "getUserPools")
  @js.native
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] = js.native
  @JSImport("@pulumi/aws/cognito", "getUserPools")
  @js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] = js.native
}
