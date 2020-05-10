package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamespacesResponse extends js.Object {
  /** The attachments that corresponded to the request params. */
  var namespaces: js.UndefOr[js.Array[Namespace]] = js.native
}

object ListNamespacesResponse {
  @scala.inline
  def apply(): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesResponse]
  }
  @scala.inline
  implicit class ListNamespacesResponseOps[Self <: ListNamespacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespaces(value: js.Array[Namespace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(js.undefined)
        ret
    }
  }
  
}

