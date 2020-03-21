package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud SQL Admin API
  *
  * Creates and manages Cloud SQL instances, which provide fully managed MySQL
  * or PostgreSQL databases.
  *
  * @example
  * const {google} = require('googleapis');
  * const sqladmin = google.sqladmin('v1beta4');
  *
  * @namespace sqladmin
  * @type {Function}
  * @version v1beta4
  * @variation v1beta4
  * @param {object=} options Options for Sqladmin
  */
@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Sqladmin")
@js.native
class Sqladmin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var backupRuns: ResourceBackupruns = js.native
  var context: APIRequestContext = js.native
  var databases: ResourceDatabases = js.native
  var flags: ResourceFlags = js.native
  var instances: ResourceInstances = js.native
  var operations: ResourceOperations = js.native
  var sslCerts: ResourceSslcerts = js.native
  var tiers: ResourceTiers = js.native
  var users: ResourceUsers = js.native
}

