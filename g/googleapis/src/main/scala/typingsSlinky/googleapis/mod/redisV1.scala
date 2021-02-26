package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redisV1 {
  
  /**
    * Google Cloud Memorystore for Redis API
    *
    * Creates and manages Redis instances on the Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const redis = google.redis('v1');
    *
    * @namespace redis
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Redis
    */
  @JSImport("googleapis", "redis_v1.Redis")
  @js.native
  class Redis protected ()
    extends typingsSlinky.googleapis.redisV1Mod.redisV1.Redis {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "redis_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.redisV1Mod.redisV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "redis_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.redisV1Mod.redisV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "redis_v1.Resource$Projects$Locations$Instances")
  @js.native
  class ResourceProjectsLocationsInstances protected ()
    extends typingsSlinky.googleapis.redisV1Mod.redisV1.ResourceProjectsLocationsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "redis_v1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typingsSlinky.googleapis.redisV1Mod.redisV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
