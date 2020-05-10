package typingsSlinky.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jqueryFancytree.jqueryFancytreeStrings.dimm
import typingsSlinky.jqueryFancytree.jqueryFancytreeStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define filter-extension options
  */
@js.native
trait Filter
  extends /* extension */ StringDictionary[js.Any] {
  /**
    * Re-apply last filter if lazy data is loaded
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * Expand all branches that contain matches while filtered
    */
  var autoExpand: js.UndefOr[Boolean] = js.native
  /**
    * Show a badge with number of matching child nodes near parent icons
    */
  var counter: js.UndefOr[Boolean] = js.native
  /**
    * Match single characters in order, e.g. 'fb' will match 'FooBar'
    */
  var fuzzy: js.UndefOr[Boolean] = js.native
  /**
    * Hide counter badge if parent is expanded
    */
  var hideExpandedCounter: js.UndefOr[Boolean] = js.native
  /**
    * Hide expanders if all child nodes are hidden by filter
    */
  var hideExpanders: js.UndefOr[Boolean] = js.native
  /**
    * Highlight matches by wrapping inside <mark> tags
    */
  var highlight: js.UndefOr[Boolean] = js.native
  /**
    * Match end nodes only
    */
  var leavesOnly: js.UndefOr[Boolean] = js.native
  /**
    * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
    */
  var mode: js.UndefOr[dimm | hide] = js.native
  /**
    * Display a 'no data' status node if result is empty
    */
  var nodata: js.UndefOr[Boolean] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withCounter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
        ret
    }
    @scala.inline
    def withFuzzy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuzzy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzy")(js.undefined)
        ret
    }
    @scala.inline
    def withHideExpandedCounter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideExpandedCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideExpandedCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideExpandedCounter")(js.undefined)
        ret
    }
    @scala.inline
    def withHideExpanders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideExpanders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideExpanders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideExpanders")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withLeavesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: dimm | hide): Self = {
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
    def withNodata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodata")(js.undefined)
        ret
    }
  }
  
}

