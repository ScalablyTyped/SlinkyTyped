package typingsSlinky.gyronorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbsolute extends js.Object {
  var absolute: Double = js.native
  var alpha: Double = js.native
  var beta: Double = js.native
  var gamma: Double = js.native
}

object AnonAbsolute {
  @scala.inline
  def apply(absolute: Double, alpha: Double, beta: Double, gamma: Double): AnonAbsolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolute]
  }
  @scala.inline
  implicit class AnonAbsoluteOps[Self <: AnonAbsolute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGamma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

