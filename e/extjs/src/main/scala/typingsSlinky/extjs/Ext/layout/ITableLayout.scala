package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITableLayout extends IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.native
  
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITableLayout: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Validates item is in the proper place in the dom
    * @param item Object
    * @param target Object
    * @param rowIdx Object
    * @param cellIdx Object
    */
  @JSName("isValidParent")
  var isValidParent_ITableLayout: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[js.Any] = js.native
}
object ITableLayout {
  
  @scala.inline
  def apply(): ITableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableLayout]
  }
  
  @scala.inline
  implicit class ITableLayoutMutableBuilder[Self <: ITableLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setFinalizeLayout(value: () => Unit): Self = StObject.set(x, "finalizeLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinalizeLayoutUndefined: Self = StObject.set(x, "finalizeLayout", js.undefined)
    
    @scala.inline
    def setIsValidParent(
      value: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* cellIdx */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "isValidParent", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
    
    @scala.inline
    def setTableAttrs(value: js.Any): Self = StObject.set(x, "tableAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableAttrsUndefined: Self = StObject.set(x, "tableAttrs", js.undefined)
    
    @scala.inline
    def setTdAttrs(value: js.Any): Self = StObject.set(x, "tdAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdAttrsUndefined: Self = StObject.set(x, "tdAttrs", js.undefined)
    
    @scala.inline
    def setTrAttrs(value: js.Any): Self = StObject.set(x, "trAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrAttrsUndefined: Self = StObject.set(x, "trAttrs", js.undefined)
  }
}
