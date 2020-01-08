package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "firebasedynamiclinks_v1")
@js.native
object firebasedynamiclinks_v1 extends js.Object {
  /**
    * Firebase Dynamic Links API
    *
    * Programmatically creates and manages Firebase Dynamic Links.
    *
    * @example
    * const {google} = require('googleapis');
    * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
    *
    * @namespace firebasedynamiclinks
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Firebasedynamiclinks
    */
  @js.native
  class Firebasedynamiclinks protected ()
    extends typingsSlinky.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1.Firebasedynamiclinks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Managedshortlinks protected ()
    extends typingsSlinky.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1.Resource$Managedshortlinks {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Shortlinks protected ()
    extends typingsSlinky.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1.Resource$Shortlinks {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$V1 protected ()
    extends typingsSlinky.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1.Resource$V1 {
    def this(context: APIRequestContext) = this()
  }
  
}

