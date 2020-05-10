package typingsSlinky.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSortOptions extends js.Object {
  var defaultSortBy: js.UndefOr[js.Array[String]] = js.native
  var defaultSortDirection: js.UndefOr[SortDirectionMap] = js.native
}

object MultiSortOptions {
  @scala.inline
  def apply(): MultiSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSortOptions]
  }
  @scala.inline
  implicit class MultiSortOptionsOps[Self <: MultiSortOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSortBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortDirection(value: SortDirectionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(js.undefined)
        ret
    }
  }
  
}

