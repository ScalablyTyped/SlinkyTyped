package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Proximity Beacon API
  *
  * Registers, manages, indexes, and searches beacons.
  *
  * @example
  * const {google} = require('googleapis');
  * const proximitybeacon = google.proximitybeacon('v1beta1');
  *
  * @namespace proximitybeacon
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Proximitybeacon
  */
@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Proximitybeacon")
@js.native
class Proximitybeacon protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var beaconinfo: ResourceBeaconinfo = js.native
  
  var beacons: ResourceBeacons = js.native
  
  var context: APIRequestContext = js.native
  
  var namespaces: ResourceNamespaces = js.native
  
  var v1beta1: ResourceV1beta1 = js.native
}
