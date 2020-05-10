package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to array of new selected items. That can be null.
  	 */
  var items: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain reference to array of old selected items. That can be null.
  	 */
  var oldItems: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object IgComboSelectionChangedEventUIParam {
  @scala.inline
  def apply(): IgComboSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboSelectionChangedEventUIParam]
  }
  @scala.inline
  implicit class IgComboSelectionChangedEventUIParamOps[Self <: IgComboSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

