package typingsSlinky.extjs.Ext.layout.container

import typingsSlinky.extjs.Ext.layout.IContextItem
import typingsSlinky.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IForm extends IContainer {
  
  /** [Method] Handles overflow processing for a container
    * @param ownerContext Ext.layout.ContextItem
    * @param containerSize Object
    * @param dimensions Number A bit mask for the overflow managed dimensions. The 0-bit is for width and the 1-bit is for height. In other words, a value of 1 would be only width, 2 would be only height and 3 would be both.
    */
  var calculateOverflow: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      /* dimensions */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IForm: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IForm: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Creates an element that makes bottom right body padding consistent across browsers
    * @param out Object
    * @param renderData Object
    */
  var doRenderPadder: js.UndefOr[
    js.Function2[/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Returns the container size that of the target
    * @param ownerContext Ext.layout.ContextItem The owner's context item.
    * @param inDom Boolean True if the container size must be in the DOM.
    * @param ignoreOverflow Boolean if true scrollbar size will not be subtracted from container size.
    * @returns Object The size
    */
  @JSName("getContainerSize")
  var getContainerSize_IForm: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* inDom */ js.UndefOr[Boolean], 
      /* ignoreOverflow */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IForm: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  
  /** [Method] returns the overflow x style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  
  /** [Method] returns the overflow y style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  
  /** [Property] (Object) */
  var getScrollRangeFlags: js.UndefOr[js.Any] = js.native
}
object IForm {
  
  @scala.inline
  def apply(): IForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IForm]
  }
  
  @scala.inline
  implicit class IFormMutableBuilder[Self <: IForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateOverflow(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[js.Any], /* dimensions */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "calculateOverflow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCalculateOverflowUndefined: Self = StObject.set(x, "calculateOverflow", js.undefined)
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteLayoutUndefined: Self = StObject.set(x, "completeLayout", js.undefined)
    
    @scala.inline
    def setDoRenderPadder(value: (/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doRenderPadder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoRenderPadderUndefined: Self = StObject.set(x, "doRenderPadder", js.undefined)
    
    @scala.inline
    def setGetContainerSize(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], /* ignoreOverflow */ js.UndefOr[Boolean]) => _
    ): Self = StObject.set(x, "getContainerSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetContainerSizeUndefined: Self = StObject.set(x, "getContainerSize", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setGetOverflowXStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = StObject.set(x, "getOverflowXStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOverflowXStyleUndefined: Self = StObject.set(x, "getOverflowXStyle", js.undefined)
    
    @scala.inline
    def setGetOverflowYStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = StObject.set(x, "getOverflowYStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOverflowYStyleUndefined: Self = StObject.set(x, "getOverflowYStyle", js.undefined)
    
    @scala.inline
    def setGetScrollRangeFlags(value: js.Any): Self = StObject.set(x, "getScrollRangeFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetScrollRangeFlagsUndefined: Self = StObject.set(x, "getScrollRangeFlags", js.undefined)
  }
}
