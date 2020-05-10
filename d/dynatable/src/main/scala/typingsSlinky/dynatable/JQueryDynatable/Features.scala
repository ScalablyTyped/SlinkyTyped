package typingsSlinky.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  /**
    * Enable the pagination feature
    *
    * @default true
    */
  var paginate: js.UndefOr[Boolean] = js.native
  /**
    * Enable the perPageSelect feature
    * The perPageSelect will insert a form control filled with the options from `perPageOptions`
    *
    * @default true
    */
  var perPageSelect: js.UndefOr[Boolean] = js.native
  /**
    * Enable the pushState feature
    * Used to update the page URL parameters and cache the query result for the browser's forward- and back-buttons
    *
    * @default true
    */
  var pushState: js.UndefOr[Boolean] = js.native
  /**
    * Enable the recordCount feature
    * When pagination is enabled, dynatable will also show the currently displayed records and the total number of records
    *
    * @default true
    */
  var recordCount: js.UndefOr[Boolean] = js.native
  /**
    * Enable the search feature
    *
    * @default true
    */
  var search: js.UndefOr[Boolean] = js.native
  /**
    * Enable the sorting feature
    *
    * @default true
    */
  var sort: js.UndefOr[Boolean] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPageSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPageSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPushState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

