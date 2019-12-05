package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import typingsSlinky.monacoDashEditor.monacoDashEditorMod.IDisposable
import typingsSlinky.monacoDashEditor.monacoDashEditorMod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.setMonarchTokensProvider")
@js.native
object setMonarchTokensProvider extends js.Object {
  def apply(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
  def apply(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
}

