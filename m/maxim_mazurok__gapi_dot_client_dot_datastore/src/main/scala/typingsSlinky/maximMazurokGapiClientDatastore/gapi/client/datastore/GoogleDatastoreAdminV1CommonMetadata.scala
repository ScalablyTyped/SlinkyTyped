package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1CommonMetadata extends StObject {
  
  /** The time the operation ended, either successfully or otherwise. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The client-assigned labels which were provided when the operation was created. May also include additional labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GoogleDatastoreAdminV1CommonMetadata with TopLevel[js.Any]
  ] = js.native
  
  /** The type of the operation. Can be used as a filter in ListOperationsRequest. */
  var operationType: js.UndefOr[String] = js.native
  
  /** The time that work began on the operation. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The current state of the Operation. */
  var state: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1CommonMetadata {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1CommonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1CommonMetadata]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1CommonMetadataMutableBuilder[Self <: GoogleDatastoreAdminV1CommonMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GoogleDatastoreAdminV1CommonMetadata with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
