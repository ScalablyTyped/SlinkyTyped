package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to export resources.
  */
@js.native
trait SchemaExportResourcesRequest extends js.Object {
  /**
    * The BigQuery destination location. The output will be one BigQuery table
    * per resource type.
    */
  var bigqueryDestinationLocation: js.UndefOr[SchemaBigQueryLocation] = js.native
  /**
    * The Cloud Storage destination location. Specify a path to a Cloud Storage
    * bucket or folder rather than a concrete object. The exported outputs are
    * organized by FHIR resource types. The server will create one object per
    * resource type. Each object contains newline delimited JSON, and each line
    * is a FHIR resource.
    */
  var gcsDestinationLocation: js.UndefOr[SchemaGcsDataLocation] = js.native
}

object SchemaExportResourcesRequest {
  @scala.inline
  def apply(): SchemaExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportResourcesRequest]
  }
  @scala.inline
  implicit class SchemaExportResourcesRequestOps[Self <: SchemaExportResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigqueryDestinationLocation(value: SchemaBigQueryLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDestinationLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigqueryDestinationLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDestinationLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsDestinationLocation(value: SchemaGcsDataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDestinationLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsDestinationLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDestinationLocation")(js.undefined)
        ret
    }
  }
  
}

