package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata available primarily for filtering jobs. Will be included in the
  * ListJob response and Job SUMMARY view.
  */
@js.native
trait SchemaJobMetadata extends StObject {
  
  /**
    * Identification of a BigTable source used in the Dataflow job.
    */
  var bigTableDetails: js.UndefOr[js.Array[SchemaBigTableIODetails]] = js.native
  
  /**
    * Identification of a BigQuery source used in the Dataflow job.
    */
  var bigqueryDetails: js.UndefOr[js.Array[SchemaBigQueryIODetails]] = js.native
  
  /**
    * Identification of a Datastore source used in the Dataflow job.
    */
  var datastoreDetails: js.UndefOr[js.Array[SchemaDatastoreIODetails]] = js.native
  
  /**
    * Identification of a File source used in the Dataflow job.
    */
  var fileDetails: js.UndefOr[js.Array[SchemaFileIODetails]] = js.native
  
  /**
    * Identification of a PubSub source used in the Dataflow job.
    */
  var pubsubDetails: js.UndefOr[js.Array[SchemaPubSubIODetails]] = js.native
  
  /**
    * The SDK version used to run the job.
    */
  var sdkVersion: js.UndefOr[SchemaSdkVersion] = js.native
  
  /**
    * Identification of a Spanner source used in the Dataflow job.
    */
  var spannerDetails: js.UndefOr[js.Array[SchemaSpannerIODetails]] = js.native
}
object SchemaJobMetadata {
  
  @scala.inline
  def apply(): SchemaJobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetadata]
  }
  
  @scala.inline
  implicit class SchemaJobMetadataMutableBuilder[Self <: SchemaJobMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigTableDetails(value: js.Array[SchemaBigTableIODetails]): Self = StObject.set(x, "bigTableDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigTableDetailsUndefined: Self = StObject.set(x, "bigTableDetails", js.undefined)
    
    @scala.inline
    def setBigTableDetailsVarargs(value: SchemaBigTableIODetails*): Self = StObject.set(x, "bigTableDetails", js.Array(value :_*))
    
    @scala.inline
    def setBigqueryDetails(value: js.Array[SchemaBigQueryIODetails]): Self = StObject.set(x, "bigqueryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDetailsUndefined: Self = StObject.set(x, "bigqueryDetails", js.undefined)
    
    @scala.inline
    def setBigqueryDetailsVarargs(value: SchemaBigQueryIODetails*): Self = StObject.set(x, "bigqueryDetails", js.Array(value :_*))
    
    @scala.inline
    def setDatastoreDetails(value: js.Array[SchemaDatastoreIODetails]): Self = StObject.set(x, "datastoreDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreDetailsUndefined: Self = StObject.set(x, "datastoreDetails", js.undefined)
    
    @scala.inline
    def setDatastoreDetailsVarargs(value: SchemaDatastoreIODetails*): Self = StObject.set(x, "datastoreDetails", js.Array(value :_*))
    
    @scala.inline
    def setFileDetails(value: js.Array[SchemaFileIODetails]): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    @scala.inline
    def setFileDetailsVarargs(value: SchemaFileIODetails*): Self = StObject.set(x, "fileDetails", js.Array(value :_*))
    
    @scala.inline
    def setPubsubDetails(value: js.Array[SchemaPubSubIODetails]): Self = StObject.set(x, "pubsubDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubDetailsUndefined: Self = StObject.set(x, "pubsubDetails", js.undefined)
    
    @scala.inline
    def setPubsubDetailsVarargs(value: SchemaPubSubIODetails*): Self = StObject.set(x, "pubsubDetails", js.Array(value :_*))
    
    @scala.inline
    def setSdkVersion(value: SchemaSdkVersion): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    @scala.inline
    def setSpannerDetails(value: js.Array[SchemaSpannerIODetails]): Self = StObject.set(x, "spannerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpannerDetailsUndefined: Self = StObject.set(x, "spannerDetails", js.undefined)
    
    @scala.inline
    def setSpannerDetailsVarargs(value: SchemaSpannerIODetails*): Self = StObject.set(x, "spannerDetails", js.Array(value :_*))
  }
}
