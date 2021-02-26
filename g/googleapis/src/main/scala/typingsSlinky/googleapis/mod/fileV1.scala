package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileV1 {
  
  /**
    * Cloud Filestore API
    *
    * The Cloud Filestore API is used for creating and managing cloud file
    * servers.
    *
    * @example
    * const {google} = require('googleapis');
    * const file = google.file('v1');
    *
    * @namespace file
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for File
    */
  @JSImport("googleapis", "file_v1.File")
  @js.native
  class File protected ()
    extends typingsSlinky.googleapis.fileV1Mod.fileV1.File {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.fileV1Mod.fileV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.fileV1Mod.fileV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations$Instances")
  @js.native
  class ResourceProjectsLocationsInstances protected ()
    extends typingsSlinky.googleapis.fileV1Mod.fileV1.ResourceProjectsLocationsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typingsSlinky.googleapis.fileV1Mod.fileV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
