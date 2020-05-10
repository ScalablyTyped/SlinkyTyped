package typingsSlinky.cathoQuantum.gridMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.Anon7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps extends js.Object {
  var children: js.Array[TagMod[Any]] | TagMod[Any] = js.native
  var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.native
  var `no-gutters`: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Anon7] = js.native
}

object RowProps {
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: BreakpointsType | js.Array[BreakpointsType]): Self = {
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
    def withTheme(value: Anon7): Self = {
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
  }
  
}

