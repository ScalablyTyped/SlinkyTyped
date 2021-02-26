package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackContinuing extends Event {
  
  /**
    * Playback control object.
    */
  var playback: Playback = js.native
}
object PlaybackContinuing {
  
  @scala.inline
  def apply(application: String, playback: Playback, timestamp: js.Date, `type`: String): PlaybackContinuing = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackContinuing]
  }
  
  @scala.inline
  implicit class PlaybackContinuingMutableBuilder[Self <: PlaybackContinuing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayback(value: Playback): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
  }
}
