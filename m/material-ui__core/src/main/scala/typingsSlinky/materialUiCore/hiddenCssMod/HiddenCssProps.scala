package typingsSlinky.materialUiCore.hiddenCssMod

import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenCssProps extends js.Object {
  var lgDown: js.UndefOr[Boolean] = js.native
  var lgUp: js.UndefOr[Boolean] = js.native
  var mdDown: js.UndefOr[Boolean] = js.native
  var mdUp: js.UndefOr[Boolean] = js.native
  var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
  var smDown: js.UndefOr[Boolean] = js.native
  var smUp: js.UndefOr[Boolean] = js.native
  var xlDown: js.UndefOr[Boolean] = js.native
  var xlUp: js.UndefOr[Boolean] = js.native
  var xsDown: js.UndefOr[Boolean] = js.native
  var xsUp: js.UndefOr[Boolean] = js.native
}

object HiddenCssProps {
  @scala.inline
  def apply(): HiddenCssProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenCssProps]
  }
  @scala.inline
  implicit class HiddenCssPropsOps[Self <: HiddenCssProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLgDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgDown")(js.undefined)
        ret
    }
    @scala.inline
    def withLgUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgUp")(js.undefined)
        ret
    }
    @scala.inline
    def withMdDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdDown")(js.undefined)
        ret
    }
    @scala.inline
    def withMdUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly(value: Breakpoint | js.Array[Breakpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withSmDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smDown")(js.undefined)
        ret
    }
    @scala.inline
    def withSmUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smUp")(js.undefined)
        ret
    }
    @scala.inline
    def withXlDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlDown")(js.undefined)
        ret
    }
    @scala.inline
    def withXlUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlUp")(js.undefined)
        ret
    }
    @scala.inline
    def withXsDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsDown")(js.undefined)
        ret
    }
    @scala.inline
    def withXsUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsUp")(js.undefined)
        ret
    }
  }
  
}

