package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHighlightProvider extends StObject {
  
  /**
    * Provide a set of document highlights, like all occurrences of a variable or
    * all exit-points of a function.
    */
  def provideDocumentHighlights(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]] = js.native
}
object DocumentHighlightProvider {
  
  @scala.inline
  def apply(
    provideDocumentHighlights: (ITextModel, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]
  ): DocumentHighlightProvider = {
    val __obj = js.Dynamic.literal(provideDocumentHighlights = js.Any.fromFunction3(provideDocumentHighlights))
    __obj.asInstanceOf[DocumentHighlightProvider]
  }
  
  @scala.inline
  implicit class DocumentHighlightProviderMutableBuilder[Self <: DocumentHighlightProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDocumentHighlights(value: (ITextModel, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]): Self = StObject.set(x, "provideDocumentHighlights", js.Any.fromFunction3(value))
  }
}
