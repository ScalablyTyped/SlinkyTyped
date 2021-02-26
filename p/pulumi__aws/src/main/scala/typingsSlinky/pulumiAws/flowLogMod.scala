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

object flowLogMod {
  
  @JSImport("@pulumi/aws/ec2/flowLog", "FlowLog")
  @js.native
  class FlowLog protected () extends CustomResource {
    /**
      * Create a FlowLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FlowLogArgs) = this()
    def this(name: String, args: FlowLogArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Flow Log.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Elastic Network Interface ID to attach to
      */
    val eniId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
      */
    val iamRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the logging destination.
      */
    val logDestination: Output_[String] = js.native
    
    /**
      * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
      */
    val logDestinationType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The fields to include in the flow log record, in the order in which they should appear.
      */
    val logFormat: Output_[String] = js.native
    
    /**
      * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
      *
      * @deprecated use 'log_destination' argument instead
      */
    val logGroupName: Output_[String] = js.native
    
    /**
      * The maximum interval of time
      * during which a flow of packets is captured and aggregated into a flow
      * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
      * minutes). Default: `600`.
      */
    val maxAggregationInterval: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Subnet ID to attach to
      */
    val subnetId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
      */
    val trafficType: Output_[String] = js.native
    
    /**
      * VPC ID to attach to
      */
    val vpcId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object FlowLog {
    
    /**
      * Get an existing FlowLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/flowLog", "FlowLog.get")
    @js.native
    def get(name: String, id: Input[ID]): FlowLog = js.native
    @JSImport("@pulumi/aws/ec2/flowLog", "FlowLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FlowLog = js.native
    @JSImport("@pulumi/aws/ec2/flowLog", "FlowLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: FlowLogState): FlowLog = js.native
    @JSImport("@pulumi/aws/ec2/flowLog", "FlowLog.get")
    @js.native
    def get(name: String, id: Input[ID], state: FlowLogState, opts: CustomResourceOptions): FlowLog = js.native
    
    /**
      * Returns true if the given object is an instance of FlowLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/flowLog", "FlowLog.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/flowLog.FlowLog */ Boolean = js.native
  }
  
  @js.native
  trait FlowLogArgs extends StObject {
    
    /**
      * Elastic Network Interface ID to attach to
      */
    val eniId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the logging destination.
      */
    val logDestination: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
      */
    val logDestinationType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The fields to include in the flow log record, in the order in which they should appear.
      */
    val logFormat: js.UndefOr[Input[String]] = js.native
    
    /**
      * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
      *
      * @deprecated use 'log_destination' argument instead
      */
    val logGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum interval of time
      * during which a flow of packets is captured and aggregated into a flow
      * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
      * minutes). Default: `600`.
      */
    val maxAggregationInterval: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Subnet ID to attach to
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
      */
    val trafficType: Input[String] = js.native
    
    /**
      * VPC ID to attach to
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object FlowLogArgs {
    
    @scala.inline
    def apply(trafficType: Input[String]): FlowLogArgs = {
      val __obj = js.Dynamic.literal(trafficType = trafficType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowLogArgs]
    }
    
    @scala.inline
    implicit class FlowLogArgsMutableBuilder[Self <: FlowLogArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEniId(value: Input[String]): Self = StObject.set(x, "eniId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEniIdUndefined: Self = StObject.set(x, "eniId", js.undefined)
      
      @scala.inline
      def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      @scala.inline
      def setLogDestination(value: Input[String]): Self = StObject.set(x, "logDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDestinationType(value: Input[String]): Self = StObject.set(x, "logDestinationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDestinationTypeUndefined: Self = StObject.set(x, "logDestinationType", js.undefined)
      
      @scala.inline
      def setLogDestinationUndefined: Self = StObject.set(x, "logDestination", js.undefined)
      
      @scala.inline
      def setLogFormat(value: Input[String]): Self = StObject.set(x, "logFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogFormatUndefined: Self = StObject.set(x, "logFormat", js.undefined)
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      @scala.inline
      def setMaxAggregationInterval(value: Input[Double]): Self = StObject.set(x, "maxAggregationInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAggregationIntervalUndefined: Self = StObject.set(x, "maxAggregationInterval", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTrafficType(value: Input[String]): Self = StObject.set(x, "trafficType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait FlowLogState extends StObject {
    
    /**
      * The ARN of the Flow Log.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Elastic Network Interface ID to attach to
      */
    val eniId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the logging destination.
      */
    val logDestination: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
      */
    val logDestinationType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The fields to include in the flow log record, in the order in which they should appear.
      */
    val logFormat: js.UndefOr[Input[String]] = js.native
    
    /**
      * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
      *
      * @deprecated use 'log_destination' argument instead
      */
    val logGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum interval of time
      * during which a flow of packets is captured and aggregated into a flow
      * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
      * minutes). Default: `600`.
      */
    val maxAggregationInterval: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Subnet ID to attach to
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
      */
    val trafficType: js.UndefOr[Input[String]] = js.native
    
    /**
      * VPC ID to attach to
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object FlowLogState {
    
    @scala.inline
    def apply(): FlowLogState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowLogState]
    }
    
    @scala.inline
    implicit class FlowLogStateMutableBuilder[Self <: FlowLogState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEniId(value: Input[String]): Self = StObject.set(x, "eniId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEniIdUndefined: Self = StObject.set(x, "eniId", js.undefined)
      
      @scala.inline
      def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      @scala.inline
      def setLogDestination(value: Input[String]): Self = StObject.set(x, "logDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDestinationType(value: Input[String]): Self = StObject.set(x, "logDestinationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDestinationTypeUndefined: Self = StObject.set(x, "logDestinationType", js.undefined)
      
      @scala.inline
      def setLogDestinationUndefined: Self = StObject.set(x, "logDestination", js.undefined)
      
      @scala.inline
      def setLogFormat(value: Input[String]): Self = StObject.set(x, "logFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogFormatUndefined: Self = StObject.set(x, "logFormat", js.undefined)
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      @scala.inline
      def setMaxAggregationInterval(value: Input[Double]): Self = StObject.set(x, "maxAggregationInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAggregationIntervalUndefined: Self = StObject.set(x, "maxAggregationInterval", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTrafficType(value: Input[String]): Self = StObject.set(x, "trafficType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficTypeUndefined: Self = StObject.set(x, "trafficType", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
