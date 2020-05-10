package typingsSlinky.babylonjs.gradientsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValueGradient extends js.Object {
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  var gradient: Double = js.native
}

object IValueGradient {
  @scala.inline
  def apply(gradient: Double): IValueGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueGradient]
  }
  @scala.inline
  implicit class IValueGradientOps[Self <: IValueGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

