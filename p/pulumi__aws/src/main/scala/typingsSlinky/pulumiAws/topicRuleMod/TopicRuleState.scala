package typingsSlinky.pulumiAws.topicRuleMod

import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleCloudwatchAlarm
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleCloudwatchMetric
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleDynamodb
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleElasticsearch
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleFirehose
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleKinesis
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleLambda
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleRepublish
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleS3
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleSns
import typingsSlinky.pulumiAws.inputMod.iot.TopicRuleSqs
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleState extends js.Object {
  /**
    * The ARN of the topic rule
    */
  val arn: js.UndefOr[Input[String]] = js.native
  val cloudwatchAlarm: js.UndefOr[Input[TopicRuleCloudwatchAlarm]] = js.native
  val cloudwatchMetric: js.UndefOr[Input[TopicRuleCloudwatchMetric]] = js.native
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  val dynamodb: js.UndefOr[Input[TopicRuleDynamodb]] = js.native
  val elasticsearch: js.UndefOr[Input[TopicRuleElasticsearch]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  val firehose: js.UndefOr[Input[TopicRuleFirehose]] = js.native
  val kinesis: js.UndefOr[Input[TopicRuleKinesis]] = js.native
  val lambda: js.UndefOr[Input[TopicRuleLambda]] = js.native
  /**
    * The name of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val republish: js.UndefOr[Input[TopicRuleRepublish]] = js.native
  val s3: js.UndefOr[Input[TopicRuleS3]] = js.native
  val sns: js.UndefOr[Input[TopicRuleSns]] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: js.UndefOr[Input[String]] = js.native
  val sqs: js.UndefOr[Input[TopicRuleSqs]] = js.native
}

object TopicRuleState {
  @scala.inline
  def apply(): TopicRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleState]
  }
  @scala.inline
  implicit class TopicRuleStateOps[Self <: TopicRuleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchAlarm(value: Input[TopicRuleCloudwatchAlarm]): Self = {
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
    def withCloudwatchMetric(value: Input[TopicRuleCloudwatchMetric]): Self = {
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
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamodb(value: Input[TopicRuleDynamodb]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearch(value: Input[TopicRuleElasticsearch]): Self = {
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
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFirehose(value: Input[TopicRuleFirehose]): Self = {
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
    def withKinesis(value: Input[TopicRuleKinesis]): Self = {
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
    def withLambda(value: Input[TopicRuleLambda]): Self = {
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
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRepublish(value: Input[TopicRuleRepublish]): Self = {
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
    def withS3(value: Input[TopicRuleS3]): Self = {
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
    def withSns(value: Input[TopicRuleSns]): Self = {
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
    def withSql(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSqs(value: Input[TopicRuleSqs]): Self = {
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
  }
  
}

