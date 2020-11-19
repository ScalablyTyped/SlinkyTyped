package typingsSlinky.googleapis.mod.storageV1beta2

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Storage JSON API
  *
  * Lets you store and retrieve potentially-large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1beta2');
  *
  * @namespace storage
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis", "storage_v1beta2.Storage")
@js.native
class Storage protected ()
  extends typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2.Storage {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
