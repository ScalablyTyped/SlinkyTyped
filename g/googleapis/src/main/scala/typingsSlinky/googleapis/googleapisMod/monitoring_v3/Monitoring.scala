package typingsSlinky.googleapis.googleapisMod.monitoring_v3

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Monitoring API
  *
  * Manages your Stackdriver Monitoring data and configurations. Most projects
  * must be associated with a Stackdriver account, with a few exceptions as
  * noted on the individual method pages.
  *
  * @example
  * const {google} = require('googleapis');
  * const monitoring = google.monitoring('v3');
  *
  * @namespace monitoring
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Monitoring
  */
@JSImport("googleapis", "monitoring_v3.Monitoring")
@js.native
class Monitoring protected ()
  extends typingsSlinky.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3.Monitoring {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

