package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersGetTestOrderTemplateResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersGetTestOrderTemplateResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The requested test order template. */
  var template: js.UndefOr[TestOrder] = js.native
}

object OrdersGetTestOrderTemplateResponse {
  @scala.inline
  def apply(): OrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersGetTestOrderTemplateResponse]
  }
  @scala.inline
  implicit class OrdersGetTestOrderTemplateResponseOps[Self <: OrdersGetTestOrderTemplateResponse] (val x: Self) extends AnyVal {
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
    def withTemplate(value: TestOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

