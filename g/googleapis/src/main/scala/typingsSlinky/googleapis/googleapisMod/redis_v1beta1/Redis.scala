package typingsSlinky.googleapis.googleapisMod.redis_v1beta1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Memorystore for Redis API
  *
  * Creates and manages Redis instances on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const redis = google.redis('v1beta1');
  *
  * @namespace redis
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Redis
  */
@JSImport("googleapis", "redis_v1beta1.Redis")
@js.native
class Redis protected ()
  extends typingsSlinky.googleapis.buildSrcApisRedisV1beta1Mod.redis_v1beta1.Redis {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

