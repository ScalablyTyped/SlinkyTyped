package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceConfiguration extends StObject {
  
  /**
    * Specifies configuration information for Salesforce chatter feeds.
    */
  var ChatterFeedConfiguration: js.UndefOr[SalesforceChatterFeedConfiguration] = js.native
  
  /**
    * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an inclusion pattern, the document is not included in the index. The regex is applied to the name of the attached file.
    */
  var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an exclusion pattern, the document is not included in the index. The regex is applied to the name of the attached file.
    */
  var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * Specifies configuration information for the knowlege article types that Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom knowledge articles, but not both.
    */
  var KnowledgeArticleConfiguration: js.UndefOr[SalesforceKnowledgeArticleConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the key/value pairs required to connect to your Salesforce instance. The secret must contain a JSON structure with the following keys:   authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.    consumerKey - The application public key generated when you created your Salesforce application.   consumerSecret - The application private key generated when you created your Salesforce application.   password - The password associated with the user logging in to the Salesforce instance.   securityToken - The token associated with the user account logging in to the Salesforce instance.   username - The user name of the user logging in to the Salesforce instance.  
    */
  var SecretArn: typingsSlinky.awsSdk.kendraMod.SecretArn = js.native
  
  /**
    * The instance URL for the Salesforce site that you want to index.
    */
  var ServerUrl: Url = js.native
  
  /**
    * Provides configuration information for processing attachments to Salesforce standard objects. 
    */
  var StandardObjectAttachmentConfiguration: js.UndefOr[SalesforceStandardObjectAttachmentConfiguration] = js.native
  
  /**
    * Specifies the Salesforce standard objects that Amazon Kendra indexes.
    */
  var StandardObjectConfigurations: js.UndefOr[SalesforceStandardObjectConfigurationList] = js.native
}
object SalesforceConfiguration {
  
  @scala.inline
  def apply(SecretArn: SecretArn, ServerUrl: Url): SalesforceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceConfigurationMutableBuilder[Self <: SalesforceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChatterFeedConfiguration(value: SalesforceChatterFeedConfiguration): Self = StObject.set(x, "ChatterFeedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatterFeedConfigurationUndefined: Self = StObject.set(x, "ChatterFeedConfiguration", js.undefined)
    
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    @scala.inline
    def setExcludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.undefined)
    
    @scala.inline
    def setExcludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.Array(value :_*))
    
    @scala.inline
    def setIncludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "IncludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.undefined)
    
    @scala.inline
    def setIncludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.Array(value :_*))
    
    @scala.inline
    def setKnowledgeArticleConfiguration(value: SalesforceKnowledgeArticleConfiguration): Self = StObject.set(x, "KnowledgeArticleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeArticleConfigurationUndefined: Self = StObject.set(x, "KnowledgeArticleConfiguration", js.undefined)
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrl(value: Url): Self = StObject.set(x, "ServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardObjectAttachmentConfiguration(value: SalesforceStandardObjectAttachmentConfiguration): Self = StObject.set(x, "StandardObjectAttachmentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardObjectAttachmentConfigurationUndefined: Self = StObject.set(x, "StandardObjectAttachmentConfiguration", js.undefined)
    
    @scala.inline
    def setStandardObjectConfigurations(value: SalesforceStandardObjectConfigurationList): Self = StObject.set(x, "StandardObjectConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardObjectConfigurationsUndefined: Self = StObject.set(x, "StandardObjectConfigurations", js.undefined)
    
    @scala.inline
    def setStandardObjectConfigurationsVarargs(value: SalesforceStandardObjectConfiguration*): Self = StObject.set(x, "StandardObjectConfigurations", js.Array(value :_*))
  }
}
