package typingsSlinky.googleapis.mod.runV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Run API
  *
  * Deploy and manage user provided container images that scale automatically
  * based on HTTP traffic.
  *
  * @example
  * const {google} = require('googleapis');
  * const run = google.run('v1');
  *
  * @namespace run
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Run
  */
@JSImport("googleapis", "run_v1.Run")
@js.native
class Run protected ()
  extends typingsSlinky.googleapis.runV1Mod.runV1.Run {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
