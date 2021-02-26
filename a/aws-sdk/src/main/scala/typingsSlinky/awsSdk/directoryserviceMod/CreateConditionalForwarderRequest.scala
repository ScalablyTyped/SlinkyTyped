package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConditionalForwarderRequest extends StObject {
  
  /**
    * The directory ID of the AWS directory for which you are creating the conditional forwarder.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var DnsIpAddrs: typingsSlinky.awsSdk.directoryserviceMod.DnsIpAddrs = js.native
  
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName = js.native
}
object CreateConditionalForwarderRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): CreateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], DnsIpAddrs = DnsIpAddrs.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConditionalForwarderRequest]
  }
  
  @scala.inline
  implicit class CreateConditionalForwarderRequestMutableBuilder[Self <: CreateConditionalForwarderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value :_*))
    
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
  }
}
