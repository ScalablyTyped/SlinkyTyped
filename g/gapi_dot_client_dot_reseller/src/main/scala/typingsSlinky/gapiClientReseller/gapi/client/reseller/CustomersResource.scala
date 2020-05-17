package typingsSlinky.gapiClientReseller.gapi.client.reseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientReseller.anon.CustomerAuthToken
import typingsSlinky.gapiClientReseller.anon.CustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: CustomerId): Request[Customer] = js.native
  /** Order a new customer's account. */
  def insert(request: CustomerAuthToken): Request[Customer] = js.native
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: CustomerId): Request[Customer] = js.native
  /** Update a customer account's settings. */
  def update(request: CustomerId): Request[Customer] = js.native
}

object CustomersResource {
  @scala.inline
  def apply(
    get: CustomerId => Request[Customer],
    insert: CustomerAuthToken => Request[Customer],
    patch: CustomerId => Request[Customer],
    update: CustomerId => Request[Customer]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomersResource]
  }
  @scala.inline
  implicit class CustomersResourceOps[Self <: CustomersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: CustomerId => Request[Customer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: CustomerAuthToken => Request[Customer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: CustomerId => Request[Customer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: CustomerId => Request[Customer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

