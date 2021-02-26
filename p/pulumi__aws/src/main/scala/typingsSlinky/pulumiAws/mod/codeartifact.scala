package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.domainMod.DomainArgs
import typingsSlinky.pulumiAws.domainMod.DomainState
import typingsSlinky.pulumiAws.domainPermissionsMod.DomainPermissionsArgs
import typingsSlinky.pulumiAws.domainPermissionsMod.DomainPermissionsState
import typingsSlinky.pulumiAws.getAuthorizationTokenMod.GetAuthorizationTokenArgs
import typingsSlinky.pulumiAws.getAuthorizationTokenMod.GetAuthorizationTokenResult
import typingsSlinky.pulumiAws.getRepositoryEndpointMod.GetRepositoryEndpointArgs
import typingsSlinky.pulumiAws.getRepositoryEndpointMod.GetRepositoryEndpointResult
import typingsSlinky.pulumiAws.repositoryMod.RepositoryArgs
import typingsSlinky.pulumiAws.repositoryMod.RepositoryState
import typingsSlinky.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicyArgs
import typingsSlinky.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicyState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeartifact {
  
  @JSImport("@pulumi/aws", "codeartifact.Domain")
  @js.native
  class Domain protected ()
    extends typingsSlinky.pulumiAws.codeartifactMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainMod.Domain = js.native
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainMod.Domain = js.native
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsSlinky.pulumiAws.domainMod.Domain = js.native
    @JSImport("@pulumi/aws", "codeartifact.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainMod.Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domain.Domain */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.DomainPermissions")
  @js.native
  class DomainPermissions protected ()
    extends typingsSlinky.pulumiAws.codeartifactMod.DomainPermissions {
    /**
      * Create a DomainPermissions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPermissionsArgs) = this()
    def this(name: String, args: DomainPermissionsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainPermissions {
    
    /**
      * Get an existing DomainPermissions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPermissionsState): typingsSlinky.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPermissionsState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainPermissionsMod.DomainPermissions = js.native
    
    /**
      * Returns true if the given object is an instance of DomainPermissions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.DomainPermissions.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.Repository")
  @js.native
  class Repository protected ()
    extends typingsSlinky.pulumiAws.codeartifactMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Repository {
    
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
    @JSImport("@pulumi/aws", "codeartifact.Repository.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.repositoryMod.Repository = js.native
    
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.Repository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repository.Repository */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy")
  @js.native
  class RepositoryPermissionsPolicy protected ()
    extends typingsSlinky.pulumiAws.codeartifactMod.RepositoryPermissionsPolicy {
    /**
      * Create a RepositoryPermissionsPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryPermissionsPolicyArgs) = this()
    def this(name: String, args: RepositoryPermissionsPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RepositoryPermissionsPolicy {
    
    /**
      * Get an existing RepositoryPermissionsPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState): typingsSlinky.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RepositoryPermissionsPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.repositoryPermissionsPolicyMod.RepositoryPermissionsPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of RepositoryPermissionsPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "codeartifact.RepositoryPermissionsPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repositoryPermissionsPolicy.RepositoryPermissionsPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "codeartifact.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws", "codeartifact.getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  
  @JSImport("@pulumi/aws", "codeartifact.getRepositoryEndpoint")
  @js.native
  def getRepositoryEndpoint(args: GetRepositoryEndpointArgs): js.Promise[GetRepositoryEndpointResult] = js.native
  @JSImport("@pulumi/aws", "codeartifact.getRepositoryEndpoint")
  @js.native
  def getRepositoryEndpoint(args: GetRepositoryEndpointArgs, opts: InvokeOptions): js.Promise[GetRepositoryEndpointResult] = js.native
}
