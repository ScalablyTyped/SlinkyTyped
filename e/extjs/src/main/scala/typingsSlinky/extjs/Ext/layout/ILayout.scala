package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayout extends IBase {
  /** [Method] Removes layout s itemCls and owning Container s itemCls
  		* @param item Object
  		*/
  var afterRemove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayoutCycle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var calculate: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var completeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] Called before an item is rendered to allow the layout to configure the item
  		* @param item Ext.Component The item to be configured
  		*/
  var configureItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Destroys this layout  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var done: js.UndefOr[Boolean] = js.native
  /** [Method] This method if implemented is called after all layouts have completed
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finalizeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finishedLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Ext.Component
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  var getItemSizePolicy: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], ISizePolicy]] = js.native
  /** [Method] Returns the set of items to layout empty by default */
  var getLayoutItems: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] A one time initialization method called just before rendering  */
  var initLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isLayout: js.UndefOr[Boolean] = js.native
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param position Object
  		*/
  var isValidParent: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var notifyOwner: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  /** [Method] This method is called when a child item changes in some way
  		* @param child Ext.Component The child item that has changed.
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  var onContentChange: js.UndefOr[js.Function1[/* child */ js.UndefOr[IComponent], Boolean]] = js.native
  /** [Method] Iterates over all passed items ensuring they are rendered
  		* @param items Object
  		* @param target Object
  		*/
  var renderItems: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object ILayout {
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRemove(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculate(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompleteLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigureItem(value: /* item */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfigureItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureItem")(js.undefined)
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
    def withDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalizeLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinalizeLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinishedLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemSizePolicy(value: /* item */ js.UndefOr[IComponent] => ISizePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemSizePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSizePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayoutItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutItems")(js.undefined)
        ret
    }
    @scala.inline
    def withInitLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidParent(
      value: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsValidParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidParent")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOwner(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOwner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentChange(value: /* child */ js.UndefOr[IComponent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItems(value: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItems")(js.undefined)
        ret
    }
  }
  
}

