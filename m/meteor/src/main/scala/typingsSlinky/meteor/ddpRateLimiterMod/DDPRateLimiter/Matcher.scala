package typingsSlinky.meteor.ddpRateLimiterMod.DDPRateLimiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.native
  var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.native
  var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.native
  var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.native
  var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.native
}

object Matcher {
  @scala.inline
  def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientAddressFunction1(value: /* clientAddress */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClientAddress(value: String | (js.Function1[/* clientAddress */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionIdFunction1(value: /* connectionId */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnectionId(value: String | (js.Function1[/* connectionId */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFunction1(value: /* name */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String | (js.Function1[/* name */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeFunction1(value: /* type */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: String | (js.Function1[/* type */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIdFunction1(value: /* userId */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUserId(value: String | (js.Function1[/* userId */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

