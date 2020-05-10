package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemChangingEventUIParam extends js.Object {
  /**
  	 * Used to stop the selected item from changing.
  	 */
  var cancel: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the newly selected data item.
  	 */
  var newItem: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the current selected data item.
  	 */
  var oldItem: js.UndefOr[js.Any] = js.native
}

object SelectedItemChangingEventUIParam {
  @scala.inline
  def apply(): SelectedItemChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangingEventUIParam]
  }
  @scala.inline
  implicit class SelectedItemChangingEventUIParamOps[Self <: SelectedItemChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withNewItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOldItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldItem")(js.undefined)
        ret
    }
  }
  
}

