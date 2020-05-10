package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisionedProductPropertiesOutput extends js.Object {
  /**
    * The provisioned product identifier.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  /**
    * A map that contains the properties updated.
    */
  var ProvisionedProductProperties: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductProperties] = js.native
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.native
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[RecordStatus] = js.native
}

object UpdateProvisionedProductPropertiesOutput {
  @scala.inline
  def apply(): UpdateProvisionedProductPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesOutput]
  }
  @scala.inline
  implicit class UpdateProvisionedProductPropertiesOutputOps[Self <: UpdateProvisionedProductPropertiesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisionedProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductProperties(value: ProvisionedProductProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: RecordStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

