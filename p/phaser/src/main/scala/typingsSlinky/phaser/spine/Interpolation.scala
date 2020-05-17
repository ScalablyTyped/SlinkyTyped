package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpolation extends js.Object {
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double = js.native
  /* protected */ def applyInternal(a: Double): Double = js.native
}

object Interpolation {
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double): Interpolation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal))
    __obj.asInstanceOf[Interpolation]
  }
  @scala.inline
  implicit class InterpolationOps[Self <: Interpolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withApplyInternal(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyInternal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

