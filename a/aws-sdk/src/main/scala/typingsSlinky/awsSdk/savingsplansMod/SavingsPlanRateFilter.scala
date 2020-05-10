package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanRateFilter extends js.Object {
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterName] = js.native
  /**
    * The filter values.
    */
  var values: js.UndefOr[ListOfStrings] = js.native
}

object SavingsPlanRateFilter {
  @scala.inline
  def apply(): SavingsPlanRateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRateFilter]
  }
  @scala.inline
  implicit class SavingsPlanRateFilterOps[Self <: SavingsPlanRateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: SavingsPlanRateFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: ListOfStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

