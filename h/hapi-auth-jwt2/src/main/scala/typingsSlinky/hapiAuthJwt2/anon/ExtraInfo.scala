package typingsSlinky.hapiAuthJwt2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[typingsSlinky.hapiAuthJwt2.mod.ExtraInfo] = js.native
  var key: String | js.Array[String] = js.native
}

object ExtraInfo {
  @scala.inline
  def apply(key: String | js.Array[String]): ExtraInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraInfo]
  }
  @scala.inline
  implicit class ExtraInfoOps[Self <: ExtraInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraInfo(value: typingsSlinky.hapiAuthJwt2.mod.ExtraInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraInfo")(js.undefined)
        ret
    }
  }
  
}

