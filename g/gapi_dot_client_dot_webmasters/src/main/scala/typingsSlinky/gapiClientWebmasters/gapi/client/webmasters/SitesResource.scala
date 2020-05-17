package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientWebmasters.anon.Alt
import typingsSlinky.gapiClientWebmasters.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitesResource extends js.Object {
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(request: Alt): Request[Unit] = js.native
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Retrieves information about specific site. */
  def get(request: Alt): Request[WmxSite] = js.native
  /** Lists the user's Search Console sites. */
  def list(request: Key): Request[SitesListResponse] = js.native
}

object SitesResource {
  @scala.inline
  def apply(
    add: Alt => Request[Unit],
    delete: Alt => Request[Unit],
    get: Alt => Request[WmxSite],
    list: Key => Request[SitesListResponse]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SitesResource]
  }
  @scala.inline
  implicit class SitesResourceOps[Self <: SitesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[WmxSite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[SitesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

