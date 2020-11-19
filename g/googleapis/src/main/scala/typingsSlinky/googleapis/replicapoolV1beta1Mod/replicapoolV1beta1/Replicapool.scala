package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replica Pool API
  *
  * The Replica Pool API allows users to declaratively provision and manage
  * groups of Google Compute Engine instances based on a common template.
  *
  * @example
  * const {google} = require('googleapis');
  * const replicapool = google.replicapool('v1beta1');
  *
  * @namespace replicapool
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Replicapool
  */
@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Replicapool")
@js.native
class Replicapool protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var pools: ResourcePools = js.native
  
  var replicas: ResourceReplicas = js.native
}
