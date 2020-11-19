package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dialogflow API
  *
  * Builds conversational interfaces (for example, chatbots, and voice-powered
  * apps and devices).
  *
  * @example
  * const {google} = require('googleapis');
  * const dialogflow = google.dialogflow('v2beta1');
  *
  * @namespace dialogflow
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Dialogflow
  */
@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Dialogflow")
@js.native
class Dialogflow protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
