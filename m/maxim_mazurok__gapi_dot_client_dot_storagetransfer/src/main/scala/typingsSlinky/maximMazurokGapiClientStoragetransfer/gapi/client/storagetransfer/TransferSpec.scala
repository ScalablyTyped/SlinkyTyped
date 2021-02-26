package typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferSpec extends StObject {
  
  /** An AWS S3 data source. */
  var awsS3DataSource: js.UndefOr[AwsS3Data] = js.native
  
  /** An Azure Blob Storage data source. */
  var azureBlobStorageDataSource: js.UndefOr[AzureBlobStorageData] = js.native
  
  /** A Cloud Storage data sink. */
  var gcsDataSink: js.UndefOr[GcsData] = js.native
  
  /** A Cloud Storage data source. */
  var gcsDataSource: js.UndefOr[GcsData] = js.native
  
  /** An HTTP URL data source. */
  var httpDataSource: js.UndefOr[HttpData] = js.native
  
  /**
    * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not
    * exclude objects in a data sink.
    */
  var objectConditions: js.UndefOr[ObjectConditions] = js.native
  
  /**
    * If the option delete_objects_unique_in_sink is `true` and time-based object conditions such as 'last modification time' are specified, the request fails with an INVALID_ARGUMENT
    * error.
    */
  var transferOptions: js.UndefOr[TransferOptions] = js.native
}
object TransferSpec {
  
  @scala.inline
  def apply(): TransferSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferSpec]
  }
  
  @scala.inline
  implicit class TransferSpecMutableBuilder[Self <: TransferSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsS3DataSource(value: AwsS3Data): Self = StObject.set(x, "awsS3DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsS3DataSourceUndefined: Self = StObject.set(x, "awsS3DataSource", js.undefined)
    
    @scala.inline
    def setAzureBlobStorageDataSource(value: AzureBlobStorageData): Self = StObject.set(x, "azureBlobStorageDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureBlobStorageDataSourceUndefined: Self = StObject.set(x, "azureBlobStorageDataSource", js.undefined)
    
    @scala.inline
    def setGcsDataSink(value: GcsData): Self = StObject.set(x, "gcsDataSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDataSinkUndefined: Self = StObject.set(x, "gcsDataSink", js.undefined)
    
    @scala.inline
    def setGcsDataSource(value: GcsData): Self = StObject.set(x, "gcsDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDataSourceUndefined: Self = StObject.set(x, "gcsDataSource", js.undefined)
    
    @scala.inline
    def setHttpDataSource(value: HttpData): Self = StObject.set(x, "httpDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpDataSourceUndefined: Self = StObject.set(x, "httpDataSource", js.undefined)
    
    @scala.inline
    def setObjectConditions(value: ObjectConditions): Self = StObject.set(x, "objectConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectConditionsUndefined: Self = StObject.set(x, "objectConditions", js.undefined)
    
    @scala.inline
    def setTransferOptions(value: TransferOptions): Self = StObject.set(x, "transferOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferOptionsUndefined: Self = StObject.set(x, "transferOptions", js.undefined)
  }
}
