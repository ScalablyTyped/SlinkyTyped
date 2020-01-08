package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "analyticsreporting_v4")
@js.native
object analyticsreporting_v4 extends js.Object {
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
  @js.native
  class Analyticsreporting protected ()
    extends typingsSlinky.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4.Analyticsreporting {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Reports protected ()
    extends typingsSlinky.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4.Resource$Reports {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Useractivity protected ()
    extends typingsSlinky.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4.Resource$Useractivity {
    def this(context: APIRequestContext) = this()
  }
  
}

