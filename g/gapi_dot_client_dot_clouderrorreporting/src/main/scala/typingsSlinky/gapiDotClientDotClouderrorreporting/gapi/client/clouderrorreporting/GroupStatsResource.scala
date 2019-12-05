package typingsSlinky.gapiDotClientDotClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotClouderrorreporting.Anon_AccesstokenAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: Anon_AccesstokenAlignment): Request[ListGroupStatsResponse]
}

object GroupStatsResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAlignment => Request[ListGroupStatsResponse]): GroupStatsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GroupStatsResource]
  }
}

