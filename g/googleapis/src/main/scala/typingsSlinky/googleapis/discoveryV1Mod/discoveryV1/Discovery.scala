package typingsSlinky.googleapis.discoveryV1Mod.discoveryV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API Discovery Service
  *
  * Provides information about other Google APIs, such as what APIs are
  * available, the resource, and method details for each API.
  *
  * @example
  * const {google} = require('googleapis');
  * const discovery = google.discovery('v1');
  *
  * @namespace discovery
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Discovery
  */
@JSImport("googleapis/build/src/apis/discovery/v1", "discovery_v1.Discovery")
@js.native
class Discovery protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var apis: ResourceApis = js.native
  
  var context: APIRequestContext = js.native
}
