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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editor_ extends event {
  val activeEnterMode: Double = js.native
  val activeFilter: typingsSlinky.ckeditor.CKEDITOR.filter = js.native
  val activeShiftEnterMode: Double = js.native
  val blockless: Boolean = js.native
  val config: typingsSlinky.ckeditor.CKEDITOR.config = js.native
  val container: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  val contextMenu: typingsSlinky.ckeditor.CKEDITOR.plugins.contextMenu = js.native
  var copyFormatting: state = js.native
  var dataProcessor: typingsSlinky.ckeditor.CKEDITOR.dataProcessor = js.native
  val document: typingsSlinky.ckeditor.CKEDITOR.dom.document = js.native
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  val elementMode: Double = js.native
  val enterMode: Double = js.native
  val filter: typingsSlinky.ckeditor.CKEDITOR.filter = js.native
  val focusManager: typingsSlinky.ckeditor.CKEDITOR.focusManager = js.native
  val id: String = js.native
  val keystrokeHandler: typingsSlinky.ckeditor.CKEDITOR.keystrokeHandler = js.native
  val lang: js.Any = js.native
  val langCode: String = js.native
  val mode: String = js.native
  val name: String = js.native
  val pasteFilter: typingsSlinky.ckeditor.CKEDITOR.filter = js.native
  val plugins: js.Any = js.native
  val readOnly: Boolean = js.native
  val shiftEnterMode: Double = js.native
  val status: String = js.native
  val tabIndex: Double = js.native
  val templates: js.Any = js.native
  val title: js.Any = js.native
  val toolbar: js.Any = js.native
  val ui: typingsSlinky.ckeditor.CKEDITOR.ui = js.native
  val widgets: repository = js.native
  val window: typingsSlinky.ckeditor.CKEDITOR.dom.window = js.native
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
  def checkDirty(): Boolean = js.native
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
  def destroy(): Unit = js.native
  def destroy(noUpdate: Boolean): Unit = js.native
  def editable(): typingsSlinky.ckeditor.CKEDITOR.editable = js.native
  def editable(elementOrEditable: typingsSlinky.ckeditor.CKEDITOR.dom.element): typingsSlinky.ckeditor.CKEDITOR.editable = js.native
  def editable(elementOrEditable: typingsSlinky.ckeditor.CKEDITOR.editable): typingsSlinky.ckeditor.CKEDITOR.editable = js.native
  def elementPath(): typingsSlinky.ckeditor.CKEDITOR.dom.elementPath = js.native
  def elementPath(startNode: node): typingsSlinky.ckeditor.CKEDITOR.dom.elementPath = js.native
  def execCommand(commandName: String): Boolean = js.native
  def execCommand(commandName: String, data: js.Any): Boolean = js.native
  def extractSelectedHtml(): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Boolean): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Boolean, removeEmptyBlock: Boolean): documentFragment | String | Unit = js.native
  def focus(): Unit = js.native
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
  def insertElement(element: typingsSlinky.ckeditor.CKEDITOR.dom.element): Unit = js.native
  def insertHtml(html: String): Unit = js.native
  def insertHtml(html: String, mode: String): Unit = js.native
  def insertHtml(html: String, mode: String, range: range): Unit = js.native
  def insertText(text: String): Unit = js.native
  def loadSnapshot(snapshot: js.Any): Unit = js.native
  def lockSelection(): Boolean = js.native
  def lockSelection(sel: selection): Boolean = js.native
  def openDialog(dialogName: String, callback: js.Function0[Unit]): dialog = js.native
  def popup(url: String): Unit = js.native
  def popup(url: String, width: String): Unit = js.native
  def popup(url: String, width: String, height: String): Unit = js.native
  def popup(url: String, width: String, height: String, options: String): Unit = js.native
  def popup(url: String, width: String, height: Double): Unit = js.native
  def popup(url: String, width: String, height: Double, options: String): Unit = js.native
  def popup(url: String, width: Double): Unit = js.native
  def popup(url: String, width: Double, height: String): Unit = js.native
  def popup(url: String, width: Double, height: String, options: String): Unit = js.native
  def popup(url: String, width: Double, height: Double): Unit = js.native
  def popup(url: String, width: Double, height: Double, options: String): Unit = js.native
  def removeMenuItem(name: String): Unit = js.native
  def removeStyle(style: style): Unit = js.native
  def resetDirty(): Unit = js.native
  def resetUndo(): Unit = js.native
  def resize(width: String, height: String): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Boolean): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: Double): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Boolean): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: String): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Boolean): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
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
  def showNotification(message: String, `type`: `type`, progressOrDuration: Double): notification = js.native
  def unlockSelection(): Unit = js.native
  def unlockSelection(restore: Boolean): Unit = js.native
  def updateElement(): Unit = js.native
}

