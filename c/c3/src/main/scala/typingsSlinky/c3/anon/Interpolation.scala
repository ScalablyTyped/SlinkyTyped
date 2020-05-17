package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpolation extends js.Object {
  var interpolation: js.UndefOr[Type] = js.native
}

object Interpolation {
  @scala.inline
  def apply(): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interpolation]
  }
  @scala.inline
  implicit class InterpolationOps[Self <: Interpolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterpolation(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
  }
  
}

