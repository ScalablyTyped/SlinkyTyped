package typingsSlinky.googleapis.mod.adminDatatransferV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Admin Data Transfer API
  *
  * Transfers user data from one user to another.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('datatransfer_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version datatransfer_v1
  * @variation datatransfer_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis", "admin_datatransfer_v1.Admin")
@js.native
class Admin protected ()
  extends typingsSlinky.googleapis.datatransferV1Mod.adminDatatransferV1.Admin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
