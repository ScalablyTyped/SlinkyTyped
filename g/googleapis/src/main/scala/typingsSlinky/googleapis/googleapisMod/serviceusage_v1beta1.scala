package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "serviceusage_v1beta1")
@js.native
object serviceusage_v1beta1 extends js.Object {
  @js.native
  class Resource$Operations protected ()
    extends typingsSlinky.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Services protected ()
    extends typingsSlinky.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1.Resource$Services {
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
  @js.native
  class Serviceusage protected ()
    extends typingsSlinky.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1.Serviceusage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

