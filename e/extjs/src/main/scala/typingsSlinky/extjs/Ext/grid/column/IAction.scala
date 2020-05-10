package typingsSlinky.extjs.Ext.grid.column

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends IColumn {
  /** [Config Option] (String) */
  var altText: js.UndefOr[String] = js.native
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
  		* @param fn Object
  		* @param scope Object
  		* @returns Ext.Container this
  		*/
  @JSName("cascade")
  var cascade_IAction: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IContainer]
  ] = js.native
  /** [Method] Renderer closure iterates through items creating an element for each and tagging with an identifying class name x ac
  		* @param v Object
  		* @param meta Object
  		* @param record Object
  		* @param rowIdx Object
  		* @param colIdx Object
  		* @param store Object
  		* @param view Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IAction: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* colIdx */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Disables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Enables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIAction: js.UndefOr[js.Any] = js.native
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IAction: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IAction: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.native
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
    def withAltText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(js.undefined)
        ret
    }
    @scala.inline
    def withCascade(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRenderer(
      value: (/* v */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* colIdx */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutDefaultRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAction(value: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisableAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAction(value: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnableAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRefItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRefItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTip")(js.undefined)
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
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: String): Self = {
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
    def withItems(value: Array): Self = {
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
    def withStopSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSelection")(js.undefined)
        ret
    }
  }
  
}

