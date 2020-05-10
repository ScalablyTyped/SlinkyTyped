package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSortDirection extends js.Object {
  var sortDirection: js.UndefOr[SortDirectionType] = js.native
}

object AnonSortDirection {
  @scala.inline
  def apply(): AnonSortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSortDirection]
  }
  @scala.inline
  implicit class AnonSortDirectionOps[Self <: AnonSortDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortDirection(value: SortDirectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(js.undefined)
        ret
    }
  }
  
}

