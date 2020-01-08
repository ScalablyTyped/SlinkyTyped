package typingsSlinky.googleapis.googleapisMod.dlp_v2

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Data Loss Prevention (DLP) API
  *
  * Provides methods for detection, risk analysis, and de-identification of
  * privacy-sensitive fragments in text, images, and Google Cloud Platform
  * storage repositories.
  *
  * @example
  * const {google} = require('googleapis');
  * const dlp = google.dlp('v2');
  *
  * @namespace dlp
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Dlp
  */
@JSImport("googleapis", "dlp_v2.Dlp")
@js.native
class Dlp protected ()
  extends typingsSlinky.googleapis.buildSrcApisDlpV2Mod.dlp_v2.Dlp {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

