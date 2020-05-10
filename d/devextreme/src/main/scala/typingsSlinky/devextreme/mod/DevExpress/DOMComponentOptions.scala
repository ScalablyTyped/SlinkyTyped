package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.AnonModel
import typingsSlinky.devextreme.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMComponentOptions[T] extends ComponentOptions[T] {
  var bindingOptions: js.UndefOr[js.Any] = js.native
  /** Specifies the attributes to be attached to the widget's root element. */
  var elementAttr: js.UndefOr[js.Any] = js.native
  /** Specifies the widget's height. */
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** A function that is executed before the widget is disposed of. */
  @JSName("onDisposing")
  var onDisposing_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ AnonModel[T], _]] = js.native
  /** A function that is executed after a widget option is changed. */
  @JSName("onOptionChanged")
  var onOptionChanged_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ AnonName[T], _]] = js.native
  /** Switches the widget to a right-to-left representation. */
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the widget's width. */
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
}

object DOMComponentOptions {
  @scala.inline
  def apply[T](): DOMComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMComponentOptions[T]]
  }
  @scala.inline
  implicit class DOMComponentOptionsOps[Self[t] <: DOMComponentOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBindingOptions(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withElementAttr(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementAttr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightFunction0(value: () => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double | String | (js.Function0[Double | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisposing(value: /* e */ AnonModel[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisposing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOptionChanged(value: /* e */ AnonName[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOptionChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRtlEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtlEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthFunction0(value: () => Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double | String | (js.Function0[Double | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

