package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionRangeProvider extends js.Object {
  /**
    * Provide ranges that should be selected from the given position.
    */
  def provideSelectionRanges(model: ITextModel, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[js.Array[SelectionRange]]] = js.native
}

object SelectionRangeProvider {
  @scala.inline
  def apply(
    provideSelectionRanges: (ITextModel, js.Array[Position], CancellationToken) => ProviderResult[js.Array[js.Array[SelectionRange]]]
  ): SelectionRangeProvider = {
    val __obj = js.Dynamic.literal(provideSelectionRanges = js.Any.fromFunction3(provideSelectionRanges))
    __obj.asInstanceOf[SelectionRangeProvider]
  }
  @scala.inline
  implicit class SelectionRangeProviderOps[Self <: SelectionRangeProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideSelectionRanges(
      value: (ITextModel, js.Array[Position], CancellationToken) => ProviderResult[js.Array[js.Array[SelectionRange]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideSelectionRanges")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

