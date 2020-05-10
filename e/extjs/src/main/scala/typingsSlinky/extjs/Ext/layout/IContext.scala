package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.dom.IElement
import typingsSlinky.extjs.Ext.util.IQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContext extends IBase {
  /** [Method] Flushes any pending writes to the DOM by calling each ContextItem in the flushQueue  */
  var flush: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the ContextItem for a component
  		* @param cmp Ext.Component
  		*/
  var getCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Returns the ContextItem for an element
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var getEl: js.UndefOr[
    js.Function2[/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement], Unit]
  ] = js.native
  /** [Method] Invalidates one or more components layouts component and container
  		* @param components Ext.Component/Array An array of Components or a single Component.
  		* @param full Boolean True if all properties should be invalidated, otherwise only those calculated by the component should be invalidated.
  		*/
  var invalidate: js.UndefOr[
    js.Function2[/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Property] (Ext.util.Queue) */
  var layoutQueue: js.UndefOr[IQueue] = js.native
  /** [Method] Removes the ContextItem for an element from the cache and from the parent s children array
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var removeEl: js.UndefOr[
    js.Function2[/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement], Unit]
  ] = js.native
  /** [Method] Resets the given layout object
  		* @param layout Object
  		* @param ownerContext Object
  		* @param firstTime Object
  		*/
  var resetLayout: js.UndefOr[
    js.Function3[
      /* layout */ js.UndefOr[js.Any], 
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstTime */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Runs the layout calculations
  		* @returns Boolean True if all layouts were completed, false if not.
  		*/
  var run: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Performs one layout cycle by calling each layout in the layout queue
  		* @returns Boolean True if some progress was made, false if not.
  		*/
  var runCycle: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Set the size of a component element or composite or an array of components or elements
  		* @param items Ext.Component/Ext.Component[]/Ext.dom.Element/Ext.dom.Element[]/Ext.dom.CompositeElement The item(s) to size.
  		* @param width Number The new width to set (ignored if undefined or NaN).
  		* @param height Number The new height to set (ignored if undefined or NaN).
  		*/
  var setItemSize: js.UndefOr[
    js.Function3[
      /* items */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Property] (Number) */
  var state: js.UndefOr[Double] = js.native
}

object IContext {
  @scala.inline
  def apply(): IContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContext]
  }
  @scala.inline
  implicit class IContextOps[Self <: IContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCmp(value: /* cmp */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCmp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEl(value: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidate(value: (/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutQueue(value: IQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEl(value: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEl")(js.undefined)
        ret
    }
    @scala.inline
    def withResetLayout(
      value: (/* layout */ js.UndefOr[js.Any], /* ownerContext */ js.UndefOr[js.Any], /* firstTime */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetLayout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
    @scala.inline
    def withRunCycle(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCycle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRunCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemSize(
      value: (/* items */ js.UndefOr[js.Any], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemSize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetItemSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemSize")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

