package typingsSlinky.googleapis.mod.tpuV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud TPU API
  *
  * TPU API provides customers with access to Google TPU technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const tpu = google.tpu('v1');
  *
  * @namespace tpu
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tpu
  */
@JSImport("googleapis", "tpu_v1.Tpu")
@js.native
class Tpu protected ()
  extends typingsSlinky.googleapis.tpuV1Mod.tpuV1.Tpu {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

