package typingsSlinky.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends js.Object {
  
  var Destination: String = js.native
  
  var Mode: String = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var Propagation: String = js.native
  
  var RW: Boolean = js.native
  
  var Source: String = js.native
}
object Mode {
  
  @scala.inline
  def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String): Mode = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagation(value: String): Self = this.set("Propagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRW(value: Boolean): Self = this.set("RW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
