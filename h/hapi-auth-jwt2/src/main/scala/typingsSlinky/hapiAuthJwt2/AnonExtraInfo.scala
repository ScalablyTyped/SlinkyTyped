package typingsSlinky.hapiAuthJwt2

import typingsSlinky.hapiAuthJwt2.mod.ExtraInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[ExtraInfo] = js.native
  var key: String | js.Array[String] = js.native
}

object AnonExtraInfo {
  @scala.inline
  def apply(key: String | js.Array[String]): AnonExtraInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraInfo]
  }
  @scala.inline
  implicit class AnonExtraInfoOps[Self <: AnonExtraInfo] (val x: Self) extends AnyVal {
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
    def withExtraInfo(value: ExtraInfo): Self = {
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

