package typingsSlinky.pulumiAws.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "organizations")
@js.native
object organizations extends js.Object {
  @js.native
  class Account protected ()
    extends typingsSlinky.pulumiAws.organizationsMod.Account {
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
    extends typingsSlinky.pulumiAws.organizationsMod.Organization {
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
    extends typingsSlinky.pulumiAws.organizationsMod.OrganizationalUnit {
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
    extends typingsSlinky.pulumiAws.organizationsMod.Policy {
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
    extends typingsSlinky.pulumiAws.organizationsMod.PolicyAttachment {
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsAccountMod.Account = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
    def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationMod.Organization = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationalUnitMod.OrganizationalUnit = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsPolicyMod.Policy = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationsPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
}

