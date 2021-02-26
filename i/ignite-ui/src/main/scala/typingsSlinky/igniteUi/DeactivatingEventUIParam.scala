package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeactivatingEventUIParam extends StObject {
  
  /**
    * Used to get reference to this igToolbarButton.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DeactivatingEventUIParam {
  
  @scala.inline
  def apply(): DeactivatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeactivatingEventUIParam]
  }
  
  @scala.inline
  implicit class DeactivatingEventUIParamMutableBuilder[Self <: DeactivatingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
