package typingsSlinky.googleapis.mod.pubsubV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Pub/Sub API
  *
  * Provides reliable, many-to-many, asynchronous messaging between
  * applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const pubsub = google.pubsub('v1');
  *
  * @namespace pubsub
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Pubsub
  */
@JSImport("googleapis", "pubsub_v1.Pubsub")
@js.native
class Pubsub protected ()
  extends typingsSlinky.googleapis.pubsubV1Mod.pubsubV1.Pubsub {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
