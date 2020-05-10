package typingsSlinky.nivoTooltip.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.nivoTooltip.Pickanytooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableTooltipProps extends js.Object {
  var renderContent: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var rows: js.Array[js.Array[TagMod[Any]]] = js.native
  var theme: Pickanytooltip = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
}

object TableTooltipProps {
  @scala.inline
  def apply(rows: js.Array[js.Array[TagMod[Any]]], theme: Pickanytooltip): TableTooltipProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTooltipProps]
  }
  @scala.inline
  implicit class TableTooltipPropsOps[Self <: TableTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRows(value: js.Array[js.Array[TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: Pickanytooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderContent(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

