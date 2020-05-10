package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDoughnutChartMethods extends js.Object {
  /**
  	 * Adds a new series to the doughnut chart.
  	 *
  	 * @param seriesObj The series object to be added.
  	 */
  def addSeries(seriesObj: js.Object): Unit = js.native
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Returns information about how the doughnut chart is rendered.
  	 */
  def exportVisualData(): js.Object = js.native
  /**
  	 * Causes all of the series that have pending changes e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): Unit = js.native
  /**
  	 * Returns the center of the doughnut chart.
  	 */
  def getCenterCoordinates(): js.Object = js.native
  /**
  	 * Returns data source of the series.
  	 *
  	 * @param series Optional. The series name. If not provided an array of series data sources is returned.
  	 */
  def getData(series: String): js.Object = js.native
  /**
  	 * Returns the radius of the chart's hole.
  	 */
  def getHoleRadius(): Double = js.native
  /**
  	 * Removes the specified series from the doughnut chart.
  	 *
  	 * @param seriesObj The series object identifying the series to be removed.
  	 */
  def removeSeries(seriesObj: js.Object): Unit = js.native
  /**
  	 * Updates the series with the specified name with the specified new property values.
  	 *
  	 * @param value The series object identifying the series to be updated.
  	 */
  def updateSeries(value: js.Object): Unit = js.native
}

object IgDoughnutChartMethods {
  @scala.inline
  def apply(
    addSeries: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    getCenterCoordinates: () => js.Object,
    getData: String => js.Object,
    getHoleRadius: () => Double,
    removeSeries: js.Object => Unit,
    updateSeries: js.Object => Unit
  ): IgDoughnutChartMethods = {
    val __obj = js.Dynamic.literal(addSeries = js.Any.fromFunction1(addSeries), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getCenterCoordinates = js.Any.fromFunction0(getCenterCoordinates), getData = js.Any.fromFunction1(getData), getHoleRadius = js.Any.fromFunction0(getHoleRadius), removeSeries = js.Any.fromFunction1(removeSeries), updateSeries = js.Any.fromFunction1(updateSeries))
    __obj.asInstanceOf[IgDoughnutChartMethods]
  }
  @scala.inline
  implicit class IgDoughnutChartMethodsOps[Self <: IgDoughnutChartMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSeries(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportVisualData(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportVisualData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCenterCoordinates(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterCoordinates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHoleRadius(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHoleRadius")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveSeries(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateSeries(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSeries")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

