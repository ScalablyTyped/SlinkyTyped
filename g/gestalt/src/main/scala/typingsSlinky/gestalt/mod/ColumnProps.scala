package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.native
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.native
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.native
  var span: UnsignedUpTo12 = js.native
}

object ColumnProps {
  @scala.inline
  def apply(span: UnsignedUpTo12): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  @scala.inline
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpan(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
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
    def withLgSpan(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withMdSpan(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSmSpan(value: UnsignedUpTo12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smSpan")(js.undefined)
        ret
    }
  }
  
}

