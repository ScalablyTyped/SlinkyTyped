package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends IBase {
  /** [Method] Disables all components configured by this Action  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Method] Executes the specified function once for each Component currently tied to this Action
  		* @param fn Function The function to execute for each component
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Enables all components configured by this Action  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Executes this Action manually using the handler function specified in the original config object or the handler funct
  		* @param args Object... Variable number of arguments passed to the handler function
  		*/
  var execute: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** [Method] Gets the icon CSS class currently used by all components configured by this Action  */
  var getIconCls: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the text currently displayed by all components configured by this Action  */
  var getText: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Method] Hides all components configured by this Action  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns true if the components using this Action are currently disabled else returns false  */
  var isDisabled: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if the components configured by this Action are currently hidden else returns false  */
  var isHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the disabled state of all components configured by this Action
  		* @param disabled Boolean True to disable the component, false to enable it
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the function that will be called by each Component using this action when its primary event is triggered
  		* @param fn Function The function that will be invoked by the action's components. The function will be called with no arguments.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component firing the event.
  		*/
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the hidden state of all components configured by this Action
  		* @param hidden Boolean True to hide the component, false to show it.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the icon CSS class for all components configured by this Action
  		* @param cls String The CSS class supplying the icon image
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the text to be displayed by all components configured by this Action
  		* @param text String The text to display
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Shows all components configured by this Action  */
  var show: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
}

object IAction {
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
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
    def withExecute(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIconCls(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
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
    def withSetHandler(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

