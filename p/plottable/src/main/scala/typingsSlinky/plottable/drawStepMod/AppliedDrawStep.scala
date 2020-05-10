package typingsSlinky.plottable.drawStepMod

import typingsSlinky.plottable.animatorMod.IAnimator
import typingsSlinky.plottable.interfacesMod.AttributeToAppliedProjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppliedDrawStep extends js.Object {
  var animator: IAnimator = js.native
  var attrToAppliedProjector: AttributeToAppliedProjector = js.native
}

object AppliedDrawStep {
  @scala.inline
  def apply(animator: IAnimator, attrToAppliedProjector: AttributeToAppliedProjector): AppliedDrawStep = {
    val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToAppliedProjector = attrToAppliedProjector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppliedDrawStep]
  }
  @scala.inline
  implicit class AppliedDrawStepOps[Self <: AppliedDrawStep] (val x: Self) extends AnyVal {
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
    def withAttrToAppliedProjector(value: AttributeToAppliedProjector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrToAppliedProjector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

