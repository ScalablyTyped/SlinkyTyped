package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.tab.IBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabPanel
  extends typingsSlinky.extjs.Ext.panel.IPanel {
  /** [Config Option] (String/Number/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the item that is currently active inside this TabPanel
  		* @returns Ext.Component The currently active item.
  		*/
  var getActiveTab: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Returns the Ext tab Bar currently used in this TabPanel
  		* @returns Ext.tab.Bar The TabBar
  		*/
  var getTabBar: js.UndefOr[js.Function0[IBar]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.native
  /** [Method] Makes sure we have a Tab for each item added to the TabPanel
  		* @param item Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_ITabPanel: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var removePanelHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Makes the given card active
  		* @param card String/Number/Ext.Component The card to make active. Either an ID, index or the component itself.
  		* @returns Ext.Component The resulting active child Component. The call may have been vetoed, or otherwise modified by an event listener.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* card */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.native
  /** [Config Option] ("top"/"bottom"/"left"/"right") */
  var tabPosition: js.UndefOr[js.Any] = js.native
}

object ITabPanel {
  @scala.inline
  def apply(): ITabPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabPanel]
  }
  @scala.inline
  implicit class ITabPanelOps[Self <: ITabPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTab(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredRender")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveTab(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTab")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabBar(value: () => IBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTabWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTabWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTabWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTabWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovePanelHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePanelHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovePanelHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePanelHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveTab(value: /* card */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withTabPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPosition")(js.undefined)
        ret
    }
  }
  
}

