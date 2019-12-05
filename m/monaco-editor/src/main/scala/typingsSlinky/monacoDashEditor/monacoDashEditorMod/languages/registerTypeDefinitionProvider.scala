package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerTypeDefinitionProvider")
@js.native
object registerTypeDefinitionProvider extends js.Object {
  def apply(languageId: String, provider: TypeDefinitionProvider): IDisposable = js.native
}

