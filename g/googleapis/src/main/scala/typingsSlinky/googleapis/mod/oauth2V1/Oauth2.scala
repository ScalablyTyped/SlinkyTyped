package typingsSlinky.googleapis.mod.oauth2V1

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
  * const oauth2 = google.oauth2('v1');
  *
  * @namespace oauth2
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Oauth2
  */
@JSImport("googleapis", "oauth2_v1.Oauth2")
@js.native
class Oauth2 protected ()
  extends typingsSlinky.googleapis.oauth2V1Mod.oauth2V1.Oauth2 {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
