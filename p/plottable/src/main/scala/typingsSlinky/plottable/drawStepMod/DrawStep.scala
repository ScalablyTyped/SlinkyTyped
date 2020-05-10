package typingsSlinky.plottable.drawStepMod

import typingsSlinky.plottable.animatorMod.IAnimator
import typingsSlinky.plottable.interfacesMod.AttributeToProjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawStep extends js.Object {
  var animator: IAnimator = js.native
  var attrToProjector: AttributeToProjector = js.native
}

object DrawStep {
  @scala.inline
  def apply(animator: IAnimator, attrToProjector: AttributeToProjector): DrawStep = {
    val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToProjector = attrToProjector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawStep]
  }
  @scala.inline
  implicit class DrawStepOps[Self <: DrawStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimator(value: IAnimator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrToProjector(value: AttributeToProjector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrToProjector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

