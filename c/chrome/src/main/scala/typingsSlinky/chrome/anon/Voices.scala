package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Voices extends StObject {
  
  var voices: js.Array[Eventtypes] = js.native
}
object Voices {
  
  @scala.inline
  def apply(voices: js.Array[Eventtypes]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
  
  @scala.inline
  implicit class VoicesMutableBuilder[Self <: Voices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoices(value: js.Array[Eventtypes]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoicesVarargs(value: Eventtypes*): Self = StObject.set(x, "voices", js.Array(value :_*))
  }
}
