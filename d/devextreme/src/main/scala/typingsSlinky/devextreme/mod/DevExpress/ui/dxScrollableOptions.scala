package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonReachedRight
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.never
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.onScroll
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollableOptions[T] extends DOMComponentOptions[T] {
  /** A Boolean value specifying whether to enable or disable the bounce-back effect. */
  var bounceEnabled: js.UndefOr[Boolean] = js.native
  /** A string value specifying the available scrolling directions. */
  var direction: js.UndefOr[both | horizontal | vertical] = js.native
  /** A Boolean value specifying whether or not the widget can respond to user interaction. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** A function that is executed on each scroll gesture. */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedRight[T], _]] = js.native
  /** A function that is executed each time the widget is updated. */
  var onUpdated: js.UndefOr[js.Function1[/* e */ AnonReachedRight[T], _]] = js.native
  /** A Boolean value specifying whether or not an end-user can scroll the widget content swiping it up or down. Applies only if useNative is false */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not an end-user can scroll the widget content using the scrollbar. */
  var scrollByThumb: js.UndefOr[Boolean] = js.native
  /** Specifies when the widget shows the scrollbar. */
  var showScrollbar: js.UndefOr[onScroll | onHover | always | never] = js.native
  /** Indicates whether to use native or simulated scrolling. */
  var useNative: js.UndefOr[Boolean] = js.native
}

object dxScrollableOptions {
  @scala.inline
  def apply[T](): dxScrollableOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxScrollableOptions[T]]
  }
  @scala.inline
  implicit class dxScrollableOptionsOps[Self[t] <: dxScrollableOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBounceEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: both | horizontal | vertical): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* e */ AnonReachedRight[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdated(value: /* e */ AnonReachedRight[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByContent(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByThumb(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByThumb: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollbar(value: onScroll | onHover | always | never): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollbar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

