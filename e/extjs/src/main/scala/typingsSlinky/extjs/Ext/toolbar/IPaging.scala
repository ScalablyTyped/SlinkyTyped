package typingsSlinky.extjs.Ext.toolbar

import typingsSlinky.extjs.Ext.data.IAbstractStore
import typingsSlinky.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IPaging extends IToolbar {
  /** [Config Option] (String) */
  var afterPageText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var beforePageText: js.UndefOr[String] = js.native
  /** [Method] Binds the paging toolbar to the specified Ext data Store deprecated
  		* @param store Ext.data.Store The data store to bind
  		*/
  var bind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Binds a store to this instance
  		* @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var displayInfo: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var displayMsg: js.UndefOr[String] = js.native
  /** [Method] Refresh the current page has the same effect as clicking the refresh button  */
  var doRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var emptyMsg: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var firstText: js.UndefOr[String] = js.native
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Config Option] (Number) */
  var inputItemWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var lastText: js.UndefOr[String] = js.native
  /** [Method] Move to the first page has the same effect as clicking the first button  */
  var moveFirst: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Move to the last page has the same effect as clicking the last button  */
  var moveLast: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Move to the next page has the same effect as clicking the next button  */
  var moveNext: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Move to the previous page has the same effect as clicking the previous button  */
  var movePrevious: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var nextText: js.UndefOr[String] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var prependButtons: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var prevText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var refreshText: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Method] Unbinds the paging toolbar from the specified Ext data Store deprecated
  		* @param store Ext.data.Store The data store to unbind
  		*/
  var unbind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IPaging {
  @scala.inline
  def apply(): IPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaging]
  }
  @scala.inline
  implicit class IPagingOps[Self <: IPaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterPageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterPageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPageText")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforePageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePageText")(js.undefined)
        ret
    }
    @scala.inline
    def withBind(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStore(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStoreListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withDoRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => IAbstractStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStoreListenersFunction0(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withInputItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputItemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputItemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLastText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastText")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveFirst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMoveFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveLast(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMoveLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveLast")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMoveNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.undefined)
        ret
    }
    @scala.inline
    def withMovePrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movePrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMovePrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movePrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnbindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrependButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshText")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withUnbind(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnbind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.undefined)
        ret
    }
    @scala.inline
    def withUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnbindStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindStoreListeners")(js.undefined)
        ret
    }
  }
  
}

