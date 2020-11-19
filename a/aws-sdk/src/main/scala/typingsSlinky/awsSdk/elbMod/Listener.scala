package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends js.Object {
  
  /**
    * The port on which the instance is listening.
    */
  var InstancePort: typingsSlinky.awsSdk.elbMod.InstancePort = js.native
  
  /**
    * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL. If the front-end protocol is HTTP, HTTPS, TCP, or SSL, InstanceProtocol must be at the same protocol. If there is another listener with the same InstancePort whose InstanceProtocol is secure, (HTTPS or SSL), the listener's InstanceProtocol must also be secure. If there is another listener with the same InstancePort whose InstanceProtocol is HTTP or TCP, the listener's InstanceProtocol must be HTTP or TCP.
    */
  var InstanceProtocol: js.UndefOr[Protocol] = js.native
  
  /**
    * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
    */
  var LoadBalancerPort: AccessPointPort = js.native
  
  /**
    * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
    */
  var Protocol: typingsSlinky.awsSdk.elbMod.Protocol = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the server certificate.
    */
  var SSLCertificateId: js.UndefOr[typingsSlinky.awsSdk.elbMod.SSLCertificateId] = js.native
}
object Listener {
  
  @scala.inline
  def apply(InstancePort: InstancePort, LoadBalancerPort: AccessPointPort, Protocol: Protocol): Listener = {
    val __obj = js.Dynamic.literal(InstancePort = InstancePort.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    
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
    def setInstancePort(value: InstancePort): Self = this.set("InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerPort(value: AccessPointPort): Self = this.set("LoadBalancerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProtocol(value: Protocol): Self = this.set("InstanceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProtocol: Self = this.set("InstanceProtocol", js.undefined)
    
    @scala.inline
    def setSSLCertificateId(value: SSLCertificateId): Self = this.set("SSLCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSLCertificateId: Self = this.set("SSLCertificateId", js.undefined)
  }
}
