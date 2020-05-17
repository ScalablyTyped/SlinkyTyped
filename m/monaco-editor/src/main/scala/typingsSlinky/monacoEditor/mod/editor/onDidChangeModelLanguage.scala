package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.anon.Model
import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.onDidChangeModelLanguage")
@js.native
object onDidChangeModelLanguage extends js.Object {
  def apply(listener: js.Function1[/* e */ Model, Unit]): IDisposable = js.native
}

