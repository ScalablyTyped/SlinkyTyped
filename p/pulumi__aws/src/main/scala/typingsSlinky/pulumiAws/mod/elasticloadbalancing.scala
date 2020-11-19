package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicyArgs
import typingsSlinky.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicyState
import typingsSlinky.pulumiAws.elasticloadbalancingAttachmentMod.AttachmentArgs
import typingsSlinky.pulumiAws.elasticloadbalancingAttachmentMod.AttachmentState
import typingsSlinky.pulumiAws.elasticloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.pulumiAws.elasticloadbalancingGetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.pulumiAws.elasticloadbalancingGetServiceAccountMod.GetServiceAccountArgs
import typingsSlinky.pulumiAws.elasticloadbalancingGetServiceAccountMod.GetServiceAccountResult
import typingsSlinky.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancerArgs
import typingsSlinky.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancerState
import typingsSlinky.pulumiAws.getHostedZoneIdMod.GetHostedZoneIdArgs
import typingsSlinky.pulumiAws.getHostedZoneIdMod.GetHostedZoneIdResult
import typingsSlinky.pulumiAws.listenerPolicyMod.ListenerPolicyArgs
import typingsSlinky.pulumiAws.listenerPolicyMod.ListenerPolicyState
import typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs
import typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
import typingsSlinky.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyArgs
import typingsSlinky.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
import typingsSlinky.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicyArgs
import typingsSlinky.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicyState
import typingsSlinky.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typingsSlinky.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicyState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "elasticloadbalancing")
@js.native
object elasticloadbalancing extends js.Object {
  
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] = js.native
  def getHostedZoneId(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  
  @js.native
  class AppCookieStickinessPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.AppCookieStickinessPolicy {
    /**
      * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.AppCookieStickinessPolicy has been deprecated in favor of aws.elb.AppCookieStickinessPolicy */
    def this(name: String, args: AppCookieStickinessPolicyArgs) = this()
    def this(name: String, args: AppCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object AppCookieStickinessPolicy extends js.Object {
    
    /**
      * Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): typingsSlinky.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.appCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = js.native
  }
  
  @js.native
  class Attachment protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.Attachment has been deprecated in favor of aws.elb.Attachment */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Attachment extends js.Object {
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typingsSlinky.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingAttachmentMod.Attachment = js.native
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/attachment.Attachment */ Boolean = js.native
  }
  
  @js.native
  class ListenerPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.ListenerPolicy {
    /**
      * Create a ListenerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.ListenerPolicy has been deprecated in favor of aws.elb.ListenerPolicy */
    def this(name: String, args: ListenerPolicyArgs) = this()
    def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ListenerPolicy extends js.Object {
    
    /**
      * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.listenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.listenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState): typingsSlinky.pulumiAws.listenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.listenerPolicyMod.ListenerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean = js.native
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancer has been deprecated in favor of aws.elb.LoadBalancer */
    def this(name: String, args: LoadBalancerArgs) = this()
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  @js.native
  class LoadBalancerBackendServerPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.LoadBalancerBackendServerPolicy {
    /**
      * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerBackendServerPolicy has been deprecated in favor of aws.elb.LoadBalancerBackendServerPolicy */
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object LoadBalancerBackendServerPolicy extends js.Object {
    
    /**
      * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.loadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
  }
  
  @js.native
  class LoadBalancerCookieStickinessPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.LoadBalancerCookieStickinessPolicy {
    /**
      * Create a LoadBalancerCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerCookieStickinessPolicy has been deprecated in favor of aws.elb.LoadBalancerCookieStickinessPolicy */
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs) = this()
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object LoadBalancerCookieStickinessPolicy extends js.Object {
    
    /**
      * Get an existing LoadBalancerCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): typingsSlinky.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.loadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = js.native
  }
  
  @js.native
  class LoadBalancerPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.LoadBalancerPolicy {
    /**
      * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerPolicy has been deprecated in favor of aws.elb.LoadBalancerPolicy */
    def this(name: String, args: LoadBalancerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object LoadBalancerPolicy extends js.Object {
    
    /**
      * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): typingsSlinky.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.loadBalancerPolicyMod.LoadBalancerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
  }
  
  @js.native
  class SslNegotiationPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticloadbalancingMod.SslNegotiationPolicy {
    /**
      * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.SslNegotiationPolicy has been deprecated in favor of aws.elb.SslNegotiationPolicy */
    def this(name: String, args: SslNegotiationPolicyArgs) = this()
    def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object SslNegotiationPolicy extends js.Object {
    
    /**
      * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typingsSlinky.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
  }
}
