package typingsSlinky.ejWebAll.ej.PivotPager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Contains the current page number in categorical axis.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[Double] = js.native
  /** Contains the total page count in categorical axis.
    * @Default {1}
    */
  var categoricalPageCount: js.UndefOr[Double] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the pager mode (Only Categorical Pager/Only Series Pager/Both) for the PivotPager.
    * @Default {ej.PivotPager.Mode.Both}
    */
  var mode: js.UndefOr[Mode | String] = js.native
  /** Contains the current page number in series axis.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[Double] = js.native
  /** Contains the total page count in series axis.
    * @Default {1}
    */
  var seriesPageCount: js.UndefOr[Double] = js.native
  /** Contains the ID of the target element for which paging needs to be done.
    * @Default {â€œâ€}
    */
  var targetControlID: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalCurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalCurrentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoricalPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalPageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalPageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesCurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesCurrentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetControlID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetControlID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetControlID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetControlID")(js.undefined)
        ret
    }
  }
  
}

