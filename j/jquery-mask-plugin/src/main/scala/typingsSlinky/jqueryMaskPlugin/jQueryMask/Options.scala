package typingsSlinky.jqueryMaskPlugin.jQueryMask

import org.scalajs.dom.raw.Event
import typingsSlinky.jqueryMaskPlugin.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var byPassKeys: js.UndefOr[js.Array[Double]] = js.native
  var clearIfNotMatch: js.UndefOr[Boolean] = js.native
  var dataMask: js.UndefOr[Boolean] = js.native
  var dataMaskAttr: js.UndefOr[String] = js.native
  var maskElements: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.native
  var onComplete: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.native
  var onInvalid: js.UndefOr[
    js.Function5[
      /* value */ String, 
      /* e */ Event, 
      /* $element */ JQuery, 
      /* invalid */ js.Array[Invalid], 
      /* options */ this.type, 
      Unit
    ]
  ] = js.native
  var onKeyPress: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  var translation: js.UndefOr[Translation] = js.native
  var watchDataMask: js.UndefOr[Boolean] = js.native
  var watchInputs: js.UndefOr[Boolean] = js.native
  var watchInterval: js.UndefOr[Double] = js.native
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
    def withByPassKeys(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byPassKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByPassKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byPassKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIfNotMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIfNotMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIfNotMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIfNotMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMask")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMaskAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaskAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMaskAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaskAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskElements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskElements")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(
      value: (/* value */ String, /* e */ Event, /* $element */ JQuery, /* invalid */ js.Array[Invalid], Options) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslation(value: Translation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchDataMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchDataMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchDataMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchDataMask")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchInputs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchInterval")(js.undefined)
        ret
    }
  }
  
}

