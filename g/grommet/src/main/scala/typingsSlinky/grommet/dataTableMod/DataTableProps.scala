package typingsSlinky.grommet.dataTableMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.grommet.AnonAlign
import typingsSlinky.grommet.AnonBackground
import typingsSlinky.grommet.AnonBody
import typingsSlinky.grommet.AnonDatum
import typingsSlinky.grommet.AnonDirection
import typingsSlinky.grommet.AnonExpand
import typingsSlinky.grommet.AnonFooter
import typingsSlinky.grommet.AnonHeader
import typingsSlinky.grommet.grommetStrings.all
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.none
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var background: js.UndefOr[String | AnonBody] = js.native
  var border: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonFooter] = js.native
  var columns: js.UndefOr[js.Array[AnonAlign]] = js.native
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var groupBy: js.UndefOr[String | AnonExpand] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onClickRow: js.UndefOr[
    js.Function1[(/* event */ AnonDatum) | (/* event */ SyntheticMouseEvent[Element]), Unit]
  ] = js.native
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.native
  var onSort: js.UndefOr[js.Function1[/* sort */ AnonDirection, Unit]] = js.native
  var pad: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | AnonHeader | String] = js.native
  var primaryKey: js.UndefOr[String] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var resizeable: js.UndefOr[Boolean] = js.native
  var rowProps: js.UndefOr[StringDictionary[AnonBackground]] = js.native
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  var sort: js.UndefOr[AnonDirection] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
}

object DataTableProps {
  @scala.inline
  def apply(): DataTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableProps]
  }
  @scala.inline
  implicit class DataTablePropsOps[Self <: DataTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA11yTitle(value: A11yTitleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA11yTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignSelf(value: AlignSelfType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String | AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[AnonAlign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGridArea(value: GridAreaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBy(value: String | AnonExpand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: MarginType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickRow(value: (/* event */ AnonDatum) | (/* event */ SyntheticMouseEvent[Element]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMore(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: /* search */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: /* sort */ AnonDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: none | xxsmall | xsmall | small | medium | large | xlarge | AnonHeader | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeable")(js.undefined)
        ret
    }
    @scala.inline
    def withRowProps(value: StringDictionary[AnonBackground]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large | xlarge | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: AnonDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

