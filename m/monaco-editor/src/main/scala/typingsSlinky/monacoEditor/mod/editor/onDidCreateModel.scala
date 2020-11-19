package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.onDidCreateModel")
@js.native
object onDidCreateModel extends js.Object {
  
  def apply(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
}
