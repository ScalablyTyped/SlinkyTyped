package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.applicationloadbalancingGetListenerMod.GetListenerArgs
import typingsSlinky.pulumiAws.applicationloadbalancingGetListenerMod.GetListenerResult
import typingsSlinky.pulumiAws.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.pulumiAws.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.pulumiAws.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs
import typingsSlinky.pulumiAws.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult
import typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificateArgs
import typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificateState
import typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.ListenerArgs
import typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.ListenerState
import typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRuleArgs
import typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRuleState
import typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancerArgs
import typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancerState
import typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentState
import typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroupArgs
import typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroupState
import typingsSlinky.pulumiAws.enumsApplicationloadbalancingMod.IpAddressType
import typingsSlinky.pulumiAws.enumsApplicationloadbalancingMod.LoadBalancerType
import typingsSlinky.pulumiAws.pulumiAwsStrings.application
import typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
import typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
import typingsSlinky.pulumiAws.pulumiAwsStrings.network
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/applicationloadbalancing", JSImport.Namespace)
@js.native
object applicationloadbalancingMod extends js.Object {
  
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  
  val Dualstack: IpAddressType = js.native
  
  val Ipv4: IpAddressType = js.native
  
  val NetworkLoadBalancer: LoadBalancerType = js.native
  
  def getListener(): js.Promise[GetListenerResult] = js.native
  def getListener(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = js.native
  def getTargetGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  
  @js.native
  object IpAddressType extends js.Object {
    
    val Dualstack: dualstack = js.native
    
    val Ipv4: ipv4 = js.native
  }
  
  @js.native
  class Listener protected ()
    extends typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.Listener has been deprecated in favor of aws.alb.Listener */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingListenerMod.Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listener.Listener */ Boolean = js.native
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.ListenerCertificate has been deprecated in favor of aws.alb.ListenerCertificate */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingListenerCertificateMod.ListenerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  @js.native
  class ListenerRule protected ()
    extends typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.ListenerRule has been deprecated in favor of aws.alb.ListenerRule */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingListenerRuleMod.ListenerRule = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.LoadBalancer has been deprecated in favor of aws.alb.LoadBalancer */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingLoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  @js.native
  object LoadBalancerType extends js.Object {
    
    val Application: application = js.native
    
    val Network: network = js.native
  }
  
  @js.native
  class TargetGroup protected ()
    extends typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.TargetGroup has been deprecated in favor of aws.alb.TargetGroup */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupMod.TargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.TargetGroupAttachment has been deprecated in favor of aws.alb.TargetGroupAttachment */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
}
