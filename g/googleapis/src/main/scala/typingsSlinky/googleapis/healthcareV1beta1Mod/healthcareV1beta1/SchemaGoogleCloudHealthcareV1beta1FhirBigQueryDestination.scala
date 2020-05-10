package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for exporting to BigQuery.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination extends js.Object {
  /**
    * BigQuery URI to a dataset, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId`
    */
  var datasetUri: js.UndefOr[String] = js.native
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.native
}

object SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestinationOps[Self <: SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaConfig(value: SchemaSchemaConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaConfig")(js.undefined)
        ret
    }
  }
  
}

