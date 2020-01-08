package typingsSlinky.onionoo.onionooMod.Onionoo

import typingsSlinky.got.gotMod.Cache
import typingsSlinky.onionoo.onionooBooleans.`false`
import typingsSlinky.onionoo.onionooStrings.bandwidth
import typingsSlinky.onionoo.onionooStrings.clients
import typingsSlinky.onionoo.onionooStrings.details
import typingsSlinky.onionoo.onionooStrings.summary
import typingsSlinky.onionoo.onionooStrings.uptime
import typingsSlinky.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithEndpoints extends Options {
  /**
    * Array of endpoints to be returned as methods on the `Onionoo` instance.
    * @default ['summary', 'details', 'bandwidth', 'weights', 'clients', 'uptime']
    */
  var endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime]
}

object OptionsWithEndpoints {
  @scala.inline
  def apply(
    endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime],
    baseUrl: String = null,
    cache: Cache | `false` = null
  ): OptionsWithEndpoints = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithEndpoints]
  }
}

