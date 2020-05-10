package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualColumnResize extends Base {
  var autoresizeTimeout: js.Function0[Unit] | Unit = js.native
  var currentCol: Double | Unit = js.native
  var currentTH: HTMLElement | Unit = js.native
  var currentWidth: Double | Unit = js.native
  var dblclick: Double = js.native
  var eventManager: EventManager = js.native
  var guide: HTMLElement = js.native
  var handle: HTMLElement = js.native
  var manualColumnWidths: js.Array[_] = js.native
  var newSize: Double | Unit = js.native
  var pressed: Core | Unit = js.native
  var selectedCols: js.Array[_] = js.native
  var startOffset: Double | Unit = js.native
  var startWidth: Double | Unit = js.native
  var startY: Double | Unit = js.native
  def checkIfColumnHeader(element: HTMLElement): Boolean = js.native
  def clearManualSize(column: Double): Unit = js.native
  def getTHFromTargetElement(element: HTMLElement): HTMLElement = js.native
  def hideHandleAndGuide(): Unit = js.native
  def loadManualColumnWidths(): Unit = js.native
  def refreshGuidePosition(): Unit = js.native
  def refreshHandlePosition(): Unit = js.native
  def saveManualColumnWidths(): Unit = js.native
  def setManualSize(column: Double, width: Double): Double = js.native
  def setupGuidePosition(): Unit = js.native
  def setupHandlePosition(TH: HTMLElement): Boolean | Unit = js.native
}

object ManualColumnResize {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    autoresizeTimeout: js.Function0[Unit] | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkIfColumnHeader: HTMLElement => Boolean,
    clearHooks: () => Unit,
    clearManualSize: Double => Unit,
    currentCol: Double | Unit,
    currentTH: HTMLElement | Unit,
    currentWidth: Double | Unit,
    dblclick: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    getTHFromTargetElement: HTMLElement => HTMLElement,
    guide: HTMLElement,
    handle: HTMLElement,
    hideHandleAndGuide: () => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadManualColumnWidths: () => Unit,
    manualColumnWidths: js.Array[_],
    newSize: Double | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    pressed: Core | Unit,
    refreshGuidePosition: () => Unit,
    refreshHandlePosition: () => Unit,
    removeHooks: String => Unit,
    saveManualColumnWidths: () => Unit,
    selectedCols: js.Array[_],
    setManualSize: (Double, Double) => Double,
    setupGuidePosition: () => Unit,
    setupHandlePosition: HTMLElement => Boolean | Unit,
    startOffset: Double | Unit,
    startWidth: Double | Unit,
    startY: Double | Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualColumnResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfColumnHeader = js.Any.fromFunction1(checkIfColumnHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentCol = currentCol.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getTHFromTargetElement = js.Any.fromFunction1(getTHFromTargetElement), guide = guide.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], loadManualColumnWidths = js.Any.fromFunction0(loadManualColumnWidths), manualColumnWidths = manualColumnWidths.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualColumnWidths = js.Any.fromFunction0(saveManualColumnWidths), selectedCols = selectedCols.asInstanceOf[js.Any], setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualColumnResize]
  }
  @scala.inline
  implicit class ManualColumnResizeOps[Self <: ManualColumnResize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoresizeTimeoutFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoresizeTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoresizeTimeout(value: js.Function0[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoresizeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckIfColumnHeader(value: HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIfColumnHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearManualSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearManualSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentCol(value: Double | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTHHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTH(value: HTMLElement | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentWidth(value: Double | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTHFromTargetElement(value: HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTHFromTargetElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGuide(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideHandleAndGuide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHandleAndGuide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadManualColumnWidths(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadManualColumnWidths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withManualColumnWidths(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewSize(value: Double | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressed(value: Core | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshGuidePosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshGuidePosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefreshHandlePosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshHandlePosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveManualColumnWidths(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveManualColumnWidths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectedCols(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetManualSize(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setManualSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetupGuidePosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupGuidePosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetupHandlePosition(value: HTMLElement => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupHandlePosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartOffset(value: Double | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartWidth(value: Double | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartY(value: Double | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

