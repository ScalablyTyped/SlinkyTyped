package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentFormattingEditProvider extends StObject {
  
  val displayName: js.UndefOr[String] = js.native
  
  /**
    * Provide formatting edits for a whole document.
    */
  def provideDocumentFormattingEdits(model: ITextModel, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}
object DocumentFormattingEditProvider {
  
  @scala.inline
  def apply(
    provideDocumentFormattingEdits: (ITextModel, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentFormattingEdits = js.Any.fromFunction3(provideDocumentFormattingEdits))
    __obj.asInstanceOf[DocumentFormattingEditProvider]
  }
  
  @scala.inline
  implicit class DocumentFormattingEditProviderMutableBuilder[Self <: DocumentFormattingEditProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProvideDocumentFormattingEdits(value: (ITextModel, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]): Self = StObject.set(x, "provideDocumentFormattingEdits", js.Any.fromFunction3(value))
  }
}
