package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonOauthtoken
import typingsSlinky.gapiClientGmail.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: AnonOauthtoken): Request_[SmimeInfo] = js.native
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: AnonPrettyPrint): Request_[SmimeInfo] = js.native
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: AnonPrettyPrint): Request_[ListSmimeInfoResponse] = js.native
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: AnonOauthtoken): Request_[Unit] = js.native
}

object SmimeInfoResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    get: AnonOauthtoken => Request_[SmimeInfo],
    insert: AnonPrettyPrint => Request_[SmimeInfo],
    list: AnonPrettyPrint => Request_[ListSmimeInfoResponse],
    setDefault: AnonOauthtoken => Request_[Unit]
  ): SmimeInfoResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setDefault = js.Any.fromFunction1(setDefault))
    __obj.asInstanceOf[SmimeInfoResource]
  }
  @scala.inline
  implicit class SmimeInfoResourceOps[Self <: SmimeInfoResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[SmimeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[SmimeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPrettyPrint => Request_[ListSmimeInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefault(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefault")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

