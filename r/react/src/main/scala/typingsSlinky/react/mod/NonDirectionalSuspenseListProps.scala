package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.backwards
import typingsSlinky.react.reactStrings.forwards
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonDirectionalSuspenseListProps
  extends typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.native
}

object NonDirectionalSuspenseListProps {
  @scala.inline
  def apply(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): NonDirectionalSuspenseListProps = {
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
    def withRevealOrder(
      value: Exclude[
          typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
          forwards | backwards
        ]
    ): Self = {
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

