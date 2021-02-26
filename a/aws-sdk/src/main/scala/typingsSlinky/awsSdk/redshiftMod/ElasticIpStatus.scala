package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticIpStatus extends StObject {
  
  /**
    * The elastic IP (EIP) address for the cluster.
    */
  var ElasticIp: js.UndefOr[String] = js.native
  
  /**
    * The status of the elastic IP (EIP) address.
    */
  var Status: js.UndefOr[String] = js.native
}
object ElasticIpStatus {
  
  @scala.inline
  def apply(): ElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticIpStatus]
  }
  
  @scala.inline
  implicit class ElasticIpStatusMutableBuilder[Self <: ElasticIpStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
