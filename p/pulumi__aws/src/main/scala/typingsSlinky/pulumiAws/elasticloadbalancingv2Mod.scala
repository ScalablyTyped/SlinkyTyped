package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.elasticloadbalancingv2GetListenerMod.GetListenerArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2GetListenerMod.GetListenerResult
import typingsSlinky.pulumiAws.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.pulumiAws.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupResult
import typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateState
import typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.ListenerArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.ListenerState
import typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRuleArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRuleState
import typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancerArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancerState
import typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentState
import typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroupArgs
import typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroupState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/elasticloadbalancingv2", JSImport.Namespace)
@js.native
object elasticloadbalancingv2Mod extends js.Object {
  
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
  class Listener protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.Listener has been deprecated in favor of aws.lb.Listener */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listener.Listener */ Boolean = js.native
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.ListenerCertificate has been deprecated in favor of aws.lb.ListenerCertificate */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  @js.native
  class ListenerRule protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.ListenerRule has been deprecated in favor of aws.lb.ListenerRule */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.LoadBalancer has been deprecated in favor of aws.lb.LoadBalancer */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  @js.native
  class TargetGroup protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.TargetGroup has been deprecated in favor of aws.lb.TargetGroup */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.TargetGroupAttachment has been deprecated in favor of aws.lb.TargetGroupAttachment */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
}
