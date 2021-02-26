package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorDeserialization extends StObject {
  
  var custom: js.UndefOr[js.Function] = js.native
}
object EditorDeserialization {
  
  @scala.inline
  def apply(): EditorDeserialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorDeserialization]
  }
  
  @scala.inline
  implicit class EditorDeserializationMutableBuilder[Self <: EditorDeserialization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: js.Function): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
  }
}
