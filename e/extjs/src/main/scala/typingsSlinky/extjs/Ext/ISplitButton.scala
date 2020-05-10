package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplitButton
  extends typingsSlinky.extjs.Ext.button.IButton {
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets this button s arrow click handler
  		* @param handler Function The function to call when the arrow is clicked.
  		* @param scope Object Scope for the function passed above.
  		*/
  var setArrowHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object ISplitButton {
  @scala.inline
  def apply(): ISplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitButton]
  }
  @scala.inline
  implicit class ISplitButtonOps[Self <: ISplitButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowTooltip(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSetArrowHandler(value: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArrowHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetArrowHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArrowHandler")(js.undefined)
        ret
    }
  }
  
}

