package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Firebase Rules API
  *
  * Creates and manages rules that determine when a Firebase Rules-enabled
  * service should permit a request.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebaserules = google.firebaserules('v1');
  *
  * @namespace firebaserules
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firebaserules
  */
@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Firebaserules")
@js.native
class Firebaserules protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
