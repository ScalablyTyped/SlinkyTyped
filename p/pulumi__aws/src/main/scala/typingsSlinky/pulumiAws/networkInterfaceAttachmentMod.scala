package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkInterfaceAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment")
  @js.native
  class NetworkInterfaceAttachment protected () extends CustomResource {
    /**
      * Create a NetworkInterfaceAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkInterfaceAttachmentArgs) = this()
    def this(name: String, args: NetworkInterfaceAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ENI Attachment ID.
      */
    val attachmentId: Output_[String] = js.native
    
    /**
      * Network interface index (int).
      */
    val deviceIndex: Output_[Double] = js.native
    
    /**
      * Instance ID to attach.
      */
    val instanceId: Output_[String] = js.native
    
    /**
      * ENI ID to attach.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The status of the Network Interface Attachment.
      */
    val status: Output_[String] = js.native
  }
  /* static members */
  object NetworkInterfaceAttachment {
    
    /**
      * Get an existing NetworkInterfaceAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): NetworkInterfaceAttachment = js.native
    @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkInterfaceAttachment = js.native
    @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: NetworkInterfaceAttachmentState): NetworkInterfaceAttachment = js.native
    @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: NetworkInterfaceAttachmentState, opts: CustomResourceOptions): NetworkInterfaceAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of NetworkInterfaceAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceAttachment.NetworkInterfaceAttachment */ Boolean = js.native
  }
  
  @js.native
  trait NetworkInterfaceAttachmentArgs extends StObject {
    
    /**
      * Network interface index (int).
      */
    val deviceIndex: Input[Double] = js.native
    
    /**
      * Instance ID to attach.
      */
    val instanceId: Input[String] = js.native
    
    /**
      * ENI ID to attach.
      */
    val networkInterfaceId: Input[String] = js.native
  }
  object NetworkInterfaceAttachmentArgs {
    
    @scala.inline
    def apply(deviceIndex: Input[Double], instanceId: Input[String], networkInterfaceId: Input[String]): NetworkInterfaceAttachmentArgs = {
      val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceAttachmentArgs]
    }
    
    @scala.inline
    implicit class NetworkInterfaceAttachmentArgsMutableBuilder[Self <: NetworkInterfaceAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceIndex(value: Input[Double]): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkInterfaceAttachmentState extends StObject {
    
    /**
      * The ENI Attachment ID.
      */
    val attachmentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Network interface index (int).
      */
    val deviceIndex: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Instance ID to attach.
      */
    val instanceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * ENI ID to attach.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the Network Interface Attachment.
      */
    val status: js.UndefOr[Input[String]] = js.native
  }
  object NetworkInterfaceAttachmentState {
    
    @scala.inline
    def apply(): NetworkInterfaceAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInterfaceAttachmentState]
    }
    
    @scala.inline
    implicit class NetworkInterfaceAttachmentStateMutableBuilder[Self <: NetworkInterfaceAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachmentId(value: Input[String]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
      
      @scala.inline
      def setDeviceIndex(value: Input[Double]): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIndexUndefined: Self = StObject.set(x, "deviceIndex", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
