package typingsSlinky.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMaskedInputOptions extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var autoUnmask: js.UndefOr[Boolean] = js.native
  var clearIncomplete: js.UndefOr[Boolean] = js.native
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.native
  var greedy: js.UndefOr[Boolean] = js.native
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Any, /* options */ js.Any, js.Object]] = js.native
  var mask: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var onBeforeMask: js.UndefOr[js.Function1[/* initialValue */ js.Any, Unit]] = js.native
  var onBeforePaste: js.UndefOr[js.Function1[/* pastedValue */ js.Any, Unit]] = js.native
  var onKeyValidation: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ js.Any, /* unmaskedValue */ js.Any, Unit]] = js.native
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.native
  var oncomplete: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var radixPoint: js.UndefOr[String] = js.native
  var repeat: js.UndefOr[Double] = js.native
  var rightAlignNumerics: js.UndefOr[Boolean] = js.native
  var showMaskOnFocus: js.UndefOr[Boolean] = js.native
  var showMaskOnHover: js.UndefOr[Boolean] = js.native
  var showToolTip: js.UndefOr[Boolean] = js.native
  var skipOptionalPartCharacter: js.UndefOr[String] = js.native
}

object JQueryMaskedInputOptions {
  @scala.inline
  def apply(): JQueryMaskedInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMaskedInputOptions]
  }
  @scala.inline
  implicit class JQueryMaskedInputOptionsOps[Self <: JQueryMaskedInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUnmask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUnmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUnmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUnmask")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIncomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIncomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIncomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIncomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withClearMaskOnLostFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMaskOnLostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearMaskOnLostFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMaskOnLostFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withGreedy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreedy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComplete(value: (/* buffer */ js.Any, /* options */ js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeMask(value: /* initialValue */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeMask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeMask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforePaste(value: /* pastedValue */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforePaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyValidation(value: /* result */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyValidation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnMask(value: (/* maskedValue */ js.Any, /* unmaskedValue */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnMask")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnMask")(js.undefined)
        ret
    }
    @scala.inline
    def withOncleared(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncleared")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOncleared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncleared")(js.undefined)
        ret
    }
    @scala.inline
    def withOncomplete(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOncomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnincomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onincomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnincomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onincomplete")(js.undefined)
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
    def withRadixPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radixPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadixPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radixPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withRightAlignNumerics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAlignNumerics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightAlignNumerics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAlignNumerics")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaskOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaskOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaskOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaskOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOptionalPartCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOptionalPartCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOptionalPartCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOptionalPartCharacter")(js.undefined)
        ret
    }
  }
  
}

