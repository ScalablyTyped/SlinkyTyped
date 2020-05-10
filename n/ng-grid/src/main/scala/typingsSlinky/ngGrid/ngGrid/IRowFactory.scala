package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowFactory extends js.Object {
  var aggCache: js.Any = js.native
  var dataChanged: Boolean = js.native
  var groupedData: js.Any = js.native
  var numberOfAggregates: Double = js.native
  var parentCache: js.Array[_] = js.native
  var parsedData: js.Array[_] = js.native
  var renderedRange: IRenderedRange = js.native
  var rowConfig: IRowConfig = js.native
  var rowHeight: Double = js.native
  var selectionProvider: ISelectionProvider = js.native
  def UpdateViewableRange(newRange: IRenderedRange): Unit = js.native
  def buildAggregateRow(aggEntity: js.Any, rowIndex: Double): IAggregate = js.native
  def buildEntityRow(entity: js.Any, rowIndex: Double): IRow = js.native
  def filteredRowsChanged(): Unit = js.native
  def fixRowCache(): Unit = js.native
  def getGrouping(groups: js.Any): Unit = js.native
  def parseGroupData(groupData: js.Any): Unit = js.native
  def renderedChange(): Unit = js.native
  def renderedChangeNoGroups(): Unit = js.native
}

object IRowFactory {
  @scala.inline
  def apply(
    UpdateViewableRange: IRenderedRange => Unit,
    aggCache: js.Any,
    buildAggregateRow: (js.Any, Double) => IAggregate,
    buildEntityRow: (js.Any, Double) => IRow,
    dataChanged: Boolean,
    filteredRowsChanged: () => Unit,
    fixRowCache: () => Unit,
    getGrouping: js.Any => Unit,
    groupedData: js.Any,
    numberOfAggregates: Double,
    parentCache: js.Array[_],
    parseGroupData: js.Any => Unit,
    parsedData: js.Array[_],
    renderedChange: () => Unit,
    renderedChangeNoGroups: () => Unit,
    renderedRange: IRenderedRange,
    rowConfig: IRowConfig,
    rowHeight: Double,
    selectionProvider: ISelectionProvider
  ): IRowFactory = {
    val __obj = js.Dynamic.literal(UpdateViewableRange = js.Any.fromFunction1(UpdateViewableRange), aggCache = aggCache.asInstanceOf[js.Any], buildAggregateRow = js.Any.fromFunction2(buildAggregateRow), buildEntityRow = js.Any.fromFunction2(buildEntityRow), dataChanged = dataChanged.asInstanceOf[js.Any], filteredRowsChanged = js.Any.fromFunction0(filteredRowsChanged), fixRowCache = js.Any.fromFunction0(fixRowCache), getGrouping = js.Any.fromFunction1(getGrouping), groupedData = groupedData.asInstanceOf[js.Any], numberOfAggregates = numberOfAggregates.asInstanceOf[js.Any], parentCache = parentCache.asInstanceOf[js.Any], parseGroupData = js.Any.fromFunction1(parseGroupData), parsedData = parsedData.asInstanceOf[js.Any], renderedChange = js.Any.fromFunction0(renderedChange), renderedChangeNoGroups = js.Any.fromFunction0(renderedChangeNoGroups), renderedRange = renderedRange.asInstanceOf[js.Any], rowConfig = rowConfig.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowFactory]
  }
  @scala.inline
  implicit class IRowFactoryOps[Self <: IRowFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateViewableRange(value: IRenderedRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateViewableRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildAggregateRow(value: (js.Any, Double) => IAggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildAggregateRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBuildEntityRow(value: (js.Any, Double) => IRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildEntityRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDataChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredRowsChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredRowsChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFixRowCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixRowCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGrouping(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupedData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfAggregates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfAggregates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCache(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseGroupData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseGroupData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParsedData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderedChangeNoGroups(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedChangeNoGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderedRange(value: IRenderedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowConfig(value: IRowConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionProvider(value: ISelectionProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

