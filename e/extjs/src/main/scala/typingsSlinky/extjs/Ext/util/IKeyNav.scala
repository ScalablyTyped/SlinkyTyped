package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyNav extends IBase {
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[String] = js.native
  /** [Method] Destroy this KeyNav
  		* @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[IKeyMap] = js.native
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.native
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.native
}

object IKeyNav {
  @scala.inline
  def apply(): IKeyNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyNav]
  }
  @scala.inline
  implicit class IKeyNavOps[Self <: IKeyNav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultEventAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEventAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* removeEl */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(js.undefined)
        ret
    }
    @scala.inline
    def withForceKeyDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreInputFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInputFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreInputFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInputFields")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMap(value: IKeyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessEventScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processEventScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessEventScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processEventScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

