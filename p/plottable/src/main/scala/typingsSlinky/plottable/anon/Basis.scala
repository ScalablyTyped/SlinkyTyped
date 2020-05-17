package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.basis
import typingsSlinky.plottable.plottableStrings.basisClosed
import typingsSlinky.plottable.plottableStrings.basisOpen
import typingsSlinky.plottable.plottableStrings.bundle
import typingsSlinky.plottable.plottableStrings.cardinal
import typingsSlinky.plottable.plottableStrings.cardinalClosed
import typingsSlinky.plottable.plottableStrings.cardinalOpen
import typingsSlinky.plottable.plottableStrings.linear
import typingsSlinky.plottable.plottableStrings.linearClosed
import typingsSlinky.plottable.plottableStrings.monotone
import typingsSlinky.plottable.plottableStrings.step
import typingsSlinky.plottable.plottableStrings.stepAfter
import typingsSlinky.plottable.plottableStrings.stepBefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basis extends js.Object {
  var basis: typingsSlinky.plottable.plottableStrings.basis = js.native
  var basisClosed: typingsSlinky.plottable.plottableStrings.basisClosed = js.native
  var basisOpen: typingsSlinky.plottable.plottableStrings.basisOpen = js.native
  var bundle: typingsSlinky.plottable.plottableStrings.bundle = js.native
  var cardinal: typingsSlinky.plottable.plottableStrings.cardinal = js.native
  var cardinalClosed: typingsSlinky.plottable.plottableStrings.cardinalClosed = js.native
  var cardinalOpen: typingsSlinky.plottable.plottableStrings.cardinalOpen = js.native
  var linear: typingsSlinky.plottable.plottableStrings.linear = js.native
  var linearClosed: typingsSlinky.plottable.plottableStrings.linearClosed = js.native
  var monotone: typingsSlinky.plottable.plottableStrings.monotone = js.native
  var step: typingsSlinky.plottable.plottableStrings.step = js.native
  var stepAfter: typingsSlinky.plottable.plottableStrings.stepAfter = js.native
  var stepBefore: typingsSlinky.plottable.plottableStrings.stepBefore = js.native
}

object Basis {
  @scala.inline
  def apply(
    basis: basis,
    basisClosed: basisClosed,
    basisOpen: basisOpen,
    bundle: bundle,
    cardinal: cardinal,
    cardinalClosed: cardinalClosed,
    cardinalOpen: cardinalOpen,
    linear: linear,
    linearClosed: linearClosed,
    monotone: monotone,
    step: step,
    stepAfter: stepAfter,
    stepBefore: stepBefore
  ): Basis = {
    val __obj = js.Dynamic.literal(basis = basis.asInstanceOf[js.Any], basisClosed = basisClosed.asInstanceOf[js.Any], basisOpen = basisOpen.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], cardinal = cardinal.asInstanceOf[js.Any], cardinalClosed = cardinalClosed.asInstanceOf[js.Any], cardinalOpen = cardinalOpen.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], linearClosed = linearClosed.asInstanceOf[js.Any], monotone = monotone.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepAfter = stepAfter.asInstanceOf[js.Any], stepBefore = stepBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basis]
  }
  @scala.inline
  implicit class BasisOps[Self <: Basis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasis(value: basis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasisClosed(value: basisClosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basisClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasisOpen(value: basisOpen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basisOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundle(value: bundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardinal(value: cardinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardinalClosed(value: cardinalClosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinalClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardinalOpen(value: cardinalOpen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinalOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearClosed(value: linearClosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonotone(value: monotone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monotone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: step): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepAfter(value: stepAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepBefore(value: stepBefore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepBefore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

