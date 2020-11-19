package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Billing API
  *
  * Allows developers to manage billing for their Google Cloud Platform
  * projects     programmatically.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudbilling = google.cloudbilling('v1');
  *
  * @namespace cloudbilling
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudbilling
  */
@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Cloudbilling")
@js.native
class Cloudbilling protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var billingAccounts: ResourceBillingaccounts = js.native
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
  
  var services: ResourceServices = js.native
}
