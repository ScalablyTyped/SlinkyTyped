package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyMap extends IBase {
  /** [Method] Add a new binding to this KeyMap
  		* @param binding Object/Object[] A single KeyMap config or an array of configs. The following config object properties are supported:
  		*/
  var addBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object/Object[][]) */
  var binding: js.UndefOr[js.Any] = js.native
  /** [Method] Destroys the KeyMap instance and removes all handlers
  		* @param removeTarget Boolean True to also remove the target
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeTarget */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Disable this KeyMap */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Enables this KeyMap */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if this KeyMap is enabled
  		* @returns Boolean
  		*/
  var isEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Shorthand for adding a single key listener
  		* @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var on: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.native
  /** [Method] Remove a binding from this KeyMap
  		* @param binding Object See for options
  		*/
  var removeBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.native
  /** [Method] Shorthand for removing a single key listener
  		* @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var un: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IKeyMap {
  @scala.inline
  def apply(): IKeyMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyMap]
  }
  @scala.inline
  implicit class IKeyMapOps[Self <: IKeyMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBinding(value: /* binding */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withBinding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* removeTarget */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(
      value: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
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
    def withRemoveBinding(value: /* binding */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBinding")(js.undefined)
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
    @scala.inline
    def withUn(
      value: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(js.undefined)
        ret
    }
  }
  
}

