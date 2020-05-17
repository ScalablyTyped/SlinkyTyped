package typingsSlinky.braintree.anon

import typingsSlinky.braintree.mod.DiscountAddRequest
import typingsSlinky.braintree.mod.DiscountUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remove extends js.Object {
  var add: js.UndefOr[js.Array[DiscountAddRequest]] = js.native
  var remove: js.UndefOr[js.Array[String]] = js.native
  var update: js.UndefOr[js.Array[DiscountUpdateRequest]] = js.native
}

object Remove {
  @scala.inline
  def apply(): Remove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remove]
  }
  @scala.inline
  implicit class RemoveOps[Self <: Remove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Array[DiscountAddRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: js.Array[DiscountUpdateRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

