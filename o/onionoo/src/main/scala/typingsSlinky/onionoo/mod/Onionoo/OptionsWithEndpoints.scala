package typingsSlinky.onionoo.mod.Onionoo

import typingsSlinky.onionoo.onionooStrings.bandwidth
import typingsSlinky.onionoo.onionooStrings.clients
import typingsSlinky.onionoo.onionooStrings.details
import typingsSlinky.onionoo.onionooStrings.summary
import typingsSlinky.onionoo.onionooStrings.uptime
import typingsSlinky.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithEndpoints extends Options {
  /**
    * Array of endpoints to be returned as methods on the `Onionoo` instance.
    * @default ['summary', 'details', 'bandwidth', 'weights', 'clients', 'uptime']
    */
  var endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime] = js.native
}

object OptionsWithEndpoints {
  @scala.inline
  def apply(endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime]): OptionsWithEndpoints = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithEndpoints]
  }
  @scala.inline
  implicit class OptionsWithEndpointsOps[Self <: OptionsWithEndpoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: js.Array[summary | details | bandwidth | weights | clients | uptime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

