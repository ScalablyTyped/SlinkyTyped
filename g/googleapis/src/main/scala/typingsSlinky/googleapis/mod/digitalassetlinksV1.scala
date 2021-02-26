package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digitalassetlinksV1 {
  
  /**
    * Digital Asset Links API
    *
    * Discovers relationships between online assets such as websites or mobile
    * apps.
    *
    * @example
    * const {google} = require('googleapis');
    * const digitalassetlinks = google.digitalassetlinks('v1');
    *
    * @namespace digitalassetlinks
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Digitalassetlinks
    */
  @JSImport("googleapis", "digitalassetlinks_v1.Digitalassetlinks")
  @js.native
  class Digitalassetlinks protected ()
    extends typingsSlinky.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1.Digitalassetlinks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "digitalassetlinks_v1.Resource$Assetlinks")
  @js.native
  class ResourceAssetlinks protected ()
    extends typingsSlinky.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1.ResourceAssetlinks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "digitalassetlinks_v1.Resource$Statements")
  @js.native
  class ResourceStatements protected ()
    extends typingsSlinky.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1.ResourceStatements {
    def this(context: APIRequestContext) = this()
  }
}
