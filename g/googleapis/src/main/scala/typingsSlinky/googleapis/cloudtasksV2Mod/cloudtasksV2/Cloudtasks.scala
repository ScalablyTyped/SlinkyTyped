package typingsSlinky.googleapis.cloudtasksV2Mod.cloudtasksV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Tasks API
  *
  * Manages the execution of large numbers of distributed requests.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudtasks = google.cloudtasks('v2');
  *
  * @namespace cloudtasks
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudtasks
  */
@JSImport("googleapis/build/src/apis/cloudtasks/v2", "cloudtasks_v2.Cloudtasks")
@js.native
class Cloudtasks protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
