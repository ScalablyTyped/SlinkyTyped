package typingsSlinky.plugapi.mod.Enum

import typingsSlinky.plugapi.plugapiStrings.d
import typingsSlinky.plugapi.plugapiStrings.f
import typingsSlinky.plugapi.plugapiStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ban extends js.Object {
  var DAY: d = js.native
  var HOUR: h = js.native
  var PERMA: f = js.native
}

object Ban {
  @scala.inline
  def apply(DAY: d, HOUR: h, PERMA: f): Ban = {
    val __obj = js.Dynamic.literal(DAY = DAY.asInstanceOf[js.Any], HOUR = HOUR.asInstanceOf[js.Any], PERMA = PERMA.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ban]
  }
  @scala.inline
  implicit class BanOps[Self <: Ban] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDAY(value: d): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOUR(value: h): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOUR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPERMA(value: f): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMA")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

