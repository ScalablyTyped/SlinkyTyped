package typingsSlinky.gapiClientAdexchangebuyer

import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.AccountsResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.BillingInfoResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.BudgetResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.CreativesResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplacedealsResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplacenotesResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplaceprivateauctionResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PerformanceReportResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PretargetingConfigResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.ProductsResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.ProposalsResource
import typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PubprofilesResource
import typingsSlinky.gapiClientAdexchangebuyer.gapiClientAdexchangebuyerStrings.adexchangebuyer
import typingsSlinky.gapiClientAdexchangebuyer.gapiClientAdexchangebuyerStrings.v1Dot4
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
      
      val accounts: AccountsResource = js.native
      
      val billingInfo: BillingInfoResource = js.native
      
      val budget: BudgetResource = js.native
      
      val creatives: CreativesResource = js.native
      
      /** Load Ad Exchange Buyer API v1.4 */
      def load(name: adexchangebuyer, version: v1Dot4): js.Thenable[Unit] = js.native
      def load(name: adexchangebuyer, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
      
      val marketplacedeals: MarketplacedealsResource = js.native
      
      val marketplacenotes: MarketplacenotesResource = js.native
      
      val marketplaceprivateauction: MarketplaceprivateauctionResource = js.native
      
      val performanceReport: PerformanceReportResource = js.native
      
      val pretargetingConfig: PretargetingConfigResource = js.native
      
      val products: ProductsResource = js.native
      
      val proposals: ProposalsResource = js.native
      
      val pubprofiles: PubprofilesResource = js.native
    }
  }
}
