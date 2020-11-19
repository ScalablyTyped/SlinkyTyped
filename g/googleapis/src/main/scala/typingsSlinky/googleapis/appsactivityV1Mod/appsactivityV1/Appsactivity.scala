package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive Activity API
  *
  * Provides a historical view of activity.
  *
  * @example
  * const {google} = require('googleapis');
  * const appsactivity = google.appsactivity('v1');
  *
  * @namespace appsactivity
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Appsactivity
  */
@JSImport("googleapis/build/src/apis/appsactivity/v1", "appsactivity_v1.Appsactivity")
@js.native
class Appsactivity protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var activities: ResourceActivities = js.native
  
  var context: APIRequestContext = js.native
}
