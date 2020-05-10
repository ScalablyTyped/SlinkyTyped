package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCreateTestReturnResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var returnId: js.UndefOr[String] = js.native
}

object OrdersCreateTestReturnResponse {
  @scala.inline
  def apply(): OrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestReturnResponse]
  }
  @scala.inline
  implicit class OrdersCreateTestReturnResponseOps[Self <: OrdersCreateTestReturnResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withReturnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnId")(js.undefined)
        ret
    }
  }
  
}

