package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentColorProvider extends js.Object {
  /**
    * Provide the string representations for a color.
    */
  def provideColorPresentations(model: ITextModel, colorInfo: IColorInformation, token: CancellationToken): ProviderResult[js.Array[IColorPresentation]] = js.native
  /**
    * Provides the color ranges for a specific model.
    */
  def provideDocumentColors(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[IColorInformation]] = js.native
}

object DocumentColorProvider {
  @scala.inline
  def apply(
    provideColorPresentations: (ITextModel, IColorInformation, CancellationToken) => ProviderResult[js.Array[IColorPresentation]],
    provideDocumentColors: (ITextModel, CancellationToken) => ProviderResult[js.Array[IColorInformation]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideDocumentColors = js.Any.fromFunction2(provideDocumentColors))
    __obj.asInstanceOf[DocumentColorProvider]
  }
  @scala.inline
  implicit class DocumentColorProviderOps[Self <: DocumentColorProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideColorPresentations(
      value: (ITextModel, IColorInformation, CancellationToken) => ProviderResult[js.Array[IColorPresentation]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideColorPresentations")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withProvideDocumentColors(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[IColorInformation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideDocumentColors")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

