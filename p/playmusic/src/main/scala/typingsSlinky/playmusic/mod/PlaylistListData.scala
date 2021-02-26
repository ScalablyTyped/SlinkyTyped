package typingsSlinky.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistListData extends StObject {
  
  var items: js.UndefOr[js.Array[PlaylistListItem]] = js.native
}
object PlaylistListData {
  
  @scala.inline
  def apply(): PlaylistListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListData]
  }
  
  @scala.inline
  implicit class PlaylistListDataMutableBuilder[Self <: PlaylistListData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PlaylistListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PlaylistListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
