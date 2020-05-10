package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of importing resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse extends js.Object {
  /**
    * The number of resources that had errors.
    */
  var errorCount: js.UndefOr[String] = js.native
  /**
    * The total number of resources included in the source data. This is the
    * sum of the success and error counts.
    */
  var inputSize: js.UndefOr[String] = js.native
  /**
    * The FHIR store name the resources have been imported to, in the format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The number of resources that have been imported.
    */
  var successCount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponseOps[Self <: SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(js.undefined)
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(js.undefined)
        ret
    }
  }
  
}

