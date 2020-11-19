package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.registerHoverProvider")
@js.native
object registerHoverProvider extends js.Object {
  
  def apply(languageId: String, provider: HoverProvider): IDisposable = js.native
}
