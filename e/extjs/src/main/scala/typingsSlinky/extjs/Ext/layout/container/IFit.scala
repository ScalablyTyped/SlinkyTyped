package typingsSlinky.extjs.Ext.layout.container

import typingsSlinky.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFit extends IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IFit: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFit: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
}
object IFit {
  
  @scala.inline
  def apply(): IFit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFit]
  }
  
  @scala.inline
  implicit class IFitMutableBuilder[Self <: IFit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setDefaultMargins(value: js.Any): Self = StObject.set(x, "defaultMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMarginsUndefined: Self = StObject.set(x, "defaultMargins", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
  }
}
