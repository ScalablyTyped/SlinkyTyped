package typingsSlinky.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Private Catalog API
  *
  * Enable cloud users to discover enterprise catalogs and products in their
  * organizations.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudprivatecatalog = google.cloudprivatecatalog('v1beta1');
  *
  * @namespace cloudprivatecatalog
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudprivatecatalog
  */
@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Cloudprivatecatalog")
@js.native
class Cloudprivatecatalog protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var folders: ResourceFolders = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
}
