package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Consumer Management API
  *
  * Manages the service consumers of a Service Infrastructure service.
  *
  * @example
  * const {google} = require('googleapis');
  * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
  *
  * @namespace serviceconsumermanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Serviceconsumermanagement
  */
@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1", "serviceconsumermanagement_v1.Serviceconsumermanagement")
@js.native
class Serviceconsumermanagement protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
  var services: ResourceServices = js.native
}

