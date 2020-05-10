package typingsSlinky.plugapi.mod.Enum

import typingsSlinky.plugapi.plugapiStrings.l
import typingsSlinky.plugapi.plugapiStrings.m
import typingsSlinky.plugapi.plugapiStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mute extends js.Object {
  var LONG: l = js.native
  var MEDIUM: m = js.native
  var SHORT: s = js.native
}

object Mute {
  @scala.inline
  def apply(LONG: l, MEDIUM: m, SHORT: s): Mute = {
    val __obj = js.Dynamic.literal(LONG = LONG.asInstanceOf[js.Any], MEDIUM = MEDIUM.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mute]
  }
  @scala.inline
  implicit class MuteOps[Self <: Mute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLONG(value: l): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LONG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIUM(value: m): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORT(value: s): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

