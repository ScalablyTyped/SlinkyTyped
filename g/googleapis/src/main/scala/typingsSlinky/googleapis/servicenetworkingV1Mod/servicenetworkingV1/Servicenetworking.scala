package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Networking API
  *
  * Provides automatic management of network configurations necessary for
  * certain services.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicenetworking = google.servicenetworking('v1');
  *
  * @namespace servicenetworking
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicenetworking
  */
@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Servicenetworking")
@js.native
class Servicenetworking protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var services: ResourceServices = js.native
}
