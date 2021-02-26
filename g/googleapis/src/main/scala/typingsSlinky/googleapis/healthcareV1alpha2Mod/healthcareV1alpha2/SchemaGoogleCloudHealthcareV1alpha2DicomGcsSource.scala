package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the configuration for importing data from Cloud Storage.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource extends StObject {
  
  /**
    * Points to a Cloud Storage URI containing file(s) with content only. The
    * URI must be in the following format: `gs://{bucket_id}/{object_id}`. The
    * URI can include wildcards in `object_id` and thus identify multiple
    * files. Supported wildcards:  &#39;*&#39; to match 0 or more non-separator
    * characters  &#39;**&#39; to match 0 or more characters (including
    * separators). Must be used at       the end of a path and with no other
    * wildcards in the       path. Can also be used with a file extension (such
    * as .dcm), which       imports all files with the extension in the
    * specified directory and       its sub-directories. For example,
    * `gs://my-bucket/my-directory/ **.dcm` imports all files with .dcm
    * extensions in `my-directory/` and its sub-directories.  &#39;?&#39; to
    * match 1 character All other URI formats are invalid. Files matching the
    * wildcard are expected to contain content only, no metadata.
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2DicomGcsSourceMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
