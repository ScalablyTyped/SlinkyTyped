package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupssettingsV1 {
  
  /**
    * Groups Settings API
    *
    * Manages permission levels and related settings of a group.
    *
    * @example
    * const {google} = require('googleapis');
    * const groupssettings = google.groupssettings('v1');
    *
    * @namespace groupssettings
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Groupssettings
    */
  @JSImport("googleapis", "groupssettings_v1.Groupssettings")
  @js.native
  class Groupssettings protected ()
    extends typingsSlinky.googleapis.groupssettingsV1Mod.groupssettingsV1.Groupssettings {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "groupssettings_v1.Resource$Groups")
  @js.native
  class ResourceGroups protected ()
    extends typingsSlinky.googleapis.groupssettingsV1Mod.groupssettingsV1.ResourceGroups {
    def this(context: APIRequestContext) = this()
  }
}
