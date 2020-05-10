package typingsSlinky.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  userId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait userIdnumberBaseRequestOp
  extends /* key */ StringDictionary[js.Any] {
  var sudo: js.UndefOr[String | Double] = js.native
  var userId: js.UndefOr[Double] = js.native
}

object userIdnumberBaseRequestOp {
  @scala.inline
  def apply(): userIdnumberBaseRequestOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[userIdnumberBaseRequestOp]
  }
  @scala.inline
  implicit class userIdnumberBaseRequestOpOps[Self <: userIdnumberBaseRequestOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: Double): Self = {
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

