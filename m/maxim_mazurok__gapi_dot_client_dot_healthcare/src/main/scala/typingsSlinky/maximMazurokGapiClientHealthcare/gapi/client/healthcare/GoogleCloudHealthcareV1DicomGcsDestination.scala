package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudHealthcareV1DicomGcsDestination extends js.Object {
  
  /**
    * MIME types supported by DICOM spec. Each file is written in the following format: `.../{study_id}/{series_id}/{instance_id}[/{frame_number}].{extension}` The frame_number component
    * exists only for multi-frame instances. Supported MIME types are consistent with supported formats in DICOMweb: https://cloud.google.com/healthcare/docs/dicom#retrieve_transaction.
    * Specifically, the following are supported: - application/dicom; transfer-syntax=1.2.840.10008.1.2.1 (uncompressed DICOM) - application/dicom; transfer-syntax=1.2.840.10008.1.2.4.50
    * (DICOM with embedded JPEG Baseline) - application/dicom; transfer-syntax=1.2.840.10008.1.2.4.90 (DICOM with embedded JPEG 2000 Lossless Only) - application/dicom;
    * transfer-syntax=1.2.840.10008.1.2.4.91 (DICOM with embedded JPEG 2000) - application/dicom; transfer-syntax=* (DICOM with no transcoding) - application/octet-stream;
    * transfer-syntax=1.2.840.10008.1.2.1 (raw uncompressed PixelData) - application/octet-stream; transfer-syntax=* (raw PixelData in whatever format it was uploaded in) - image/jpeg;
    * transfer-syntax=1.2.840.10008.1.2.4.50 (Consumer JPEG) - image/png The following extensions are used for output files: - application/dicom -> .dcm - image/jpeg -> .jpg - image/png
    * -> .png - application/octet-stream -> no extension If unspecified, the instances are exported in the original DICOM format they were uploaded in.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The Cloud Storage destination to export to. URI for a Cloud Storage directory where the server writes the result files, in the format `gs://{bucket-id}/{path/to/destination/dir}`).
    * If there is no trailing slash, the service appends one when composing the object path. The user is responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}
object GoogleCloudHealthcareV1DicomGcsDestination {
  
  @scala.inline
  def apply(): GoogleCloudHealthcareV1DicomGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1DicomGcsDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudHealthcareV1DicomGcsDestinationOps[Self <: GoogleCloudHealthcareV1DicomGcsDestination] (val x: Self) extends AnyVal {
    
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setUriPrefix(value: String): Self = this.set("uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriPrefix: Self = this.set("uriPrefix", js.undefined)
  }
}
