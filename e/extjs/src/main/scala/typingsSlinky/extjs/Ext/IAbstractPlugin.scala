package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractPlugin extends IBase {
  /** [Method] Creates clone of the plugin
  		* @param overrideCfg Object Additional config for the derived plugin.
  		*/
  var clonePlugin: js.UndefOr[js.Function1[/* overrideCfg */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] The destroy method is invoked by the owning Component at the time the Component is being destroyed  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] The base implementation just sets the plugin s disabled flag to true Plugin subclasses which need more complex proce  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] The base implementation just sets the plugin s disabled flag to false Plugin subclasses which need more complex proc  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the component to which this plugin is attached
  		* @returns Ext.Component Owner component.
  		*/
  var getCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param client Ext.Component The client Component which owns this plugin.
  		*/
  var init: js.UndefOr[js.Function1[/* client */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Property] (Boolean) */
  var isPlugin: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var pluginId: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the component to which this plugin is attached
  		* @param cmp Ext.Component Owner component.
  		*/
  var setCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], Unit]] = js.native
}

object IAbstractPlugin {
  @scala.inline
  def apply(): IAbstractPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractPlugin]
  }
  @scala.inline
  implicit class IAbstractPluginOps[Self <: IAbstractPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClonePlugin(value: /* overrideCfg */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clonePlugin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClonePlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clonePlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
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
    def withGetCmp(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCmp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* client */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPlugin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCmp(value: /* cmp */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCmp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCmp")(js.undefined)
        ret
    }
  }
  
}

