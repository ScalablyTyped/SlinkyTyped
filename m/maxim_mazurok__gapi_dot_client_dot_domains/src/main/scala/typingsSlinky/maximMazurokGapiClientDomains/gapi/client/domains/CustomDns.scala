package typingsSlinky.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDns extends StObject {
  
  /** The list of DS records for this domain, which are used to enable DNSSEC. The domain's DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled. */
  var dsRecords: js.UndefOr[js.Array[DsRecord]] = js.native
  
  /** Required. A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. */
  var nameServers: js.UndefOr[js.Array[String]] = js.native
}
object CustomDns {
  
  @scala.inline
  def apply(): CustomDns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDns]
  }
  
  @scala.inline
  implicit class CustomDnsMutableBuilder[Self <: CustomDns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDsRecords(value: js.Array[DsRecord]): Self = StObject.set(x, "dsRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsRecordsUndefined: Self = StObject.set(x, "dsRecords", js.undefined)
    
    @scala.inline
    def setDsRecordsVarargs(value: DsRecord*): Self = StObject.set(x, "dsRecords", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
  }
}
