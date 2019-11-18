package typingsSlinky.react.experimentalMod.reactMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDirectionalSuspenseListProps
  extends SuspenseListCommonProps
     with SuspenseListProps
     with typingsSlinky.react.reactMod.SuspenseListProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.undefined
}

object NonDirectionalSuspenseListProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Iterable[ReactElement],
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null
  ): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
}

