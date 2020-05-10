package typingsSlinky.baseui.tableSemanticMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilderProps[RowT] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var data: js.Array[RowT] = js.native
  var horizontalScrollWidth: js.UndefOr[String] = js.native
  var onSort: js.UndefOr[js.Function1[/* columnId */ String, Unit]] = js.native
  var overrides: js.UndefOr[BuilderOverrides] = js.native
  var sortColumn: js.UndefOr[String | Null] = js.native
  var sortOrder: js.UndefOr[ASC | DESC | Null] = js.native
}

object TableBuilderProps {
  @scala.inline
  def apply[RowT](data: js.Array[RowT]): TableBuilderProps[RowT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBuilderProps[RowT]]
  }
  @scala.inline
  implicit class TableBuilderPropsOps[Self[rowt] <: TableBuilderProps[rowt], RowT] (val x: Self[RowT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RowT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RowT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RowT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RowT] with Other]
    @scala.inline
    def withData(value: js.Array[RowT]): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalScrollWidth(value: String): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalScrollWidth: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: /* columnId */ String => Unit): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSort: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: BuilderOverrides): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumn(value: String): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumn: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumnNull: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(null)
        ret
    }
    @scala.inline
    def withSortOrder(value: ASC | DESC): Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrderNull: Self[RowT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(null)
        ret
    }
  }
  
}

