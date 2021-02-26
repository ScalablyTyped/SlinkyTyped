package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupsmigrationV1 {
  
  /**
    * Groups Migration API
    *
    * Groups Migration Api.
    *
    * @example
    * const {google} = require('googleapis');
    * const groupsmigration = google.groupsmigration('v1');
    *
    * @namespace groupsmigration
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Groupsmigration
    */
  @JSImport("googleapis", "groupsmigration_v1.Groupsmigration")
  @js.native
  class Groupsmigration protected ()
    extends typingsSlinky.googleapis.groupsmigrationV1Mod.groupsmigrationV1.Groupsmigration {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "groupsmigration_v1.Resource$Archive")
  @js.native
  class ResourceArchive protected ()
    extends typingsSlinky.googleapis.groupsmigrationV1Mod.groupsmigrationV1.ResourceArchive {
    def this(context: APIRequestContext) = this()
  }
}
