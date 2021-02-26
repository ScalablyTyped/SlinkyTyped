package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Functions API
  *
  * Manages lightweight user-provided functions executed in response to events.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudfunctions = google.cloudfunctions('v1');
  *
  * @namespace cloudfunctions
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudfunctions
  */
@JSImport("googleapis/build/src/apis/cloudfunctions/v1", "cloudfunctions_v1.Cloudfunctions")
@js.native
class Cloudfunctions protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var projects: ResourceProjects = js.native
}
