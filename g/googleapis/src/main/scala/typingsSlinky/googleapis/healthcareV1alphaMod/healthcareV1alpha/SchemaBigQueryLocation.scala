package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BigQuery dataset location.
  */
@js.native
trait SchemaBigQueryLocation extends js.Object {
  /**
    * ID of the dataset that houses the BigQuery tables.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the BigQuery datasets.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.native
}

object SchemaBigQueryLocation {
  @scala.inline
  def apply(): SchemaBigQueryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryLocation]
  }
  @scala.inline
  implicit class SchemaBigQueryLocationOps[Self <: SchemaBigQueryLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
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

