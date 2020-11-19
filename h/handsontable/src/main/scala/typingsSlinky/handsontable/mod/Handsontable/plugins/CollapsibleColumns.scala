package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleColumns extends Base {
  
  var buttonEnabledList: js.Object = js.native
  
  def checkDependencies(): Unit = js.native
  
  def collapseAll(): Unit = js.native
  
  def collapseSection(coords: js.Object): Unit = js.native
  
  var collapsedSections: js.Object = js.native
  
  var columnHeaderLevelCount: Double = js.native
  
  var eventManager: EventManager = js.native
  
  def expandAll(): Unit = js.native
  
  def expandSection(coords: js.Object): Unit = js.native
  
  def generateIndicator(col: Double, TH: HTMLElement): HTMLElement = js.native
  
  var hiddenColumnsPlugin: js.Object = js.native
  
  def markSectionAs(state: String, row: Double, column: Double, recursive: Boolean): Unit = js.native
  
  def meetsDependencies(): Boolean = js.native
  
  var nestedHeadersPlugin: js.Object = js.native
  
  def parseSettings(): Unit = js.native
  
  var settings: Boolean | js.Array[_] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonEnabledList(value: js.Object): Self = this.set("buttonEnabledList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckDependencies(value: () => Unit): Self = this.set("checkDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseAll(value: () => Unit): Self = this.set("collapseAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseSection(value: js.Object => Unit): Self = this.set("collapseSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapsedSections(value: js.Object): Self = this.set("collapsedSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderLevelCount(value: Double): Self = this.set("columnHeaderLevelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: () => Unit): Self = this.set("expandAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandSection(value: js.Object => Unit): Self = this.set("expandSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateIndicator(value: (Double, HTMLElement) => HTMLElement): Self = this.set("generateIndicator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHiddenColumnsPlugin(value: js.Object): Self = this.set("hiddenColumnsPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkSectionAs(value: (String, Double, Double, Boolean) => Unit): Self = this.set("markSectionAs", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMeetsDependencies(value: () => Boolean): Self = this.set("meetsDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNestedHeadersPlugin(value: js.Object): Self = this.set("nestedHeadersPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseSettings(value: () => Unit): Self = this.set("parseSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettingsVarargs(value: js.Any*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: Boolean | js.Array[_]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleAllCollapsibleSections(value: String => Unit): Self = this.set("toggleAllCollapsibleSections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleCollapsibleSection(value: (js.Object, String) => Unit): Self = this.set("toggleCollapsibleSection", js.Any.fromFunction2(value))
  }
}
