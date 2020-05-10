package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinner
  extends typingsSlinky.extjs.Ext.form.field.ITrigger {
  /** [Config Option] (Boolean) */
  var keyNavEnabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.native
  /** [Method] This method is called when the spinner down button is clicked or when the down arrow key is pressed if keyNavEnabled  */
  var onSpinDown: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method is called when the spinner up button is clicked or when the up arrow key is pressed if keyNavEnabled is */
  var onSpinUp: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Boolean true to enable the button, false to disable it.
  		*/
  var setSpinDownEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Boolean true to enable the button, false to disable it.
  		*/
  var setSpinUpEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Triggers the spinner to step down fires the spin and spindown events and calls the onSpinDown method  */
  var spinDown: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.Element) */
  var spinDownEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Boolean) */
  var spinDownEnabled: js.UndefOr[Boolean] = js.native
  /** [Method] Triggers the spinner to step up fires the spin and spinup events and calls the onSpinUp method  */
  var spinUp: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.Element) */
  var spinUpEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Boolean) */
  var spinUpEnabled: js.UndefOr[Boolean] = js.native
}

object ISpinner {
  @scala.inline
  def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  @scala.inline
  implicit class ISpinnerOps[Self <: ISpinner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyNavEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyNavEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyNavEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyNavEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSpinDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpinDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSpinDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpinDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSpinUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpinUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSpinUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpinUp")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSpinDownEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinDownEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSpinDownEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinDownEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSpinUpEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinUpEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSpinUpEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinUpEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSpinDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDown")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinDownEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDownEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinDownEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDownEl")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinDownEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDownEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinDownEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDownEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSpinUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinUp")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinUpEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinUpEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinUpEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinUpEl")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinUpEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinUpEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinUpEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinUpEnabled")(js.undefined)
        ret
    }
  }
  
}

