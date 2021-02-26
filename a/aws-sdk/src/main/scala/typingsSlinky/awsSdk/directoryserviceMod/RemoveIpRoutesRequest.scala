package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveIpRoutesRequest extends StObject {
  
  /**
    * IP address blocks that you want to remove.
    */
  var CidrIps: typingsSlinky.awsSdk.directoryserviceMod.CidrIps = js.native
  
  /**
    * Identifier (ID) of the directory from which you want to remove the IP addresses.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
}
object RemoveIpRoutesRequest {
  
  @scala.inline
  def apply(CidrIps: CidrIps, DirectoryId: DirectoryId): RemoveIpRoutesRequest = {
    val __obj = js.Dynamic.literal(CidrIps = CidrIps.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveIpRoutesRequest]
  }
  
  @scala.inline
  implicit class RemoveIpRoutesRequestMutableBuilder[Self <: RemoveIpRoutesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrIps(value: CidrIps): Self = StObject.set(x, "CidrIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIpsVarargs(value: CidrIp*): Self = StObject.set(x, "CidrIps", js.Array(value :_*))
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
