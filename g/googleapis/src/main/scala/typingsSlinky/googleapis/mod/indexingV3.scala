package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexingV3 {
  
  /**
    * Indexing API
    *
    * Notifies Google when your web pages change.
    *
    * @example
    * const {google} = require('googleapis');
    * const indexing = google.indexing('v3');
    *
    * @namespace indexing
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Indexing
    */
  @JSImport("googleapis", "indexing_v3.Indexing")
  @js.native
  class Indexing protected ()
    extends typingsSlinky.googleapis.indexingV3Mod.indexingV3.Indexing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "indexing_v3.Resource$Urlnotifications")
  @js.native
  class ResourceUrlnotifications protected ()
    extends typingsSlinky.googleapis.indexingV3Mod.indexingV3.ResourceUrlnotifications {
    def this(context: APIRequestContext) = this()
  }
}
