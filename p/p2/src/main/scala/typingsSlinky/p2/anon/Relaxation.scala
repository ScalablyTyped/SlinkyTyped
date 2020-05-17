package typingsSlinky.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relaxation extends js.Object {
  var relaxation: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
}

object Relaxation {
  @scala.inline
  def apply(): Relaxation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relaxation]
  }
  @scala.inline
  implicit class RelaxationOps[Self <: Relaxation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxation")(js.undefined)
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(js.undefined)
        ret
    }
  }
  
}

