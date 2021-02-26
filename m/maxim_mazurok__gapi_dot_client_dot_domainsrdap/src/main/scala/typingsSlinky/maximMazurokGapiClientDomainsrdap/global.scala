package typingsSlinky.maximMazurokGapiClientDomainsrdap

import typingsSlinky.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.AutnumResource
import typingsSlinky.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.DomainResource
import typingsSlinky.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.EntityResource
import typingsSlinky.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.IpResource
import typingsSlinky.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.NameserverResource
import typingsSlinky.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.V1Resource
import typingsSlinky.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.domainsrdap
import typingsSlinky.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object domainsrdap {
        
        @JSGlobal("gapi.client.domainsrdap.autnum")
        @js.native
        val autnum: AutnumResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.domain")
        @js.native
        val domain: DomainResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.entity")
        @js.native
        val entity: EntityResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.ip")
        @js.native
        val ip: IpResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.nameserver")
        @js.native
        val nameserver: NameserverResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Domains RDAP API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: domainsrdap, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: domainsrdap, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
