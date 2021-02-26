package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trafficMirrorTargetMod {
  
  @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget")
  @js.native
  class TrafficMirrorTarget protected () extends CustomResource {
    /**
      * Create a TrafficMirrorTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TrafficMirrorTargetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TrafficMirrorTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the traffic mirror target.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the traffic mirror session.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The network interface ID that is associated with the target.
      */
    val networkInterfaceId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
      */
    val networkLoadBalancerArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object TrafficMirrorTarget {
    
    /**
      * Get an existing TrafficMirrorTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): TrafficMirrorTarget = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TrafficMirrorTarget = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrafficMirrorTargetState): TrafficMirrorTarget = js.native
    @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrafficMirrorTargetState, opts: CustomResourceOptions): TrafficMirrorTarget = js.native
    
    /**
      * Returns true if the given object is an instance of TrafficMirrorTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorTarget.TrafficMirrorTarget */ Boolean = js.native
  }
  
  @js.native
  trait TrafficMirrorTargetArgs extends StObject {
    
    /**
      * A description of the traffic mirror session.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The network interface ID that is associated with the target.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
      */
    val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object TrafficMirrorTargetArgs {
    
    @scala.inline
    def apply(): TrafficMirrorTargetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorTargetArgs]
    }
    
    @scala.inline
    implicit class TrafficMirrorTargetArgsMutableBuilder[Self <: TrafficMirrorTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setNetworkLoadBalancerArn(value: Input[String]): Self = StObject.set(x, "networkLoadBalancerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkLoadBalancerArnUndefined: Self = StObject.set(x, "networkLoadBalancerArn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait TrafficMirrorTargetState extends StObject {
    
    /**
      * The ARN of the traffic mirror target.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of the traffic mirror session.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The network interface ID that is associated with the target.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
      */
    val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object TrafficMirrorTargetState {
    
    @scala.inline
    def apply(): TrafficMirrorTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorTargetState]
    }
    
    @scala.inline
    implicit class TrafficMirrorTargetStateMutableBuilder[Self <: TrafficMirrorTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setNetworkLoadBalancerArn(value: Input[String]): Self = StObject.set(x, "networkLoadBalancerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkLoadBalancerArnUndefined: Self = StObject.set(x, "networkLoadBalancerArn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
