package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.lbGetListenerMod.GetListenerArgs
import typingsSlinky.pulumiAws.lbGetListenerMod.GetListenerResult
import typingsSlinky.pulumiAws.lbGetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.pulumiAws.lbGetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.pulumiAws.lbGetTargetGroupMod.GetTargetGroupArgs
import typingsSlinky.pulumiAws.lbGetTargetGroupMod.GetTargetGroupResult
import typingsSlinky.pulumiAws.lbListenerCertificateMod.ListenerCertificateArgs
import typingsSlinky.pulumiAws.lbListenerCertificateMod.ListenerCertificateState
import typingsSlinky.pulumiAws.lbListenerMod.ListenerArgs
import typingsSlinky.pulumiAws.lbListenerMod.ListenerState
import typingsSlinky.pulumiAws.lbListenerRuleMod.ListenerRuleArgs
import typingsSlinky.pulumiAws.lbListenerRuleMod.ListenerRuleState
import typingsSlinky.pulumiAws.lbLoadBalancerMod.LoadBalancerArgs
import typingsSlinky.pulumiAws.lbLoadBalancerMod.LoadBalancerState
import typingsSlinky.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typingsSlinky.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachmentState
import typingsSlinky.pulumiAws.lbTargetGroupMod.TargetGroupArgs
import typingsSlinky.pulumiAws.lbTargetGroupMod.TargetGroupState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lb {
  
  @JSImport("@pulumi/aws", "lb.Listener")
  @js.native
  class Listener protected ()
    extends typingsSlinky.pulumiAws.lbMod.Listener {
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
    @JSImport("@pulumi/aws", "lb.Listener.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lbListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "lb.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "lb.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsSlinky.pulumiAws.lbListenerMod.Listener = js.native
    @JSImport("@pulumi/aws", "lb.Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbListenerMod.Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lb.Listener.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listener.Listener */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lb.ListenerCertificate")
  @js.native
  class ListenerCertificate protected ()
    extends typingsSlinky.pulumiAws.lbMod.ListenerCertificate {
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
    @JSImport("@pulumi/aws", "lb.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws", "lb.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws", "lb.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typingsSlinky.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    @JSImport("@pulumi/aws", "lb.ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lb.ListenerCertificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lb.ListenerRule")
  @js.native
  class ListenerRule protected ()
    extends typingsSlinky.pulumiAws.lbMod.ListenerRule {
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
    @JSImport("@pulumi/aws", "lb.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws", "lb.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws", "lb.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typingsSlinky.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    @JSImport("@pulumi/aws", "lb.ListenerRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lb.ListenerRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lb.LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.pulumiAws.lbMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    @JSImport("@pulumi/aws", "lb.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws", "lb.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws", "lb.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws", "lb.LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lb.LoadBalancer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lb.TargetGroup")
  @js.native
  class TargetGroup protected ()
    extends typingsSlinky.pulumiAws.lbMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    @JSImport("@pulumi/aws", "lb.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws", "lb.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws", "lb.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typingsSlinky.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    @JSImport("@pulumi/aws", "lb.TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lb.TargetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lb.TargetGroupAttachment")
  @js.native
  class TargetGroupAttachment protected ()
    extends typingsSlinky.pulumiAws.lbMod.TargetGroupAttachment {
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
    @JSImport("@pulumi/aws", "lb.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws", "lb.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws", "lb.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typingsSlinky.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws", "lb.TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lb.TargetGroupAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lb.getListener")
  @js.native
  def getListener(): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws", "lb.getListener")
  @js.native
  def getListener(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws", "lb.getListener")
  @js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws", "lb.getListener")
  @js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  
  @JSImport("@pulumi/aws", "lb.getLoadBalancer")
  @js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws", "lb.getLoadBalancer")
  @js.native
  def getLoadBalancer(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws", "lb.getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws", "lb.getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  @JSImport("@pulumi/aws", "lb.getTargetGroup")
  @js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws", "lb.getTargetGroup")
  @js.native
  def getTargetGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws", "lb.getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws", "lb.getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
}
