package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kind extends StObject {
  
  /**
    * The kind, or type, of the referred resource.
    */
  var kind: String = js.native
  
  /**
    * If the snippet.resourceId.kind propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify the video in the playlist.
    */
  var videoId: String = js.native
}
object Kind {
  
  @scala.inline
  def apply(kind: String, videoId: String): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
