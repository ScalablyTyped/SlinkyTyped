package typingsSlinky.pendoIoBrowser.anon

import typingsSlinky.pendoIoBrowser.pendo.Guide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auto extends js.Object {
  var auto: js.Array[Guide] = js.native
  var `override`: js.Array[Guide] = js.native
}

object Auto {
  @scala.inline
  def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): Auto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auto]
  }
  @scala.inline
  implicit class AutoOps[Self <: Auto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: js.Array[Guide]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverride(value: js.Array[Guide]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

