package typingsSlinky.googleapis.mod.cloudschedulerV1beta1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Scheduler API
  *
  * Creates and manages jobs run on a regular recurring schedule.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudscheduler = google.cloudscheduler('v1beta1');
  *
  * @namespace cloudscheduler
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudscheduler
  */
@JSImport("googleapis", "cloudscheduler_v1beta1.Cloudscheduler")
@js.native
class Cloudscheduler protected ()
  extends typingsSlinky.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1.Cloudscheduler {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
