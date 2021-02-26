package typingsSlinky.maximMazurokGapiClientProdTtSasportal

import typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal.CustomersResource
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal.DeploymentsResource
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal.InstallerResource
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal.NodesResource
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal.PoliciesResource
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.maximMazurokGapiClientProdTtSasportalStrings.prod_tt_sasportal
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.maximMazurokGapiClientProdTtSasportalStrings.v1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load SAS Portal API (Testing) v1alpha1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: prod_tt_sasportal, version: v1alpha1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: prod_tt_sasportal, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
      
      object prodTtSasportal {
        
        @JSGlobal("gapi.client.prod_tt_sasportal.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.prod_tt_sasportal.deployments")
        @js.native
        val deployments: DeploymentsResource = js.native
        
        @JSGlobal("gapi.client.prod_tt_sasportal.installer")
        @js.native
        val installer: InstallerResource = js.native
        
        @JSGlobal("gapi.client.prod_tt_sasportal.nodes")
        @js.native
        val nodes: NodesResource = js.native
        
        @JSGlobal("gapi.client.prod_tt_sasportal.policies")
        @js.native
        val policies: PoliciesResource = js.native
      }
    }
  }
}
