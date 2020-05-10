package typingsSlinky.dynatable.JQueryDynatable

import org.scalajs.dom.raw.Element
import typingsSlinky.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inputs extends js.Object {
  /**
    * Allows you to define the accepted modifier keys to trigger a multisort action
    *
    * @default ['ctrlKey', 'shiftKey', 'metaKey']
    * @see https://en.wikipedia.org/wiki/Modifier_key
    */
  var multisort: js.UndefOr[js.Array[String]] = js.native
  /**
    * @todo Find out how this `inputs.page` setting is useful + show an example
    * @default null
    */
  var page: js.UndefOr[js.Any] = js.native
  /**
    * Text content introducing the pagination
    *
    * @default 'Pages: '
    */
  var pageText: js.UndefOr[String] = js.native
  /**
    * The classname to be injected on the current page link
    *
    * @default 'dynatable-active-page'
    */
  var paginationActiveClass: js.UndefOr[String] = js.native
  /**
    * The classname to be injected on the `<ul>` containing the pagination
    *
    * @default 'dynatable-pagination-links'
    */
  var paginationClass: js.UndefOr[String] = js.native
  /**
    * The classname to be injected on the disabled page links
    *
    * @default 'dynatable-disabled-page'
    */
  var paginationDisabledClass: js.UndefOr[String] = js.native
  /**
    * Define the number of page number links shown inside the pagination
    *
    * @default [1,2,2,1]
    */
  var paginationGap: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The classname to be injected on every pagination link
    *
    * @default 'dynatable-page-link'
    */
  var paginationLinkClass: js.UndefOr[String] = js.native
  /**
    * Determines where the pagination links are inserted
    *
    * @enum('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var paginationLinkPlacement: js.UndefOr[String] = js.native
  /**
    * The target inside next to which the pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var paginationLinkTarget: js.UndefOr[String | Element | JQuery] = js.native
  /**
    * Text content for the next page link
    *
    * @default 'Next'
    */
  var paginationNext: js.UndefOr[String] = js.native
  /**
    * The classname to be injected on the next page link
    *
    * @default 'dynatable-page-next'
    */
  var paginationNextClass: js.UndefOr[String] = js.native
  /**
    * Text content for the previous page link
    *
    * @default 'Previous'
    */
  var paginationPrev: js.UndefOr[String] = js.native
  /**
    * The classname to be injected on the previous page link
    *
    * @default 'dynatable-page-prev'
    */
  var paginationPrevClass: js.UndefOr[String] = js.native
  /**
    * Determines where the perPage menu is inserted
    *
    * @enum('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var perPagePlacement: js.UndefOr[String] = js.native
  /**
    * The target next to which the per page pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a jQuery object.
    *
    * @default null
    */
  var perPageTarget: js.UndefOr[String | Element | JQuery] = js.native
  /**
    * Text content preceding the items per page <select>
    *
    * @default 'Show: '
    */
  var perPageText: js.UndefOr[String] = js.native
  /**
    * Text content injected inside the processingIndicator
    *
    * @default 'Processing...'
    */
  var processingText: js.UndefOr[String] = js.native
  /**
    * Allows you to provide an array of jQuery objects which point to our filter inputs.
    * The inputs musts have a name attribute value matching a columnId in order to work.
    * Input values must strictly match the data from the cell...
    * Searching for "Lux" won't show "Luxembourg" event if it starts if the same letters!
    *
    * @default null
    * @see http://www.dynatable.com/#querying
    *
    * @example
    * $('#search-year')
    */
  var queries: js.UndefOr[JQuery] = js.native
  /**
    * The events attached to the search/filtering inputs elements
    *
    * @default 'blur change'
    */
  var queryEvent: js.UndefOr[String] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default ' (filtered from {recordsTotal} total records)'
    */
  var recordCountFilteredTemplate: js.UndefOr[String] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default '{pageLowerBound} to {pageUpperBound} of'
    */
  var recordCountPageBoundTemplate: js.UndefOr[String] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsShown} of'
    */
  var recordCountPageUnboundedTemplate: js.UndefOr[String] = js.native
  /**
    * Determines where the recordCount is inserted
    *
    * @enum('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var recordCountPlacement: js.UndefOr[String] = js.native
  /**
    * The jQuery object pointing to a target where to insert the recordCount html
    *
    * @default null
    *
    * @example
    * $('#chart-status-text')
    */
  var recordCountTarget: js.UndefOr[JQuery] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default '<span id="dynatable-record-count-{elementId}" class="dynatable-record-count">{textTemplate}</span>'
    */
  var recordCountTemplate: js.UndefOr[String] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default 'Showing '
    */
  var recordCountText: js.UndefOr[String] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default '{text} {pageTemplate} {totalTemplate} {filteredTemplate}'
    */
  var recordCountTextTemplate: js.UndefOr[String] = js.native
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsQueryCount} {collectionName}'
    */
  var recordCountTotalTemplate: js.UndefOr[String] = js.native
  /**
    * Determines where the search field is inserted
    *
    * @enum('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var searchPlacement: js.UndefOr[String] = js.native
  /**
    * The target next to which the search block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var searchTarget: js.UndefOr[String | Element | JQuery] = js.native
  /**
    * Text preceding the search field
    *
    * @default 'Search: '
    */
  var searchText: js.UndefOr[String] = js.native
  /**
    * @todo Find out how this `inputs.sorts` setting is useful + show an example
    * @default null
    * @see http://www.dynatable.com/#sorting
    */
  var sorts: js.UndefOr[js.Any] = js.native
}

object Inputs {
  @scala.inline
  def apply(): Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inputs]
  }
  @scala.inline
  implicit class InputsOps[Self <: Inputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultisort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultisort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisort")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageText")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationDisabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationDisabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationDisabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationDisabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationGap(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationGap")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationLinkClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationLinkClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationLinkPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationLinkPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationLinkTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationLinkTarget(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationLinkTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationLinkTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNext")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationPrevClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPrevClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationPrevClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPrevClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPagePlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPagePlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPagePlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPagePlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPageTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerPageTarget(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPageTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPageText")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingText")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountFilteredTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountFilteredTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountFilteredTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountFilteredTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountPageBoundTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountPageBoundTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountPageBoundTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountPageBoundTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountPageUnboundedTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountPageUnboundedTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountPageUnboundedTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountPageUnboundedTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountTarget(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountText")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountTextTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTextTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountTextTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTextTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountTotalTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTotalTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountTotalTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountTotalTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchTarget(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(js.undefined)
        ret
    }
    @scala.inline
    def withSorts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorts")(js.undefined)
        ret
    }
  }
  
}

