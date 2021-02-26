package typingsSlinky.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistListResponse extends StObject {
  
  var data: js.UndefOr[PlaylistListData] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object PlaylistListResponse {
  
  @scala.inline
  def apply(): PlaylistListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListResponse]
  }
  
  @scala.inline
  implicit class PlaylistListResponseMutableBuilder[Self <: PlaylistListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PlaylistListData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
