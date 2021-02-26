package typingsSlinky.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait subtitleTrackSwitchData extends StObject {
  
  var id: String = js.native
}
object subtitleTrackSwitchData {
  
  @scala.inline
  def apply(id: String): subtitleTrackSwitchData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleTrackSwitchData]
  }
  
  @scala.inline
  implicit class subtitleTrackSwitchDataMutableBuilder[Self <: subtitleTrackSwitchData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
