package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientProximitybeacon.anon.Callback
import typingsSlinky.gapiClientProximitybeacon.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespacesResource extends js.Object {
  /**
    * Lists all attachment namespaces owned by your Google Developers Console
    * project. Attachment data associated with a beacon must include a
    * namespaced type, and the namespace must be owned by your project.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: Callback): Request[ListNamespacesResponse] = js.native
  /**
    * Updates the information about the specified namespace. Only the namespace
    * visibility can be updated.
    */
  def update(request: Fields): Request[Namespace] = js.native
}

object NamespacesResource {
  @scala.inline
  def apply(list: Callback => Request[ListNamespacesResponse], update: Fields => Request[Namespace]): NamespacesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[NamespacesResource]
  }
  @scala.inline
  implicit class NamespacesResourceOps[Self <: NamespacesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: Callback => Request[ListNamespacesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fields => Request[Namespace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

