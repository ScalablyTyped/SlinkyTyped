package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXaxis extends js.Object {
  var `x-axis`: AnonRootNodeNameString = js.native
  var `y-axis`: AnonRootNodeNameString = js.native
}

object AnonXaxis {
  @scala.inline
  def apply(`x-axis`: AnonRootNodeNameString, `y-axis`: AnonRootNodeNameString): AnonXaxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.updateDynamic("y-axis")(`y-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXaxis]
  }
  @scala.inline
  implicit class AnonXaxisOps[Self <: AnonXaxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-axis`(value: AnonRootNodeNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withY-axis`(value: AnonRootNodeNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-axis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

