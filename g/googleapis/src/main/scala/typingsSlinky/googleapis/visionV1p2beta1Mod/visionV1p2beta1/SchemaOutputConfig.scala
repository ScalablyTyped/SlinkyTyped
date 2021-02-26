package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired output location and metadata.
  */
@js.native
trait SchemaOutputConfig extends StObject {
  
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
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.native
}
object SchemaOutputConfig {
  
  @scala.inline
  def apply(): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutputConfig]
  }
  
  @scala.inline
  implicit class SchemaOutputConfigMutableBuilder[Self <: SchemaOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: SchemaGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
