package typingsSlinky.googleapis.mod.driveV2

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive API
  *
  * Manages files in Drive including uploading, downloading, searching,
  * detecting changes, and updating sharing permissions.
  *
  * @example
  * const {google} = require('googleapis');
  * const drive = google.drive('v2');
  *
  * @namespace drive
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Drive
  */
@JSImport("googleapis", "drive_v2.Drive")
@js.native
class Drive protected ()
  extends typingsSlinky.googleapis.driveV2Mod.driveV2.Drive {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
