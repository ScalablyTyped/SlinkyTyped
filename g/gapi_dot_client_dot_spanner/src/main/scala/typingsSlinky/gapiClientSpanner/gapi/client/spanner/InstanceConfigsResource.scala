package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSpanner.AnonAccesstoken
import typingsSlinky.gapiClientSpanner.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: AnonAccesstoken): Request_[InstanceConfig] = js.native
  /** Lists the supported instance configurations for a given project. */
  def list(request: AnonAlt): Request_[ListInstanceConfigsResponse] = js.native
}

object InstanceConfigsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => Request_[InstanceConfig],
    list: AnonAlt => Request_[ListInstanceConfigsResponse]
  ): InstanceConfigsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InstanceConfigsResource]
  }
  @scala.inline
  implicit class InstanceConfigsResourceOps[Self <: InstanceConfigsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[InstanceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListInstanceConfigsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

