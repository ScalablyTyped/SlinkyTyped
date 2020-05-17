package typingsSlinky.cathoQuantum.gridMod

import typingsSlinky.cathoQuantum.anon.BreakpointsComponents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProps extends js.Object {
  var fluid: js.UndefOr[Boolean] = js.native
  var hide: js.UndefOr[BreakpointsType | js.Array[String]] = js.native
  var `no-gutters`: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[BreakpointsComponents] = js.native
  var withBreakpoints: js.UndefOr[Boolean] = js.native
}

object ContainerProps {
  @scala.inline
  def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  @scala.inline
  implicit class ContainerPropsOps[Self <: ContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFluid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: BreakpointsType | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-gutters`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-gutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-gutters`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-gutters")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: BreakpointsComponents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWithBreakpoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBreakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBreakpoints")(js.undefined)
        ret
    }
  }
  
}

