package typingsSlinky.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Event
import typingsSlinky.ckeditor.CKEDITOR.dom.domObject
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.event
import typingsSlinky.ckeditor.CKEDITOR.dom.range
import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.clipboard")
@js.native
object clipboard extends js.Object {
  
  def addPasteButton(editor: editor, name: String, definition: StringDictionary[js.Any]): Unit = js.native
  
  def canClipboardApiBeTrusted(dataTransfer: typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer, editor: editor): Boolean = js.native
  
  def getDropTarget(editor: editor): domObject = js.native
  
  def getRangeAtDropPosition(domEvent: Event, editor: editor): range = js.native
  
  def initDragDataTransfer(): Unit = js.native
  def initDragDataTransfer(evt: js.UndefOr[scala.Nothing], editor: editor): Unit = js.native
  def initDragDataTransfer(evt: event): Unit = js.native
  def initDragDataTransfer(evt: event, editor: editor): Unit = js.native
  
  def initPasteDataTransfer(): Unit = js.native
  def initPasteDataTransfer(evt: js.UndefOr[scala.Nothing], sourceEditor: editor): Unit = js.native
  def initPasteDataTransfer(evt: event): Unit = js.native
  def initPasteDataTransfer(evt: event, sourceEditor: editor): Unit = js.native
  
  val isCustomCopyCutSupported: Boolean = js.native
  
  val isCustomDataTypesSupported: Boolean = js.native
  
  val isFileApiSupported: Boolean = js.native
  
  val mainPasteEvent: String = js.native
  
  def preventDefaultDropOnElement(element: element): Unit = js.native
  
  def resetDragDataTransfer(): Unit = js.native
  
  @js.native
  class dataTransfer ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer {
    def this(nativeDataTransfer: DataTransfer) = this()
    def this(nativeDataTransfer: js.UndefOr[scala.Nothing], editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
    def this(nativeDataTransfer: DataTransfer, editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
  }
  
  @js.native
  class fallbackDataTransfer protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.fallbackDataTransfer {
    def this(dataTransfer: typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer) = this()
  }
}
