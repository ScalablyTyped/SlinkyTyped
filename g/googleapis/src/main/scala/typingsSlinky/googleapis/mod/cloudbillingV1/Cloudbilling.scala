package typingsSlinky.googleapis.mod.cloudbillingV1

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
@JSImport("googleapis", "cloudbilling_v1.Cloudbilling")
@js.native
class Cloudbilling protected ()
  extends typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1.Cloudbilling {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
