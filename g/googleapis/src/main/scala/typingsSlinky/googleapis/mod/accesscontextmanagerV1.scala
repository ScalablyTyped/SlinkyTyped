package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accesscontextmanagerV1 {
  
  /**
    * Access Context Manager API
    *
    * An API for setting attribute based access control to requests to GCP
    * services.
    *
    * @example
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1');
    *
    * @namespace accesscontextmanager
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Accesscontextmanager
    */
  @JSImport("googleapis", "accesscontextmanager_v1.Accesscontextmanager")
  @js.native
  class Accesscontextmanager protected ()
    extends typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.Accesscontextmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1.Resource$Accesspolicies")
  @js.native
  class ResourceAccesspolicies protected ()
    extends typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.ResourceAccesspolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1.Resource$Accesspolicies$Accesslevels")
  @js.native
  class ResourceAccesspoliciesAccesslevels protected ()
    extends typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.ResourceAccesspoliciesAccesslevels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1.Resource$Accesspolicies$Serviceperimeters")
  @js.native
  class ResourceAccesspoliciesServiceperimeters protected ()
    extends typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.ResourceAccesspoliciesServiceperimeters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
