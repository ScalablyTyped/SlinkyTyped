package typingsSlinky.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait axis extends axisOptions {
  var options: axisOptions = js.native
  def c2p(canvasPoint: canvasPoint): point = js.native
  def p2c(point: point): canvasPoint = js.native
}

object axis {
  @scala.inline
  def apply(c2p: canvasPoint => point, options: axisOptions, p2c: point => canvasPoint): axis = {
    val __obj = js.Dynamic.literal(c2p = js.Any.fromFunction1(c2p), options = options.asInstanceOf[js.Any], p2c = js.Any.fromFunction1(p2c))
    __obj.asInstanceOf[axis]
  }
  @scala.inline
  implicit class axisOps[Self <: axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC2p(value: canvasPoint => point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c2p")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: axisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP2c(value: point => canvasPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2c")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

