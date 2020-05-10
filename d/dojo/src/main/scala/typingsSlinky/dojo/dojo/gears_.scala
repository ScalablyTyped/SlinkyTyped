package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/gears.html
  *
  * TODOC
  *
  */
@js.native
trait gears_ extends js.Object {
  /**
    * True if client is using Google Gears
    *
    */
  var available: js.Object = js.native
}

object gears_ {
  @scala.inline
  def apply(available: js.Object): gears_ = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any])
    __obj.asInstanceOf[gears_]
  }
  @scala.inline
  implicit class gears_Ops[Self <: gears_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

