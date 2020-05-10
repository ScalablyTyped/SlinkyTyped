package typingsSlinky.pulumiAws.dataSourceMod

import typingsSlinky.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig
import typingsSlinky.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig
import typingsSlinky.pulumiAws.inputMod.appsync.DataSourceHttpConfig
import typingsSlinky.pulumiAws.inputMod.appsync.DataSourceLambdaConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceState extends js.Object {
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the DataSource.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: js.UndefOr[Input[DataSourceDynamodbConfig]] = js.native
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: js.UndefOr[Input[DataSourceElasticsearchConfig]] = js.native
  /**
    * HTTP settings. See below
    */
  val httpConfig: js.UndefOr[Input[DataSourceHttpConfig]] = js.native
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: js.UndefOr[Input[DataSourceLambdaConfig]] = js.native
  /**
    * A user-supplied name for the DataSource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object DataSourceState {
  @scala.inline
  def apply(): DataSourceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceState]
  }
  @scala.inline
  implicit class DataSourceStateOps[Self <: DataSourceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(js.undefined)
        ret
    }
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
    def withDynamodbConfig(value: Input[DataSourceDynamodbConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodbConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodbConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodbConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchConfig(value: Input[DataSourceElasticsearchConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpConfig(value: Input[DataSourceHttpConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaConfig(value: Input[DataSourceLambdaConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaConfig")(js.undefined)
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
    def withServiceRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

