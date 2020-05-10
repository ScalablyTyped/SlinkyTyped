package typingsSlinky.amcharts.categoryAxisMod

import typingsSlinky.amcharts.axisBaseMod.AxisBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryAxis extends AxisBase {
  /**
    * When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods,
    * like month, in bold. Set this to false to disable the functionality.
    * @default true
    */
  var boldPeriodBeginning: Boolean = js.native
  /**
    * Date formats of different periods. Possible period values:
    * fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years.
    * Check this page for date formatting strings.
    * [
    *     {period:'fff',format:'JJ:NN:SS'},
    *     {period:'ss',format:'JJ:NN:SS'},
    *     {period:'mm',format:'JJ:NN'},
    *     {period:'hh',format:'JJ:NN'},
    *     {period:'DD',format:'MMM DD'},
    *     {period:'WW',format:'MMM DD'},
    *     {period:'MM',format:'MMM'},
    *     {period:'YYYY',format:'YYYY'}
    * ]
    */
  var dateFormats: js.Array[_] = js.native
  /**
    * In case your category axis values are Date objects and parseDates is set to true,
    * the chart will parse dates and will place your data points at irregular intervals.
    * However if you want dates to be parsed (displayed on the axis, baloons, etc),
    * but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true.
    */
  var equalSpacing: Boolean = js.native
  /**
    * Field in data provider which specifies if the category value should always be shown.
    * For example: categoryAxis.forceShowField = "forceShow";
    * Field in data provider which specifies if the category value should always be shown.
    * For example: categoryAxis.forceShowField = "forceShow";
    * And in data:
    * {category:"one", forceShow:true, value:100}
    * Note, this works only when parseDates is set to false.
    */
  var forceShowField: String = js.native
  /**
    * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell.
    * Possible values are: "start" and "middle" This setting doesn't work if parseDates is set to true.
    * @default "middle"
    */
  var gridPosition: String = js.native
  /**
    * Specifies the shortest period of your data. This should be set only if parseDates is set to "true".
    * Possible period values:
    * fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years.
    * @default "DD"
    */
  var minPeriod: String = js.native
  /**
    * Specifies if minor grid should be displayed.
    * NOTE: If equalSpacing is set to true, this setting will be ignored.
    * @default false
    */
  var minorGridEnabled: Boolean = js.native
  /**
    * In case your category axis values are Date objects, set this to true.
    * In this case the chart will parse dates and will place your data points at irregular intervals.
    * If you want dates to be parsed, but data points to be placed at equal intervals,
    * set both parseDates and equalSpacing to true.
    */
  var parseDates: Boolean = js.native
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true.
    */
  var startOnAxis: Boolean = js.native
  /**
    * Works only when parseDates is set to true and equalSpacing is false.
    * If you set it to true, at the position where bigger period changes,
    * category axis will display date strings of bot small and big period, in two rows.
    * @default false
    */
  var twoLineMode: Boolean = js.native
  /**
    * Use line color for bullet
    * @default false
    */
  var useLineColorForBulletBorder: Boolean = js.native
  /**
    * Number returns coordinate of a category. Works only if parseDates is false.
    * If parseDates is true, use dateToCoordinate method.
    */
  def categoryToCoordinate(category: String): Unit = js.native
  /**
    * date - Date object Returns Date of the coordinate, in case parseDates is set to true and
    * equalSpacing is set to false.
    */
  def coordinateToDate(coordinate: Double): Unit = js.native
  /**
    * Number Returns coordinate of the date, in case parseDates is set to true.
    * If parseDates is false, use categoryToCoordinate method.
    */
  def dateToCoordinate(date: js.Date): Unit = js.native
  /**
    * Number Returns index of the category which is most close to specified coordinate.
    */
  def xToIndex(x: Double): Unit = js.native
}

object CategoryAxis {
  @scala.inline
  def apply(
    addGuide: typingsSlinky.amcharts.guideMod.default => Unit,
    autoGridCount: Boolean,
    axisAlpha: Double,
    axisColor: String,
    axisThickness: Double,
    boldPeriodBeginning: Boolean,
    categoryToCoordinate: String => Unit,
    color: String,
    coordinateToDate: Double => Unit,
    dashLength: Double,
    dateFormats: js.Array[_],
    dateToCoordinate: js.Date => Unit,
    equalSpacing: Boolean,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    forceShowField: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    gridPosition: String,
    gridThickness: Double,
    guides: js.Array[_],
    ignoreAxisWidth: Boolean,
    inside: Boolean,
    labelFrequency: Double,
    labelRotation: Double,
    labelsEnabled: Boolean,
    minPeriod: String,
    minorGridEnabled: Boolean,
    offset: Double,
    parseDates: Boolean,
    position: String,
    removeGuide: typingsSlinky.amcharts.guideMod.default => Unit,
    showFirstLabel: Boolean,
    showLastLabel: Boolean,
    startOnAxis: Boolean,
    tickLength: Double,
    title: String,
    titleBold: Boolean,
    titleColor: String,
    titlefontSize: String,
    twoLineMode: Boolean,
    useLineColorForBulletBorder: Boolean,
    xToIndex: Double => Unit
  ): CategoryAxis = {
    val __obj = js.Dynamic.literal(addGuide = js.Any.fromFunction1(addGuide), autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], boldPeriodBeginning = boldPeriodBeginning.asInstanceOf[js.Any], categoryToCoordinate = js.Any.fromFunction1(categoryToCoordinate), color = color.asInstanceOf[js.Any], coordinateToDate = js.Any.fromFunction1(coordinateToDate), dashLength = dashLength.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], dateToCoordinate = js.Any.fromFunction1(dateToCoordinate), equalSpacing = equalSpacing.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], forceShowField = forceShowField.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridPosition = gridPosition.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any], ignoreAxisWidth = ignoreAxisWidth.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], minPeriod = minPeriod.asInstanceOf[js.Any], minorGridEnabled = minorGridEnabled.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseDates = parseDates.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeGuide = js.Any.fromFunction1(removeGuide), showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], startOnAxis = startOnAxis.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleBold = titleBold.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titlefontSize = titlefontSize.asInstanceOf[js.Any], twoLineMode = twoLineMode.asInstanceOf[js.Any], useLineColorForBulletBorder = useLineColorForBulletBorder.asInstanceOf[js.Any], xToIndex = js.Any.fromFunction1(xToIndex))
    __obj.asInstanceOf[CategoryAxis]
  }
  @scala.inline
  implicit class CategoryAxisOps[Self <: CategoryAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoldPeriodBeginning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldPeriodBeginning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryToCoordinate(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryToCoordinate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCoordinateToDate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateToDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateFormats(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateToCoordinate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateToCoordinate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEqualSpacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceShowField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceShowField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorGridEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOnAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoLineMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoLineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseLineColorForBulletBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLineColorForBulletBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXToIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xToIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

