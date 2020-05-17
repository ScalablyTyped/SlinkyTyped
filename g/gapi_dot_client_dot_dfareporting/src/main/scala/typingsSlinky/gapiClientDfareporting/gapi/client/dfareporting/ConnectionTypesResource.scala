package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionTypesResource extends js.Object {
  /** Gets one connection type by ID. */
  def get(request: Fields): Request[ConnectionType] = js.native
  /** Retrieves a list of connection types. */
  def list(request: Key): Request[ConnectionTypesListResponse] = js.native
}

object ConnectionTypesResource {
  @scala.inline
  def apply(get: Fields => Request[ConnectionType], list: Key => Request[ConnectionTypesListResponse]): ConnectionTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ConnectionTypesResource]
  }
  @scala.inline
  implicit class ConnectionTypesResourceOps[Self <: ConnectionTypesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[ConnectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[ConnectionTypesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

