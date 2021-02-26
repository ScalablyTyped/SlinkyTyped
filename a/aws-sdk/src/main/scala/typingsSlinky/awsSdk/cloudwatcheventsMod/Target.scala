package typingsSlinky.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var Arn: TargetArn = js.native
  
  /**
    * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For more information, see Jobs in the AWS Batch User Guide.
    */
  var BatchParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.BatchParameters] = js.native
  
  /**
    * The DeadLetterConfig that defines the target queue to send dead-letter queue events to.
    */
  var DeadLetterConfig: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.DeadLetterConfig] = js.native
  
  /**
    * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see Task Definitions  in the Amazon EC2 Container Service Developer Guide.
    */
  var EcsParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EcsParameters] = js.native
  
  /**
    * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint. If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path parameter, query string keys/values as part of your target invoking request.
    */
  var HttpParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.HttpParameters] = js.native
  
  /**
    * The ID of the target.
    */
  var Id: TargetId = js.native
  
  /**
    * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For more information, see The JavaScript Object Notation (JSON) Data Interchange Format.
    */
  var Input: js.UndefOr[TargetInput] = js.native
  
  /**
    * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see JSONPath.
    */
  var InputPath: js.UndefOr[TargetInputPath] = js.native
  
  /**
    * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or more key-value pairs from the event and then use that data to send customized input to the target.
    */
  var InputTransformer: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.InputTransformer] = js.native
  
  /**
    * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If you do not include this parameter, the default is to use the eventId as the partition key.
    */
  var KinesisParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.KinesisParameters] = js.native
  
  /**
    * Contains the Redshift Data API parameters to use when the target is a Redshift cluster. If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the Redshift Data API ExecuteStatement based on EventBridge events.
    */
  var RedshiftDataParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.RedshiftDataParameters] = js.native
  
  /**
    * The RetryPolicy object that contains the retry policy configuration to use for the dead-letter queue.
    */
  var RetryPolicy: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.RetryPolicy] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule triggers multiple targets, you can use a different IAM role for each target.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.RoleArn] = js.native
  
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
    */
  var RunCommandParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.RunCommandParameters] = js.native
  
  /**
    * Contains the message group ID to use when the target is a FIFO queue. If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
    */
  var SqsParameters: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.SqsParameters] = js.native
}
object Target {
  
  @scala.inline
  def apply(Arn: TargetArn, Id: TargetId): Target = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: TargetArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchParameters(value: BatchParameters): Self = StObject.set(x, "BatchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchParametersUndefined: Self = StObject.set(x, "BatchParameters", js.undefined)
    
    @scala.inline
    def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    @scala.inline
    def setEcsParameters(value: EcsParameters): Self = StObject.set(x, "EcsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsParametersUndefined: Self = StObject.set(x, "EcsParameters", js.undefined)
    
    @scala.inline
    def setHttpParameters(value: HttpParameters): Self = StObject.set(x, "HttpParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpParametersUndefined: Self = StObject.set(x, "HttpParameters", js.undefined)
    
    @scala.inline
    def setId(value: TargetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: TargetInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPath(value: TargetInputPath): Self = StObject.set(x, "InputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPathUndefined: Self = StObject.set(x, "InputPath", js.undefined)
    
    @scala.inline
    def setInputTransformer(value: InputTransformer): Self = StObject.set(x, "InputTransformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTransformerUndefined: Self = StObject.set(x, "InputTransformer", js.undefined)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setKinesisParameters(value: KinesisParameters): Self = StObject.set(x, "KinesisParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisParametersUndefined: Self = StObject.set(x, "KinesisParameters", js.undefined)
    
    @scala.inline
    def setRedshiftDataParameters(value: RedshiftDataParameters): Self = StObject.set(x, "RedshiftDataParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftDataParametersUndefined: Self = StObject.set(x, "RedshiftDataParameters", js.undefined)
    
    @scala.inline
    def setRetryPolicy(value: RetryPolicy): Self = StObject.set(x, "RetryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "RetryPolicy", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setRunCommandParameters(value: RunCommandParameters): Self = StObject.set(x, "RunCommandParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCommandParametersUndefined: Self = StObject.set(x, "RunCommandParameters", js.undefined)
    
    @scala.inline
    def setSqsParameters(value: SqsParameters): Self = StObject.set(x, "SqsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsParametersUndefined: Self = StObject.set(x, "SqsParameters", js.undefined)
  }
}
