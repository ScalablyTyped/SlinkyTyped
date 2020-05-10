package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonFieldsFirewall
import typingsSlinky.gapiClientCompute.AnonFirewall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: AnonFirewall): Request_[Operation] = js.native
  /** Returns the specified firewall. */
  def get(request: AnonFieldsFirewall): Request_[Firewall] = js.native
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: AnonAlt): Request_[FirewallList] = js.native
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: AnonFirewall): Request_[Operation] = js.native
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: AnonFirewall): Request_[Operation] = js.native
}

object FirewallsResource {
  @scala.inline
  def apply(
    delete: AnonFirewall => Request_[Operation],
    get: AnonFieldsFirewall => Request_[Firewall],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[FirewallList],
    patch: AnonFirewall => Request_[Operation],
    update: AnonFirewall => Request_[Operation]
  ): FirewallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FirewallsResource]
  }
  @scala.inline
  implicit class FirewallsResourceOps[Self <: FirewallsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFirewall => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsFirewall => Request_[Firewall]): Self = {
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
    def withList(value: AnonAlt => Request_[FirewallList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFirewall => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFirewall => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

