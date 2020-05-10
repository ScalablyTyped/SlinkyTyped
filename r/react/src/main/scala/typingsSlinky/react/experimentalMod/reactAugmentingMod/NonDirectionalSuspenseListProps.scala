package typingsSlinky.react.experimentalMod.reactAugmentingMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonDirectionalSuspenseListProps
  extends SuspenseListCommonProps
     with typingsSlinky.react.mod.SuspenseListProps
     with SuspenseListProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.native
}

object NonDirectionalSuspenseListProps {
  @scala.inline
  def apply(children: ReactElement | js.Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
  @scala.inline
  implicit class NonDirectionalSuspenseListPropsOps[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevealOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealOrder")(js.undefined)
        ret
    }
  }
  
}

