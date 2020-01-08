package typingsSlinky.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var beaconinfo: Resource$Beaconinfo = js.native
  var beacons: Resource$Beacons = js.native
  var context: APIRequestContext = js.native
  var namespaces: Resource$Namespaces = js.native
  var v1beta1: Resource$V1beta1 = js.native
}

