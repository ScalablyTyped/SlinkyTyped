package typingsSlinky.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackSnippetParams extends StObject {
  
  var track_id: Double = js.native
}
object TrackSnippetParams {
  
  @scala.inline
  def apply(track_id: Double): TrackSnippetParams = {
    val __obj = js.Dynamic.literal(track_id = track_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSnippetParams]
  }
  
  @scala.inline
  implicit class TrackSnippetParamsMutableBuilder[Self <: TrackSnippetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
  }
}
