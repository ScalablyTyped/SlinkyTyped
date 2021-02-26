package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.media.PlayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedPlayerState extends StObject {
  
  var currentTime: Double = js.native
  
  var isPaused: Boolean = js.native
  
  var mediaInfo: PlayerState | Null = js.native
}
object SavedPlayerState {
  
  @scala.inline
  def apply(currentTime: Double, isPaused: Boolean): SavedPlayerState = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedPlayerState]
  }
  
  @scala.inline
  implicit class SavedPlayerStateMutableBuilder[Self <: SavedPlayerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfo(value: PlayerState): Self = StObject.set(x, "mediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaInfoNull: Self = StObject.set(x, "mediaInfo", null)
  }
}
