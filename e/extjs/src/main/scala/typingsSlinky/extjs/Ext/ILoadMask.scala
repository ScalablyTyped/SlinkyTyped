package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IAbstractStore
import typingsSlinky.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait ILoadMask extends IComponent {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Changes the data store bound to this LoadMask
  		* @param store Ext.data.Store The store to bind to this LoadMask
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  @JSName("center")
  var center_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
  		* @param store Object
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], _]] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (String) */
  var maskCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msgCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  @JSName("setActive")
  var setActive_ILoadMask: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.native
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @returns Ext.Component this
  		*/
  @JSName("show")
  var show_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Config Option] (Ext.Component) */
  var target: js.UndefOr[IComponent] = js.native
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
  		* @returns Ext.Component this
  		*/
  @JSName("toBack")
  var toBack_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
  		* @param preventFocus Boolean Specify true to prevent the Component from being focused.
  		* @returns Ext.Component this
  		*/
  @JSName("toFront")
  var toFront_ILoadMask: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.native
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useMsg: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useTargetEl: js.UndefOr[Boolean] = js.native
}

object ILoadMask {
  @scala.inline
  def apply(): ILoadMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoadMask]
  }
  @scala.inline
  implicit class ILoadMaskOps[Self <: ILoadMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStore(value: js.UndefOr[js.Any | IStore] => Unit): Self = {
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
    def withCenter(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
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
    def withGetStoreListeners(value: js.UndefOr[js.Any | IStore] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => IComponent): Self = {
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
    def withMaskCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMsg(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgCls")(js.undefined)
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
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
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
    def withSetActive(value: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => IComponent): Self = {
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
    def withTarget(value: IComponent): Self = {
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
    def withToBack(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(js.undefined)
        ret
    }
    @scala.inline
    def withToFront(value: /* preventFocus */ js.UndefOr[Boolean] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(js.undefined)
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
    @scala.inline
    def withUseMsg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTargetEl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTargetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetEl")(js.undefined)
        ret
    }
  }
  
}

