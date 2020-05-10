package typingsSlinky.frctlFractal

import typingsSlinky.frctlFractal.mod.Fractal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFractal extends js.Object {
  var fractal: Fractal_ = js.native
}

object AnonFractal {
  @scala.inline
  def apply(fractal: Fractal_): AnonFractal = {
    val __obj = js.Dynamic.literal(fractal = fractal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFractal]
  }
  @scala.inline
  implicit class AnonFractalOps[Self <: AnonFractal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFractal(value: Fractal_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

