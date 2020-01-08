package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.organizationsAccountMod.AccountArgs
import typingsSlinky.atPulumiAws.organizationsAccountMod.AccountState
import typingsSlinky.atPulumiAws.organizationsGetOrganizationMod.GetOrganizationResult
import typingsSlinky.atPulumiAws.organizationsGetOrganizationalUnitsMod.GetOrganizationalUnitsArgs
import typingsSlinky.atPulumiAws.organizationsGetOrganizationalUnitsMod.GetOrganizationalUnitsResult
import typingsSlinky.atPulumiAws.organizationsOrganizationMod.OrganizationArgs
import typingsSlinky.atPulumiAws.organizationsOrganizationMod.OrganizationState
import typingsSlinky.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnitArgs
import typingsSlinky.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnitState
import typingsSlinky.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentArgs
import typingsSlinky.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachmentState
import typingsSlinky.atPulumiAws.organizationsPolicyMod.PolicyArgs
import typingsSlinky.atPulumiAws.organizationsPolicyMod.PolicyState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations", JSImport.Namespace)
@js.native
object organizationsMod extends js.Object {
  @js.native
  class Account protected ()
    extends typingsSlinky.atPulumiAws.organizationsAccountMod.Account {
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
  
  @js.native
  class Organization protected ()
    extends typingsSlinky.atPulumiAws.organizationsOrganizationMod.Organization {
    /**
      * Create a Organization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OrganizationArgs) = this()
    def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationalUnit protected ()
    extends typingsSlinky.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit {
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
  
  @js.native
  class Policy protected ()
    extends typingsSlinky.atPulumiAws.organizationsPolicyMod.Policy {
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
  
  @js.native
  class PolicyAttachment protected ()
    extends typingsSlinky.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment {
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
  
  def getOrganization(): js.Promise[GetOrganizationResult] with GetOrganizationResult = js.native
  def getOrganization(opts: InvokeOptions): js.Promise[GetOrganizationResult] with GetOrganizationResult = js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs): js.Promise[GetOrganizationalUnitsResult] with GetOrganizationalUnitsResult = js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs, opts: InvokeOptions): js.Promise[GetOrganizationalUnitsResult] with GetOrganizationalUnitsResult = js.native
  /* static members */
  @js.native
  object Account extends js.Object {
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typingsSlinky.atPulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.organizationsAccountMod.Account = js.native
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Organization extends js.Object {
    /**
      * Get an existing Organization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.organizationsOrganizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState): typingsSlinky.atPulumiAws.organizationsOrganizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.organizationsOrganizationMod.Organization = js.native
    /**
      * Returns true if the given object is an instance of Organization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationalUnit extends js.Object {
    /**
      * Get an existing OrganizationalUnit resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState): typingsSlinky.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
    /**
      * Returns true if the given object is an instance of OrganizationalUnit.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.atPulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.organizationsPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PolicyAttachment extends js.Object {
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typingsSlinky.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
}

