package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepDef extends js.Object {
  var flags: ɵDepFlags = js.native
  var token: js.Any = js.native
  var tokenKey: String = js.native
}

object DepDef {
  @scala.inline
  def apply(flags: ɵDepFlags, token: js.Any, tokenKey: String): DepDef = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenKey = tokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepDef]
  }
  @scala.inline
  implicit class DepDefOps[Self <: DepDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: ɵDepFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

