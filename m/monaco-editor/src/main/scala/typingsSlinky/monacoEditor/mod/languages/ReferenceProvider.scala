package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceProvider extends js.Object {
  /**
    * Provide a set of project-wide references for the given position and document.
    */
  def provideReferences(model: ITextModel, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]] = js.native
}

object ReferenceProvider {
  @scala.inline
  def apply(
    provideReferences: (ITextModel, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal(provideReferences = js.Any.fromFunction4(provideReferences))
    __obj.asInstanceOf[ReferenceProvider]
  }
  @scala.inline
  implicit class ReferenceProviderOps[Self <: ReferenceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideReferences(
      value: (ITextModel, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideReferences")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

