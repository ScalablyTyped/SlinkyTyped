package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getOrganizationMod.GetOrganizationResult
import typingsSlinky.pulumiAws.getOrganizationalUnitsMod.GetOrganizationalUnitsArgs
import typingsSlinky.pulumiAws.getOrganizationalUnitsMod.GetOrganizationalUnitsResult
import typingsSlinky.pulumiAws.organizationMod.OrganizationArgs
import typingsSlinky.pulumiAws.organizationMod.OrganizationState
import typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnitArgs
import typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnitState
import typingsSlinky.pulumiAws.organizationsAccountMod.AccountArgs
import typingsSlinky.pulumiAws.organizationsAccountMod.AccountState
import typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentArgs
import typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentState
import typingsSlinky.pulumiAws.organizationsPolicyMod.PolicyArgs
import typingsSlinky.pulumiAws.organizationsPolicyMod.PolicyState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationsMod {
  
  @JSImport("@pulumi/aws/organizations", "Account")
  @js.native
  class Account protected ()
    extends typingsSlinky.pulumiAws.organizationsAccountMod.Account {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws/organizations", "Account.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
    @JSImport("@pulumi/aws/organizations", "Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
    @JSImport("@pulumi/aws/organizations", "Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountState): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
    @JSImport("@pulumi/aws/organizations", "Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
    
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations", "Account.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/organizations", "Organization")
  @js.native
  class Organization protected ()
    extends typingsSlinky.pulumiAws.organizationMod.Organization {
    /**
      * Create a Organization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OrganizationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Organization {
    
    /**
      * Get an existing Organization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations", "Organization.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
    @JSImport("@pulumi/aws/organizations", "Organization.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
    @JSImport("@pulumi/aws/organizations", "Organization.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationState): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
    @JSImport("@pulumi/aws/organizations", "Organization.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
    
    /**
      * Returns true if the given object is an instance of Organization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations", "Organization.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/organizations", "OrganizationalUnit")
  @js.native
  class OrganizationalUnit protected ()
    extends typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit {
    /**
      * Create a OrganizationalUnit resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationalUnitArgs) = this()
    def this(name: String, args: OrganizationalUnitArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object OrganizationalUnit {
    
    /**
      * Get an existing OrganizationalUnit resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    @JSImport("@pulumi/aws/organizations", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    @JSImport("@pulumi/aws/organizations", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    @JSImport("@pulumi/aws/organizations", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationalUnit.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations", "OrganizationalUnit.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/organizations", "Policy")
  @js.native
  class Policy protected ()
    extends typingsSlinky.pulumiAws.organizationsPolicyMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Policy {
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws/organizations", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws/organizations", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws/organizations", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations", "Policy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policy.Policy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/organizations", "PolicyAttachment")
  @js.native
  class PolicyAttachment protected ()
    extends typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyAttachmentArgs) = this()
    def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PolicyAttachment {
    
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    @JSImport("@pulumi/aws/organizations", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    @JSImport("@pulumi/aws/organizations", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    @JSImport("@pulumi/aws/organizations", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations", "PolicyAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/organizations", "getOrganization")
  @js.native
  def getOrganization(): js.Promise[GetOrganizationResult] = js.native
  @JSImport("@pulumi/aws/organizations", "getOrganization")
  @js.native
  def getOrganization(opts: InvokeOptions): js.Promise[GetOrganizationResult] = js.native
  
  @JSImport("@pulumi/aws/organizations", "getOrganizationalUnits")
  @js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs): js.Promise[GetOrganizationalUnitsResult] = js.native
  @JSImport("@pulumi/aws/organizations", "getOrganizationalUnits")
  @js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs, opts: InvokeOptions): js.Promise[GetOrganizationalUnitsResult] = js.native
}
