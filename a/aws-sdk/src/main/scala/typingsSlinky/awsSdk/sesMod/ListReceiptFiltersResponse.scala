package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReceiptFiltersResponse extends js.Object {
  /**
    * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filters: js.UndefOr[ReceiptFilterList] = js.native
}

object ListReceiptFiltersResponse {
  @scala.inline
  def apply(): ListReceiptFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptFiltersResponse]
  }
  @scala.inline
  implicit class ListReceiptFiltersResponseOps[Self <: ListReceiptFiltersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: ReceiptFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
  }
  
}

