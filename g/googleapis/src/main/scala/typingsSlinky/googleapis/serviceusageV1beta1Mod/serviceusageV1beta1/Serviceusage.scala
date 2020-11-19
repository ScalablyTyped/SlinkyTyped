package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Usage API
  *
  * Enables services that service consumers want to use on Google Cloud
  * Platform, lists the available or enabled services, or disables services
  * that service consumers no longer use.
  *
  * @example
  * const {google} = require('googleapis');
  * const serviceusage = google.serviceusage('v1beta1');
  *
  * @namespace serviceusage
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Serviceusage
  */
@JSImport("googleapis/build/src/apis/serviceusage/v1beta1", "serviceusage_v1beta1.Serviceusage")
@js.native
class Serviceusage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var services: ResourceServices = js.native
}
