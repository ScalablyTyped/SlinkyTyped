package typingsSlinky.jsCaptcha.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.jsCaptcha.jsCaptchaStrings.error
import typingsSlinky.jsCaptcha.jsCaptchaStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the base jCaptcha class. Derived from https://github.com/robiveli/js-captcha#options
  */
@js.native
trait Options extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* response */ success | error, /* input */ NodeListOf[Element with Node], Unit]
  ] = js.native
  var canvasFillStyle: js.UndefOr[String] = js.native
  var canvasFontFamily: js.UndefOr[String] = js.native
  var canvasFontSize: js.UndefOr[String] = js.native
  var canvasHeight: js.UndefOr[Double] = js.native
  var canvasWidth: js.UndefOr[Double] = js.native
  var clearOnSubmit: js.UndefOr[Boolean] = js.native
  var el: js.UndefOr[String] = js.native
  var focusOnError: js.UndefOr[Boolean] = js.native
  var requiredValue: js.UndefOr[String] = js.native
  var resetOnError: js.UndefOr[Boolean] = js.native
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
    def withCallback(value: (/* response */ success | error, /* input */ NodeListOf[Element with Node]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasFillStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredValue")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnError")(js.undefined)
        ret
    }
  }
  
}

