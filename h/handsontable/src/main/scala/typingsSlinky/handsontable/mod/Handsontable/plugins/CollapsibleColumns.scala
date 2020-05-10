package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleColumns extends Base {
  var buttonEnabledList: js.Object = js.native
  var collapsedSections: js.Object = js.native
  var columnHeaderLevelCount: Double = js.native
  var eventManager: EventManager = js.native
  var hiddenColumnsPlugin: js.Object = js.native
  var nestedHeadersPlugin: js.Object = js.native
  var settings: Boolean | js.Array[_] = js.native
  def checkDependencies(): Unit = js.native
  def collapseAll(): Unit = js.native
  def collapseSection(coords: js.Object): Unit = js.native
  def expandAll(): Unit = js.native
  def expandSection(coords: js.Object): Unit = js.native
  def generateIndicator(col: Double, TH: HTMLElement): HTMLElement = js.native
  def markSectionAs(state: String, row: Double, column: Double, recursive: Boolean): Unit = js.native
  def meetsDependencies(): Boolean = js.native
  def parseSettings(): Unit = js.native
  def toggleAllCollapsibleSections(action: String): Unit = js.native
  def toggleCollapsibleSection(coords: js.Object, action: String): Unit = js.native
}

object CollapsibleColumns {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    buttonEnabledList: js.Object,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkDependencies: () => Unit,
    clearHooks: () => Unit,
    collapseAll: () => Unit,
    collapseSection: js.Object => Unit,
    collapsedSections: js.Object,
    columnHeaderLevelCount: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    expandAll: () => Unit,
    expandSection: js.Object => Unit,
    generateIndicator: (Double, HTMLElement) => HTMLElement,
    hiddenColumnsPlugin: js.Object,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    markSectionAs: (String, Double, Double, Boolean) => Unit,
    meetsDependencies: () => Boolean,
    nestedHeadersPlugin: js.Object,
    parseSettings: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    settings: Boolean | js.Array[_],
    t: RecordTranslator,
    toggleAllCollapsibleSections: String => Unit,
    toggleCollapsibleSection: (js.Object, String) => Unit,
    updatePlugin: () => Unit
  ): CollapsibleColumns = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), buttonEnabledList = buttonEnabledList.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkDependencies = js.Any.fromFunction0(checkDependencies), clearHooks = js.Any.fromFunction0(clearHooks), collapseAll = js.Any.fromFunction0(collapseAll), collapseSection = js.Any.fromFunction1(collapseSection), collapsedSections = collapsedSections.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], expandAll = js.Any.fromFunction0(expandAll), expandSection = js.Any.fromFunction1(expandSection), generateIndicator = js.Any.fromFunction2(generateIndicator), hiddenColumnsPlugin = hiddenColumnsPlugin.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], markSectionAs = js.Any.fromFunction4(markSectionAs), meetsDependencies = js.Any.fromFunction0(meetsDependencies), nestedHeadersPlugin = nestedHeadersPlugin.asInstanceOf[js.Any], parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), settings = settings.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], toggleAllCollapsibleSections = js.Any.fromFunction1(toggleAllCollapsibleSections), toggleCollapsibleSection = js.Any.fromFunction2(toggleCollapsibleSection), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[CollapsibleColumns]
  }
  @scala.inline
  implicit class CollapsibleColumnsOps[Self <: CollapsibleColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonEnabledList(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonEnabledList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckDependencies(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapseAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapseSection(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseSection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollapsedSections(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnHeaderLevelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderLevelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandSection(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateIndicator(value: (Double, HTMLElement) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIndicator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHiddenColumnsPlugin(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnsPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkSectionAs(value: (String, Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markSectionAs")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMeetsDependencies(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetsDependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNestedHeadersPlugin(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeadersPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseSettings(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSettings(value: Boolean | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleAllCollapsibleSections(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAllCollapsibleSections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleCollapsibleSection(value: (js.Object, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCollapsibleSection")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

