package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls */ @js.native
trait IContainerLayout extends ILayout {
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		* @param firstCycle Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IContainerLayout: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] In addition to work done by our base classes containers benefit from some extra cached data
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IContainerLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Adds layout s itemCls and owning Container s itemCls
  		* @param item Object
  		*/
  @JSName("configureItem")
  var configureItem_IContainerLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the container size that of the target
  		* @param ownerContext Ext.layout.ContextItem The owner's context item.
  		* @param inDom Boolean True if the container size must be in the DOM.
  		* @returns Object The size
  		*/
  var getContainerSize: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns the element into which extra functional DOM elements can be inserted
  		* @returns Ext.Element
  		*/
  var getElementTarget: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns an array of child components either for a render phase Performed in the beforeLayout method of the layout s
  		* @returns Ext.Component[] of child components
  		*/
  @JSName("getLayoutItems")
  var getLayoutItems_IContainerLayout: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the element into which rendering must take place
  		* @returns Ext.Element
  		*/
  var getRenderTarget: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns all items that are rendered
  		* @returns Array All matching items
  		*/
  var getRenderedItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the owner component s resize element
  		* @returns Ext.Element
  		*/
  var getTarget: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns all items that are both rendered and visible
  		* @returns Array All matching items
  		*/
  var getVisibleItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var overflowPadderEl: js.UndefOr[IElement] = js.native
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
  		* @param testFn Function The test function.
  		*/
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
}

object IContainerLayout {
  @scala.inline
  def apply(): IContainerLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainerLayout]
  }
  @scala.inline
  implicit class IContainerLayoutOps[Self <: IContainerLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChildEls(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildEls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAddChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildEls")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withBeginLayoutCycle(value: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeginLayoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigureItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withGetContainerSize(value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetContainerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementTarget(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetElementTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayoutItems(value: () => Array): Self = {
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
    def withGetRenderTarget(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRenderTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRenderedItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderedItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRenderedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTarget(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVisibleItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVisibleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCls(value: String): Self = {
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
    def withOverflowPadderEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowPadderEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowPadderEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowPadderEl")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChildEls(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildEls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildEls")(js.undefined)
        ret
    }
  }
  
}

