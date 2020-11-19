package typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Deployment Manager API
  *
  * Declares, configures, and deploys complex solutions on Google Cloud
  * Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('v2');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis/build/src/apis/deploymentmanager/v2", "deploymentmanager_v2.Deploymentmanager")
@js.native
class Deploymentmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var deployments: ResourceDeployments = js.native
  
  var manifests: ResourceManifests = js.native
  
  var operations: ResourceOperations = js.native
  
  var resources: ResourceResources = js.native
  
  var types: ResourceTypes = js.native
}
