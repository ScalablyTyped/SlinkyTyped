package typingsSlinky.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatarurl extends js.Object {
  var avatar_url: js.UndefOr[String] = js.native
  var displayname: js.UndefOr[String] = js.native
}

object Avatarurl {
  @scala.inline
  def apply(): Avatarurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatarurl]
  }
  @scala.inline
  implicit class AvatarurlOps[Self <: Avatarurl] (val x: Self) extends AnyVal {
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

