package typingsSlinky.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistParam extends StObject {
  
  var playlist: js.Array[_] = js.native
}
object PlaylistParam {
  
  @scala.inline
  def apply(playlist: js.Array[_]): PlaylistParam = {
    val __obj = js.Dynamic.literal(playlist = playlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistParam]
  }
  
  @scala.inline
  implicit class PlaylistParamMutableBuilder[Self <: PlaylistParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaylist(value: js.Array[_]): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistVarargs(value: js.Any*): Self = StObject.set(x, "playlist", js.Array(value :_*))
  }
}
