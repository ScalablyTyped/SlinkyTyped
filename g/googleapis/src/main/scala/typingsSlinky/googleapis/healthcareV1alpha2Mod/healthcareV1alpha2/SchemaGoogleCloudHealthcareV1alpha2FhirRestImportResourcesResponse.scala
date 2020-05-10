package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of importing resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes successfully.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse extends js.Object {
  /**
    * The name of the FHIR store where the resources have been imported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  /**
    * The total number of resources included in the source data.
    */
  var inputSize: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponseOps[Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFhirStore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fhirStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFhirStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fhirStore")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSize")(js.undefined)
        ret
    }
  }
  
}

