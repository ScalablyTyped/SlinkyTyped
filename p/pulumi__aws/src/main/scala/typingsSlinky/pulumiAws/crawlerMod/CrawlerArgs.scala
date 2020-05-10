package typingsSlinky.pulumiAws.crawlerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.glue.CrawlerCatalogTarget
import typingsSlinky.pulumiAws.inputMod.glue.CrawlerDynamodbTarget
import typingsSlinky.pulumiAws.inputMod.glue.CrawlerJdbcTarget
import typingsSlinky.pulumiAws.inputMod.glue.CrawlerS3Target
import typingsSlinky.pulumiAws.inputMod.glue.CrawlerSchemaChangePolicy
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerArgs extends js.Object {
  val catalogTargets: js.UndefOr[Input[js.Array[Input[CrawlerCatalogTarget]]]] = js.native
  /**
    * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  val classifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * JSON string of configuration information.
    */
  val configuration: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Glue database to be synchronized.
    */
  val databaseName: Input[String] = js.native
  /**
    * Description of the crawler.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of nested DynamoDB target arguments. See below.
    */
  val dynamodbTargets: js.UndefOr[Input[js.Array[Input[CrawlerDynamodbTarget]]]] = js.native
  /**
    * List of nested JBDC target arguments. See below.
    */
  val jdbcTargets: js.UndefOr[Input[js.Array[Input[CrawlerJdbcTarget]]]] = js.native
  /**
    * Name of the crawler.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
    */
  val role: Input[String] = js.native
  /**
    * List nested Amazon S3 target arguments. See below.
    */
  val s3Targets: js.UndefOr[Input[js.Array[Input[CrawlerS3Target]]]] = js.native
  /**
    * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
    */
  val schedule: js.UndefOr[Input[String]] = js.native
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  val schemaChangePolicy: js.UndefOr[Input[CrawlerSchemaChangePolicy]] = js.native
  /**
    * The name of Security Configuration to be used by the crawler
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * The table prefix used for catalog tables that are created.
    */
  val tablePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object CrawlerArgs {
  @scala.inline
  def apply(databaseName: Input[String], role: Input[String]): CrawlerArgs = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerArgs]
  }
  @scala.inline
  implicit class CrawlerArgsOps[Self <: CrawlerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogTargets(value: Input[js.Array[Input[CrawlerCatalogTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withClassifiers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
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
    def withDynamodbTargets(value: Input[js.Array[Input[CrawlerDynamodbTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodbTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodbTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodbTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withJdbcTargets(value: Input[js.Array[Input[CrawlerJdbcTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jdbcTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJdbcTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jdbcTargets")(js.undefined)
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
    def withS3Targets(value: Input[js.Array[Input[CrawlerS3Target]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Targets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Targets")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaChangePolicy(value: Input[CrawlerSchemaChangePolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaChangePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaChangePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaChangePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfiguration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTablePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

