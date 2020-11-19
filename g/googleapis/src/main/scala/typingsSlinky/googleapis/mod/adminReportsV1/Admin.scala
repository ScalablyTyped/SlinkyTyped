package typingsSlinky.googleapis.mod.adminReportsV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Admin Reports API
  *
  * Fetches reports for the administrators of G Suite customers about the
  * usage, collaboration, security, and risk for their users.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('reports_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version reports_v1
  * @variation reports_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis", "admin_reports_v1.Admin")
@js.native
class Admin protected ()
  extends typingsSlinky.googleapis.reportsV1Mod.adminReportsV1.Admin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
