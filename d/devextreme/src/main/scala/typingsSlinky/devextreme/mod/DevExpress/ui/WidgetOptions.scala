package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentElement
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetOptions[T] extends DOMComponentOptions[T] {
  /** Specifies the shortcut key that sets focus on the widget. */
  var accessKey: js.UndefOr[String] = js.native
  /** Specifies whether or not the widget changes its state when interacting with a user. */
  var activeStateEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether the widget responds to user interaction. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether the widget can be focused using keyboard navigation. */
  var focusStateEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies text for a hint that appears when a user pauses on the widget. */
  var hint: js.UndefOr[String] = js.native
  /** Specifies whether the widget changes its state when a user pauses on it. */
  var hoverStateEnabled: js.UndefOr[Boolean] = js.native
  /** A function that is executed when the widget's content is ready and each time the content is changed. */
  var onContentReady: js.UndefOr[js.Function1[/* e */ AnonComponentElement[T], _]] = js.native
  /** Specifies the number of the element when the Tab key is used for navigating. */
  var tabIndex: js.UndefOr[Double] = js.native
  /** Specifies whether the widget is visible. */
  var visible: js.UndefOr[Boolean] = js.native
}

object WidgetOptions {
  @scala.inline
  def apply[T](): WidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions[T]]
  }
  @scala.inline
  implicit class WidgetOptionsOps[Self[t] <: WidgetOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAccessKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveStateEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStateEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStateEnabled")(js.undefined)
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
    def withFocusStateEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusStateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusStateEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusStateEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStateEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStateEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStateEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentReady(value: /* e */ AnonComponentElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentReady: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentReady")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

