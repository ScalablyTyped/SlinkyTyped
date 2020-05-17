package typingsSlinky.expo.anon

import typingsSlinky.expo.authSessionMod.AuthSessionResult
import typingsSlinky.expo.expoStrings.cancel
import typingsSlinky.expo.expoStrings.dismiss
import typingsSlinky.expo.expoStrings.locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends AuthSessionResult {
  var `type`: cancel | dismiss | locked = js.native
}

object Type {
  @scala.inline
  def apply(`type`: cancel | dismiss | locked): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: cancel | dismiss | locked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

