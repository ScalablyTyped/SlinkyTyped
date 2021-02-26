package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRoomResponse extends StObject {
  
  /**
    * The room details.
    */
  var Room: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Room] = js.native
}
object GetRoomResponse {
  
  @scala.inline
  def apply(): GetRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomResponse]
  }
  
  @scala.inline
  implicit class GetRoomResponseMutableBuilder[Self <: GetRoomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: Room): Self = StObject.set(x, "Room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomUndefined: Self = StObject.set(x, "Room", js.undefined)
  }
}
