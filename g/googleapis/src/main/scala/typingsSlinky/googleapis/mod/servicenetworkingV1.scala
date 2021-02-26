package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicenetworkingV1 {
  
  @JSImport("googleapis", "servicenetworking_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicenetworking_v1.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicenetworking_v1.Resource$Services$Connections")
  @js.native
  class ResourceServicesConnections protected ()
    extends typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesConnections {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Networking API
    *
    * Provides automatic management of network configurations necessary for
    * certain services.
    *
    * @example
    * const {google} = require('googleapis');
    * const servicenetworking = google.servicenetworking('v1');
    *
    * @namespace servicenetworking
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Servicenetworking
    */
  @JSImport("googleapis", "servicenetworking_v1.Servicenetworking")
  @js.native
  class Servicenetworking protected ()
    extends typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Servicenetworking {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
