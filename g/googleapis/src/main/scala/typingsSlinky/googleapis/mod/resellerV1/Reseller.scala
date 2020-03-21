package typingsSlinky.googleapis.mod.resellerV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enterprise Apps Reseller API
  *
  * Creates and manages your customers and their subscriptions.
  *
  * @example
  * const {google} = require('googleapis');
  * const reseller = google.reseller('v1');
  *
  * @namespace reseller
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Reseller
  */
@JSImport("googleapis", "reseller_v1.Reseller")
@js.native
class Reseller protected ()
  extends typingsSlinky.googleapis.resellerV1Mod.resellerV1.Reseller {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

