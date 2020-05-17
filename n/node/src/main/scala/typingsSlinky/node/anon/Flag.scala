package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flag extends js.Object {
  var encoding: js.UndefOr[Null] = js.native
  var flag: js.UndefOr[String] = js.native
}

object Flag {
  @scala.inline
  def apply(): Flag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flag]
  }
  @scala.inline
  implicit class FlagOps[Self <: Flag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
  }
  
}

