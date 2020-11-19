package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the configuration for importing data from Cloud Storage.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource extends js.Object {
  
  /**
    * Points to a Cloud Storage URI containing file(s) to import.  The URI must
    * be in the following format: `gs://{bucket_id}/{object_id}`. The URI can
    * include wildcards in `object_id` and thus identify multiple files.
    * Supported wildcards:  *  `*` to match 0 or more non-separator characters
    * *  `**` to match 0 or more characters (including separators). Must be
    * used at the end of a path and with no other wildcards in the path. Can
    * also be used with a file extension (such as .ndjson), which imports all
    * files with the extension in the specified directory and its
    * sub-directories. For example, `gs://my-bucket/my-directory/ **.ndjson`
    * imports all files with `.ndjson` extensions in `my-directory/` and its
    * sub-directories. *  `?` to match 1 character  Files matching the wildcard
    * are expected to contain content only, no metadata.
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSourceOps[Self <: SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource] (val x: Self) extends AnyVal {
    
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
