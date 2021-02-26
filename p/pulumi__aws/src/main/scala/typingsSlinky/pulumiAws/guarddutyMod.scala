package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.detectorMod.DetectorArgs
import typingsSlinky.pulumiAws.detectorMod.DetectorState
import typingsSlinky.pulumiAws.filterMod.FilterArgs
import typingsSlinky.pulumiAws.filterMod.FilterState
import typingsSlinky.pulumiAws.getDetectorMod.GetDetectorArgs
import typingsSlinky.pulumiAws.getDetectorMod.GetDetectorResult
import typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepterArgs
import typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepterState
import typingsSlinky.pulumiAws.ipsetMod.IPSetArgs
import typingsSlinky.pulumiAws.ipsetMod.IPSetState
import typingsSlinky.pulumiAws.memberMod.MemberArgs
import typingsSlinky.pulumiAws.memberMod.MemberState
import typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccountArgs
import typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccountState
import typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfigurationArgs
import typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfigurationState
import typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestinationArgs
import typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestinationState
import typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSetArgs
import typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSetState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guarddutyMod {
  
  @JSImport("@pulumi/aws/guardduty", "Detector")
  @js.native
  class Detector protected ()
    extends typingsSlinky.pulumiAws.detectorMod.Detector {
    /**
      * Create a Detector resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DetectorArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DetectorArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Detector {
    
    /**
      * Get an existing Detector resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID], state: DetectorState): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
    @JSImport("@pulumi/aws/guardduty", "Detector.get")
    @js.native
    def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
    
    /**
      * Returns true if the given object is an instance of Detector.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "Detector.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/detector.Detector */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "Filter")
  @js.native
  class Filter protected ()
    extends typingsSlinky.pulumiAws.filterMod.Filter {
    /**
      * Create a Filter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FilterArgs) = this()
    def this(name: String, args: FilterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Filter {
    
    /**
      * Get an existing Filter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.filterMod.Filter = js.native
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.filterMod.Filter = js.native
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID], state: FilterState): typingsSlinky.pulumiAws.filterMod.Filter = js.native
    @JSImport("@pulumi/aws/guardduty", "Filter.get")
    @js.native
    def get(name: String, id: Input[ID], state: FilterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.filterMod.Filter = js.native
    
    /**
      * Returns true if the given object is an instance of Filter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "Filter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/filter.Filter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "IPSet")
  @js.native
  class IPSet protected ()
    extends typingsSlinky.pulumiAws.ipsetMod.IPSet {
    /**
      * Create a IPSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IPSetArgs) = this()
    def this(name: String, args: IPSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IPSet {
    
    /**
      * Get an existing IPSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ipsetMod.IPSet = js.native
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ipsetMod.IPSet = js.native
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IPSetState): typingsSlinky.pulumiAws.ipsetMod.IPSet = js.native
    @JSImport("@pulumi/aws/guardduty", "IPSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ipsetMod.IPSet = js.native
    
    /**
      * Returns true if the given object is an instance of IPSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "IPSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/ipset.IPSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "InviteAccepter")
  @js.native
  class InviteAccepter protected ()
    extends typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter {
    /**
      * Create a InviteAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InviteAccepterArgs) = this()
    def this(name: String, args: InviteAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object InviteAccepter {
    
    /**
      * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "InviteAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "Member")
  @js.native
  class Member protected ()
    extends typingsSlinky.pulumiAws.memberMod.Member {
    /**
      * Create a Member resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberArgs) = this()
    def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Member {
    
    /**
      * Get an existing Member resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.memberMod.Member = js.native
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.memberMod.Member = js.native
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState): typingsSlinky.pulumiAws.memberMod.Member = js.native
    @JSImport("@pulumi/aws/guardduty", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.memberMod.Member = js.native
    
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "Member.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount")
  @js.native
  class OrganizationAdminAccount protected ()
    extends typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount {
    /**
      * Create a OrganizationAdminAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationAdminAccountArgs) = this()
    def this(name: String, args: OrganizationAdminAccountArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object OrganizationAdminAccount {
    
    /**
      * Get an existing OrganizationAdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState): typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationAdminAccountState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationAdminAccountMod.OrganizationAdminAccount = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationAdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationAdminAccount.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationAdminAccount.OrganizationAdminAccount */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration")
  @js.native
  class OrganizationConfiguration protected ()
    extends typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfiguration {
    /**
      * Create a OrganizationConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationConfigurationArgs) = this()
    def this(name: String, args: OrganizationConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object OrganizationConfiguration {
    
    /**
      * Get an existing OrganizationConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState): typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.organizationConfigurationMod.OrganizationConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "OrganizationConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationConfiguration.OrganizationConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "PublishingDestination")
  @js.native
  class PublishingDestination protected ()
    extends typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestination {
    /**
      * Create a PublishingDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublishingDestinationArgs) = this()
    def this(name: String, args: PublishingDestinationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublishingDestination {
    
    /**
      * Get an existing PublishingDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublishingDestinationState): typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublishingDestinationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.publishingDestinationMod.PublishingDestination = js.native
    
    /**
      * Returns true if the given object is an instance of PublishingDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "PublishingDestination.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/publishingDestination.PublishingDestination */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet")
  @js.native
  class ThreatIntelSet protected ()
    extends typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet {
    /**
      * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ThreatIntelSetArgs) = this()
    def this(name: String, args: ThreatIntelSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ThreatIntelSet {
    
    /**
      * Get an existing ThreatIntelSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    
    /**
      * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty", "ThreatIntelSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(args: GetDetectorArgs): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty", "getDetector")
  @js.native
  def getDetector(args: GetDetectorArgs, opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
}
