package typingsSlinky.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.gears.html
  *
  * TODOC
  *
  */
@js.native
trait gears extends js.Object {
  /**
    * True if client is using Google Gears
    *
    */
  var available: js.Object = js.native
}

object gears {
  @scala.inline
  def apply(available: js.Object): gears = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any])
    __obj.asInstanceOf[gears]
  }
  @scala.inline
  implicit class gearsOps[Self <: gears] (val x: Self) extends AnyVal {
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

