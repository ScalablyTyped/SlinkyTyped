package typingsSlinky.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.File
import typingsSlinky.ckeditor.CKEDITOR.dom.domObject
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.range
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard")
@js.native
object clipboard extends js.Object {
  @js.native
  class dataTransfer () extends js.Object {
    def this(nativeDataTransfer: DataTransfer) = this()
    def this(nativeDataTransfer: DataTransfer, editor: editor) = this()
    @JSName("$")
    val $: DataTransfer = js.native
    val id: String = js.native
    val sourceEditor: editor = js.native
    def cacheData(): Unit = js.native
    def getData(`type`: String): String = js.native
    def getData(`type`: String, getNative: Boolean): String = js.native
    def getFile(i: Double): File = js.native
    def getFilesCount(): Double = js.native
    def getTransferType(targetEditor: editor): Double = js.native
    def isEmpty(): Boolean = js.native
    def setData(`type`: String, value: String): Unit = js.native
    def storeId(): Unit = js.native
  }
  
  @js.native
  class fallbackDataTransfer protected () extends js.Object {
    def this(dataTransfer: dataTransfer) = this()
    def getData(`type`: String): String = js.native
    def getData(`type`: String, getNative: Boolean): String = js.native
    def isRequired(): Boolean = js.native
    def setData(`type`: String, value: String): String = js.native
  }
  
  val isCustomCopyCutSupported: Boolean = js.native
  val isCustomDataTypesSupported: Boolean = js.native
  val isFileApiSupported: Boolean = js.native
  val mainPasteEvent: String = js.native
  def addPasteButton(editor: editor, name: String, definition: StringDictionary[js.Any]): Unit = js.native
  def canClipboardApiBeTrusted(dataTransfer: dataTransfer, editor: editor): Boolean = js.native
  def getDropTarget(editor: editor): domObject = js.native
  def getRangeAtDropPosition(domEvent: Event, editor: editor): range = js.native
  def initDragDataTransfer(): Unit = js.native
  def initDragDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event): Unit = js.native
  def initDragDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event, editor: editor): Unit = js.native
  def initPasteDataTransfer(): Unit = js.native
  def initPasteDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event): Unit = js.native
  def initPasteDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event, sourceEditor: editor): Unit = js.native
  def preventDefaultDropOnElement(element: element): Unit = js.native
  def resetDragDataTransfer(): Unit = js.native
}

