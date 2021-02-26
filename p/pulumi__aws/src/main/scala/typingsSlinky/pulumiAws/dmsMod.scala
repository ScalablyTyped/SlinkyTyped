package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.dmsCertificateMod.CertificateArgs
import typingsSlinky.pulumiAws.dmsCertificateMod.CertificateState
import typingsSlinky.pulumiAws.endpointMod.EndpointArgs
import typingsSlinky.pulumiAws.endpointMod.EndpointState
import typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscriptionArgs
import typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscriptionState
import typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstanceArgs
import typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstanceState
import typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupState
import typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTaskArgs
import typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTaskState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmsMod {
  
  @JSImport("@pulumi/aws/dms", "Certificate")
  @js.native
  class Certificate protected ()
    extends typingsSlinky.pulumiAws.dmsCertificateMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Certificate {
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.dmsCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.dmsCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsSlinky.pulumiAws.dmsCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.dmsCertificateMod.Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "Certificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typingsSlinky.pulumiAws.endpointMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.endpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsSlinky.pulumiAws.endpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.endpointMod.Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSubscriptionArgs) = this()
    def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSubscription {
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "ReplicationInstance")
  @js.native
  class ReplicationInstance protected ()
    extends typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstance {
    /**
      * Create a ReplicationInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationInstanceArgs) = this()
    def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationInstance {
    
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup")
  @js.native
  class ReplicationSubnetGroup protected ()
    extends typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup {
    /**
      * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationSubnetGroupArgs) = this()
    def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationSubnetGroup {
    
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "ReplicationTask")
  @js.native
  class ReplicationTask protected ()
    extends typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTask {
    /**
      * Create a ReplicationTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationTaskArgs) = this()
    def this(name: String, args: ReplicationTaskArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationTask {
    
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState): typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationTask.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
  }
}
