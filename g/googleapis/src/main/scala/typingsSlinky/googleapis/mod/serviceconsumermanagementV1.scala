package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceconsumermanagementV1 {
  
  @JSImport("googleapis", "serviceconsumermanagement_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "serviceconsumermanagement_v1.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "serviceconsumermanagement_v1.Resource$Services$Tenancyunits")
  @js.native
  class ResourceServicesTenancyunits protected ()
    extends typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1.ResourceServicesTenancyunits {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Consumer Management API
    *
    * Manages the service consumers of a Service Infrastructure service.
    *
    * @example
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
    *
    * @namespace serviceconsumermanagement
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Serviceconsumermanagement
    */
  @JSImport("googleapis", "serviceconsumermanagement_v1.Serviceconsumermanagement")
  @js.native
  class Serviceconsumermanagement protected ()
    extends typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1.Serviceconsumermanagement {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
