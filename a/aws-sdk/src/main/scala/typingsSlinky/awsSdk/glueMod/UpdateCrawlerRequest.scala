package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCrawlerRequest extends js.Object {
  /**
    * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.native
  /**
    * The crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typingsSlinky.awsSdk.glueMod.CrawlerSecurityConfiguration] = js.native
  /**
    * The AWS Glue database where results are stored, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var DatabaseName: js.UndefOr[typingsSlinky.awsSdk.glueMod.DatabaseName] = js.native
  /**
    * A description of the new crawler.
    */
  var Description: js.UndefOr[DescriptionStringRemovable] = js.native
  /**
    * Name of the new crawler.
    */
  var Name: NameString = js.native
  /**
    * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by the new crawler to access customer resources.
    */
  var Role: js.UndefOr[typingsSlinky.awsSdk.glueMod.Role] = js.native
  /**
    * A cron expression used to specify the schedule. For more information, see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, specify cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.native
  /**
    * The policy for the crawler's update and deletion behavior.
    */
  var SchemaChangePolicy: js.UndefOr[typingsSlinky.awsSdk.glueMod.SchemaChangePolicy] = js.native
  /**
    * The table prefix used for catalog tables that are created.
    */
  var TablePrefix: js.UndefOr[typingsSlinky.awsSdk.glueMod.TablePrefix] = js.native
  /**
    * A list of targets to crawl.
    */
  var Targets: js.UndefOr[CrawlerTargets] = js.native
}

object UpdateCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): UpdateCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCrawlerRequest]
  }
  @scala.inline
  implicit class UpdateCrawlerRequestOps[Self <: UpdateCrawlerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassifiers(value: ClassifierNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: CrawlerConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawlerSecurityConfiguration(value: CrawlerSecurityConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerSecurityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlerSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerSecurityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: DatabaseName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionStringRemovable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: CronExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaChangePolicy(value: SchemaChangePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaChangePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaChangePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaChangePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withTablePrefix(value: TablePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: CrawlerTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(js.undefined)
        ret
    }
  }
  
}

