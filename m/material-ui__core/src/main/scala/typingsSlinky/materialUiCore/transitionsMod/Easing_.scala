package typingsSlinky.materialUiCore.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing_ extends js.Object {
  var easeIn: String = js.native
  var easeInOut: String = js.native
  var easeOut: String = js.native
  var sharp: String = js.native
}

object Easing_ {
  @scala.inline
  def apply(easeIn: String, easeInOut: String, easeOut: String, sharp: String): Easing_ = {
    val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInOut = easeInOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], sharp = sharp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing_]
  }
  @scala.inline
  implicit class Easing_Ops[Self <: Easing_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEaseIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

