package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSummary extends Base {
  var endpoints: Endpoints | Unit = js.native
  def calculate(endpoint: Endpoints): Unit = js.native
  def calculateAverage(endpoint: Endpoints): Double = js.native
  def calculateMinMax(endpoint: Endpoints, `type`: String): Double = js.native
  def calculateSum(endpoint: Endpoints): Unit = js.native
  def countEmpty(rowRange: js.Array[_], col: Double): Double = js.native
  def countEntries(endpoint: Endpoints): Double = js.native
  def getCellValue(row: Double, col: Double): String = js.native
  def getPartialMinMax(rowRange: js.Array[_], col: Double, `type`: String): Double = js.native
  def getPartialSum(rowRange: js.Array[_], col: Double): Double = js.native
}

object ColumnSummary {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    calculate: Endpoints => Unit,
    calculateAverage: Endpoints => Double,
    calculateMinMax: (Endpoints, String) => Double,
    calculateSum: Endpoints => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    countEmpty: (js.Array[_], Double) => Double,
    countEntries: Endpoints => Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    endpoints: Endpoints | Unit,
    getCellValue: (Double, Double) => String,
    getPartialMinMax: (js.Array[_], Double, String) => Double,
    getPartialSum: (js.Array[_], Double) => Double,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ColumnSummary = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), calculate = js.Any.fromFunction1(calculate), calculateAverage = js.Any.fromFunction1(calculateAverage), calculateMinMax = js.Any.fromFunction2(calculateMinMax), calculateSum = js.Any.fromFunction1(calculateSum), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), countEmpty = js.Any.fromFunction2(countEmpty), countEntries = js.Any.fromFunction1(countEntries), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], getCellValue = js.Any.fromFunction2(getCellValue), getPartialMinMax = js.Any.fromFunction3(getPartialMinMax), getPartialSum = js.Any.fromFunction2(getPartialSum), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ColumnSummary]
  }
  @scala.inline
  implicit class ColumnSummaryOps[Self <: ColumnSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculate(value: Endpoints => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateAverage(value: Endpoints => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateAverage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateMinMax(value: (Endpoints, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateMinMax")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCalculateSum(value: Endpoints => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCountEmpty(value: (js.Array[_], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countEmpty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCountEntries(value: Endpoints => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countEntries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndpoints(value: Endpoints | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellValue(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPartialMinMax(value: (js.Array[_], Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPartialMinMax")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPartialSum(value: (js.Array[_], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPartialSum")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

