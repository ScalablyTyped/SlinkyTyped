package typingsSlinky.blueprintjsCore.collapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollapseState extends js.Object {
  /** The state the element is currently in. */
  var animationState: AnimationStates = js.native
  /** The height that should be used for the content animations. This is a CSS value, not just a number. */
  var height: js.UndefOr[String] = js.native
  /**
    * The most recent non-zero height (once a height has been measured upon first open; it is undefined until then)
    */
  var heightWhenOpen: js.UndefOr[Double] = js.native
}

object ICollapseState {
  @scala.inline
  def apply(animationState: AnimationStates): ICollapseState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapseState]
  }
  @scala.inline
  implicit class ICollapseStateOps[Self <: ICollapseState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationState(value: AnimationStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightWhenOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightWhenOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightWhenOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightWhenOpen")(js.undefined)
        ret
    }
  }
  
}

