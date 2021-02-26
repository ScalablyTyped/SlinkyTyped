package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired output location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1OutputConfig extends StObject {
  
  /**
    * The max number of response protos to put into each output JSON file on
    * Google Cloud Storage. The valid range is [1, 100]. If not specified, the
    * default value is 20.  For example, for one pdf file with 100 pages, 100
    * response protos will be generated. If `batch_size` = 20, then 5 json
    * files each containing 20 response protos will be written under the prefix
    * `gcs_destination`.`uri`.  Currently, batch_size only applies to
    * GcsDestination, with potential future support for other output
    * configurations.
    */
  var batchSize: js.UndefOr[Double] = js.native
  
  /**
    * The Google Cloud Storage location to write the output(s) to.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1GcsDestination] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1OutputConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1OutputConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1OutputConfigMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1OutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: SchemaGoogleCloudVisionV1p4beta1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
