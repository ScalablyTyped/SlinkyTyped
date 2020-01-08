package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "admin_datatransfer_v1")
@js.native
object admin_datatransfer_v1 extends js.Object {
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
  @js.native
  class Admin protected ()
    extends typingsSlinky.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Applications protected ()
    extends typingsSlinky.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1.Resource$Applications {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Transfers protected ()
    extends typingsSlinky.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1.Resource$Transfers {
    def this(context: APIRequestContext) = this()
  }
  
}

