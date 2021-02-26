package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.documentFragment
import typingsSlinky.ckeditor.CKEDITOR.dom.node
import typingsSlinky.ckeditor.CKEDITOR.dom.range
import typingsSlinky.ckeditor.CKEDITOR.dom.selection
import typingsSlinky.ckeditor.CKEDITOR.plugins.copyformatting.state
import typingsSlinky.ckeditor.CKEDITOR.plugins.notification
import typingsSlinky.ckeditor.CKEDITOR.plugins.notification.`type`
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository
import typingsSlinky.ckeditor.CKEDITOR.style.definition
import typingsSlinky.ckeditor.anon.Callback
import typingsSlinky.ckeditor.anon.Title
import typingsSlinky.ckeditor.ckeditorBooleans.`false`
import typingsSlinky.ckeditor.ckeditorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editor extends event {
  
  val activeEnterMode: Double = js.native
  
  val activeFilter: typingsSlinky.ckeditor.CKEDITOR.filter = js.native
  
  val activeShiftEnterMode: Double = js.native
  
  def addCommand(commandName: String, commandDefinition: commandDefinition): Unit = js.native
  
  def addContentsCss(cssPath: String): Unit = js.native
  
  def addFeature(feature: feature): Boolean = js.native
  
  def addMenuGroup(name: String): Unit = js.native
  def addMenuGroup(name: String, order: Double): Unit = js.native
  
  def addMenuItem(name: String): Unit = js.native
  def addMenuItem(name: String, definition: IMenuItemDefinition): Unit = js.native
  
  def addMenuItems(definitions: StringDictionary[IMenuItemDefinition]): Unit = js.native
  
  def addMode(mode: String, exec: js.Function0[Unit]): Unit = js.native
  
  def addRemoveFormatFilter(func: js.Function1[/* element */ typingsSlinky.ckeditor.CKEDITOR.dom.element, Boolean]): Unit = js.native
  
  def applyStyle(style: style): Unit = js.native
  
  def attachStyleStateChange(style: style, callback: js.Function1[/* state */ Double, Unit]): Unit = js.native
  
  val blockless: Boolean = js.native
  
  def checkDirty(): Boolean = js.native
  
  val config: typingsSlinky.ckeditor.CKEDITOR.config = js.native
  
  val container: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  
  val contextMenu: typingsSlinky.ckeditor.CKEDITOR.plugins.contextMenu = js.native
  
  var copyFormatting: state = js.native
  
  def createFakeElement(
    realElement: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    className: String,
    realElementType: String,
    isResizable: Boolean
  ): Unit = js.native
  
  def createFakeParserElement(
    realElement: typingsSlinky.ckeditor.CKEDITOR.dom.element,
    className: String,
    realElementType: String,
    isResizable: Boolean
  ): Unit = js.native
  
  def createRange(): range = js.native
  
  var dataProcessor: typingsSlinky.ckeditor.CKEDITOR.dataProcessor = js.native
  
  def destroy(): Unit = js.native
  def destroy(noUpdate: Boolean): Unit = js.native
  
  val document: typingsSlinky.ckeditor.CKEDITOR.dom.document = js.native
  
  def editable(): typingsSlinky.ckeditor.CKEDITOR.editable = js.native
  def editable(elementOrEditable: typingsSlinky.ckeditor.CKEDITOR.dom.element): typingsSlinky.ckeditor.CKEDITOR.editable = js.native
  def editable(elementOrEditable: typingsSlinky.ckeditor.CKEDITOR.editable): typingsSlinky.ckeditor.CKEDITOR.editable = js.native
  
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  
  val elementMode: Double = js.native
  
  def elementPath(): typingsSlinky.ckeditor.CKEDITOR.dom.elementPath = js.native
  def elementPath(startNode: node): typingsSlinky.ckeditor.CKEDITOR.dom.elementPath = js.native
  
  val enterMode: Double = js.native
  
  def execCommand(commandName: String): Boolean = js.native
  def execCommand(commandName: String, data: js.Any): Boolean = js.native
  
  def extractSelectedHtml(): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: js.UndefOr[scala.Nothing], removeEmptyBlock: Boolean): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Boolean): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Boolean, removeEmptyBlock: Boolean): documentFragment | String | Unit = js.native
  
  val filter: typingsSlinky.ckeditor.CKEDITOR.filter = js.native
  
  def focus(): Unit = js.native
  
  val focusManager: typingsSlinky.ckeditor.CKEDITOR.focusManager = js.native
  
  def forceNextSelectionCheck(): Unit = js.native
  
  def getClipboardData(
    callbackOrOptions: js.Function1[/* data */ js.Any, Unit],
    callback: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def getClipboardData(callbackOrOptions: Title, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  def getColorFromDialog(callback: js.Function1[/* color */ String, Unit]): Unit = js.native
  def getColorFromDialog(callback: js.Function1[/* color */ String, Unit], scope: StringDictionary[js.Any]): Unit = js.native
  
  def getCommand(commandName: String): command = js.native
  
  def getCommandKeystroke(command: String): Double | Null = js.native
  def getCommandKeystroke(command: command): Double | Null = js.native
  
  def getData(): String = js.native
  def getData(internal: Boolean): String = js.native
  
  def getMenuItem(name: String): IMenuItemDefinition = js.native
  
  def getResizable(forContents: Boolean): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  
  def getSelectedHtml(): documentFragment = js.native
  def getSelectedHtml(toString: Boolean): documentFragment | String = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_Union(): documentFragment | String = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_false(toString: `false`): documentFragment = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_true(toString: `true`): String = js.native
  
  def getSelection(): selection = js.native
  def getSelection(forceRealSelection: Boolean): selection = js.native
  
  def getSnapshot(): String = js.native
  
  def getStylesSet(callback: js.Function1[/* stylesDefinitions */ js.Array[definition], Unit]): Unit = js.native
  
  def getUiColor(): String = js.native
  
  val id: String = js.native
  
  def insertElement(element: typingsSlinky.ckeditor.CKEDITOR.dom.element): Unit = js.native
  
  def insertHtml(html: String): Unit = js.native
  def insertHtml(html: String, mode: js.UndefOr[scala.Nothing], range: range): Unit = js.native
  def insertHtml(html: String, mode: String): Unit = js.native
  def insertHtml(html: String, mode: String, range: range): Unit = js.native
  
  def insertText(text: String): Unit = js.native
  
  val keystrokeHandler: typingsSlinky.ckeditor.CKEDITOR.keystrokeHandler = js.native
  
  val lang: js.Any = js.native
  
  val langCode: String = js.native
  
  def loadSnapshot(snapshot: js.Any): Unit = js.native
  
  def lockSelection(): Boolean = js.native
  def lockSelection(sel: selection): Boolean = js.native
  
  val mode: String = js.native
  
  val name: String = js.native
  
  def openDialog(dialogName: String, callback: js.Function0[Unit]): dialog = js.native
  
  val pasteFilter: typingsSlinky.ckeditor.CKEDITOR.filter = js.native
  
  val plugins: js.Any = js.native
  
  def popup(url: String): Unit = js.native
  def popup(url: String, width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], options: String): Unit = js.native
  def popup(url: String, width: js.UndefOr[scala.Nothing], height: String): Unit = js.native
  def popup(url: String, width: js.UndefOr[scala.Nothing], height: String, options: String): Unit = js.native
  def popup(url: String, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def popup(url: String, width: js.UndefOr[scala.Nothing], height: Double, options: String): Unit = js.native
  def popup(url: String, width: String): Unit = js.native
  def popup(url: String, width: String, height: js.UndefOr[scala.Nothing], options: String): Unit = js.native
  def popup(url: String, width: String, height: String): Unit = js.native
  def popup(url: String, width: String, height: String, options: String): Unit = js.native
  def popup(url: String, width: String, height: Double): Unit = js.native
  def popup(url: String, width: String, height: Double, options: String): Unit = js.native
  def popup(url: String, width: Double): Unit = js.native
  def popup(url: String, width: Double, height: js.UndefOr[scala.Nothing], options: String): Unit = js.native
  def popup(url: String, width: Double, height: String): Unit = js.native
  def popup(url: String, width: Double, height: String, options: String): Unit = js.native
  def popup(url: String, width: Double, height: Double): Unit = js.native
  def popup(url: String, width: Double, height: Double, options: String): Unit = js.native
  
  val readOnly: Boolean = js.native
  
  def removeMenuItem(name: String): Unit = js.native
  
  def removeStyle(style: style): Unit = js.native
  
  def resetDirty(): Unit = js.native
  
  def resetUndo(): Unit = js.native
  
  def resize(width: String, height: String): Unit = js.native
  def resize(width: String, height: String, isContentHeight: js.UndefOr[scala.Nothing], resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Boolean): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: Double): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: js.UndefOr[scala.Nothing], resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Boolean): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: String): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: js.UndefOr[scala.Nothing], resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Boolean): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resize(width: Double, height: Double, isContentHeight: js.UndefOr[scala.Nothing], resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: Double, isContentHeight: Boolean): Unit = js.native
  def resize(width: Double, height: Double, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  
  def restoreRealElement(fakeElement: typingsSlinky.ckeditor.CKEDITOR.dom.element): typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  
  def selectionChange(): Unit = js.native
  def selectionChange(checkNow: Boolean): Unit = js.native
  
  def setActiveEnterMode(enterMode: Double, shiftEnterMode: Double): Unit = js.native
  
  def setActiveFilter(filter: typingsSlinky.ckeditor.CKEDITOR.filter): Unit = js.native
  
  def setData(data: String): Unit = js.native
  def setData(data: String, options: Callback): Unit = js.native
  
  def setKeystroke(keystroke: js.Array[js.Tuple2[Double, String | Boolean]]): Unit = js.native
  def setKeystroke(keystroke: Double, behavior: String): Unit = js.native
  def setKeystroke(keystroke: Double, behavior: Boolean): Unit = js.native
  
  def setMode(newMode: String, callback: js.Function0[Unit]): Unit = js.native
  
  def setReadOnly(): Unit = js.native
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  
  def setUiColor(color: String): Unit = js.native
  
  val shiftEnterMode: Double = js.native
  
  def showNotification(message: String, `type`: `type`, progressOrDuration: Double): notification = js.native
  
  val status: String = js.native
  
  val tabIndex: Double = js.native
  
  val templates: js.Any = js.native
  
  val title: js.Any = js.native
  
  val toolbar: js.Any = js.native
  
  val ui: typingsSlinky.ckeditor.CKEDITOR.ui = js.native
  
  def unlockSelection(): Unit = js.native
  def unlockSelection(restore: Boolean): Unit = js.native
  
  def updateElement(): Unit = js.native
  
  val widgets: repository = js.native
  
  val window: typingsSlinky.ckeditor.CKEDITOR.dom.window = js.native
}
object editor {
  
  @js.native
  trait eventObject extends StObject {
    
    var activeEnterModeChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var activeFilterChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var afterCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var afterInsertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var afterPaste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var afterPasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var afterSetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var afterUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var ariaEditorHelpLabel: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var ariaWidget: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var autogrow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var beforeCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var beforeDestroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var beforeGetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var beforeModeUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var beforeSetMode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var beforeUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var blur: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var change: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var configLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var contentDirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var contentDom: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var contentDomInvalidated: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var contentDomUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var customConfigLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dataFiltered: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dataReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var destroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dialogHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dialogShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var doubleclick: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dragend: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var dragstart: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var drop: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var elementsPathUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var fileUploadRequest: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var fileUploadResponse: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var floatingSpaceLayout: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var focus: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var getData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var getSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var insertElement: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var insertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var insertText: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var instanceReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var key: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var langLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var loadSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var loaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var lockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var maximize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var menuShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var mode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var notificationHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var notificationShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var notificationUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var paste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var pasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var pluginsLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var readOnly: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var removeFormatCleanup: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var required: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var resize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var save: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var saveSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var selectionChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var setData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var stylesSet: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var template: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var toDataFormat: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var toHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var unlockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var updateSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
    
    var widgetDefinition: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  }
  object eventObject {
    
    @scala.inline
    def apply(): eventObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[eventObject]
    }
    
    @scala.inline
    implicit class eventObjectMutableBuilder[Self <: eventObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveEnterModeChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "activeEnterModeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveEnterModeChangeUndefined: Self = StObject.set(x, "activeEnterModeChange", js.undefined)
      
      @scala.inline
      def setActiveFilterChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "activeFilterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveFilterChangeUndefined: Self = StObject.set(x, "activeFilterChange", js.undefined)
      
      @scala.inline
      def setAfterCommandExec(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterCommandExec", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterCommandExecUndefined: Self = StObject.set(x, "afterCommandExec", js.undefined)
      
      @scala.inline
      def setAfterInsertHtml(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterInsertHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterInsertHtmlUndefined: Self = StObject.set(x, "afterInsertHtml", js.undefined)
      
      @scala.inline
      def setAfterPaste(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterPasteFromWord(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterPasteFromWord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterPasteFromWordUndefined: Self = StObject.set(x, "afterPasteFromWord", js.undefined)
      
      @scala.inline
      def setAfterPasteUndefined: Self = StObject.set(x, "afterPaste", js.undefined)
      
      @scala.inline
      def setAfterSetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterSetData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterSetDataUndefined: Self = StObject.set(x, "afterSetData", js.undefined)
      
      @scala.inline
      def setAfterUndoImage(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterUndoImage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUndoImageUndefined: Self = StObject.set(x, "afterUndoImage", js.undefined)
      
      @scala.inline
      def setAriaEditorHelpLabel(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "ariaEditorHelpLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAriaEditorHelpLabelUndefined: Self = StObject.set(x, "ariaEditorHelpLabel", js.undefined)
      
      @scala.inline
      def setAriaWidget(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "ariaWidget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAriaWidgetUndefined: Self = StObject.set(x, "ariaWidget", js.undefined)
      
      @scala.inline
      def setAutogrow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "autogrow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutogrowUndefined: Self = StObject.set(x, "autogrow", js.undefined)
      
      @scala.inline
      def setBeforeCommandExec(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeCommandExec", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCommandExecUndefined: Self = StObject.set(x, "beforeCommandExec", js.undefined)
      
      @scala.inline
      def setBeforeDestroy(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      @scala.inline
      def setBeforeGetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeGetData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeGetDataUndefined: Self = StObject.set(x, "beforeGetData", js.undefined)
      
      @scala.inline
      def setBeforeModeUnload(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeModeUnload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeModeUnloadUndefined: Self = StObject.set(x, "beforeModeUnload", js.undefined)
      
      @scala.inline
      def setBeforeSetMode(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeSetMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSetModeUndefined: Self = StObject.set(x, "beforeSetMode", js.undefined)
      
      @scala.inline
      def setBeforeUndoImage(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeUndoImage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUndoImageUndefined: Self = StObject.set(x, "beforeUndoImage", js.undefined)
      
      @scala.inline
      def setBlur(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setConfigLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "configLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfigLoadedUndefined: Self = StObject.set(x, "configLoaded", js.undefined)
      
      @scala.inline
      def setContentDirChanged(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDirChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentDirChangedUndefined: Self = StObject.set(x, "contentDirChanged", js.undefined)
      
      @scala.inline
      def setContentDom(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentDomInvalidated(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDomInvalidated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentDomInvalidatedUndefined: Self = StObject.set(x, "contentDomInvalidated", js.undefined)
      
      @scala.inline
      def setContentDomUndefined: Self = StObject.set(x, "contentDom", js.undefined)
      
      @scala.inline
      def setContentDomUnload(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDomUnload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentDomUnloadUndefined: Self = StObject.set(x, "contentDomUnload", js.undefined)
      
      @scala.inline
      def setCustomConfigLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "customConfigLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomConfigLoadedUndefined: Self = StObject.set(x, "customConfigLoaded", js.undefined)
      
      @scala.inline
      def setDataFiltered(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
      
      @scala.inline
      def setDataReady(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dataReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataReadyUndefined: Self = StObject.set(x, "dataReady", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDialogHide(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dialogHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDialogHideUndefined: Self = StObject.set(x, "dialogHide", js.undefined)
      
      @scala.inline
      def setDialogShow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dialogShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDialogShowUndefined: Self = StObject.set(x, "dialogShow", js.undefined)
      
      @scala.inline
      def setDirChanged(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dirChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirChangedUndefined: Self = StObject.set(x, "dirChanged", js.undefined)
      
      @scala.inline
      def setDoubleclick(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "doubleclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleclickUndefined: Self = StObject.set(x, "doubleclick", js.undefined)
      
      @scala.inline
      def setDragend(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      @scala.inline
      def setDragstart(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      @scala.inline
      def setDrop(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setElementsPathUpdate(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "elementsPathUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementsPathUpdateUndefined: Self = StObject.set(x, "elementsPathUpdate", js.undefined)
      
      @scala.inline
      def setFileUploadRequest(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "fileUploadRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFileUploadRequestUndefined: Self = StObject.set(x, "fileUploadRequest", js.undefined)
      
      @scala.inline
      def setFileUploadResponse(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "fileUploadResponse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFileUploadResponseUndefined: Self = StObject.set(x, "fileUploadResponse", js.undefined)
      
      @scala.inline
      def setFloatingSpaceLayout(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "floatingSpaceLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFloatingSpaceLayoutUndefined: Self = StObject.set(x, "floatingSpaceLayout", js.undefined)
      
      @scala.inline
      def setFocus(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setGetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      @scala.inline
      def setGetSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSnapshotUndefined: Self = StObject.set(x, "getSnapshot", js.undefined)
      
      @scala.inline
      def setInsertElement(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "insertElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertElementUndefined: Self = StObject.set(x, "insertElement", js.undefined)
      
      @scala.inline
      def setInsertHtml(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "insertHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
      
      @scala.inline
      def setInsertText(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "insertText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
      
      @scala.inline
      def setInstanceReady(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "instanceReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInstanceReadyUndefined: Self = StObject.set(x, "instanceReady", js.undefined)
      
      @scala.inline
      def setKey(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLangLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "langLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLangLoadedUndefined: Self = StObject.set(x, "langLoaded", js.undefined)
      
      @scala.inline
      def setLoadSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "loadSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadSnapshotUndefined: Self = StObject.set(x, "loadSnapshot", js.undefined)
      
      @scala.inline
      def setLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setLockSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "lockSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLockSnapshotUndefined: Self = StObject.set(x, "lockSnapshot", js.undefined)
      
      @scala.inline
      def setMaximize(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "maximize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
      
      @scala.inline
      def setMenuShow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "menuShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuShowUndefined: Self = StObject.set(x, "menuShow", js.undefined)
      
      @scala.inline
      def setMode(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNotificationHide(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "notificationHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotificationHideUndefined: Self = StObject.set(x, "notificationHide", js.undefined)
      
      @scala.inline
      def setNotificationShow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "notificationShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotificationShowUndefined: Self = StObject.set(x, "notificationShow", js.undefined)
      
      @scala.inline
      def setNotificationUpdate(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "notificationUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotificationUpdateUndefined: Self = StObject.set(x, "notificationUpdate", js.undefined)
      
      @scala.inline
      def setPaste(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPasteFromWord(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "pasteFromWord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPasteFromWordUndefined: Self = StObject.set(x, "pasteFromWord", js.undefined)
      
      @scala.inline
      def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      @scala.inline
      def setPluginsLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "pluginsLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPluginsLoadedUndefined: Self = StObject.set(x, "pluginsLoaded", js.undefined)
      
      @scala.inline
      def setReadOnly(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "readOnly", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRemoveFormatCleanup(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "removeFormatCleanup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveFormatCleanupUndefined: Self = StObject.set(x, "removeFormatCleanup", js.undefined)
      
      @scala.inline
      def setRequired(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResize(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSave(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "saveSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveSnapshotUndefined: Self = StObject.set(x, "saveSnapshot", js.undefined)
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setSelectionChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      @scala.inline
      def setSetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      @scala.inline
      def setStylesSet(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "stylesSet", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesSetUndefined: Self = StObject.set(x, "stylesSet", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setToDataFormat(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "toDataFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToDataFormatUndefined: Self = StObject.set(x, "toDataFormat", js.undefined)
      
      @scala.inline
      def setToHtml(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "toHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToHtmlUndefined: Self = StObject.set(x, "toHtml", js.undefined)
      
      @scala.inline
      def setUnlockSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "unlockSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnlockSnapshotUndefined: Self = StObject.set(x, "unlockSnapshot", js.undefined)
      
      @scala.inline
      def setUpdateSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "updateSnapshot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateSnapshotUndefined: Self = StObject.set(x, "updateSnapshot", js.undefined)
      
      @scala.inline
      def setWidgetDefinition(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "widgetDefinition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidgetDefinitionUndefined: Self = StObject.set(x, "widgetDefinition", js.undefined)
    }
  }
}
