package typingsSlinky.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionsListParam extends StObject {
  
  var tracks: js.Array[_] = js.native
}
object CaptionsListParam {
  
  @scala.inline
  def apply(tracks: js.Array[_]): CaptionsListParam = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsListParam]
  }
  
  @scala.inline
  implicit class CaptionsListParamMutableBuilder[Self <: CaptionsListParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: js.Array[_]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: js.Any*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
