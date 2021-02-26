package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.dockerodeStrings.host
import typingsSlinky.dockerode.dockerodeStrings.ingress
import typingsSlinky.dockerode.dockerodeStrings.sctp
import typingsSlinky.dockerode.dockerodeStrings.tcp
import typingsSlinky.dockerode.dockerodeStrings.udp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortConfig extends StObject {
  
  var Name: js.UndefOr[String] = js.native
  
  var Protocol: js.UndefOr[tcp | udp | sctp] = js.native
  
  var PublishMode: js.UndefOr[ingress | host] = js.native
  
  var PublishedPort: js.UndefOr[Double] = js.native
  
  var TargetPort: js.UndefOr[Double] = js.native
}
object PortConfig {
  
  @scala.inline
  def apply(): PortConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortConfig]
  }
  
  @scala.inline
  implicit class PortConfigMutableBuilder[Self <: PortConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProtocol(value: tcp | udp | sctp): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setPublishMode(value: ingress | host): Self = StObject.set(x, "PublishMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishModeUndefined: Self = StObject.set(x, "PublishMode", js.undefined)
    
    @scala.inline
    def setPublishedPort(value: Double): Self = StObject.set(x, "PublishedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedPortUndefined: Self = StObject.set(x, "PublishedPort", js.undefined)
    
    @scala.inline
    def setTargetPort(value: Double): Self = StObject.set(x, "TargetPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPortUndefined: Self = StObject.set(x, "TargetPort", js.undefined)
  }
}
