package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Range
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentRangeFormattingEditProvider extends js.Object {
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
  implicit class DocumentRangeFormattingEditProviderOps[Self <: DocumentRangeFormattingEditProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideDocumentRangeFormattingEdits(
      value: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentRangeFormattingEdits")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
  }
  
}

