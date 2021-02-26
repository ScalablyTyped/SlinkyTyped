package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webfontsV1 {
  
  @JSImport("googleapis", "webfonts_v1.Resource$Webfonts")
  @js.native
  class ResourceWebfonts protected ()
    extends typingsSlinky.googleapis.webfontsV1Mod.webfontsV1.ResourceWebfonts {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Google Fonts Developer API
    *
    * Accesses the metadata for all families served by Google Fonts, providing a
    * list of families currently available (including available styles and a list
    * of supported script subsets).
    *
    * @example
    * const {google} = require('googleapis');
    * const webfonts = google.webfonts('v1');
    *
    * @namespace webfonts
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Webfonts
    */
  @JSImport("googleapis", "webfonts_v1.Webfonts")
  @js.native
  class Webfonts protected ()
    extends typingsSlinky.googleapis.webfontsV1Mod.webfontsV1.Webfonts {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
