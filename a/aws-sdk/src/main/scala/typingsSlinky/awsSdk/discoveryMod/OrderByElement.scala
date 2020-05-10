package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderByElement extends js.Object {
  /**
    * The field on which to order.
    */
  var fieldName: String = js.native
  /**
    * Ordering direction.
    */
  var sortOrder: js.UndefOr[orderString] = js.native
}

object OrderByElement {
  @scala.inline
  def apply(fieldName: String): OrderByElement = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByElement]
  }
  @scala.inline
  implicit class OrderByElementOps[Self <: OrderByElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortOrder(value: orderString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

