package typingsSlinky.googleapis.v24Mod.analyticsV24

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Analytics API
  *
  * Views and manages your Google Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analytics = google.analytics('v2.4');
  *
  * @namespace analytics
  * @type {Function}
  * @version v2.4
  * @variation v2.4
  * @param {object=} options Options for Analytics
  */
@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Analytics")
@js.native
class Analytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var data: ResourceData = js.native
  
  var management: ResourceManagement = js.native
}
