package typingsSlinky.azdata.mod

import typingsSlinky.azdata.azdataStrings.bold
import typingsSlinky.azdata.azdataStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardDescriptionItem extends StObject {
  
  var fontWeight: js.UndefOr[normal | bold] = js.native
  
  var label: String = js.native
  
  var tooltip: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object CardDescriptionItem {
  
  @scala.inline
  def apply(label: String): CardDescriptionItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDescriptionItem]
  }
  
  @scala.inline
  implicit class CardDescriptionItemMutableBuilder[Self <: CardDescriptionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontWeight(value: normal | bold): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
