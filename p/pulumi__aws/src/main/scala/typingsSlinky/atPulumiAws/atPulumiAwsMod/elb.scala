package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyArgs
import typingsSlinky.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicyState
import typingsSlinky.atPulumiAws.elbAttachmentMod.AttachmentArgs
import typingsSlinky.atPulumiAws.elbAttachmentMod.AttachmentState
import typingsSlinky.atPulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdArgs
import typingsSlinky.atPulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdResult
import typingsSlinky.atPulumiAws.elbGetLoadBalancerMod.GetLoadBalancerArgs
import typingsSlinky.atPulumiAws.elbGetLoadBalancerMod.GetLoadBalancerResult
import typingsSlinky.atPulumiAws.elbGetServiceAccountMod.GetServiceAccountArgs
import typingsSlinky.atPulumiAws.elbGetServiceAccountMod.GetServiceAccountResult
import typingsSlinky.atPulumiAws.elbListenerPolicyMod.ListenerPolicyArgs
import typingsSlinky.atPulumiAws.elbListenerPolicyMod.ListenerPolicyState
import typingsSlinky.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyArgs
import typingsSlinky.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicyState
import typingsSlinky.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyArgs
import typingsSlinky.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicyState
import typingsSlinky.atPulumiAws.elbLoadBalancerMod.LoadBalancerArgs
import typingsSlinky.atPulumiAws.elbLoadBalancerMod.LoadBalancerState
import typingsSlinky.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyArgs
import typingsSlinky.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicyState
import typingsSlinky.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typingsSlinky.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicyState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elb")
@js.native
object elb extends js.Object {
  @js.native
  class AppCookieStickinessPolicy protected ()
    extends typingsSlinky.atPulumiAws.elbMod.AppCookieStickinessPolicy {
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
  
  @js.native
  class Attachment protected ()
    extends typingsSlinky.atPulumiAws.elbMod.Attachment {
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
  
  @js.native
  class ListenerPolicy protected ()
    extends typingsSlinky.atPulumiAws.elbMod.ListenerPolicy {
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
  
  @js.native
  class LoadBalancer protected ()
    extends typingsSlinky.atPulumiAws.elbMod.LoadBalancer {
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
  
  @js.native
  class LoadBalancerBackendServerPolicy protected ()
    extends typingsSlinky.atPulumiAws.elbMod.LoadBalancerBackendServerPolicy {
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
  
  @js.native
  class LoadBalancerCookieStickinessPolicy protected ()
    extends typingsSlinky.atPulumiAws.elbMod.LoadBalancerCookieStickinessPolicy {
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
  
  @js.native
  class LoadBalancerPolicy protected ()
    extends typingsSlinky.atPulumiAws.elbMod.LoadBalancerPolicy {
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
  
  @js.native
  class SslNegotiationPolicy protected ()
    extends typingsSlinky.atPulumiAws.elbMod.SslNegotiationPolicy {
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
  
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState): typingsSlinky.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: AppCookieStickinessPolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elbAppCookieStickinessPolicyMod.AppCookieStickinessPolicy = js.native
    /**
      * Returns true if the given object is an instance of AppCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/appCookieStickinessPolicy.AppCookieStickinessPolicy */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typingsSlinky.atPulumiAws.elbAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elbAttachmentMod.Attachment = js.native
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/attachment.Attachment */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState): typingsSlinky.atPulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elbListenerPolicyMod.ListenerPolicy = js.native
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/listenerPolicy.ListenerPolicy */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsSlinky.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancer.LoadBalancer */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): typingsSlinky.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): typingsSlinky.atPulumiAws.elbLoadBalancerBackendServerPolicyMod.LoadBalancerBackendServerPolicy = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerCookieStickinessPolicyState): typingsSlinky.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerCookieStickinessPolicyState,
      opts: CustomResourceOptions
    ): typingsSlinky.atPulumiAws.elbLoadBalancerCookieStickinessPolicyMod.LoadBalancerCookieStickinessPolicy = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancerCookieStickinessPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerCookieStickinessPolicy.LoadBalancerCookieStickinessPolicy */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): typingsSlinky.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elbLoadBalancerPolicyMod.LoadBalancerPolicy = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typingsSlinky.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elbSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
  }
  
}

