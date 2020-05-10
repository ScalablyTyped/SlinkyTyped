package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidthOptions> */
@js.native
trait PartialWithWidthOptions extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  var noSSR: js.UndefOr[Boolean] = js.native
  var resizeInterval: js.UndefOr[Double] = js.native
  var withTheme: js.UndefOr[Boolean] = js.native
}

object PartialWithWidthOptions {
  @scala.inline
  def apply(): PartialWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithWidthOptions]
  }
  @scala.inline
  implicit class PartialWithWidthOptionsOps[Self <: PartialWithWidthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialWidth(value: Breakpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSSR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSSR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSSR")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withWithTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.undefined)
        ret
    }
  }
  
}

