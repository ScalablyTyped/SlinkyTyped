package typingsSlinky.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NickName extends js.Object {
  	// 用户昵称
  var avatar: String = js.native
  var nickName: String = js.native
}

object NickName {
  @scala.inline
  def apply(avatar: String, nickName: String): NickName = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NickName]
  }
  @scala.inline
  implicit class NickNameOps[Self <: NickName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

