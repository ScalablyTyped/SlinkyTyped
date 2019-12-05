package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerRenameProvider")
@js.native
object registerRenameProvider extends js.Object {
  def apply(languageId: String, provider: RenameProvider): IDisposable = js.native
}

