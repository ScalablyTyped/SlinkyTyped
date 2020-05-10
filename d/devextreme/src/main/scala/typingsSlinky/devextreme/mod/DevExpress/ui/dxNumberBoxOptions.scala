package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.clear
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.spins
import typingsSlinky.devextreme.devextremeStrings.tel
import typingsSlinky.devextreme.devextremeStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxNumberBoxOptions extends dxTextEditorOptions[dxNumberBox] {
  /** Allows you to add custom buttons to the input text field. */
  @JSName("buttons")
  var buttons_dxNumberBoxOptions: js.UndefOr[js.Array[clear | spins | dxTextEditorButton]] = js.native
  /** Specifies the value's display format and controls user input accordingly. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Specifies the text of the message displayed if the specified value is not a number. */
  var invalidValueMessage: js.UndefOr[String] = js.native
  /** The maximum value accepted by the number box. */
  var max: js.UndefOr[Double] = js.native
  /** The minimum value accepted by the number box. */
  var min: js.UndefOr[Double] = js.native
  /** Specifies the value to be passed to the type attribute of the underlying `` element. */
  var mode: js.UndefOr[number | text | tel] = js.native
  /** Specifies whether to show the buttons that change the value by a step. */
  var showSpinButtons: js.UndefOr[Boolean] = js.native
  /** Specifies how much the widget's value changes when using the spin buttons, Up/Down arrow keys, or mouse wheel. */
  var step: js.UndefOr[Double] = js.native
  /** Specifies whether to use touch friendly spin buttons. Applies only if showSpinButtons is true. */
  var useLargeSpinButtons: js.UndefOr[Boolean] = js.native
  /** The current number box value. */
  @JSName("value")
  var value_dxNumberBoxOptions: js.UndefOr[Double] = js.native
}

object dxNumberBoxOptions {
  @scala.inline
  def apply(): dxNumberBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxNumberBoxOptions]
  }
  @scala.inline
  implicit class dxNumberBoxOptionsOps[Self <: dxNumberBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[clear | spins | dxTextEditorButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidValueMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidValueMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidValueMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidValueMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: number | text | tel): Self = {
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
    def withShowSpinButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSpinButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLargeSpinButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLargeSpinButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLargeSpinButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLargeSpinButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

