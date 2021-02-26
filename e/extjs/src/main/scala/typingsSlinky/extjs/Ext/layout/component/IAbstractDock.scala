package typingsSlinky.extjs.Ext.layout.component

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractDock extends IComponent {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
    * @param order String The desired ordering of the items ('render' or 'visual').
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] An array of components.
    */
  var getDockedItems: js.UndefOr[
    js.Function2[/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAbstractDock: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
  
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
    * @returns Array An array containing all the visible docked items of the Panel
    */
  @JSName("getLayoutItems")
  var getLayoutItems_IAbstractDock: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] The default weighting of docked items produces this arrangement
    * @param ownerContext Object
    * @param horz Object
    * @param vert Object
    */
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* horz */ js.UndefOr[js.Any], 
      /* vert */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IAbstractDock {
  
  @scala.inline
  def apply(): IAbstractDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractDock]
  }
  
  @scala.inline
  implicit class IAbstractDockMutableBuilder[Self <: IAbstractDock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setGetDockedItems(value: (/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setGetLayoutItems(value: () => Array): Self = StObject.set(x, "getLayoutItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutItemsUndefined: Self = StObject.set(x, "getLayoutItems", js.undefined)
    
    @scala.inline
    def setInvalidateAxes(
      value: (/* ownerContext */ js.UndefOr[js.Any], /* horz */ js.UndefOr[js.Any], /* vert */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "invalidateAxes", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInvalidateAxesUndefined: Self = StObject.set(x, "invalidateAxes", js.undefined)
  }
}
