package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Cloud Storage destination where errors will be recorded.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination extends js.Object {
  /**
    * URI for a Cloud Storage directory to which error report files should be
    * written (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If
    * there is no trailing slash, the service will append one when composing
    * the object path. The user is responsible for creating the Cloud Storage
    * bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestinationOps[Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUriPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPrefix")(js.undefined)
        ret
    }
  }
  
}

