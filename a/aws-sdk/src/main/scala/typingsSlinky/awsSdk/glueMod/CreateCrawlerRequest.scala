package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCrawlerRequest extends StObject {
  
  /**
    * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.native
  
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.native
  
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typingsSlinky.awsSdk.glueMod.CrawlerSecurityConfiguration] = js.native
  
  /**
    * The AWS Glue database where results are written, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var DatabaseName: js.UndefOr[typingsSlinky.awsSdk.glueMod.DatabaseName] = js.native
  
  /**
    * A description of the new crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * Name of the new crawler.
    */
  var Name: NameString = js.native
  
  /**
    * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.
    */
  var RecrawlPolicy: js.UndefOr[typingsSlinky.awsSdk.glueMod.RecrawlPolicy] = js.native
  
  /**
    * The IAM role or Amazon Resource Name (ARN) of an IAM role used by the new crawler to access customer resources.
    */
  var Role: typingsSlinky.awsSdk.glueMod.Role = js.native
  
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
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
    * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  
  /**
    * A list of collection of targets to crawl.
    */
  var Targets: CrawlerTargets = js.native
}
object CreateCrawlerRequest {
  
  @scala.inline
  def apply(Name: NameString, Role: Role, Targets: CrawlerTargets): CreateCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCrawlerRequest]
  }
  
  @scala.inline
  implicit class CreateCrawlerRequestMutableBuilder[Self <: CreateCrawlerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifiers(value: ClassifierNameList): Self = StObject.set(x, "Classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiersUndefined: Self = StObject.set(x, "Classifiers", js.undefined)
    
    @scala.inline
    def setClassifiersVarargs(value: NameString*): Self = StObject.set(x, "Classifiers", js.Array(value :_*))
    
    @scala.inline
    def setConfiguration(value: CrawlerConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setCrawlerSecurityConfiguration(value: CrawlerSecurityConfiguration): Self = StObject.set(x, "CrawlerSecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerSecurityConfigurationUndefined: Self = StObject.set(x, "CrawlerSecurityConfiguration", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecrawlPolicy(value: RecrawlPolicy): Self = StObject.set(x, "RecrawlPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecrawlPolicyUndefined: Self = StObject.set(x, "RecrawlPolicy", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: CronExpression): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setSchemaChangePolicy(value: SchemaChangePolicy): Self = StObject.set(x, "SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaChangePolicyUndefined: Self = StObject.set(x, "SchemaChangePolicy", js.undefined)
    
    @scala.inline
    def setTablePrefix(value: TablePrefix): Self = StObject.set(x, "TablePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablePrefixUndefined: Self = StObject.set(x, "TablePrefix", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTargets(value: CrawlerTargets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
  }
}
