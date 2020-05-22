package typingsSlinky.gapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdmin.anon.ActorIpAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: ActorIpAddress): Request[Activities]
  /** Push changes to activities */
  def watch(request: ActorIpAddress): Request[Channel]
}

object ActivitiesResource {
  @scala.inline
  def apply(list: ActorIpAddress => Request[Activities], watch: ActorIpAddress => Request[Channel]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

