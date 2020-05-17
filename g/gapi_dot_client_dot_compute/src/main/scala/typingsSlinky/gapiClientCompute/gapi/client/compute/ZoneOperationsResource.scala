package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Fields
import typingsSlinky.gapiClientCompute.anon.OperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: OperationPrettyPrint): Request[Unit] = js.native
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: OperationPrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: Fields): Request[OperationList] = js.native
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: OperationPrettyPrint => Request[Unit],
    get: OperationPrettyPrint => Request[Operation],
    list: Fields => Request[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
  @scala.inline
  implicit class ZoneOperationsResourceOps[Self <: ZoneOperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: OperationPrettyPrint => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: OperationPrettyPrint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

