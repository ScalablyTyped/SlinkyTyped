package typingsSlinky.bootstrap3Typeahead.Bootstrap3Typeahead

import typingsSlinky.bootstrap3Typeahead.AnonName
import typingsSlinky.bootstrap3Typeahead.JQuery
import typingsSlinky.bootstrap3Typeahead.bootstrap3TypeaheadStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Adds an item to the end of the list
    */
  var addItem: js.UndefOr[js.Object] = js.native
  /**
    * Call back function to execute after selected an item
    */
  var afterSelect: js.UndefOr[js.Function1[/* item */ String | js.Object, Unit]] = js.native
  /**
    * Use this option to add the menu to another div
    */
  var appendTo: js.UndefOr[JQuery] = js.native
  /**
    * Allows you to dictate whether or not the first suggestion is selected automatically
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * Adds a delay between lookups
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Method used to get textual representation of an item of the sources
    */
  var displayText: js.UndefOr[js.Function1[/* item */ String | AnonName, String]] = js.native
  /**
    * Set to true if you want the menu to be the same size than the input it is attached to
    */
  var fitToElement: js.UndefOr[Boolean] = js.native
  /**
    * Method used to highlight autocomplete results
    */
  var highlighter: js.UndefOr[js.Function1[/* item */ String, String]] = js.native
  /**
    * The max number of items to display in the dropdown
    */
  var items: js.UndefOr[Double] = js.native
  /**
    * The method used to determine if a query matches an item
    */
  var matcher: js.UndefOr[js.Function1[/* item */ String, Boolean]] = js.native
  /**
    * The minimum character length needed before triggering autocomplete suggestions
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * Number of pixels the scrollable parent container scrolled down
    */
  var scrollHeight: js.UndefOr[Double | js.Function0[Double]] = js.native
  /**
    * If hints should be shown as soon as the input gets focus
    */
  var showHintOnFocus: js.UndefOr[Boolean | all] = js.native
  /**
    * Method used to sort autocomplete results
    */
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[String], js.Array[String]]] = js.native
  /**
    * The data source to query against
    */
  var source: js.UndefOr[
    (js.Array[js.Object | String]) | (js.Function2[
      /* query */ js.UndefOr[String], 
      /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]], 
      Unit
    ])
  ] = js.native
  /**
    * The method used to return selected item
    */
  var updater: js.UndefOr[js.Function1[/* item */ String, String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddItem(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelect(value: /* item */ String | js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayText(value: /* item */ String | AnonName => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
    @scala.inline
    def withFitToElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitToElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToElement")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlighter(value: /* item */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHighlighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighter")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(value: /* item */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHeightFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollHeight(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHintOnFocus(value: Boolean | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHintOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHintOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHintOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSorter(value: /* items */ js.Array[String] => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFunction2(
      value: (/* query */ js.UndefOr[String], /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSource(
      value: (js.Array[js.Object | String]) | (js.Function2[
          /* query */ js.UndefOr[String], 
          /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]], 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdater(value: /* item */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.undefined)
        ret
    }
  }
  
}

