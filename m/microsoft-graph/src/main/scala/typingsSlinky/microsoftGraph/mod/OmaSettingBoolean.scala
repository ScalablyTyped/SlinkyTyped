package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSettingBoolean extends OmaSetting {
  
  // Value.
  var value: js.UndefOr[Boolean] = js.native
}
object OmaSettingBoolean {
  
  @scala.inline
  def apply(): OmaSettingBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingBoolean]
  }
  
  @scala.inline
  implicit class OmaSettingBooleanMutableBuilder[Self <: OmaSettingBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
