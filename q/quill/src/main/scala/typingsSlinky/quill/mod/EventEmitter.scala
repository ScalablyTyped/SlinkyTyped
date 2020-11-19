package typingsSlinky.quill.mod

import typingsSlinky.quill.quillStrings.`editor-change`
import typingsSlinky.quill.quillStrings.`selection-change`
import typingsSlinky.quill.quillStrings.`text-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends js.Object {
  
  @JSName("off")
  def off_editorchange(eventName: `editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("off")
  def off_selectionchange(eventName: `selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("off")
  def off_textchange(eventName: `text-change`, handler: TextChangeHandler): EventEmitter = js.native
  
  @JSName("on")
  def on_editorchange(eventName: `editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("on")
  def on_selectionchange(eventName: `selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("on")
  def on_textchange(eventName: `text-change`, handler: TextChangeHandler): EventEmitter = js.native
  
  @JSName("once")
  def once_editorchange(eventName: `editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("once")
  def once_selectionchange(eventName: `selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("once")
  def once_textchange(eventName: `text-change`, handler: TextChangeHandler): EventEmitter = js.native
}
