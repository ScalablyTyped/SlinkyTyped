package typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingOutputMod

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSourceMappingOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your function. Your function receives an event with all the retrieved records.</p>
    */
  var BatchSize: js.UndefOr[Double] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the Amazon Kinesis or DynamoDB stream that is the source of events.</p>
    */
  var EventSourceArn: js.UndefOr[String] = js.native
  /**
    * <p>The Lambda function to invoke when AWS Lambda detects an event on the poll-based source.</p>
    */
  var FunctionArn: js.UndefOr[String] = js.native
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * <p>The result of the last AWS Lambda invocation of your Lambda function. This value will be null if an SQS queue is the event source.</p>
    */
  var LastProcessingResult: js.UndefOr[String] = js.native
  /**
    * <p>The state of the event source mapping. It can be <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>, <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>, or <code>Deleting</code>.</p>
    */
  var State: js.UndefOr[String] = js.native
  /**
    * <p>The reason the event source mapping is in its current state. It is either user-requested or an AWS Lambda-initiated state transition.</p>
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
  /**
    * <p>The AWS Lambda assigned opaque identifier for the mapping.</p>
    */
  var UUID: js.UndefOr[String] = js.native
}

object CreateEventSourceMappingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CreateEventSourceMappingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSourceMappingOutput]
  }
  @scala.inline
  implicit class CreateEventSourceMappingOutputOps[Self <: CreateEventSourceMappingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLastProcessingResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastProcessingResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastProcessingResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastProcessingResult")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTransitionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateTransitionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withUUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UUID")(js.undefined)
        ret
    }
  }
  
}

