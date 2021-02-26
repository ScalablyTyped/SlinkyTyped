package typingsSlinky.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeParam extends StObject {
  
  var volume: Double = js.native
}
object VolumeParam {
  
  @scala.inline
  def apply(volume: Double): VolumeParam = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeParam]
  }
  
  @scala.inline
  implicit class VolumeParamMutableBuilder[Self <: VolumeParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
