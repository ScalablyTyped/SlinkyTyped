package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Analytics Reporting API
  *
  * Accesses Analytics report data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analyticsreporting = google.analyticsreporting('v4');
  *
  * @namespace analyticsreporting
  * @type {Function}
  * @version v4
  * @variation v4
  * @param {object=} options Options for Analyticsreporting
  */
@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Analyticsreporting")
@js.native
class Analyticsreporting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var reports: ResourceReports = js.native
  
  var userActivity: ResourceUseractivity = js.native
}
