package typingsSlinky.paypalCordovaPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorizationid extends js.Object {
  var authorization_id: String = js.native
  var create_time: String = js.native
  var id: String = js.native
  var intent: String = js.native
  var state: String = js.native
}

object Authorizationid {
  @scala.inline
  def apply(authorization_id: String, create_time: String, id: String, intent: String, state: String): Authorizationid = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizationid]
  }
  @scala.inline
  implicit class AuthorizationidOps[Self <: Authorizationid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

