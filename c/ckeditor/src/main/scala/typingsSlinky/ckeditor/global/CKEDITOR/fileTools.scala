package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.fileTools.uploadWidgetDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.fileTools")
@js.native
object fileTools extends js.Object {
  
  def addUploadWidget(editor: typingsSlinky.ckeditor.CKEDITOR.editor, name: String, `def`: uploadWidgetDefinition): Unit = js.native
  
  def bindNotification(
    editor: typingsSlinky.ckeditor.CKEDITOR.editor,
    fileLoader: typingsSlinky.ckeditor.CKEDITOR.fileTools.fileLoader
  ): Unit = js.native
  
  def getUploadUrl(config: StringDictionary[js.Any]): String = js.native
  def getUploadUrl(config: StringDictionary[js.Any], `type`: String): String = js.native
  
  var isFileUploadSupported: Boolean = js.native
  
  def isTypeSupported(file: Blob, supportedTypes: js.RegExp): Boolean = js.native
  
  def markElement(element: element, widgetName: String, loaderId: Double): Unit = js.native
  
  @js.native
  class fileLoader protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.fileTools.fileLoader {
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: String) = this()
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: Blob) = this()
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
  }
  
  @js.native
  class uploadRepository protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.fileTools.uploadRepository {
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
  }
}
