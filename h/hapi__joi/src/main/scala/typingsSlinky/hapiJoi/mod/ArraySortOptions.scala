package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.hapiJoiStrings.ascending
import typingsSlinky.hapiJoi.hapiJoiStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySortOptions extends js.Object {
  var by: js.UndefOr[String | Reference] = js.native
  /**
    * @default 'ascending'
    */
  var order: js.UndefOr[ascending | descending] = js.native
}

object ArraySortOptions {
  @scala.inline
  def apply(): ArraySortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArraySortOptions]
  }
  @scala.inline
  implicit class ArraySortOptionsOps[Self <: ArraySortOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBy(value: String | Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: ascending | descending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

