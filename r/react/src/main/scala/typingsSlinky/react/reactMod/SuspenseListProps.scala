package typingsSlinky.react.reactMod

import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.react.experimentalMod.reactMod.DirectionalSuspenseListProps
  - typings.react.experimentalMod.reactMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends js.Object

object SuspenseListProps {
  @scala.inline
  def DirectionalSuspenseListProps(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: forwards | backwards,
    tail: typingsSlinky.react.experimentalMod.reactMod.SuspenseListTailMode = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
  @scala.inline
  def NonDirectionalSuspenseListProps(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: Exclude[
      typingsSlinky.react.experimentalMod.reactMod.SuspenseListRevealOrder, 
      forwards | backwards
    ] = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
}

