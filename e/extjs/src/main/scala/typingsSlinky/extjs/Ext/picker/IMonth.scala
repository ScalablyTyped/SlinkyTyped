package typingsSlinky.extjs.Ext.picker

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMonth extends IComponent {
  /** [Method] Modify the year display by passing an offset
  		* @param offset Number The offset to move by.
  		*/
  var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (String) */
  var cancelText: js.UndefOr[String] = js.native
  /** [Method] Gets the selected value
  		* @returns Number[] The selected value
  		*/
  var getValue: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Checks whether the picker has a selection
  		* @returns Boolean Returns true if both a month and year have been selected
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var okText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[String] = js.native
  /** [Method] Set the value for the picker
  		* @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
  		* @returns Ext.picker.Month this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[js.Any] = js.native
}

object IMonth {
  @scala.inline
  def apply(): IMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMonth]
  }
  @scala.inline
  implicit class IMonthOps[Self <: IMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustYear(value: /* offset */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdjustYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustYear")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => IMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
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

