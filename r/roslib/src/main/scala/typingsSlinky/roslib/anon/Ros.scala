package typingsSlinky.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ros extends js.Object {
  
  var name: java.lang.String = js.native
  
  var ros: typingsSlinky.roslib.mod.Ros = js.native
  
  var serviceType: java.lang.String = js.native
}
object Ros {
  
  @scala.inline
  def apply(name: java.lang.String, ros: typingsSlinky.roslib.mod.Ros, serviceType: java.lang.String): Ros = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ros]
  }
  
  @scala.inline
  implicit class RosOps[Self <: Ros] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRos(value: typingsSlinky.roslib.mod.Ros): Self = this.set("ros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: java.lang.String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
  }
}
