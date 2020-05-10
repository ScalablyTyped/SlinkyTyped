package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoundRectangleOptions extends js.Object {
  var resolution: js.UndefOr[Double] = js.native
  var roundradius: Double = js.native
}

object IRoundRectangleOptions {
  @scala.inline
  def apply(roundradius: Double): IRoundRectangleOptions = {
    val __obj = js.Dynamic.literal(roundradius = roundradius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoundRectangleOptions]
  }
  @scala.inline
  implicit class IRoundRectangleOptionsOps[Self <: IRoundRectangleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoundradius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundradius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
  }
  
}

