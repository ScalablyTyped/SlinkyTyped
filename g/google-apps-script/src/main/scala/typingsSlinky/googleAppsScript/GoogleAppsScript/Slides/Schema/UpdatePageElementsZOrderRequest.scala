package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePageElementsZOrderRequest extends js.Object {
  var operation: js.UndefOr[String] = js.native
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.native
}

object UpdatePageElementsZOrderRequest {
  @scala.inline
  def apply(): UpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
  }
  @scala.inline
  implicit class UpdatePageElementsZOrderRequestOps[Self <: UpdatePageElementsZOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageElementObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElementObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageElementObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElementObjectIds")(js.undefined)
        ret
    }
  }
  
}

