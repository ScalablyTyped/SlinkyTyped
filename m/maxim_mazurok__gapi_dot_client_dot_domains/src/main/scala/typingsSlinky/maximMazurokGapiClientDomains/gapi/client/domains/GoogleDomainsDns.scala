package typingsSlinky.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDomainsDns extends StObject {
  
  /** Output only. The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty. */
  var dsRecords: js.UndefOr[js.Array[DsRecord]] = js.native
  
  /** Required. The state of DS records for this domain. Used to enable or disable automatic DNSSEC. */
  var dsState: js.UndefOr[String] = js.native
  
  /**
    * Output only. A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is
    * automatically populated with the name servers assigned to the Google Domains DNS zone.
    */
  var nameServers: js.UndefOr[js.Array[String]] = js.native
}
object GoogleDomainsDns {
  
  @scala.inline
  def apply(): GoogleDomainsDns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDomainsDns]
  }
  
  @scala.inline
  implicit class GoogleDomainsDnsMutableBuilder[Self <: GoogleDomainsDns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDsRecords(value: js.Array[DsRecord]): Self = StObject.set(x, "dsRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsRecordsUndefined: Self = StObject.set(x, "dsRecords", js.undefined)
    
    @scala.inline
    def setDsRecordsVarargs(value: DsRecord*): Self = StObject.set(x, "dsRecords", js.Array(value :_*))
    
    @scala.inline
    def setDsState(value: String): Self = StObject.set(x, "dsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsStateUndefined: Self = StObject.set(x, "dsState", js.undefined)
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
  }
}
