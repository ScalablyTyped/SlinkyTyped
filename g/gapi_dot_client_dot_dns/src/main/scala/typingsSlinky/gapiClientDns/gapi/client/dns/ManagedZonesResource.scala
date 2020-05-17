package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDns.anon.Alt
import typingsSlinky.gapiClientDns.anon.DnsName
import typingsSlinky.gapiClientDns.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: Key): Request[ManagedZone] = js.native
  /** Delete a previously created ManagedZone. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: Alt): Request[ManagedZone] = js.native
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: DnsName): Request[ManagedZonesListResponse] = js.native
}

object ManagedZonesResource {
  @scala.inline
  def apply(
    create: Key => Request[ManagedZone],
    delete: Alt => Request[Unit],
    get: Alt => Request[ManagedZone],
    list: DnsName => Request[ManagedZonesListResponse]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ManagedZonesResource]
  }
  @scala.inline
  implicit class ManagedZonesResourceOps[Self <: ManagedZonesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Key => Request[ManagedZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[ManagedZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: DnsName => Request[ManagedZonesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

