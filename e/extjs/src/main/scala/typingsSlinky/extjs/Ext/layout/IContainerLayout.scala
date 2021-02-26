package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IContainerLayoutMutableBuilder[Self <: IContainerLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChildEls(value: () => Unit): Self = StObject.set(x, "addChildEls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddChildElsUndefined: Self = StObject.set(x, "addChildEls", js.undefined)
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycle(value: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    @scala.inline
    def setConfigureItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "configureItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfigureItemUndefined: Self = StObject.set(x, "configureItem", js.undefined)
    
    @scala.inline
    def setGetContainerSize(value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "getContainerSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContainerSizeUndefined: Self = StObject.set(x, "getContainerSize", js.undefined)
    
    @scala.inline
    def setGetElementTarget(value: () => IElement): Self = StObject.set(x, "getElementTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementTargetUndefined: Self = StObject.set(x, "getElementTarget", js.undefined)
    
    @scala.inline
    def setGetLayoutItems(value: () => Array): Self = StObject.set(x, "getLayoutItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutItemsUndefined: Self = StObject.set(x, "getLayoutItems", js.undefined)
    
    @scala.inline
    def setGetRenderTarget(value: () => IElement): Self = StObject.set(x, "getRenderTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRenderTargetUndefined: Self = StObject.set(x, "getRenderTarget", js.undefined)
    
    @scala.inline
    def setGetRenderedItems(value: () => Array): Self = StObject.set(x, "getRenderedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRenderedItemsUndefined: Self = StObject.set(x, "getRenderedItems", js.undefined)
    
    @scala.inline
    def setGetTarget(value: () => IElement): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    @scala.inline
    def setGetVisibleItems(value: () => Array): Self = StObject.set(x, "getVisibleItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleItemsUndefined: Self = StObject.set(x, "getVisibleItems", js.undefined)
    
    @scala.inline
    def setItemCls(value: String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
    
    @scala.inline
    def setOverflowPadderEl(value: IElement): Self = StObject.set(x, "overflowPadderEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowPadderElUndefined: Self = StObject.set(x, "overflowPadderEl", js.undefined)
    
    @scala.inline
    def setRemoveChildEls(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeChildEls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChildElsUndefined: Self = StObject.set(x, "removeChildEls", js.undefined)
  }
}
