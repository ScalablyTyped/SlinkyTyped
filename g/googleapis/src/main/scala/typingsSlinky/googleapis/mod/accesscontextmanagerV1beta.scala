package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accesscontextmanagerV1beta {
  
  /**
    * Access Context Manager API
    *
    * An API for setting attribute based access control to requests to GCP
    * services.
    *
    * @example
    * const {google} = require('googleapis');
    * const accesscontextmanager = google.accesscontextmanager('v1beta');
    *
    * @namespace accesscontextmanager
    * @type {Function}
    * @version v1beta
    * @variation v1beta
    * @param {object=} options Options for Accesscontextmanager
    */
  @JSImport("googleapis", "accesscontextmanager_v1beta.Accesscontextmanager")
  @js.native
  class Accesscontextmanager protected ()
    extends typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta.Accesscontextmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1beta.Resource$Accesspolicies")
  @js.native
  class ResourceAccesspolicies protected ()
    extends typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta.ResourceAccesspolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1beta.Resource$Accesspolicies$Accesslevels")
  @js.native
  class ResourceAccesspoliciesAccesslevels protected ()
    extends typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta.ResourceAccesspoliciesAccesslevels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1beta.Resource$Accesspolicies$Serviceperimeters")
  @js.native
  class ResourceAccesspoliciesServiceperimeters protected ()
    extends typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta.ResourceAccesspoliciesServiceperimeters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "accesscontextmanager_v1beta.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
