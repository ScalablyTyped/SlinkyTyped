package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionsKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildKeys extends StObject {
  
  var childKeys: js.UndefOr[OptionsKeys] = js.native
  
  var children: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object ChildKeys {
  
  @scala.inline
  def apply(): ChildKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildKeys]
  }
  
  @scala.inline
  implicit class ChildKeysMutableBuilder[Self <: ChildKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildKeys(value: OptionsKeys): Self = StObject.set(x, "childKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildKeysUndefined: Self = StObject.set(x, "childKeys", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
