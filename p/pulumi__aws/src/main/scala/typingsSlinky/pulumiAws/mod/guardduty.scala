package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.detectorMod.DetectorArgs
import typingsSlinky.pulumiAws.detectorMod.DetectorState
import typingsSlinky.pulumiAws.getDetectorMod.GetDetectorArgs
import typingsSlinky.pulumiAws.getDetectorMod.GetDetectorResult
import typingsSlinky.pulumiAws.iPSetMod.IPSetArgs
import typingsSlinky.pulumiAws.iPSetMod.IPSetState
import typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepterArgs
import typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepterState
import typingsSlinky.pulumiAws.memberMod.MemberArgs
import typingsSlinky.pulumiAws.memberMod.MemberState
import typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSetArgs
import typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSetState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "guardduty")
@js.native
object guardduty extends js.Object {
  @js.native
  class Detector protected ()
    extends typingsSlinky.pulumiAws.guarddutyMod.Detector {
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
    extends typingsSlinky.pulumiAws.guarddutyMod.IPSet {
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
    extends typingsSlinky.pulumiAws.guarddutyMod.InviteAccepter {
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
    extends typingsSlinky.pulumiAws.guarddutyMod.Member {
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
    extends typingsSlinky.pulumiAws.guarddutyMod.ThreatIntelSet {
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: DetectorState): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
    def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.detectorMod.Detector = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.iPSetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: IPSetState): typingsSlinky.pulumiAws.iPSetMod.IPSet = js.native
    def get(name: String, id: Input[ID], state: IPSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.iPSetMod.IPSet = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.inviteAccepterMod.InviteAccepter = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.memberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState): typingsSlinky.pulumiAws.memberMod.Member = js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.memberMod.Member = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.threatIntelSetMod.ThreatIntelSet = js.native
    /**
      * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
  }
  
}

