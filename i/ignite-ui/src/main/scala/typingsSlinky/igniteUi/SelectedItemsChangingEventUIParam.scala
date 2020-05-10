package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemsChangingEventUIParam extends js.Object {
  /**
  	 * Used to stop the selected items from changing.
  	 */
  var cancel: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the newly selected data items.
  	 */
  var newItems: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the current selected data items.
  	 */
  var oldItems: js.UndefOr[js.Any] = js.native
}

object SelectedItemsChangingEventUIParam {
  @scala.inline
  def apply(): SelectedItemsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangingEventUIParam]
  }
  @scala.inline
  implicit class SelectedItemsChangingEventUIParamOps[Self <: SelectedItemsChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def withNewItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOldItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldItems")(js.undefined)
        ret
    }
  }
  
}

