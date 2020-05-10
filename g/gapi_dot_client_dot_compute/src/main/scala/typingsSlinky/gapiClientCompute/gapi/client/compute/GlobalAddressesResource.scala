package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAddressAlt
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: AnonAddressAlt): Request_[Operation] = js.native
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: AnonFieldsKey): Request_[Address] = js.native
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves a list of global addresses. */
  def list(request: AnonAlt): Request_[AddressList] = js.native
}

object GlobalAddressesResource {
  @scala.inline
  def apply(
    delete: AnonAddressAlt => Request_[Operation],
    get: AnonFieldsKey => Request_[Address],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[AddressList]
  ): GlobalAddressesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalAddressesResource]
  }
  @scala.inline
  implicit class GlobalAddressesResourceOps[Self <: GlobalAddressesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAddressAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsKey => Request_[Address]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[AddressList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

