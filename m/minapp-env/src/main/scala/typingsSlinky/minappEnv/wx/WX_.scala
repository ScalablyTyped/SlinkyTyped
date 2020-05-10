package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.AnonCallFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WX_ extends js.Object {
  var cloud: AnonCallFunction = js.native
}

object WX_ {
  @scala.inline
  def apply(cloud: AnonCallFunction): WX_ = {
    val __obj = js.Dynamic.literal(cloud = cloud.asInstanceOf[js.Any])
    __obj.asInstanceOf[WX_]
  }
  @scala.inline
  implicit class WX_Ops[Self <: WX_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloud(value: AnonCallFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

