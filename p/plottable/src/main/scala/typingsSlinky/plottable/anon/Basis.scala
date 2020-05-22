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

trait Basis extends js.Object {
  var basis: typingsSlinky.plottable.plottableStrings.basis
  var basisClosed: typingsSlinky.plottable.plottableStrings.basisClosed
  var basisOpen: typingsSlinky.plottable.plottableStrings.basisOpen
  var bundle: typingsSlinky.plottable.plottableStrings.bundle
  var cardinal: typingsSlinky.plottable.plottableStrings.cardinal
  var cardinalClosed: typingsSlinky.plottable.plottableStrings.cardinalClosed
  var cardinalOpen: typingsSlinky.plottable.plottableStrings.cardinalOpen
  var linear: typingsSlinky.plottable.plottableStrings.linear
  var linearClosed: typingsSlinky.plottable.plottableStrings.linearClosed
  var monotone: typingsSlinky.plottable.plottableStrings.monotone
  var step: typingsSlinky.plottable.plottableStrings.step
  var stepAfter: typingsSlinky.plottable.plottableStrings.stepAfter
  var stepBefore: typingsSlinky.plottable.plottableStrings.stepBefore
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
}

