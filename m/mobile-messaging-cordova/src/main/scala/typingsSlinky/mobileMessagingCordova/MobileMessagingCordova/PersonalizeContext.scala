package typingsSlinky.mobileMessagingCordova.MobileMessagingCordova

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizeContext extends js.Object {
  var forceDepersonalize: js.UndefOr[Boolean] = js.native
  var userAttributes: js.UndefOr[Record[String, String]] = js.native
  var userIdentity: UserIdentity = js.native
}

object PersonalizeContext {
  @scala.inline
  def apply(userIdentity: UserIdentity): PersonalizeContext = {
    val __obj = js.Dynamic.literal(userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalizeContext]
  }
  @scala.inline
  implicit class PersonalizeContextOps[Self <: PersonalizeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserIdentity(value: UserIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceDepersonalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDepersonalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDepersonalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDepersonalize")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAttributes(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(js.undefined)
        ret
    }
  }
  
}

