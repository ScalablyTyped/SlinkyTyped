package typingsSlinky.mqtt.anon

import typingsSlinky.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nl extends js.Object {
  
  var nl: js.UndefOr[Boolean] = js.native
  
  var qos: QoS = js.native
  
  var rap: js.UndefOr[Boolean] = js.native
  
  var rh: js.UndefOr[Double] = js.native
}
object Nl {
  
  @scala.inline
  def apply(qos: QoS): Nl = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nl]
  }
  
  @scala.inline
  implicit class NlOps[Self <: Nl] (val x: Self) extends AnyVal {
    
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
    def setQos(value: QoS): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNl(value: Boolean): Self = this.set("nl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNl: Self = this.set("nl", js.undefined)
    
    @scala.inline
    def setRap(value: Boolean): Self = this.set("rap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRap: Self = this.set("rap", js.undefined)
    
    @scala.inline
    def setRh(value: Double): Self = this.set("rh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRh: Self = this.set("rh", js.undefined)
  }
}
