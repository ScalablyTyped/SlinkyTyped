package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IP address information for entries in the (plural) PodIPs field. Each entry includes:
  *    IP: An IP address allocated to the pod. Routable at least within the cluster.
  */
@js.native
trait PodIP extends StObject {
  
  /**
    * ip is an IP address (IPv4 or IPv6) assigned to the pod
    */
  var ip: String = js.native
}
object PodIP {
  
  @scala.inline
  def apply(ip: String): PodIP = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodIP]
  }
  
  @scala.inline
  implicit class PodIPMutableBuilder[Self <: PodIP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
