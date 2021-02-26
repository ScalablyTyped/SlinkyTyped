package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCustom[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom] = js.native
  
  var id: String = js.native
}
object SetCustom {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](id: String): SetCustom[Custom] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCustom[Custom]]
  }
  
  @scala.inline
  implicit class SetCustomMutableBuilder[Self <: SetCustom[_], Custom /* <: ObjectCustom */] (val x: Self with SetCustom[Custom]) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
