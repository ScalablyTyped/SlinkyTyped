package typingsSlinky.googleapis.mod.computeV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compute Engine API
  *
  * Creates and runs virtual machines on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const compute = google.compute('v1');
  *
  * @namespace compute
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis", "compute_v1.Compute")
@js.native
class Compute protected ()
  extends typingsSlinky.googleapis.computeV1Mod.computeV1.Compute {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
