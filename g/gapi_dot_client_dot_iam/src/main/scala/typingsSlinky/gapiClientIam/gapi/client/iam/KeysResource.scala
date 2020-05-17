package typingsSlinky.gapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientIam.anon.Bearertoken
import typingsSlinky.gapiClientIam.anon.KeyTypes
import typingsSlinky.gapiClientIam.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: Bearertoken): Request[ServiceAccountKey] = js.native
  /** Deletes a ServiceAccountKey. */
  def delete(request: Bearertoken): Request[js.Object] = js.native
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: Name): Request[ServiceAccountKey] = js.native
  /** Lists ServiceAccountKeys. */
  def list(request: KeyTypes): Request[ListServiceAccountKeysResponse] = js.native
}

object KeysResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[ServiceAccountKey],
    delete: Bearertoken => Request[js.Object],
    get: Name => Request[ServiceAccountKey],
    list: KeyTypes => Request[ListServiceAccountKeysResponse]
  ): KeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[KeysResource]
  }
  @scala.inline
  implicit class KeysResourceOps[Self <: KeysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Bearertoken => Request[ServiceAccountKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Bearertoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Name => Request[ServiceAccountKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: KeyTypes => Request[ListServiceAccountKeysResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

