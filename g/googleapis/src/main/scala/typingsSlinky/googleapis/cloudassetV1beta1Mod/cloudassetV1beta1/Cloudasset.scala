package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Asset API
  *
  * The cloud asset API manages the history and inventory of cloud resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudasset = google.cloudasset('v1beta1');
  *
  * @namespace cloudasset
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudasset
  */
@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Cloudasset")
@js.native
class Cloudasset protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var folders: ResourceFolders = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
}
