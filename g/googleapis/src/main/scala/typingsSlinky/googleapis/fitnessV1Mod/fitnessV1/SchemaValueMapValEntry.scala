package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaValueMapValEntry extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[SchemaMapValue] = js.native
}
object SchemaValueMapValEntry {
  
  @scala.inline
  def apply(): SchemaValueMapValEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueMapValEntry]
  }
  
  @scala.inline
  implicit class SchemaValueMapValEntryMutableBuilder[Self <: SchemaValueMapValEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaMapValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
