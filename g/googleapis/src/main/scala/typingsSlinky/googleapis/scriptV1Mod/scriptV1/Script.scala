package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Apps Script API
  *
  * Manages and executes Google Apps Script projects.
  *
  * @example
  * const {google} = require('googleapis');
  * const script = google.script('v1');
  *
  * @namespace script
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Script
  */
@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Script")
@js.native
class Script protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var processes: ResourceProcesses = js.native
  
  var projects: ResourceProjects = js.native
  
  var scripts: ResourceScripts = js.native
}
