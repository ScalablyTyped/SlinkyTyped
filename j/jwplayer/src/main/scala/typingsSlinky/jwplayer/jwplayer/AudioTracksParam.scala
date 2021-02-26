package typingsSlinky.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTracksParam extends StObject {
  
  var levels: js.Array[_] = js.native
}
object AudioTracksParam {
  
  @scala.inline
  def apply(levels: js.Array[_]): AudioTracksParam = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTracksParam]
  }
  
  @scala.inline
  implicit class AudioTracksParamMutableBuilder[Self <: AudioTracksParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevels(value: js.Array[_]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: js.Any*): Self = StObject.set(x, "levels", js.Array(value :_*))
  }
}
