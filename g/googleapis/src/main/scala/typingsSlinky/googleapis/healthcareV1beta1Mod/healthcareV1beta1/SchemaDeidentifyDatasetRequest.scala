package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Redacts identifying information from the specified dataset.
  */
@js.native
trait SchemaDeidentifyDatasetRequest extends js.Object {
  /**
    * Deidentify configuration.
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.native
  /**
    * The name of the dataset resource to create and write the redacted data to
    * (e.g.,   * The destination dataset must not exist.  * The destination
    * dataset must be in the same project as the source    dataset.
    * De-identifying data across multiple projects is not supported.
    */
  var destinationDataset: js.UndefOr[String] = js.native
}

object SchemaDeidentifyDatasetRequest {
  @scala.inline
  def apply(): SchemaDeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyDatasetRequest]
  }
  @scala.inline
  implicit class SchemaDeidentifyDatasetRequestOps[Self <: SchemaDeidentifyDatasetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SchemaDeidentifyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationDataset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationDataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationDataset")(js.undefined)
        ret
    }
  }
  
}

