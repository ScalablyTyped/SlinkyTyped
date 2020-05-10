package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppUser extends js.Object {
  var URI: String = js.native
  var callTimeout: Double = js.native
  var endpoint: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def allUsers(query: Query, callback: CbCallback): Unit = js.native
  def count(query: Query, callback: CbCallback): Unit = js.native
  def getUser(callback: CbCallback): Unit = js.native
  def setPassword(old_password: String, new_password: String, callback: CbCallback): Unit = js.native
  def setUser(data: js.Object, callback: CbCallback): Unit = js.native
}

object AppUser {
  @scala.inline
  def apply(
    URI: String,
    allUsers: (Query, CbCallback) => Unit,
    callTimeout: Double,
    count: (Query, CbCallback) => Unit,
    endpoint: String,
    getUser: CbCallback => Unit,
    setPassword: (String, String, CbCallback) => Unit,
    setUser: (js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], allUsers = js.Any.fromFunction2(allUsers), callTimeout = callTimeout.asInstanceOf[js.Any], count = js.Any.fromFunction2(count), endpoint = endpoint.asInstanceOf[js.Any], getUser = js.Any.fromFunction1(getUser), setPassword = js.Any.fromFunction3(setPassword), setUser = js.Any.fromFunction2(setUser), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUser]
  }
  @scala.inline
  implicit class AppUserOps[Self <: AppUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllUsers(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allUsers")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUser(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPassword(value: (String, String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPassword")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetUser(value: (js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

