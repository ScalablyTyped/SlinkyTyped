package typingsSlinky.angularAnimate.mod.angularAugmentingMod.animate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimateCssRunner extends js.Object {
  /**
    * Ends (aborts) the animation
    */
  def end(): Unit = js.native
  /**
    * Starts the animation
    *
    * @returns The animation runner with a done function for supplying a callback.
    */
  def start(): IAnimateCssRunnerStart = js.native
}

object IAnimateCssRunner {
  @scala.inline
  def apply(end: () => Unit, start: () => IAnimateCssRunnerStart): IAnimateCssRunner = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IAnimateCssRunner]
  }
  @scala.inline
  implicit class IAnimateCssRunnerOps[Self <: IAnimateCssRunner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => IAnimateCssRunnerStart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

