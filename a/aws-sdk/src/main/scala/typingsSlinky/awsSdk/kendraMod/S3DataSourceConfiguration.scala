package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3DataSourceConfiguration extends StObject {
  
  /**
    * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
    */
  var AccessControlListConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.AccessControlListConfiguration] = js.native
  
  /**
    * The name of the bucket that contains the documents.
    */
  var BucketName: S3BucketName = js.native
  
  var DocumentsMetadataConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DocumentsMetadataConfiguration] = js.native
  
  /**
    * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. For more information about glob patterns, see glob (programming) in Wikipedia.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. For more information about glob patterns, see glob (programming) in Wikipedia.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of S3 prefixes for the documents that should be included in the index.
    */
  var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
}
object S3DataSourceConfiguration {
  
  @scala.inline
  def apply(BucketName: S3BucketName): S3DataSourceConfiguration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSourceConfiguration]
  }
  
  @scala.inline
  implicit class S3DataSourceConfigurationMutableBuilder[Self <: S3DataSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlListConfiguration(value: AccessControlListConfiguration): Self = StObject.set(x, "AccessControlListConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListConfigurationUndefined: Self = StObject.set(x, "AccessControlListConfiguration", js.undefined)
    
    @scala.inline
    def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsMetadataConfiguration(value: DocumentsMetadataConfiguration): Self = StObject.set(x, "DocumentsMetadataConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsMetadataConfigurationUndefined: Self = StObject.set(x, "DocumentsMetadataConfiguration", js.undefined)
    
    @scala.inline
    def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    @scala.inline
    def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    @scala.inline
    def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPrefixes(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionPrefixesUndefined: Self = StObject.set(x, "InclusionPrefixes", js.undefined)
    
    @scala.inline
    def setInclusionPrefixesVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPrefixes", js.Array(value :_*))
  }
}
