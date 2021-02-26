package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ad Exchange Buyer API
  *
  * Accesses your bidding-account information, submits creatives for
  * validation, finds available direct deals, and retrieves performance
  * reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const adexchangebuyer = google.adexchangebuyer('v1.4');
  *
  * @namespace adexchangebuyer
  * @type {Function}
  * @version v1.4
  * @variation v1.4
  * @param {object=} options Options for Adexchangebuyer
  */
@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Adexchangebuyer")
@js.native
class Adexchangebuyer protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var billingInfo: ResourceBillinginfo = js.native
  
  var budget: ResourceBudget = js.native
  
  var context: APIRequestContext = js.native
  
  var creatives: ResourceCreatives = js.native
  
  var marketplacedeals: ResourceMarketplacedeals = js.native
  
  var marketplacenotes: ResourceMarketplacenotes = js.native
  
  var marketplaceprivateauction: ResourceMarketplaceprivateauction = js.native
  
  var performanceReport: ResourcePerformancereport = js.native
  
  var pretargetingConfig: ResourcePretargetingconfig = js.native
  
  var products: ResourceProducts = js.native
  
  var proposals: ResourceProposals = js.native
  
  var pubprofiles: ResourcePubprofiles = js.native
}
