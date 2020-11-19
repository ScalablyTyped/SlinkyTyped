package typingsSlinky.googleapis.mod.datastoreV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Datastore API
  *
  * Accesses the schemaless NoSQL database to provide fully managed, robust,
  * scalable storage for your application.
  *
  * @example
  * const {google} = require('googleapis');
  * const datastore = google.datastore('v1');
  *
  * @namespace datastore
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Datastore
  */
@JSImport("googleapis", "datastore_v1.Datastore")
@js.native
class Datastore protected ()
  extends typingsSlinky.googleapis.datastoreV1Mod.datastoreV1.Datastore {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
