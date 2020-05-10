package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemsChangedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the current selected data items.
  	 */
  var newItems: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the previous selected data items.
  	 */
  var oldItems: js.UndefOr[js.Any] = js.native
}

object SelectedItemsChangedEventUIParam {
  @scala.inline
  def apply(): SelectedItemsChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangedEventUIParam]
  }
  @scala.inline
  implicit class SelectedItemsChangedEventUIParamOps[Self <: SelectedItemsChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

