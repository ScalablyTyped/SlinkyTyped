package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.mod.MessageAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataMessageAction extends StObject {
  
  var data: MessageAction = js.native
}
object DataMessageAction {
  
  @scala.inline
  def apply(data: MessageAction): DataMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMessageAction]
  }
  
  @scala.inline
  implicit class DataMessageActionMutableBuilder[Self <: DataMessageAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: MessageAction): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
