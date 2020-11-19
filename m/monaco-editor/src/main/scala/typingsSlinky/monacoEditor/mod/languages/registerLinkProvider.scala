package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.registerLinkProvider")
@js.native
object registerLinkProvider extends js.Object {
  
  def apply(languageId: String, provider: LinkProvider): IDisposable = js.native
}
