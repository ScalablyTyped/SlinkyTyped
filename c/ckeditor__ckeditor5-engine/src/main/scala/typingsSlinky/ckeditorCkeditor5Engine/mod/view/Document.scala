package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import typingsSlinky.ckeditorCkeditor5Engine.Anon0
import typingsSlinky.ckeditorCkeditor5Engine.AnonPriority
import typingsSlinky.ckeditorCkeditor5Utils.mod.Collection
import typingsSlinky.ckeditorCkeditor5Utils.mod.Emitter
import typingsSlinky.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/document
@JSImport("@ckeditor/ckeditor5-engine", "view.Document")
@js.native
class Document () extends Observable {
  val isComposing: Boolean = js.native
  val isFocused: Boolean = js.native
  var isReadOnly: Boolean = js.native
  val roots: Collection[RootEditableElement] = js.native
  val selection: DocumentSelection = js.native
  /* protected */ def _callPostFixers(writer: DowncastWriter): Unit = js.native
  def getRoot(): RootEditableElement | Null = js.native
  def getRoot(name: String): RootEditableElement | Null = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def registerPostFixer(postFixer: js.Function1[/* downcastWriter */ DowncastWriter, Boolean]): Unit = js.native
}

