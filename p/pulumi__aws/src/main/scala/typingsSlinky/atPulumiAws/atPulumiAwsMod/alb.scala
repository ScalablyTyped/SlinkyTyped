package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.albGetListenerMod.GetListenerArgs
import typingsSlinky.atPulumiAws.albGetListenerMod.GetListenerResult
import typingsSlinky.atPulumiAws.albGetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.atPulumiAws.albGetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.atPulumiAws.albGetTargetGroupMod.GetTargetGroupArgs
import typingsSlinky.atPulumiAws.albGetTargetGroupMod.GetTargetGroupResult
import typingsSlinky.atPulumiAws.albIpAddressTypeMod.IpAddressType
import typingsSlinky.atPulumiAws.albListenerCertificateMod.ListenerCertificateArgs
import typingsSlinky.atPulumiAws.albListenerCertificateMod.ListenerCertificateState
import typingsSlinky.atPulumiAws.albListenerMod.ListenerArgs
import typingsSlinky.atPulumiAws.albListenerMod.ListenerState
import typingsSlinky.atPulumiAws.albListenerRuleMod.ListenerRuleArgs
import typingsSlinky.atPulumiAws.albListenerRuleMod.ListenerRuleState
import typingsSlinky.atPulumiAws.albLoadBalancerMod.LoadBalancerArgs
import typingsSlinky.atPulumiAws.albLoadBalancerMod.LoadBalancerState
import typingsSlinky.atPulumiAws.albLoadBalancerTypeMod.LoadBalancerType
import typingsSlinky.atPulumiAws.albTargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typingsSlinky.atPulumiAws.albTargetGroupAttachmentMod.TargetGroupAttachmentState
import typingsSlinky.atPulumiAws.albTargetGroupMod.TargetGroupArgs
import typingsSlinky.atPulumiAws.albTargetGroupMod.TargetGroupState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "alb")
@js.native
object alb extends js.Object {
  @js.native
  class Listener protected ()
    extends typingsSlinky.atPulumiAws.albMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends typingsSlinky.atPulumiAws.albMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerRule protected ()
    extends typingsSlinky.atPulumiAws.albMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.atPulumiAws.albMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroup protected ()
    extends typingsSlinky.atPulumiAws.albMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends typingsSlinky.atPulumiAws.albMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  val Dualstack: IpAddressType = js.native
  val Ipv4: IpAddressType = js.native
  val NetworkLoadBalancer: LoadBalancerType = js.native
  def getListener(): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  /* static members */
  @js.native
  object Listener extends js.Object {
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.albListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.atPulumiAws.albListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.albListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listener.Listener */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListenerCertificate extends js.Object {
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.albListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typingsSlinky.atPulumiAws.albListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.albListenerCertificateMod.ListenerCertificate = js.native
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListenerRule extends js.Object {
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.albListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typingsSlinky.atPulumiAws.albListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.albListenerRuleMod.ListenerRule = js.native
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LoadBalancer extends js.Object {
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.albLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.atPulumiAws.albLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.albLoadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetGroup extends js.Object {
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.albTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typingsSlinky.atPulumiAws.albTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.albTargetGroupMod.TargetGroup = js.native
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetGroupAttachment extends js.Object {
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.albTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typingsSlinky.atPulumiAws.albTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.albTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
}

