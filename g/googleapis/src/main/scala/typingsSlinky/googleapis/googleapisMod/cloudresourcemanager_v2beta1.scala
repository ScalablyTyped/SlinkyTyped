package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "cloudresourcemanager_v2beta1")
@js.native
object cloudresourcemanager_v2beta1 extends js.Object {
  /**
    * Cloud Resource Manager API
    *
    * Creates, reads, and updates metadata for Google Cloud Platform resource
    * containers.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v2beta1');
    *
    * @namespace cloudresourcemanager
    * @type {Function}
    * @version v2beta1
    * @variation v2beta1
    * @param {object=} options Options for Cloudresourcemanager
    */
  @js.native
  class Cloudresourcemanager protected ()
    extends typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Cloudresourcemanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Folders protected ()
    extends typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Resource$Folders {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typingsSlinky.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
}

