package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedHeaders extends Base {
  var colspanArray: js.Array[_] = js.native
  var columnHeaderLevelCount: Double = js.native
  var ghostTable: GhostTableNestedHeaders = js.native
  var settings: js.Array[_] = js.native
  def checkForFixedColumnsCollision(): Unit = js.native
  def checkForOverlappingHeaders(): Unit = js.native
  def fillColspanArrayWithDummies(colspan: Double, level: Double): Unit = js.native
  def fillTheRemainingColspans(): Unit = js.native
  def getChildHeaders(row: Double, column: Double): js.Array[_] = js.native
  def getColspan(row: Double, column: Double): Double = js.native
  def getNestedParent(level: Double, column: Double): js.Any = js.native
  def headerRendererFactory(headerRow: Double): js.Function0[Unit] = js.native
  def levelToRowCoords(level: Double): Double = js.native
  def rowCoordsToLevel(row: Double): Double = js.native
  def setupColspanArray(): Unit = js.native
}

object NestedHeaders {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkForFixedColumnsCollision: () => Unit,
    checkForOverlappingHeaders: () => Unit,
    clearHooks: () => Unit,
    colspanArray: js.Array[_],
    columnHeaderLevelCount: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    fillColspanArrayWithDummies: (Double, Double) => Unit,
    fillTheRemainingColspans: () => Unit,
    getChildHeaders: (Double, Double) => js.Array[_],
    getColspan: (Double, Double) => Double,
    getNestedParent: (Double, Double) => js.Any,
    ghostTable: GhostTableNestedHeaders,
    headerRendererFactory: Double => js.Function0[Unit],
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    levelToRowCoords: Double => Double,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    rowCoordsToLevel: Double => Double,
    settings: js.Array[_],
    setupColspanArray: () => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): NestedHeaders = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkForFixedColumnsCollision = js.Any.fromFunction0(checkForFixedColumnsCollision), checkForOverlappingHeaders = js.Any.fromFunction0(checkForOverlappingHeaders), clearHooks = js.Any.fromFunction0(clearHooks), colspanArray = colspanArray.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], fillColspanArrayWithDummies = js.Any.fromFunction2(fillColspanArrayWithDummies), fillTheRemainingColspans = js.Any.fromFunction0(fillTheRemainingColspans), getChildHeaders = js.Any.fromFunction2(getChildHeaders), getColspan = js.Any.fromFunction2(getColspan), getNestedParent = js.Any.fromFunction2(getNestedParent), ghostTable = ghostTable.asInstanceOf[js.Any], headerRendererFactory = js.Any.fromFunction1(headerRendererFactory), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], levelToRowCoords = js.Any.fromFunction1(levelToRowCoords), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), rowCoordsToLevel = js.Any.fromFunction1(rowCoordsToLevel), settings = settings.asInstanceOf[js.Any], setupColspanArray = js.Any.fromFunction0(setupColspanArray), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[NestedHeaders]
  }
  @scala.inline
  implicit class NestedHeadersOps[Self <: NestedHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckForFixedColumnsCollision(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForFixedColumnsCollision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckForOverlappingHeaders(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForOverlappingHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColspanArray(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspanArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnHeaderLevelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderLevelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColspanArrayWithDummies(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColspanArrayWithDummies")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFillTheRemainingColspans(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillTheRemainingColspans")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChildHeaders(value: (Double, Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildHeaders")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetColspan(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColspan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNestedParent(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNestedParent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGhostTable(value: GhostTableNestedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRendererFactory(value: Double => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRendererFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevelToRowCoords(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelToRowCoords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowCoordsToLevel(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCoordsToLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupColspanArray(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupColspanArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

