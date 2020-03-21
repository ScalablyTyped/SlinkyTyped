package typingsSlinky.googleapis.mod.scriptV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Apps Script API
  *
  * Manages and executes Google Apps Script projects.
  *
  * @example
  * const {google} = require('googleapis');
  * const script = google.script('v1');
  *
  * @namespace script
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Script
  */
@JSImport("googleapis", "script_v1.Script")
@js.native
class Script protected ()
  extends typingsSlinky.googleapis.scriptV1Mod.scriptV1.Script {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

