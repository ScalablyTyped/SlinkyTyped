package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordHistorySearchFilter extends js.Object {
  /**
    * The filter key.    product - Filter results based on the specified product identifier.    provisionedproduct - Filter results based on the provisioned product identifier.  
    */
  var Key: js.UndefOr[SearchFilterKey] = js.native
  /**
    * The filter value.
    */
  var Value: js.UndefOr[SearchFilterValue] = js.native
}

object ListRecordHistorySearchFilter {
  @scala.inline
  def apply(): ListRecordHistorySearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistorySearchFilter]
  }
  @scala.inline
  implicit class ListRecordHistorySearchFilterOps[Self <: ListRecordHistorySearchFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: SearchFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SearchFilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

