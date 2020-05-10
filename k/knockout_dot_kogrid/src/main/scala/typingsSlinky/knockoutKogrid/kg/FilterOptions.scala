package typingsSlinky.knockoutKogrid.kg

import typingsSlinky.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptions extends js.Object {
  /** Variable to contain the current search filter */
  var filterText: js.UndefOr[KnockoutObservable[String]] = js.native
  /** Number of seconds to throttle before reapplying search */
  var filterThrottle: js.UndefOr[Double] = js.native
  /** Is the filtering internal or does it require a server visit. You should subscribe to filterText to refresh */
  var useExternalFilter: js.UndefOr[Boolean] = js.native
}

object FilterOptions {
  @scala.inline
  def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterText(value: KnockoutObservable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalFilter")(js.undefined)
        ret
    }
  }
  
}

