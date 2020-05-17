package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dialog.IDialogDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dialog")
@js.native
class dialog protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.dialog {
  def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, dialogName: String) = this()
}

/* static members */
@JSGlobal("CKEDITOR.dialog")
@js.native
object dialog extends js.Object {
  def add(name: String, dialogDefinition: String): Unit = js.native
  def add(
    name: String,
    dialogDefinition: js.Function1[/* editor */ typingsSlinky.ckeditor.CKEDITOR.editor, IDialogDefinition]
  ): Unit = js.native
  def addIframe(name: String, title: String, minWidth: Double, minHeight: Double): Unit = js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit]
  ): Unit = js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit],
    userDefinition: StringDictionary[js.Any]
  ): Unit = js.native
  def addUIElement(typeName: String, builder: js.Function0[Unit]): Unit = js.native
  def cancelButton(): Unit = js.native
  def exists(name: String): Unit = js.native
  def exists(name: Double): Unit = js.native
   // NOTE: documentation says object, but it's an array accessor, so really a string or number will work
  def getCurrent(): typingsSlinky.ckeditor.CKEDITOR.dialog = js.native
  def isTabEnabled(editor: typingsSlinky.ckeditor.CKEDITOR.editor, dialogName: String, tabName: String): Boolean = js.native
  def okButton(): Unit = js.native
}

