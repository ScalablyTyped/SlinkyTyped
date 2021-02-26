package typingsSlinky.plugapi.mod

import typingsSlinky.plugapi.mod.User.DJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastPlay extends StObject {
  
  var dj: DJ = js.native
  
  var media: Media = js.native
  
  var score: Score = js.native
}
object LastPlay {
  
  @scala.inline
  def apply(dj: DJ, media: Media, score: Score): LastPlay = {
    val __obj = js.Dynamic.literal(dj = dj.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastPlay]
  }
  
  @scala.inline
  implicit class LastPlayMutableBuilder[Self <: LastPlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDj(value: DJ): Self = StObject.set(x, "dj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
