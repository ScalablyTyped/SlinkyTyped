package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveKey extends StObject {
  
  var activeKey: typingsSlinky.react.mod.Key = js.native
}
object ActiveKey {
  
  @scala.inline
  def apply(activeKey: typingsSlinky.react.mod.Key): ActiveKey = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKey]
  }
  
  @scala.inline
  implicit class ActiveKeyMutableBuilder[Self <: ActiveKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
  }
}
