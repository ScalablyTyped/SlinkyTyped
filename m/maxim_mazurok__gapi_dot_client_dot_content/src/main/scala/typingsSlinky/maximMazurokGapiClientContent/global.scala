package typingsSlinky.maximMazurokGapiClientContent

import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.AccountsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.AccountstatusesResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.AccounttaxResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.CssesResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.DatafeedsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.DatafeedstatusesResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.LiasettingsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.LocalinventoryResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.OrderinvoicesResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.OrderreportsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.OrderreturnsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.OrdersResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.OrdertrackingsignalsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.PosResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.ProductsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.ProductstatusesResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.PubsubnotificationsettingsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.RegionalinventoryResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.RegionsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.RepricingrulesResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.ReturnaddressResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.ReturnpolicyResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.SettlementreportsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.SettlementtransactionsResource
import typingsSlinky.maximMazurokGapiClientContent.gapi.client.content.ShippingsettingsResource
import typingsSlinky.maximMazurokGapiClientContent.maximMazurokGapiClientContentStrings.content
import typingsSlinky.maximMazurokGapiClientContent.maximMazurokGapiClientContentStrings.v2Dot1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Content API for Shopping v2.1 */
      def load(name: content, version: v2Dot1): js.Thenable[Unit] = js.native
      def load(name: content, version: v2Dot1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object content extends js.Object {
        
        val accounts: AccountsResource = js.native
        
        val accountstatuses: AccountstatusesResource = js.native
        
        val accounttax: AccounttaxResource = js.native
        
        val csses: CssesResource = js.native
        
        val datafeeds: DatafeedsResource = js.native
        
        val datafeedstatuses: DatafeedstatusesResource = js.native
        
        val liasettings: LiasettingsResource = js.native
        
        val localinventory: LocalinventoryResource = js.native
        
        val orderinvoices: OrderinvoicesResource = js.native
        
        val orderreports: OrderreportsResource = js.native
        
        val orderreturns: OrderreturnsResource = js.native
        
        val orders: OrdersResource = js.native
        
        val ordertrackingsignals: OrdertrackingsignalsResource = js.native
        
        val pos: PosResource = js.native
        
        val products: ProductsResource = js.native
        
        val productstatuses: ProductstatusesResource = js.native
        
        val pubsubnotificationsettings: PubsubnotificationsettingsResource = js.native
        
        val regionalinventory: RegionalinventoryResource = js.native
        
        val regions: RegionsResource = js.native
        
        val repricingrules: RepricingrulesResource = js.native
        
        val returnaddress: ReturnaddressResource = js.native
        
        val returnpolicy: ReturnpolicyResource = js.native
        
        val settlementreports: SettlementreportsResource = js.native
        
        val settlementtransactions: SettlementtransactionsResource = js.native
        
        val shippingsettings: ShippingsettingsResource = js.native
      }
    }
  }
}
