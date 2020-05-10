package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidmanagement.AnonAlt
import typingsSlinky.gapiClientAndroidmanagement.AnonCallback
import typingsSlinky.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  var operations: OperationsResource = js.native
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: AnonAlt): Request_[js.Object] = js.native
  /** Gets a device. */
  def get(request: AnonAlt): Request_[Device] = js.native
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: AnonAlt): Request_[Operation] = js.native
  /** Lists devices for a given enterprise. */
  def list(request: AnonCallback): Request_[ListDevicesResponse] = js.native
  /** Updates a device. */
  def patch(request: AnonFields): Request_[Device] = js.native
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[Device],
    issueCommand: AnonAlt => Request_[Operation],
    list: AnonCallback => Request_[ListDevicesResponse],
    operations: OperationsResource,
    patch: AnonFields => Request_[Device]
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
    def withDelete(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIssueCommand(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListDevicesResponse]): Self = {
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
    def withPatch(value: AnonFields => Request_[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

