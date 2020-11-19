package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeParam extends js.Object {
  
  var volume: Double = js.native
}
object VolumeParam {
  
  @scala.inline
  def apply(volume: Double): VolumeParam = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeParam]
  }
  
  @scala.inline
  implicit class VolumeParamOps[Self <: VolumeParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
