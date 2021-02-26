package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigtableadminV1 {
  
  /**
    * Cloud Bigtable Admin API
    *
    * Administer your Cloud Bigtable tables and instances.
    *
    * @example
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v1');
    *
    * @namespace bigtableadmin
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Bigtableadmin
    */
  @JSImport("googleapis", "bigtableadmin_v1.Bigtableadmin")
  @js.native
  class Bigtableadmin protected ()
    extends typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1.Bigtableadmin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "bigtableadmin_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
}
