package typingsSlinky.atlassianCrowdClient.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionObj extends js.Object {
  val `created-date`: Double = js.native
  val `expiry-date`: Double = js.native
  val token: String = js.native
}

object SessionObj {
  @scala.inline
  def apply(`created-date`: Double, `expiry-date`: Double, token: String): SessionObj = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("created-date")(`created-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("expiry-date")(`expiry-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionObj]
  }
  @scala.inline
  implicit class SessionObjOps[Self <: SessionObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCreated-date`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExpiry-date`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

