package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSettingString extends OmaSetting {
  
  // Value.
  var value: js.UndefOr[String] = js.native
}
object OmaSettingString {
  
  @scala.inline
  def apply(): OmaSettingString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingString]
  }
  
  @scala.inline
  implicit class OmaSettingStringMutableBuilder[Self <: OmaSettingString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
