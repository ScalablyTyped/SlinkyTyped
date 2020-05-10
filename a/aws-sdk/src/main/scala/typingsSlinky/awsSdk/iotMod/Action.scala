package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * Change the state of a CloudWatch alarm.
    */
  var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.native
  /**
    * Send data to CloudWatch logs.
    */
  var cloudwatchLogs: js.UndefOr[CloudwatchLogsAction] = js.native
  /**
    * Capture a CloudWatch metric.
    */
  var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.native
  /**
    * Write to a DynamoDB table.
    */
  var dynamoDB: js.UndefOr[DynamoDBAction] = js.native
  /**
    * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in an MQTT message payload into a separate DynamoDB column.
    */
  var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.native
  /**
    * Write data to an Amazon Elasticsearch Service domain.
    */
  var elasticsearch: js.UndefOr[ElasticsearchAction] = js.native
  /**
    * Write to an Amazon Kinesis Firehose stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.native
  /**
    * Send data to an HTTPS endpoint.
    */
  var http: js.UndefOr[HttpAction] = js.native
  /**
    * Sends message data to an AWS IoT Analytics channel.
    */
  var iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.native
  /**
    * Sends an input to an AWS IoT Events detector.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.native
  /**
    * Sends data from the MQTT message that triggered the rule to AWS IoT SiteWise asset properties.
    */
  var iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.native
  /**
    * Write data to an Amazon Kinesis stream.
    */
  var kinesis: js.UndefOr[KinesisAction] = js.native
  /**
    * Invoke a Lambda function.
    */
  var lambda: js.UndefOr[LambdaAction] = js.native
  /**
    * Publish to another MQTT topic.
    */
  var republish: js.UndefOr[RepublishAction] = js.native
  /**
    * Write to an Amazon S3 bucket.
    */
  var s3: js.UndefOr[S3Action] = js.native
  /**
    * Send a message to a Salesforce IoT Cloud Input Stream.
    */
  var salesforce: js.UndefOr[SalesforceAction] = js.native
  /**
    * Publish to an Amazon SNS topic.
    */
  var sns: js.UndefOr[SnsAction] = js.native
  /**
    * Publish to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.native
  /**
    * Starts execution of a Step Functions state machine.
    */
  var stepFunctions: js.UndefOr[StepFunctionsAction] = js.native
}

object Action {
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchAlarm(value: CloudwatchAlarmAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchAlarm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchAlarm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchAlarm")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLogs(value: CloudwatchLogsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchMetric(value: CloudwatchMetricAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoDB(value: DynamoDBAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDB")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamoDBv2(value: DynamoDBv2Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDBv2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamoDBv2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamoDBv2")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearch(value: ElasticsearchAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearch")(js.undefined)
        ret
    }
    @scala.inline
    def withFirehose(value: FirehoseAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firehose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirehose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firehose")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: HttpAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withIotAnalytics(value: IotAnalyticsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withIotEvents(value: IotEventsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withIotSiteWise(value: IotSiteWiseAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotSiteWise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotSiteWise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotSiteWise")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesis(value: KinesisAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: LambdaAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
    @scala.inline
    def withRepublish(value: RepublishAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("republish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("republish")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: S3Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(js.undefined)
        ret
    }
    @scala.inline
    def withSalesforce(value: SalesforceAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salesforce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalesforce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salesforce")(js.undefined)
        ret
    }
    @scala.inline
    def withSns(value: SnsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(js.undefined)
        ret
    }
    @scala.inline
    def withSqs(value: SqsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(js.undefined)
        ret
    }
    @scala.inline
    def withStepFunctions(value: StepFunctionsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepFunctions")(js.undefined)
        ret
    }
  }
  
}

