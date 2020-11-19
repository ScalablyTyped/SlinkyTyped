package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFitLayout extends IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IFitLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFitLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
}
object IFitLayout {
  
  @scala.inline
  def apply(): IFitLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFitLayout]
  }
  
  @scala.inline
  implicit class IFitLayoutOps[Self <: IFitLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setDefaultMargins(value: js.Any): Self = this.set("defaultMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMargins: Self = this.set("defaultMargins", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
  }
}
