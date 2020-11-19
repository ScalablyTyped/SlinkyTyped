package typingsSlinky.googleapis.mod.oauth2V2

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google OAuth2 API
  *
  * Obtains end-user authorization grants for use with other Google APIs.
  *
  * @example
  * const {google} = require('googleapis');
  * const oauth2 = google.oauth2('v2');
  *
  * @namespace oauth2
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Oauth2
  */
@JSImport("googleapis", "oauth2_v2.Oauth2")
@js.native
class Oauth2 protected ()
  extends typingsSlinky.googleapis.oauth2V2Mod.oauth2V2.Oauth2 {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
