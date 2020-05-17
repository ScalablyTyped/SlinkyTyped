package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlaymoviespartner.anon.Accesstoken
import typingsSlinky.gapiClientPlaymoviespartner.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: Accesstoken): Request[Avail] = js.native
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AccountId): Request[ListAvailsResponse] = js.native
}

object AvailsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Avail], list: AccountId => Request[ListAvailsResponse]): AvailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AvailsResource]
  }
  @scala.inline
  implicit class AvailsResourceOps[Self <: AvailsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Accesstoken => Request[Avail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AccountId => Request[ListAvailsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

