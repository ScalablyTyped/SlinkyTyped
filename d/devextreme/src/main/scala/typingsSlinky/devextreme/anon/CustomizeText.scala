package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomizeText[T] extends StObject {
  
  var customizeText: js.UndefOr[js.Function1[/* e */ FilterValue[T], String]] = js.native
  
  var filterEnabled: js.UndefOr[Boolean] = js.native
  
  var texts: js.UndefOr[ClearFilter] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object CustomizeText {
  
  @scala.inline
  def apply[T](): CustomizeText[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeText[T]]
  }
  
  @scala.inline
  implicit class CustomizeTextMutableBuilder[Self <: CustomizeText[_], T] (val x: Self with CustomizeText[T]) extends AnyVal {
    
    @scala.inline
    def setCustomizeText(value: /* e */ FilterValue[T] => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    @scala.inline
    def setTexts(value: ClearFilter): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
