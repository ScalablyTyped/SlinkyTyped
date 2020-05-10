package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJiggle extends js.Object {
  var duration: js.UndefOr[String] = js.native
  var jiggle: js.UndefOr[AnonDuration] = js.native
}

object AnonJiggle {
  @scala.inline
  def apply(): AnonJiggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonJiggle]
  }
  @scala.inline
  implicit class AnonJiggleOps[Self <: AnonJiggle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withJiggle(value: AnonDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJiggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jiggle")(js.undefined)
        ret
    }
  }
  
}

