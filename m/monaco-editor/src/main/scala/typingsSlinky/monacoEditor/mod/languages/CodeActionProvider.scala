package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Range
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionProvider extends js.Object {
  /**
    * Provide commands for the given document and range.
    */
  def provideCodeActions(model: ITextModel, range: Range, context: CodeActionContext, token: CancellationToken): CodeActionList | js.Promise[CodeActionList] = js.native
}

object CodeActionProvider {
  @scala.inline
  def apply(
    provideCodeActions: (ITextModel, Range, CodeActionContext, CancellationToken) => CodeActionList | js.Promise[CodeActionList]
  ): CodeActionProvider = {
    val __obj = js.Dynamic.literal(provideCodeActions = js.Any.fromFunction4(provideCodeActions))
    __obj.asInstanceOf[CodeActionProvider]
  }
  @scala.inline
  implicit class CodeActionProviderOps[Self <: CodeActionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideCodeActions(
      value: (ITextModel, Range, CodeActionContext, CancellationToken) => CodeActionList | js.Promise[CodeActionList]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeActions")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

