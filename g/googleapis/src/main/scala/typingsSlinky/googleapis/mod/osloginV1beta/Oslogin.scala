package typingsSlinky.googleapis.mod.osloginV1beta

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud OS Login API
  *
  * Manages OS login configuration for Google account users.
  *
  * @example
  * const {google} = require('googleapis');
  * const oslogin = google.oslogin('v1beta');
  *
  * @namespace oslogin
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Oslogin
  */
@JSImport("googleapis", "oslogin_v1beta.Oslogin")
@js.native
class Oslogin protected ()
  extends typingsSlinky.googleapis.osloginV1betaMod.osloginV1beta.Oslogin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
