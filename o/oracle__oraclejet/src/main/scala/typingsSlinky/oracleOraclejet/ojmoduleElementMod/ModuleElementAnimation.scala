package typingsSlinky.oracleOraclejet.ojmoduleElementMod

import typingsSlinky.oracleOraclejet.AnonInsertNewView
import typingsSlinky.oracleOraclejet.AnonIsInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleElementAnimation extends js.Object {
  def animate(context: AnonInsertNewView): js.Promise[_] = js.native
  def canAnimate(context: AnonIsInitial): Boolean = js.native
  def prepareAnimation(context: AnonIsInitial): js.Object = js.native
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: AnonInsertNewView => js.Promise[_],
    canAnimate: AnonIsInitial => Boolean,
    prepareAnimation: AnonIsInitial => js.Object
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), canAnimate = js.Any.fromFunction1(canAnimate), prepareAnimation = js.Any.fromFunction1(prepareAnimation))
    __obj.asInstanceOf[ModuleElementAnimation]
  }
  @scala.inline
  implicit class ModuleElementAnimationOps[Self <: ModuleElementAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: AnonInsertNewView => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanAnimate(value: AnonIsInitial => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAnimate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrepareAnimation(value: AnonIsInitial => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareAnimation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

