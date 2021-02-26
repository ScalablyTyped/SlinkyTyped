package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingCopyTab extends StObject {
  
  /**
    * The initial value that you want to assign to the tab.
    */
  var initialValue: js.UndefOr[String] = js.native
  
  /**
    * The label associated with the recipient tab. In a bulk send request, the `tabLabel` for this tab and the `tabLabel`
    * for the corresponding tab on the envelope or template must be the same.
    *
    * Maximum Length: 500 characters.
    */
  var tabLabel: js.UndefOr[String] = js.native
}
object BulkSendingCopyTab {
  
  @scala.inline
  def apply(): BulkSendingCopyTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingCopyTab]
  }
  
  @scala.inline
  implicit class BulkSendingCopyTabMutableBuilder[Self <: BulkSendingCopyTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setTabLabel(value: String): Self = StObject.set(x, "tabLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLabelUndefined: Self = StObject.set(x, "tabLabel", js.undefined)
  }
}
