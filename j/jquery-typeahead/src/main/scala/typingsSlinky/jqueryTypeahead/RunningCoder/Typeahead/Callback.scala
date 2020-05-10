package typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  /** Perform operation on the source data before it gets in Typeahead cache */
  var onCacheSave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* data */ js.UndefOr[js.Any], 
      /* group */ js.UndefOr[js.Any], 
      /* path */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /**
    * Any time there is text inside the input and it gets cleared (Backspace, Esc, Cancel button, etc).
    * It is possible to track back the event that cleared the input using event.originalEvent
    */
  var onCancel: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject], Unit]
  ] = js.native
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger before the regular behaviors.
    */
  var onClick: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger after the regular behaviors.
    */
  var onClickAfter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger before the regular behaviors.
    */
  var onClickBefore: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Will be executed when a dropdown filter is selected. Requires `dropdownFilter: true`. */
  var onDropdownFilter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** When an item in the result list is focused */
  var onEnter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* result */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Triggers when the Typeahead results layout is requested to hide. */
  var onHideLayout: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Will be executed on Typeahead initialization, before anything else. */
  var onInit: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.native
  /** Perform an action right after the result HTML gets inserted into Typeahead's DOM. */
  var onLayoutBuiltAfter: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /**
    * When the result HTML is build, modify it before it get showed.
    * This callback should be used to modify the result DOM before it gets inserted into Typeahead.
    * * If you are using this callback, the resultHtmlList param needs to be returned at the end of your function.
    */
  var onLayoutBuiltBefore: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultHtmlList */ js.UndefOr[JQuery], 
      JQuery
    ]
  ] = js.native
  /** When an item in the result list is blurred */
  var onLeave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* result */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Will be executed when a item is hovered inside the result list. */
  var onMouseEnter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Will be executed when a result item is hovered out. */
  var onMouseLeave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Called at the end of Navigate (once the `.active` class and other operations are completed). */
  var onNavigateAfter: js.UndefOr[
    js.Function6[
      /* node */ js.UndefOr[JQuery], 
      /* lis */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* query */ js.UndefOr[String], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * When a key is pressed to navigate the results. It is possible to disable the input text change
    * when using up and down arrows when `event.preventInputChange` is set to true
    */
  var onNavigateBefore: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * Gets called after the Ajax requests are all received and the data is populated inside Typeahead.
    * This is the place where extra parsing or filtering should occure before the data gets available inside any Typeahead query
    * For example, the Backend sends the "display" key separated by underscores "_" instead of spaces " ".
    * * The `data` parameter HAS to be returned after it's transformed.
    */
  var onPopulateSource: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* data */ js.UndefOr[js.Array[_]], 
      /* group */ js.UndefOr[js.Any], 
      /* path */ js.UndefOr[js.Any], 
      js.Array[_]
    ]
  ] = js.native
  /** Triggers when the Typeahead initial preparation is completed. */
  var onReady: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.native
  /** Gets called when the Ajax request(s) are all received */
  var onReceiveRequest: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Whenever the result changes, this callback will be triggered. */
  var onResult: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** Triggers every time a new search is executed in Typeahead. */
  var onSearch: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Gets called when the Ajax request(s) are sent. Either on initial requests or on every dynamic requests. */
  var onSendRequest: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Triggers when the Typeahead results layout is displayed. */
  var onShowLayout: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /**
    * Override the native onSubmit function by your own.
    * If after performing a set of action(s) you want to submit the form, simply do `form.submit()`.
    * * The item parameter is not always defined. An item object will be sent if the submit happens after an item from the list has been selected.
    */
  var onSubmit: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* form */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
}

object Callback {
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCacheSave(
      value: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Any], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCacheSave")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCacheSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCacheSave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: (/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickAfter(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAfter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnClickAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickBefore(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickBefore")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnClickBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownFilter(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownFilter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideLayout(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHideLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: /* node */ js.UndefOr[JQuery] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayoutBuiltAfter(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutBuiltAfter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnLayoutBuiltAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutBuiltAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayoutBuiltBefore(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultHtmlList */ js.UndefOr[JQuery]) => JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutBuiltBefore")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnLayoutBuiltBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutBuiltBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigateAfter(
      value: (/* node */ js.UndefOr[JQuery], /* lis */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigateAfter")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnNavigateAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigateAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigateBefore(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigateBefore")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNavigateBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigateBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopulateSource(
      value: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Array[_]], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => js.Array[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopulateSource")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnPopulateSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopulateSource")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* node */ js.UndefOr[JQuery] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReceiveRequest(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReceiveRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResult(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResult")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResult")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSendRequest(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSendRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSendRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSendRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowLayout(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(
      value: (/* node */ js.UndefOr[JQuery], /* form */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
  }
  
}

