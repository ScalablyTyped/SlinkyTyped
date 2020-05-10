package typingsSlinky.gapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientIam.AnonBearertoken
import typingsSlinky.gapiClientIam.AnonKeyTypes
import typingsSlinky.gapiClientIam.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: AnonBearertoken): Request_[ServiceAccountKey] = js.native
  /** Deletes a ServiceAccountKey. */
  def delete(request: AnonBearertoken): Request_[js.Object] = js.native
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: AnonName): Request_[ServiceAccountKey] = js.native
  /** Lists ServiceAccountKeys. */
  def list(request: AnonKeyTypes): Request_[ListServiceAccountKeysResponse] = js.native
}

object KeysResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[ServiceAccountKey],
    delete: AnonBearertoken => Request_[js.Object],
    get: AnonName => Request_[ServiceAccountKey],
    list: AnonKeyTypes => Request_[ListServiceAccountKeysResponse]
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
    def withCreate(value: AnonBearertoken => Request_[ServiceAccountKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBearertoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonName => Request_[ServiceAccountKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKeyTypes => Request_[ListServiceAccountKeysResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

