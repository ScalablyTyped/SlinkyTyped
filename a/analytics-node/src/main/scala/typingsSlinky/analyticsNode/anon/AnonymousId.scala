package typingsSlinky.analyticsNode.anon

import typingsSlinky.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonymousId extends Identity {
  var anonymousId: String | Double = js.native
  var userId: js.UndefOr[String | Double] = js.native
}

object AnonymousId {
  @scala.inline
  def apply(anonymousId: String | Double): AnonymousId = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousId]
  }
  @scala.inline
  implicit class AnonymousIdOps[Self <: AnonymousId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymousId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymousId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String | Double): Self = {
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

