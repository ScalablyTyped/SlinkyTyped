package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "groupsmigration_v1")
@js.native
object groupsmigration_v1 extends js.Object {
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
  @js.native
  class Groupsmigration protected ()
    extends typingsSlinky.googleapis.buildSrcApisGroupsmigrationV1Mod.groupsmigration_v1.Groupsmigration {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Archive protected ()
    extends typingsSlinky.googleapis.buildSrcApisGroupsmigrationV1Mod.groupsmigration_v1.Resource$Archive {
    def this(context: APIRequestContext) = this()
  }
  
}

