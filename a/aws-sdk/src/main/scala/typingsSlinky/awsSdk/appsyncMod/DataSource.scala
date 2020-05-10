package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The data source ARN.
    */
  var dataSourceArn: js.UndefOr[String] = js.native
  /**
    * The description of the data source.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Amazon DynamoDB settings.
    */
  var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.native
  /**
    * Amazon Elasticsearch Service settings.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.native
  /**
    * HTTP endpoint settings.
    */
  var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.native
  /**
    * AWS Lambda settings.
    */
  var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.native
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * Relational database settings.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.native
  /**
    * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.native
  /**
    * The type of the data source.    AMAZON_DYNAMODB: The data source is an Amazon DynamoDB table.    AMAZON_ELASTICSEARCH: The data source is an Amazon Elasticsearch Service domain.    AWS_LAMBDA: The data source is an AWS Lambda function.    NONE: There is no data source. This type is used when you wish to invoke a GraphQL operation without connecting to a data source, such as performing data transformation with resolvers or triggering a subscription to be invoked from a mutation.    HTTP: The data source is an HTTP endpoint.    RELATIONAL_DATABASE: The data source is a relational database.  
    */
  var `type`: js.UndefOr[DataSourceType] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withDynamodbConfig(value: DynamodbDataSourceConfig): Self = {
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
    def withElasticsearchConfig(value: ElasticsearchDataSourceConfig): Self = {
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
    def withHttpConfig(value: HttpDataSourceConfig): Self = {
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
    def withLambdaConfig(value: LambdaDataSourceConfig): Self = {
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
    def withName(value: ResourceName): Self = {
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
    def withRelationalDatabaseConfig(value: RelationalDatabaseDataSourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalDatabaseConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: String): Self = {
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
    def withType(value: DataSourceType): Self = {
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

