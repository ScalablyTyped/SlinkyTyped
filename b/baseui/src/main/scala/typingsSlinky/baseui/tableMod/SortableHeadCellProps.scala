package typingsSlinky.baseui.tableMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.HeadCell
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableHeadCellProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var direction: ASC | DESC | Null = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fillClickTarget: js.UndefOr[Boolean] = js.native
  var onSort: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[HeadCell] = js.native
  var title: String = js.native
}

object SortableHeadCellProps {
  @scala.inline
  def apply(title: String): SortableHeadCellProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableHeadCellProps]
  }
  @scala.inline
  implicit class SortableHeadCellPropsOps[Self <: SortableHeadCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
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
    def withDirection(value: ASC | DESC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(null)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFillClickTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillClickTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillClickTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillClickTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: HeadCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

