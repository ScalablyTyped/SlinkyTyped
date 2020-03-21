package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerFoldingRangeProvider")
@js.native
object registerFoldingRangeProvider extends js.Object {
  def apply(languageId: String, provider: FoldingRangeProvider): IDisposable = js.native
}

