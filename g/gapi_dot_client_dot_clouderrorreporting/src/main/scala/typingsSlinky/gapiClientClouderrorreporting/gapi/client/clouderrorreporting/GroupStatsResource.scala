package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouderrorreporting.AnonAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: AnonAlignment): Request_[ListGroupStatsResponse]
}

object GroupStatsResource {
  @scala.inline
  def apply(list: AnonAlignment => Request_[ListGroupStatsResponse]): GroupStatsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GroupStatsResource]
  }
}

