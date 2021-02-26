package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatasetContentResponse extends StObject {
  
  /**
    * The version ID of the dataset contents that are being created.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.native
}
object CreateDatasetContentResponse {
  
  @scala.inline
  def apply(): CreateDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetContentResponse]
  }
  
  @scala.inline
  implicit class CreateDatasetContentResponseMutableBuilder[Self <: CreateDatasetContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: DatasetContentVersion): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
