package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyArgs
import typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyState
import typingsSlinky.pulumiAws.elbAttachmentMod.AttachmentArgs
import typingsSlinky.pulumiAws.elbAttachmentMod.AttachmentState
import typingsSlinky.pulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdArgs
import typingsSlinky.pulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdResult
import typingsSlinky.pulumiAws.elbGetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.pulumiAws.elbGetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.pulumiAws.elbGetServiceAccountMod.GetServiceAccountArgs
import typingsSlinky.pulumiAws.elbGetServiceAccountMod.GetServiceAccountResult
import typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicyArgs
import typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicyState
import typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs
import typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
import typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyArgs
import typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
import typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancerArgs
import typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancerState
import typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyArgs
import typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyState
import typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbMod {
  
  @JSImport("@pulumi/aws/elb", "AppCookieStickinessPolicy")
  @js.native
  class AppCookieStickinessPolicy protected ()
    extends typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy {
    /**
      * Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AppCookieStickinessPolicyArgs) = this()
    def this(name: String, args: AppCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AppCookieStickinessPolicy {
    
    /**
      * Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elb", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elb", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elb", "AppCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "AppCookieStickinessPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "Attachment")
  @js.native
  class Attachment protected ()
    extends typingsSlinky.pulumiAws.elbAttachmentMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Attachment {
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbAttachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws/elb", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbAttachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws/elb", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typingsSlinky.pulumiAws.elbAttachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws/elb", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbAttachmentMod.Attachment = js.native
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "Attachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/attachment.Attachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "ListenerPolicy")
  @js.native
  class ListenerPolicy protected ()
    extends typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicy {
    /**
      * Create a ListenerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerPolicyArgs) = this()
    def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ListenerPolicy {
    
    /**
      * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState): typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "ListenerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/listenerPolicy.ListenerPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "LoadBalancer")
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerArgs) = this()
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
    @JSImport("@pulumi/aws/elb", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancer.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "LoadBalancerBackendServerPolicy")
  @js.native
  class LoadBalancerBackendServerPolicy protected ()
    extends typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy {
    /**
      * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancerBackendServerPolicy {
    
    /**
      * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancerBackendServerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "LoadBalancerCookieStickinessPolicy")
  @js.native
  class LoadBalancerCookieStickinessPolicy protected ()
    extends typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy {
    /**
      * Create a LoadBalancerCookieStickinessPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs) = this()
    def this(name: String, args: LoadBalancerCookieStickinessPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancerCookieStickinessPolicy {
    
    /**
      * Get an existing LoadBalancerCookieStickinessPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerCookieStickinessPolicy.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancerCookieStickinessPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "LoadBalancerPolicy")
  @js.native
  class LoadBalancerPolicy protected ()
    extends typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy {
    /**
      * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoadBalancerPolicy {
    
    /**
      * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    @JSImport("@pulumi/aws/elb", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "LoadBalancerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "SslNegotiationPolicy")
  @js.native
  class SslNegotiationPolicy protected ()
    extends typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy {
    /**
      * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SslNegotiationPolicyArgs) = this()
    def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SslNegotiationPolicy {
    
    /**
      * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    @JSImport("@pulumi/aws/elb", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    @JSImport("@pulumi/aws/elb", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    @JSImport("@pulumi/aws/elb", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb", "SslNegotiationPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elb", "getHostedZoneId")
  @js.native
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] = js.native
  @JSImport("@pulumi/aws/elb", "getHostedZoneId")
  @js.native
  def getHostedZoneId(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  @JSImport("@pulumi/aws/elb", "getHostedZoneId")
  @js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] = js.native
  @JSImport("@pulumi/aws/elb", "getHostedZoneId")
  @js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  
  @JSImport("@pulumi/aws/elb", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = js.native
  @JSImport("@pulumi/aws/elb", "getLoadBalancer")
  @js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = js.native
  
  @JSImport("@pulumi/aws/elb", "getServiceAccount")
  @js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/elb", "getServiceAccount")
  @js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/elb", "getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/elb", "getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
}
