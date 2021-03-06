package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceusageV1beta1 {
  
  @JSImport("googleapis", "serviceusage_v1beta1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "serviceusage_v1beta1.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
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
  @JSImport("googleapis", "serviceusage_v1beta1.Serviceusage")
  @js.native
  class Serviceusage protected ()
    extends typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1.Serviceusage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
