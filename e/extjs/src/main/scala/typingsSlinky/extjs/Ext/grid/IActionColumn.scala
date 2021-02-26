package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionColumn
  extends typingsSlinky.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var altText: js.UndefOr[String] = js.native
  
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
    * @param fn Object
    * @param scope Object
    * @returns Ext.Container this
    */
  @JSName("cascade")
  var cascade_IActionColumn: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IContainer]
  ] = js.native
  
  /** [Method] Renderer closure iterates through items creating an element for each and tagging with an identifying class name x ac
    * @param v Object
    * @param meta Object
    * @param record Object
    * @param rowIdx Object
    * @param colIdx Object
    * @param store Object
    * @param view Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_IActionColumn: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* colIdx */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Disables this ActionColumn s action at the specified index
    * @param index Number/Ext.grid.column.Action
    * @param silent Boolean
    */
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Enables this ActionColumn s action at the specified index
    * @param index Number/Ext.grid.column.Action
    * @param silent Boolean
    */
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIActionColumn: js.UndefOr[js.Any] = js.native
  
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IActionColumn: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IActionColumn: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.native
}
object IActionColumn {
  
  @scala.inline
  def apply(): IActionColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionColumn]
  }
  
  @scala.inline
  implicit class IActionColumnMutableBuilder[Self <: IActionColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    @scala.inline
    def setCascade(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IContainer): Self = StObject.set(x, "cascade", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    
    @scala.inline
    def setDefaultRenderer(
      value: (/* v */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* colIdx */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction7(value))
    
    @scala.inline
    def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
    
    @scala.inline
    def setDisableAction(value: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "disableAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisableActionUndefined: Self = StObject.set(x, "disableAction", js.undefined)
    
    @scala.inline
    def setEnableAction(value: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "enableAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnableActionUndefined: Self = StObject.set(x, "enableAction", js.undefined)
    
    @scala.inline
    def setGetClass_(value: js.Any): Self = StObject.set(x, "getClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClass_Undefined: Self = StObject.set(x, "getClass", js.undefined)
    
    @scala.inline
    def setGetRefItems(value: () => Unit): Self = StObject.set(x, "getRefItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRefItemsUndefined: Self = StObject.set(x, "getRefItems", js.undefined)
    
    @scala.inline
    def setGetTip(value: js.Any): Self = StObject.set(x, "getTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTipUndefined: Self = StObject.set(x, "getTip", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconCls(value: String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setStopSelection(value: Boolean): Self = StObject.set(x, "stopSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopSelectionUndefined: Self = StObject.set(x, "stopSelection", js.undefined)
  }
}
