package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceParameters extends js.Object {
  /**
    * Amazon Elasticsearch Service parameters.
    */
  var AmazonElasticsearchParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AmazonElasticsearchParameters] = js.native
  /**
    * Amazon Athena parameters.
    */
  var AthenaParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AthenaParameters] = js.native
  /**
    * Amazon Aurora MySQL parameters.
    */
  var AuroraParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AuroraParameters] = js.native
  /**
    * Aurora PostgreSQL parameters.
    */
  var AuroraPostgreSqlParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AuroraPostgreSqlParameters] = js.native
  /**
    * AWS IoT Analytics parameters.
    */
  var AwsIotAnalyticsParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AwsIotAnalyticsParameters] = js.native
  /**
    * Jira parameters.
    */
  var JiraParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.JiraParameters] = js.native
  /**
    * MariaDB parameters.
    */
  var MariaDbParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.MariaDbParameters] = js.native
  /**
    * MySQL parameters.
    */
  var MySqlParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.MySqlParameters] = js.native
  /**
    * PostgreSQL parameters.
    */
  var PostgreSqlParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.PostgreSqlParameters] = js.native
  /**
    * Presto parameters.
    */
  var PrestoParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.PrestoParameters] = js.native
  /**
    * Amazon RDS parameters.
    */
  var RdsParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RdsParameters] = js.native
  /**
    * Amazon Redshift parameters.
    */
  var RedshiftParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RedshiftParameters] = js.native
  /**
    * S3 parameters.
    */
  var S3Parameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.S3Parameters] = js.native
  /**
    * ServiceNow parameters.
    */
  var ServiceNowParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ServiceNowParameters] = js.native
  /**
    * Snowflake parameters.
    */
  var SnowflakeParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.SnowflakeParameters] = js.native
  /**
    * Spark parameters.
    */
  var SparkParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.SparkParameters] = js.native
  /**
    * SQL Server parameters.
    */
  var SqlServerParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.SqlServerParameters] = js.native
  /**
    * Teradata parameters.
    */
  var TeradataParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.TeradataParameters] = js.native
  /**
    * Twitter parameters.
    */
  var TwitterParameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.TwitterParameters] = js.native
}

object DataSourceParameters {
  @scala.inline
  def apply(): DataSourceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameters]
  }
  @scala.inline
  implicit class DataSourceParametersOps[Self <: DataSourceParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonElasticsearchParameters(value: AmazonElasticsearchParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmazonElasticsearchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonElasticsearchParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmazonElasticsearchParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAthenaParameters(value: AthenaParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AthenaParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAthenaParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AthenaParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAuroraParameters(value: AuroraParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuroraParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuroraParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuroraParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAuroraPostgreSqlParameters(value: AuroraPostgreSqlParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuroraPostgreSqlParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuroraPostgreSqlParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuroraPostgreSqlParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsIotAnalyticsParameters(value: AwsIotAnalyticsParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsIotAnalyticsParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIotAnalyticsParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsIotAnalyticsParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withJiraParameters(value: JiraParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JiraParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJiraParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JiraParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withMariaDbParameters(value: MariaDbParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MariaDbParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMariaDbParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MariaDbParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withMySqlParameters(value: MySqlParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MySqlParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMySqlParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MySqlParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPostgreSqlParameters(value: PostgreSqlParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostgreSqlParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostgreSqlParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostgreSqlParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPrestoParameters(value: PrestoParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrestoParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrestoParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrestoParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRdsParameters(value: RdsParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftParameters(value: RedshiftParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Parameters(value: S3Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Parameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNowParameters(value: ServiceNowParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNowParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceNowParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNowParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSnowflakeParameters(value: SnowflakeParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowflakeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowflakeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowflakeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSparkParameters(value: SparkParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SparkParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparkParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SparkParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlServerParameters(value: SqlServerParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlServerParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlServerParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlServerParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTeradataParameters(value: TeradataParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeradataParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeradataParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeradataParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitterParameters(value: TwitterParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwitterParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitterParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwitterParameters")(js.undefined)
        ret
    }
  }
  
}

