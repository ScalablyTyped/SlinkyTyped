package typingsSlinky.googleapis.buildSrcApisGroupsmigrationV1Mod.groupsmigration_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("googleapis/build/src/apis/groupsmigration/v1", "groupsmigration_v1.Groupsmigration")
@js.native
class Groupsmigration protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var archive: Resource$Archive = js.native
  var context: APIRequestContext = js.native
}

