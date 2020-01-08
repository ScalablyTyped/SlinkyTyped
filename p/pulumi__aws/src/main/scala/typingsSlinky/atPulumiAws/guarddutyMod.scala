package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.guarddutyDetectorMod.DetectorArgs
import typingsSlinky.atPulumiAws.guarddutyDetectorMod.DetectorState
import typingsSlinky.atPulumiAws.guarddutyGetDetectorMod.GetDetectorArgs
import typingsSlinky.atPulumiAws.guarddutyGetDetectorMod.GetDetectorResult
import typingsSlinky.atPulumiAws.guarddutyIPSetMod.IPSetArgs
import typingsSlinky.atPulumiAws.guarddutyIPSetMod.IPSetState
import typingsSlinky.atPulumiAws.guarddutyInviteAccepterMod.InviteAccepterArgs
import typingsSlinky.atPulumiAws.guarddutyInviteAccepterMod.InviteAccepterState
import typingsSlinky.atPulumiAws.guarddutyMemberMod.MemberArgs
import typingsSlinky.atPulumiAws.guarddutyMemberMod.MemberState
import typingsSlinky.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSetArgs
import typingsSlinky.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSetState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty", JSImport.Namespace)
@js.native
object guarddutyMod extends js.Object {
  @js.native
  class Detector protected ()
    extends typingsSlinky.atPulumiAws.guarddutyDetectorMod.Detector {
    /**
      * Create a Detector resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DetectorArgs) = this()
    def this(name: String, args: DetectorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IPSet protected ()
    extends typingsSlinky.atPulumiAws.guarddutyIPSetMod.IPSet {
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
  
  @js.native
  class InviteAccepter protected ()
    extends typingsSlinky.atPulumiAws.guarddutyInviteAccepterMod.InviteAccepter {
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
  
  @js.native
  class Member protected ()
    extends typingsSlinky.atPulumiAws.guarddutyMemberMod.Member {
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
  
  @js.native
  class ThreatIntelSet protected ()
    extends typingsSlinky.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet {
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
  
  def getDetector(): js.Promise[GetDetectorResult] with GetDetectorResult = js.native
  def getDetector(args: GetDetectorArgs): js.Promise[GetDetectorResult] with GetDetectorResult = js.native
  def getDetector(args: GetDetectorArgs, opts: InvokeOptions): js.Promise[GetDetectorResult] with GetDetectorResult = js.native
  /* static members */
  @js.native
  object Detector extends js.Object {
    /**
      * Get an existing Detector resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.guarddutyDetectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: DetectorState): typingsSlinky.atPulumiAws.guarddutyDetectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.guarddutyDetectorMod.Detector = js.native
    /**
      * Returns true if the given object is an instance of Detector.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/detector.Detector */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IPSet extends js.Object {
    /**
      * Get an existing IPSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.guarddutyIPSetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: IPSetState): typingsSlinky.atPulumiAws.guarddutyIPSetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.guarddutyIPSetMod.IPSet = js.native
    /**
      * Returns true if the given object is an instance of IPSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/iPSet.IPSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object InviteAccepter extends js.Object {
    /**
      * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.guarddutyInviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState): typingsSlinky.atPulumiAws.guarddutyInviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.guarddutyInviteAccepterMod.InviteAccepter = js.native
    /**
      * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Member extends js.Object {
    /**
      * Get an existing Member resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.guarddutyMemberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState): typingsSlinky.atPulumiAws.guarddutyMemberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.guarddutyMemberMod.Member = js.native
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ThreatIntelSet extends js.Object {
    /**
      * Get an existing ThreatIntelSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState): typingsSlinky.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.guarddutyThreatIntelSetMod.ThreatIntelSet = js.native
    /**
      * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
  }
  
}

