package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditInitializeFiltering extends js.Object {
  var LimitResults: js.UndefOr[Double] = js.native
}

object EditInitializeFiltering {
  @scala.inline
  def apply(): EditInitializeFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditInitializeFiltering]
  }
  @scala.inline
  implicit class EditInitializeFilteringOps[Self <: EditInitializeFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimitResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitResults")(js.undefined)
        ret
    }
  }
  
}

