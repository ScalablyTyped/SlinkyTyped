package typingsSlinky.reactVerticalTimelineComponent.mod

import typingsSlinky.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typingsSlinky.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalTimelineProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var layout: js.UndefOr[`1-column` | `2-columns`] = js.native
}

object VerticalTimelineProps {
  @scala.inline
  def apply(): VerticalTimelineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalTimelineProps]
  }
  @scala.inline
  implicit class VerticalTimelinePropsOps[Self <: VerticalTimelineProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: `1-column` | `2-columns`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
  }
  
}

