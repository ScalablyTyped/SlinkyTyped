package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crawler extends js.Object {
  /**
    * A list of UTF-8 strings that specify the custom classifiers that are associated with the crawler.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.native
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.native
  /**
    * If the crawler is running, contains the total time elapsed since the last crawl began.
    */
  var CrawlElapsedTime: js.UndefOr[MillisecondsCount] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typingsSlinky.awsSdk.glueMod.CrawlerSecurityConfiguration] = js.native
  /**
    * The time that the crawler was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the database in which the crawler's output is stored.
    */
  var DatabaseName: js.UndefOr[typingsSlinky.awsSdk.glueMod.DatabaseName] = js.native
  /**
    * A description of the crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The status of the last crawl, and potentially error information if an error occurred.
    */
  var LastCrawl: js.UndefOr[LastCrawlInfo] = js.native
  /**
    * The time that the crawler was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The name of the crawler.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as Amazon Simple Storage Service (Amazon S3) data.
    */
  var Role: js.UndefOr[typingsSlinky.awsSdk.glueMod.Role] = js.native
  /**
    * For scheduled crawlers, the schedule when the crawler runs.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdk.glueMod.Schedule] = js.native
  /**
    * The policy that specifies update and delete behaviors for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[typingsSlinky.awsSdk.glueMod.SchemaChangePolicy] = js.native
  /**
    * Indicates whether the crawler is running, or whether a run is pending.
    */
  var State: js.UndefOr[CrawlerState] = js.native
  /**
    * The prefix added to the names of tables that are created.
    */
  var TablePrefix: js.UndefOr[typingsSlinky.awsSdk.glueMod.TablePrefix] = js.native
  /**
    * A collection of targets to crawl.
    */
  var Targets: js.UndefOr[CrawlerTargets] = js.native
  /**
    * The version of the crawler.
    */
  var Version: js.UndefOr[VersionId] = js.native
}

object Crawler {
  @scala.inline
  def apply(): Crawler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawler]
  }
  @scala.inline
  implicit class CrawlerOps[Self <: Crawler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCrawlElapsedTime(value: MillisecondsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlElapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlElapsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlElapsedTime")(js.undefined)
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
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withDescription(value: DescriptionString): Self = {
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
    def withLastCrawl(value: LastCrawlInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastCrawl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastCrawl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastCrawl")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
    def withSchedule(value: Schedule): Self = {
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
    def withState(value: CrawlerState): Self = {
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
    @scala.inline
    def withVersion(value: VersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

