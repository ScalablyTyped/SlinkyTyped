package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAddress
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonOauthtoken
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: AnonAlt): Request_[AddressAggregatedList] = js.native
  /** Deletes the specified address resource. */
  def delete(request: AnonAddress): Request_[Operation] = js.native
  /** Returns the specified address resource. */
  def get(request: AnonOauthtoken): Request_[Address] = js.native
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: AnonFilter): Request_[AddressList] = js.native
}

object AddressesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[AddressAggregatedList],
    delete: AnonAddress => Request_[Operation],
    get: AnonOauthtoken => Request_[Address],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[AddressList]
  ): AddressesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AddressesResource]
  }
  @scala.inline
  implicit class AddressesResourceOps[Self <: AddressesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[AddressAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAddress => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Address]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[AddressList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

