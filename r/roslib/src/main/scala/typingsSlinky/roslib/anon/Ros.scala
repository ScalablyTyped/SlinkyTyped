package typingsSlinky.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ros extends StObject {
  
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
  implicit class RosMutableBuilder[Self <: Ros] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRos(value: typingsSlinky.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: java.lang.String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
