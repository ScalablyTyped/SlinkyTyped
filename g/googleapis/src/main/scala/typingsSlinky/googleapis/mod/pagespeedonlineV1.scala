package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagespeedonlineV1 {
  
  /**
    * PageSpeed Insights API
    *
    * Analyzes the performance of a web page and provides tailored suggestions to
    * make that page faster.
    *
    * @example
    * const {google} = require('googleapis');
    * const pagespeedonline = google.pagespeedonline('v1');
    *
    * @namespace pagespeedonline
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Pagespeedonline
    */
  @JSImport("googleapis", "pagespeedonline_v1.Pagespeedonline")
  @js.native
  class Pagespeedonline protected ()
    extends typingsSlinky.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Pagespeedonline {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "pagespeedonline_v1.Resource$Pagespeedapi")
  @js.native
  class ResourcePagespeedapi protected ()
    extends typingsSlinky.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.ResourcePagespeedapi {
    def this(context: APIRequestContext) = this()
  }
}
