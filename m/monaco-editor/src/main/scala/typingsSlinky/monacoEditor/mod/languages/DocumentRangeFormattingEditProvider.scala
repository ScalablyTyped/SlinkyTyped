package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Range
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRangeFormattingEditProvider extends StObject {
  
  val displayName: js.UndefOr[String] = js.native
  
  /**
    * Provide formatting edits for a range in a document.
    *
    * The given range is a hint and providers can decide to format a smaller
    * or larger range. Often this is done by adjusting the start and end
    * of the range to full syntax nodes.
    */
  def provideDocumentRangeFormattingEdits(model: ITextModel, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}
object DocumentRangeFormattingEditProvider {
  
  @scala.inline
  def apply(
    provideDocumentRangeFormattingEdits: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentRangeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeFormattingEdits = js.Any.fromFunction4(provideDocumentRangeFormattingEdits))
    __obj.asInstanceOf[DocumentRangeFormattingEditProvider]
  }
  
  @scala.inline
  implicit class DocumentRangeFormattingEditProviderMutableBuilder[Self <: DocumentRangeFormattingEditProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProvideDocumentRangeFormattingEdits(
      value: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = StObject.set(x, "provideDocumentRangeFormattingEdits", js.Any.fromFunction4(value))
  }
}
