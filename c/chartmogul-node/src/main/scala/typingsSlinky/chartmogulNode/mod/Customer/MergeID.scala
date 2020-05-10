package typingsSlinky.chartmogulNode.mod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeID extends js.Object {
  var customer_uuid: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
}

object MergeID {
  @scala.inline
  def apply(): MergeID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeID]
  }
  @scala.inline
  implicit class MergeIDOps[Self <: MergeID] (val x: Self) extends AnyVal {
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

