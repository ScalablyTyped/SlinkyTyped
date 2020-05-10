package typingsSlinky.chartmogulNode.mod.Invoice

import typingsSlinky.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvoicesParams extends CursorParams {
  var customer_uuid: js.UndefOr[String] = js.native
  var data_source_uuid: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
}

object ListInvoicesParams {
  @scala.inline
  def apply(): ListInvoicesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvoicesParams]
  }
  @scala.inline
  implicit class ListInvoicesParamsOps[Self <: ListInvoicesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withData_source_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_source_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
        ret
    }
  }
  
}

