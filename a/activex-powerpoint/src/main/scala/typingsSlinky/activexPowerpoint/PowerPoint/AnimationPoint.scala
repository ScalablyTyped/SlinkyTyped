package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPoint extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Formula: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AnimationPoint_typekey")
  var PowerPointDotAnimationPoint_typekey: AnimationPoint = js.native
  var Time: Double = js.native
  var Value: js.Any = js.native
  def Delete(): Unit = js.native
}

object AnimationPoint {
  @scala.inline
  def apply(
    Application: Application,
    Delete: () => Unit,
    Formula: String,
    Parent: js.Any,
    PowerPointDotAnimationPoint_typekey: AnimationPoint,
    Time: Double,
    Value: js.Any
  ): AnimationPoint = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationPoint_typekey")(PowerPointDotAnimationPoint_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPoint]
  }
  @scala.inline
  implicit class AnimationPointOps[Self <: AnimationPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotAnimationPoint_typekey(value: AnimationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.AnimationPoint_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

