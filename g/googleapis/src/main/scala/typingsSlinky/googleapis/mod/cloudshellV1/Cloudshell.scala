package typingsSlinky.googleapis.mod.cloudshellV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Shell API
  *
  * Allows users to start, configure, and connect to interactive shell sessions
  * running in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudshell = google.cloudshell('v1');
  *
  * @namespace cloudshell
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudshell
  */
@JSImport("googleapis", "cloudshell_v1.Cloudshell")
@js.native
class Cloudshell protected ()
  extends typingsSlinky.googleapis.cloudshellV1Mod.cloudshellV1.Cloudshell {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
