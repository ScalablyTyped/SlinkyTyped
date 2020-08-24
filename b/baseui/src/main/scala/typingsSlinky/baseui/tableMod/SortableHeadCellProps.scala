package typingsSlinky.baseui.tableMod

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.HeadCell
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableHeadCellProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDirection(value: ASC | DESC): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionNull: Self = this.set("direction", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFillClickTarget(value: Boolean): Self = this.set("fillClickTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillClickTarget: Self = this.set("fillClickTarget", js.undefined)
    @scala.inline
    def setOnSort(value: () => _): Self = this.set("onSort", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    @scala.inline
    def setOverrides(value: HeadCell): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

