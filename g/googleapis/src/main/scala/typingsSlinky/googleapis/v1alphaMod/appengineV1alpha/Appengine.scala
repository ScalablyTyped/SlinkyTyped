package typingsSlinky.googleapis.v1alphaMod.appengineV1alpha

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App Engine Admin API
  *
  * Provisions and manages developers&#39; App Engine applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const appengine = google.appengine('v1alpha');
  *
  * @namespace appengine
  * @type {Function}
  * @version v1alpha
  * @variation v1alpha
  * @param {object=} options Options for Appengine
  */
@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Appengine")
@js.native
class Appengine protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var apps: ResourceApps = js.native
  
  var context: APIRequestContext = js.native
}
