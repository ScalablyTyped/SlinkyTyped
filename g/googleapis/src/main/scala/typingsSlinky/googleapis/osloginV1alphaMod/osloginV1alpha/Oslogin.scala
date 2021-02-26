package typingsSlinky.googleapis.osloginV1alphaMod.osloginV1alpha

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
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
  * const oslogin = google.oslogin('v1alpha');
  *
  * @namespace oslogin
  * @type {Function}
  * @version v1alpha
  * @variation v1alpha
  * @param {object=} options Options for Oslogin
  */
@JSImport("googleapis/build/src/apis/oslogin/v1alpha", "oslogin_v1alpha.Oslogin")
@js.native
class Oslogin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var users: ResourceUsers = js.native
}
