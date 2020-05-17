package typingsSlinky.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentsSpacing extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.native
  var breakpoints: js.UndefOr[js.Object] = js.native
  var components: js.UndefOr[TabbedView] = js.native
  var spacing: js.UndefOr[js.Object] = js.native
}

object ComponentsSpacing {
  @scala.inline
  def apply(): ComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsSpacing]
  }
  @scala.inline
  implicit class ComponentsSpacingOps[Self <: ComponentsSpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpoints(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: TabbedView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
  }
  
}

