package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.anon.Accuracy
import typingsSlinky.jweixin.jweixinStrings.gcj02
import typingsSlinky.jweixin.jweixinStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgetLocation extends BaseParams {
  var `type`: wgs84 | gcj02 = js.native
   // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: Accuracy): Unit = js.native
}

object IgetLocation {
  @scala.inline
  def apply(success: Accuracy => Unit, `type`: wgs84 | gcj02): IgetLocation = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgetLocation]
  }
  @scala.inline
  implicit class IgetLocationOps[Self <: IgetLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: Accuracy => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: wgs84 | gcj02): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

