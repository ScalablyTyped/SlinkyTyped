package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IAbstractStore
import typingsSlinky.extjs.Ext.data.IStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IPagingToolbar
  extends typingsSlinky.extjs.Ext.toolbar.IToolbar {
  
  /** [Config Option] (String) */
  var afterPageText: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var beforePageText: js.UndefOr[java.lang.String] = js.native
  
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
  var displayMsg: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Refresh the current page has the same effect as clicking the refresh button  */
  var doRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var emptyMsg: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var firstText: js.UndefOr[java.lang.String] = js.native
  
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
  var lastText: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Move to the first page has the same effect as clicking the first button  */
  var moveFirst: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Move to the last page has the same effect as clicking the last button  */
  var moveLast: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Move to the next page has the same effect as clicking the next button  */
  var moveNext: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Move to the previous page has the same effect as clicking the previous button  */
  var movePrevious: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.native
  
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
  var prevText: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var refreshText: js.UndefOr[java.lang.String] = js.native
  
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
object IPagingToolbar {
  
  @scala.inline
  def apply(): IPagingToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingToolbar]
  }
  
  @scala.inline
  implicit class IPagingToolbarMutableBuilder[Self <: IPagingToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterPageText(value: java.lang.String): Self = StObject.set(x, "afterPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterPageTextUndefined: Self = StObject.set(x, "afterPageText", js.undefined)
    
    @scala.inline
    def setBeforePageText(value: java.lang.String): Self = StObject.set(x, "beforePageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforePageTextUndefined: Self = StObject.set(x, "beforePageText", js.undefined)
    
    @scala.inline
    def setBind(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStore(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
    
    @scala.inline
    def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    @scala.inline
    def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    @scala.inline
    def setDisplayInfo(value: Boolean): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayInfoUndefined: Self = StObject.set(x, "displayInfo", js.undefined)
    
    @scala.inline
    def setDisplayMsg(value: java.lang.String): Self = StObject.set(x, "displayMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMsgUndefined: Self = StObject.set(x, "displayMsg", js.undefined)
    
    @scala.inline
    def setDoRefresh(value: () => Unit): Self = StObject.set(x, "doRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoRefreshUndefined: Self = StObject.set(x, "doRefresh", js.undefined)
    
    @scala.inline
    def setEmptyMsg(value: java.lang.String): Self = StObject.set(x, "emptyMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyMsgUndefined: Self = StObject.set(x, "emptyMsg", js.undefined)
    
    @scala.inline
    def setFirstText(value: java.lang.String): Self = StObject.set(x, "firstText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTextUndefined: Self = StObject.set(x, "firstText", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStoreListenersFunction0(value: () => _): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setInputItemWidth(value: Double): Self = StObject.set(x, "inputItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputItemWidthUndefined: Self = StObject.set(x, "inputItemWidth", js.undefined)
    
    @scala.inline
    def setLastText(value: java.lang.String): Self = StObject.set(x, "lastText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTextUndefined: Self = StObject.set(x, "lastText", js.undefined)
    
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = StObject.set(x, "moveFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveFirstUndefined: Self = StObject.set(x, "moveFirst", js.undefined)
    
    @scala.inline
    def setMoveLast(value: () => Unit): Self = StObject.set(x, "moveLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveLastUndefined: Self = StObject.set(x, "moveLast", js.undefined)
    
    @scala.inline
    def setMoveNext(value: () => Unit): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNextUndefined: Self = StObject.set(x, "moveNext", js.undefined)
    
    @scala.inline
    def setMovePrevious(value: () => Unit): Self = StObject.set(x, "movePrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMovePreviousUndefined: Self = StObject.set(x, "movePrevious", js.undefined)
    
    @scala.inline
    def setNextText(value: java.lang.String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    @scala.inline
    def setPrependButtons(value: Boolean): Self = StObject.set(x, "prependButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrependButtonsUndefined: Self = StObject.set(x, "prependButtons", js.undefined)
    
    @scala.inline
    def setPrevText(value: java.lang.String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    @scala.inline
    def setRefreshText(value: java.lang.String): Self = StObject.set(x, "refreshText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTextUndefined: Self = StObject.set(x, "refreshText", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setUnbind(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
    
    @scala.inline
    def setUnbindUndefined: Self = StObject.set(x, "unbind", js.undefined)
  }
}
