package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtasksV2beta2 {
  
  /**
    * Cloud Tasks API
    *
    * Manages the execution of large numbers of distributed requests.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2beta2');
    *
    * @namespace cloudtasks
    * @type {Function}
    * @version v2beta2
    * @variation v2beta2
    * @param {object=} options Options for Cloudtasks
    */
  @JSImport("googleapis", "cloudtasks_v2beta2.Cloudtasks")
  @js.native
  class Cloudtasks protected ()
    extends typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues")
  @js.native
  class ResourceProjectsLocationsQueues protected ()
    extends typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocationsQueues {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues$Tasks")
  @js.native
  class ResourceProjectsLocationsQueuesTasks protected ()
    extends typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocationsQueuesTasks {
    def this(context: APIRequestContext) = this()
  }
}
