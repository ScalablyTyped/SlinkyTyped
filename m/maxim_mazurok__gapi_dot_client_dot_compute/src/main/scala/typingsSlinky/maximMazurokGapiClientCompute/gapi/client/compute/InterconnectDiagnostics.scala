package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectDiagnostics extends StObject {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty
    * when the Interconnect is not bundled.
    */
  var arpCaches: js.UndefOr[js.Array[InterconnectDiagnosticsARPEntry]] = js.native
  
  /** A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect. */
  var links: js.UndefOr[js.Array[InterconnectDiagnosticsLinkStatus]] = js.native
  
  /** The MAC address of the Interconnect's bundle interface. */
  var macAddress: js.UndefOr[String] = js.native
}
object InterconnectDiagnostics {
  
  @scala.inline
  def apply(): InterconnectDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnostics]
  }
  
  @scala.inline
  implicit class InterconnectDiagnosticsMutableBuilder[Self <: InterconnectDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArpCaches(value: js.Array[InterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    @scala.inline
    def setArpCachesVarargs(value: InterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[InterconnectDiagnosticsLinkStatus]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: InterconnectDiagnosticsLinkStatus*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
