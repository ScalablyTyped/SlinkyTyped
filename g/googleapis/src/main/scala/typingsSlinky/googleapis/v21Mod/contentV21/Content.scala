package typingsSlinky.googleapis.v21Mod.contentV21

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content API for Shopping
  *
  * Manages product items, inventory, and Merchant Center accounts for Google
  * Shopping.
  *
  * @example
  * const {google} = require('googleapis');
  * const content = google.content('v2.1');
  *
  * @namespace content
  * @type {Function}
  * @version v2.1
  * @variation v2.1
  * @param {object=} options Options for Content
  */
@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Content")
@js.native
class Content protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var accountstatuses: ResourceAccountstatuses = js.native
  
  var accounttax: ResourceAccounttax = js.native
  
  var context: APIRequestContext = js.native
  
  var datafeeds: ResourceDatafeeds = js.native
  
  var datafeedstatuses: ResourceDatafeedstatuses = js.native
  
  var liasettings: ResourceLiasettings = js.native
  
  var orderinvoices: ResourceOrderinvoices = js.native
  
  var orderreports: ResourceOrderreports = js.native
  
  var orderreturns: ResourceOrderreturns = js.native
  
  var orders: ResourceOrders = js.native
  
  var pos: ResourcePos = js.native
  
  var products: ResourceProducts = js.native
  
  var productstatuses: ResourceProductstatuses = js.native
  
  var regionalinventory: ResourceRegionalinventory = js.native
  
  var shippingsettings: ResourceShippingsettings = js.native
}
