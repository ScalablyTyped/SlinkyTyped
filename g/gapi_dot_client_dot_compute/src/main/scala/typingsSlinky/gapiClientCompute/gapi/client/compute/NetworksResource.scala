package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.KeyNetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: typingsSlinky.gapiClientCompute.anon.Network): Request[Operation] = js.native
  /** Deletes the specified network. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Network): Request[Operation] = js.native
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: KeyNetwork): Request[Network] = js.native
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of networks available to the specified project. */
  def list(request: Alt): Request[NetworkList] = js.native
  /** Patches the specified network with the data included in the request. */
  def patch(request: typingsSlinky.gapiClientCompute.anon.Network): Request[Operation] = js.native
  /** Removes a peering from the specified network. */
  def removePeering(request: typingsSlinky.gapiClientCompute.anon.Network): Request[Operation] = js.native
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: typingsSlinky.gapiClientCompute.anon.Network): Request[Operation] = js.native
}

object NetworksResource {
  @scala.inline
  def apply(
    addPeering: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation],
    delete: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation],
    get: KeyNetwork => Request[Network],
    insert: AltFields => Request[Operation],
    list: Alt => Request[NetworkList],
    patch: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation],
    removePeering: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation],
    switchToCustomMode: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal(addPeering = js.Any.fromFunction1(addPeering), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), removePeering = js.Any.fromFunction1(removePeering), switchToCustomMode = js.Any.fromFunction1(switchToCustomMode))
    __obj.asInstanceOf[NetworksResource]
  }
  @scala.inline
  implicit class NetworksResourceOps[Self <: NetworksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPeering(value: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPeering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: KeyNetwork => Request[Network]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[NetworkList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePeering(value: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePeering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwitchToCustomMode(value: typingsSlinky.gapiClientCompute.anon.Network => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchToCustomMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

