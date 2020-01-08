package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "pagespeedonline_v5")
@js.native
object pagespeedonline_v5 extends js.Object {
  /**
    * PageSpeed Insights API
    *
    * Analyzes the performance of a web page and provides tailored suggestions to
    * make that page faster.
    *
    * @example
    * const {google} = require('googleapis');
    * const pagespeedonline = google.pagespeedonline('v5');
    *
    * @namespace pagespeedonline
    * @type {Function}
    * @version v5
    * @variation v5
    * @param {object=} options Options for Pagespeedonline
    */
  @js.native
  class Pagespeedonline protected ()
    extends typingsSlinky.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Pagespeedonline {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Pagespeedapi protected ()
    extends typingsSlinky.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Resource$Pagespeedapi {
    def this(context: APIRequestContext) = this()
  }
  
}

