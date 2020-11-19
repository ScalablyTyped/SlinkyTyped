package typingsSlinky.googleapis.mod.computeAlpha

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
  * const compute = google.compute('alpha');
  *
  * @namespace compute
  * @type {Function}
  * @version alpha
  * @variation alpha
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis", "compute_alpha.Compute")
@js.native
class Compute protected ()
  extends typingsSlinky.googleapis.alphaMod.computeAlpha.Compute {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
