package typingsSlinky.reReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDependencies[C, D] extends js.Object {
  var dependencies: D = js.native
  var resultFunc: C = js.native
  def recomputations(): Double = js.native
  def resetRecomputations(): Double = js.native
}

object AnonDependencies {
  @scala.inline
  def apply[C, D](dependencies: D, recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): AnonDependencies[C, D] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDependencies[C, D]]
  }
  @scala.inline
  implicit class AnonDependenciesOps[Self[c, d] <: AnonDependencies[c, d], C, D] (val x: Self[C, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, D]) with Other]
    @scala.inline
    def withDependencies(value: D): Self[C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecomputations(value: () => Double): Self[C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recomputations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetRecomputations(value: () => Double): Self[C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetRecomputations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResultFunc(value: C): Self[C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFunc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

