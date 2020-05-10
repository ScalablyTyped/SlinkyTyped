package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersReturnLineItemResponse extends js.Object {
  /** The status of the execution. */
  var executionStatus: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersReturnLineItemResponse". */
  var kind: js.UndefOr[String] = js.native
}

object OrdersReturnLineItemResponse {
  @scala.inline
  def apply(): OrdersReturnLineItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersReturnLineItemResponse]
  }
  @scala.inline
  implicit class OrdersReturnLineItemResponseOps[Self <: OrdersReturnLineItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

