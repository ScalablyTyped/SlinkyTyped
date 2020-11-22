package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DicomStore extends js.Object {
  
  /**
    * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
    * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.DicomStore with TopLevel[js.Any]
  ] = js.native
  
  /** Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`. */
  var name: js.UndefOr[String] = js.native
  
  /** Notification destination for new DICOM instances. Supplied by the client. */
  var notificationConfig: js.UndefOr[NotificationConfig] = js.native
}
object DicomStore {
  
  @scala.inline
  def apply(): DicomStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DicomStore]
  }
  
  @scala.inline
  implicit class DicomStoreOps[Self <: DicomStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.DicomStore with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: NotificationConfig): Self = this.set("notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfig: Self = this.set("notificationConfig", js.undefined)
  }
}
