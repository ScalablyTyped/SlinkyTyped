package typingsSlinky.pendoIoBrowser

import typingsSlinky.pendoIoBrowser.pendo.Guide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuto extends js.Object {
  var auto: js.Array[Guide] = js.native
  var `override`: js.Array[Guide] = js.native
}

object AnonAuto {
  @scala.inline
  def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): AnonAuto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuto]
  }
  @scala.inline
  implicit class AnonAutoOps[Self <: AnonAuto] (val x: Self) extends AnyVal {
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

