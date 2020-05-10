package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCreateTestOrderRequest extends js.Object {
  /**
    * The test order template to use. Specify as an alternative to testOrder as a shortcut for retrieving a template and then creating an order using that
    * template.
    */
  var templateName: js.UndefOr[String] = js.native
  /** The test order to create. */
  var testOrder: js.UndefOr[TestOrder] = js.native
}

object OrdersCreateTestOrderRequest {
  @scala.inline
  def apply(): OrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestOrderRequest]
  }
  @scala.inline
  implicit class OrdersCreateTestOrderRequestOps[Self <: OrdersCreateTestOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(js.undefined)
        ret
    }
    @scala.inline
    def withTestOrder(value: TestOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOrder")(js.undefined)
        ret
    }
  }
  
}

