package typingsSlinky.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButtonGroup
  extends typingsSlinky.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] private
    * @param component Object
    */
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.native
}
object IButtonGroup {
  
  @scala.inline
  def apply(): IButtonGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonGroup]
  }
  
  @scala.inline
  implicit class IButtonGroupMutableBuilder[Self <: IButtonGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setDefaultButtonUI(value: java.lang.String): Self = StObject.set(x, "defaultButtonUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultButtonUIUndefined: Self = StObject.set(x, "defaultButtonUI", js.undefined)
    
    @scala.inline
    def setOnBeforeAdd(value: /* component */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onBeforeAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeAddUndefined: Self = StObject.set(x, "onBeforeAdd", js.undefined)
  }
}
