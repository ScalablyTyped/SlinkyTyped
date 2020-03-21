package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPlaymoviespartner.AnonAlt
import typingsSlinky.gapiClientPlaymoviespartner.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /**
    * Get an Order given its id.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: AnonAlt): Request_[Order]
  /**
    * List Orders owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AnonBearertoken): Request_[ListOrdersResponse]
}

object OrdersResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Order], list: AnonBearertoken => Request_[ListOrdersResponse]): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrdersResource]
  }
}

