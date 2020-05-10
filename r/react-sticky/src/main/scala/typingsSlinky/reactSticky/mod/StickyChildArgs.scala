package typingsSlinky.reactSticky.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyChildArgs extends js.Object {
  var calculatedHeight: Double = js.native
  var distanceFromBottom: Double = js.native
  var distanceFromTop: Double = js.native
  var isSticky: Boolean = js.native
  var style: CSSProperties = js.native
  var wasSticky: Boolean = js.native
}

object StickyChildArgs {
  @scala.inline
  def apply(
    calculatedHeight: Double,
    distanceFromBottom: Double,
    distanceFromTop: Double,
    isSticky: Boolean,
    style: CSSProperties,
    wasSticky: Boolean
  ): StickyChildArgs = {
    val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight.asInstanceOf[js.Any], distanceFromBottom = distanceFromBottom.asInstanceOf[js.Any], distanceFromTop = distanceFromTop.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], wasSticky = wasSticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyChildArgs]
  }
  @scala.inline
  implicit class StickyChildArgsOps[Self <: StickyChildArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculatedHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFromTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasSticky")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

