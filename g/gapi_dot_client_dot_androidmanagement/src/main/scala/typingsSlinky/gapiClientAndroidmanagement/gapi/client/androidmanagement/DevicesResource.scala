package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidmanagement.anon.Alt
import typingsSlinky.gapiClientAndroidmanagement.anon.Callback
import typingsSlinky.gapiClientAndroidmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  var operations: OperationsResource = js.native
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: Alt): Request[js.Object] = js.native
  /** Gets a device. */
  def get(request: Alt): Request[Device] = js.native
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: Alt): Request[Operation] = js.native
  /** Lists devices for a given enterprise. */
  def list(request: Callback): Request[ListDevicesResponse] = js.native
  /** Updates a device. */
  def patch(request: Fields): Request[Device] = js.native
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: Alt => Request[js.Object],
    get: Alt => Request[Device],
    issueCommand: Alt => Request[Operation],
    list: Callback => Request[ListDevicesResponse],
    operations: OperationsResource,
    patch: Fields => Request[Device]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), issueCommand = js.Any.fromFunction1(issueCommand), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[DevicesResource]
  }
  @scala.inline
  implicit class DevicesResourceOps[Self <: DevicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIssueCommand(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Callback => Request[ListDevicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperations(value: OperationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

