package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOneAndUpdateOption extends FindOneAndReplaceOption {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
}

object FindOneAndUpdateOption {
  @scala.inline
  def apply(): FindOneAndUpdateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndUpdateOption]
  }
  @scala.inline
  implicit class FindOneAndUpdateOptionOps[Self <: FindOneAndUpdateOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFilters(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(js.undefined)
        ret
    }
  }
  
}

