package typingsSlinky.react.reactMod

import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDirectionalSuspenseListProps
  extends typingsSlinky.react.experimentalMod.reactMod.SuspenseListCommonProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typingsSlinky.react.experimentalMod.reactMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.undefined
}

object NonDirectionalSuspenseListProps {
  @scala.inline
  def apply(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: Exclude[
      typingsSlinky.react.experimentalMod.reactMod.SuspenseListRevealOrder, 
      forwards | backwards
    ] = null
  ): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
}

