package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSpanner.AnonAccesstoken
import typingsSlinky.gapiClientSpanner.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: AnonAccesstoken): Request_[InstanceConfig]
  /** Lists the supported instance configurations for a given project. */
  def list(request: AnonAlt): Request_[ListInstanceConfigsResponse]
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
}

