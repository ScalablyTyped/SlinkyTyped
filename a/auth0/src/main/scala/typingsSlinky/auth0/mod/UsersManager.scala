package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "UsersManager")
@js.native
class UsersManager[A, U] protected () extends js.Object {
  def this(options: UsersOptions) = this()
  def getInfo(accessToken: String): js.Promise[User[A, U]] = js.native
  def getInfo(accessToken: String, cb: js.Function2[/* err */ js.Error, /* user */ User[A, U], Unit]): Unit = js.native
  def impersonate(userId: String, settings: ImpersonateSettingOptions): js.Promise[_] = js.native
  def impersonate(
    userId: String,
    settings: ImpersonateSettingOptions,
    cb: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
}

