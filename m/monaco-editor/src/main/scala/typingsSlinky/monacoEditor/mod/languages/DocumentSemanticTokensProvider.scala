package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.IEvent
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSemanticTokensProvider extends StObject {
  
  def getLegend(): SemanticTokensLegend = js.native
  
  var onDidChange: js.UndefOr[IEvent[Unit]] = js.native
  
  def provideDocumentSemanticTokens(model: ITextModel, lastResultId: String, token: CancellationToken): ProviderResult[SemanticTokens | SemanticTokensEdits] = js.native
  def provideDocumentSemanticTokens(model: ITextModel, lastResultId: Null, token: CancellationToken): ProviderResult[SemanticTokens | SemanticTokensEdits] = js.native
  
  def releaseDocumentSemanticTokens(): Unit = js.native
  def releaseDocumentSemanticTokens(resultId: String): Unit = js.native
}
