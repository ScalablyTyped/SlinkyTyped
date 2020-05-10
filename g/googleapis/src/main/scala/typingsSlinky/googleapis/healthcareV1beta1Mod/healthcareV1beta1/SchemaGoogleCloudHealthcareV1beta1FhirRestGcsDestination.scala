package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for exporting to Cloud Storage.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination extends js.Object {
  /**
    * URI for a Cloud Storage directory where result files should be written
    * (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If there is
    * no trailing slash, the service will append one when composing the object
    * path. The user is responsible for creating the Cloud Storage bucket
    * referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestinationOps[Self <: SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination] (val x: Self) extends AnyVal {
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

