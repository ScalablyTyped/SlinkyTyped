package typingsSlinky.googleapis.redisV1Mod.redisV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/redis/v1", "redis_v1.Redis")
@js.native
class Redis protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
