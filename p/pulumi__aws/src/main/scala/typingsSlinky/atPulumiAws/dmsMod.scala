package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.dmsCertificateMod.CertificateArgs
import typingsSlinky.atPulumiAws.dmsCertificateMod.CertificateState
import typingsSlinky.atPulumiAws.dmsEndpointMod.EndpointArgs
import typingsSlinky.atPulumiAws.dmsEndpointMod.EndpointState
import typingsSlinky.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstanceArgs
import typingsSlinky.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstanceState
import typingsSlinky.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typingsSlinky.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupState
import typingsSlinky.atPulumiAws.dmsReplicationTaskMod.ReplicationTaskArgs
import typingsSlinky.atPulumiAws.dmsReplicationTaskMod.ReplicationTaskState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms", JSImport.Namespace)
@js.native
object dmsMod extends js.Object {
  @js.native
  class Certificate protected ()
    extends typingsSlinky.atPulumiAws.dmsCertificateMod.Certificate {
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
  
  @js.native
  class Endpoint protected ()
    extends typingsSlinky.atPulumiAws.dmsEndpointMod.Endpoint {
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
  
  @js.native
  class ReplicationInstance protected ()
    extends typingsSlinky.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance {
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
  
  @js.native
  class ReplicationSubnetGroup protected ()
    extends typingsSlinky.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup {
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
  
  @js.native
  class ReplicationTask protected ()
    extends typingsSlinky.atPulumiAws.dmsReplicationTaskMod.ReplicationTask {
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
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsSlinky.atPulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.dmsCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.dmsEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsSlinky.atPulumiAws.dmsEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.dmsEndpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationInstance extends js.Object {
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): typingsSlinky.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationSubnetGroup extends js.Object {
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typingsSlinky.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationTask extends js.Object {
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.dmsReplicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState): typingsSlinky.atPulumiAws.dmsReplicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.dmsReplicationTaskMod.ReplicationTask = js.native
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
  }
  
}

