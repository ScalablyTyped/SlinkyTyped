package typingsSlinky.extjs.Ext.tree

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IView: js.UndefOr[Boolean] = js.native
  /** [Method] Collapses a record that is loaded in the view
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapse: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Expands a record that is loaded in the view
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expand: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  @JSName("getStoreListeners")
  var getStoreListeners_IView: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the base TreeStore from the bound TreePanel  */
  var getTreeStore: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isTreeView: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  @JSName("loadMask")
  var loadMask_IView: js.UndefOr[Boolean] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance  */
  @JSName("onBindStore")
  var onBindStore_IView: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance  */
  @JSName("onUnbindStore")
  var onUnbindStore_IView: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Method] Toggles a record between expanded and collapsed
  		* @param record Ext.data.Model
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the expand/collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var toggle: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IView {
  @scala.inline
  def apply(): IView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStoreListeners(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTreeStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTreeStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTreeStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTreeStore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTreeView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTreeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTreeView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTreeView")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBindStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnbindStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnbindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withRootVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
  }
  
}

