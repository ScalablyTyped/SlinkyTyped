package typingsSlinky.googleapis.mod.clouderrorreportingV1beta1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Error Reporting API
  *
  * Groups and counts similar errors from cloud services and applications,
  * reports new errors, and provides access to error groups and their
  * associated errors.
  *
  * @example
  * const {google} = require('googleapis');
  * const clouderrorreporting = google.clouderrorreporting('v1beta1');
  *
  * @namespace clouderrorreporting
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Clouderrorreporting
  */
@JSImport("googleapis", "clouderrorreporting_v1beta1.Clouderrorreporting")
@js.native
class Clouderrorreporting protected ()
  extends typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1.Clouderrorreporting {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
