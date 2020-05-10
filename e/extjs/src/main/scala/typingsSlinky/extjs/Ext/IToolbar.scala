package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToolbar
  extends typingsSlinky.extjs.Ext.container.IContainer {
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var enableOverflow: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isToolbar: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var menuTriggerCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.native
}

object IToolbar {
  @scala.inline
  def apply(): IToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolbar]
  }
  @scala.inline
  implicit class IToolbarOps[Self <: IToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultButtonUI(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButtonUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultButtonUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButtonUI")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withIsToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuTriggerCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTriggerCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuTriggerCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTriggerCls")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

