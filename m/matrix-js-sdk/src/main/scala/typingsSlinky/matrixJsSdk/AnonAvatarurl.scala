package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvatarurl extends js.Object {
  var avatar_url: js.UndefOr[String] = js.native
  var displayname: js.UndefOr[String] = js.native
}

object AnonAvatarurl {
  @scala.inline
  def apply(): AnonAvatarurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAvatarurl]
  }
  @scala.inline
  implicit class AnonAvatarurlOps[Self <: AnonAvatarurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayname")(js.undefined)
        ret
    }
  }
  
}

