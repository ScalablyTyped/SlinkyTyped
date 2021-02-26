package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerNumbers.`0`
import typingsSlinky.jwplayer.jwplayerNumbers.`1`
import typingsSlinky.jwplayer.jwplayerStrings.buffering
import typingsSlinky.jwplayer.jwplayerStrings.playing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayParam extends StObject {
  
  var oldstate: buffering | playing = js.native
  
  var viewable: `0` | `1` = js.native
}
object PlayParam {
  
  @scala.inline
  def apply(oldstate: buffering | playing, viewable: `0` | `1`): PlayParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayParam]
  }
  
  @scala.inline
  implicit class PlayParamMutableBuilder[Self <: PlayParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldstate(value: buffering | playing): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
