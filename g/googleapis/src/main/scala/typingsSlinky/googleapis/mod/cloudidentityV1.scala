package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudidentityV1 {
  
  /**
    * Cloud Identity API
    *
    * API for provisioning and managing identity resources.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1');
    *
    * @namespace cloudidentity
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudidentity
    */
  @JSImport("googleapis", "cloudidentity_v1.Cloudidentity")
  @js.native
  class Cloudidentity protected ()
    extends typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1.Cloudidentity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudidentity_v1.Resource$Groups")
  @js.native
  class ResourceGroups protected ()
    extends typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudidentity_v1.Resource$Groups$Memberships")
  @js.native
  class ResourceGroupsMemberships protected ()
    extends typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceGroupsMemberships {
    def this(context: APIRequestContext) = this()
  }
}
