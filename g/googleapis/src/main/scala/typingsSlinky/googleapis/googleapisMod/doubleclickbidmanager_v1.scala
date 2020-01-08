package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "doubleclickbidmanager_v1")
@js.native
object doubleclickbidmanager_v1 extends js.Object {
  /**
    * DoubleClick Bid Manager API
    *
    * API for viewing and managing your reports in DoubleClick Bid Manager.
    *
    * @example
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
    *
    * @namespace doubleclickbidmanager
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Doubleclickbidmanager
    */
  @js.native
  class Doubleclickbidmanager protected ()
    extends typingsSlinky.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1.Doubleclickbidmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Lineitems protected ()
    extends typingsSlinky.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1.Resource$Lineitems {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Queries protected ()
    extends typingsSlinky.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1.Resource$Queries {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Reports protected ()
    extends typingsSlinky.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1.Resource$Reports {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Sdf protected ()
    extends typingsSlinky.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1.Resource$Sdf {
    def this(context: APIRequestContext) = this()
  }
  
}

