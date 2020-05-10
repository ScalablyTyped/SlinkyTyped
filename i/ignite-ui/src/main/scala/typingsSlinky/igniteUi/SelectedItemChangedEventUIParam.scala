package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemChangedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the current selected data item.
  	 */
  var newItem: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the previous selected data item.
  	 */
  var oldItem: js.UndefOr[js.Any] = js.native
}

object SelectedItemChangedEventUIParam {
  @scala.inline
  def apply(): SelectedItemChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangedEventUIParam]
  }
  @scala.inline
  implicit class SelectedItemChangedEventUIParamOps[Self <: SelectedItemChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

