package typingsSlinky.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLua extends js.Object {
  var lua: js.UndefOr[String] = js.native
  var numberOfKeys: js.UndefOr[Double] = js.native
}

object AnonLua {
  @scala.inline
  def apply(): AnonLua = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLua]
  }
  @scala.inline
  implicit class AnonLuaOps[Self <: AnonLua] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLua(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lua")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLua: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lua")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfKeys")(js.undefined)
        ret
    }
  }
  
}

