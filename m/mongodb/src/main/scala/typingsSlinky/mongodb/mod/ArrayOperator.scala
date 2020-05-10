package typingsSlinky.mongodb.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayOperator[Type] extends js.Object {
  @JSName("$each")
  var $each: Type = js.native
  @JSName("$position")
  var $position: js.UndefOr[scala.Double] = js.native
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double] = js.native
  @JSName("$sort")
  var $sort: js.UndefOr[SortValues | (Record[String, SortValues])] = js.native
}

object ArrayOperator {
  @scala.inline
  def apply[Type]($each: Type): ArrayOperator[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOperator[Type]]
  }
  @scala.inline
  implicit class ArrayOperatorOps[Self[`type`] <: ArrayOperator[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def with$each(value: Type): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$each")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$position(value: scala.Double): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$position: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$position")(js.undefined)
        ret
    }
    @scala.inline
    def with$slice(value: scala.Double): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$slice: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slice")(js.undefined)
        ret
    }
    @scala.inline
    def with$sort(value: SortValues | (Record[String, SortValues])): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$sort: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$sort")(js.undefined)
        ret
    }
  }
  
}

