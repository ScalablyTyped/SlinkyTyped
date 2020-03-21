package typingsSlinky.googleapis.mod.servicebrokerV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Broker API
  *
  * The Google Cloud Platform Service Broker API provides Google hosted
  * implementation of the Open Service Broker API
  * (https://www.openservicebrokerapi.org/).
  *
  * @example
  * const {google} = require('googleapis');
  * const servicebroker = google.servicebroker('v1');
  *
  * @namespace servicebroker
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicebroker
  */
@JSImport("googleapis", "servicebroker_v1.Servicebroker")
@js.native
class Servicebroker protected ()
  extends typingsSlinky.googleapis.servicebrokerV1Mod.servicebrokerV1.Servicebroker {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

