package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSymbolProvider extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  /**
    * Provide symbol information for the given document.
    */
  def provideDocumentSymbols(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol]] = js.native
}

object DocumentSymbolProvider {
  @scala.inline
  def apply(
    provideDocumentSymbols: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal(provideDocumentSymbols = js.Any.fromFunction2(provideDocumentSymbols))
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
  @scala.inline
  implicit class DocumentSymbolProviderOps[Self <: DocumentSymbolProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideDocumentSymbols(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentSymbols")(js.Any.fromFunction2(value))
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

