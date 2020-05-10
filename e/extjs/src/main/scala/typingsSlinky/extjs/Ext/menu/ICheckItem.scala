package typingsSlinky.extjs.Ext.menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckItem extends IItem {
  /** [Config Option] (Boolean) */
  var checkChangeDisabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var checkHandler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.native
  /** [Method] Disables just the checkbox functionality of this menu Item  */
  var disableCheckChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Reenables the checkbox functionality of this menu item after having been disabled by disableCheckChange */
  var enableCheckChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var group: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var groupCls: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the checked state of the item
  		* @param checked Boolean True to check, false to uncheck
  		* @param suppressEvents Boolean True to prevent firing the checkchange events.
  		*/
  var setChecked: js.UndefOr[
    js.Function2[/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var uncheckedCls: js.UndefOr[String] = js.native
}

object ICheckItem {
  @scala.inline
  def apply(): ICheckItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckItem]
  }
  @scala.inline
  implicit class ICheckItemOps[Self <: ICheckItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckChangeDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChangeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckChangeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChangeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCheckChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCheckChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisableCheckChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCheckChange")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCheckChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCheckChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnableCheckChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCheckChange")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCls")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetChecked(value: (/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChecked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedCls")(js.undefined)
        ret
    }
  }
  
}

