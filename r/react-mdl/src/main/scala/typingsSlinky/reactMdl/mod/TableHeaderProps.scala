package typingsSlinky.reactMdl.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeaderProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with MDLDOMAttributes[TableHeader] {
  var cellFormatter: js.UndefOr[
    js.Function3[/* value */ js.Any, /* row */ js.Any, /* index */ Double, TagMod[Any]]
  ] = js.native
  var name: String = js.native
  var nosort: js.UndefOr[Boolean] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[TableHeader], /* name */ String, _]] = js.native
  var sortFn: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean, Double]] = js.native
  var title: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[TagMod[Any]] = js.native
}

object TableHeaderProps {
  @scala.inline
  def apply(name: String): TableHeaderProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
  @scala.inline
  implicit class TableHeaderPropsOps[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellFormatter(value: (/* value */ js.Any, /* row */ js.Any, /* index */ Double) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCellFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withNosort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNosort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosort")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* e */ SyntheticMouseEvent[TableHeader], /* name */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFn(value: (/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSortFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    @scala.inline
    def withTooltipReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

