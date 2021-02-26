package typingsSlinky.pulumiAws.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingv2 {
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.Listener")
  @js.native
  class Listener protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2Mod.Listener {
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
  object Listener {
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.Listener.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerMod.Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.Listener.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listener.Listener */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerCertificate")
  @js.native
  class ListenerCertificate protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2Mod.ListenerCertificate {
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
  object ListenerCertificate {
    
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerCertificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerRule")
  @js.native
  class ListenerRule protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2Mod.ListenerRule {
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
  object ListenerRule {
    
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2ListenerRuleMod.ListenerRule = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.ListenerRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2Mod.LoadBalancer {
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
  object LoadBalancer {
    
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2LoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.LoadBalancer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroup")
  @js.native
  class TargetGroup protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2Mod.TargetGroup {
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
  object TargetGroup {
    
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupMod.TargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroupAttachment")
  @js.native
  class TargetGroupAttachment protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingv2Mod.TargetGroupAttachment {
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
  object TargetGroupAttachment {
    
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticloadbalancingv2.TargetGroupAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getListener")
  @js.native
  def getListener(): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getListener")
  @js.native
  def getListener(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getListener")
  @js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getListener")
  @js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getLoadBalancer")
  @js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getLoadBalancer")
  @js.native
  def getLoadBalancer(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getTargetGroup")
  @js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getTargetGroup")
  @js.native
  def getTargetGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws", "elasticloadbalancingv2.getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
}
