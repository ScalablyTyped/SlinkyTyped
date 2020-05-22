package typingsSlinky.plottable.drawStepMod

import typingsSlinky.plottable.animatorMod.IAnimator
import typingsSlinky.plottable.interfacesMod.AttributeToProjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawStep extends js.Object {
  var animator: IAnimator
  var attrToProjector: AttributeToProjector
}

object DrawStep {
  @scala.inline
  def apply(animator: IAnimator, attrToProjector: AttributeToProjector): DrawStep = {
    val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToProjector = attrToProjector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawStep]
  }
}

