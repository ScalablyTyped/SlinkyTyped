package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameProvider extends js.Object {
  var resolveRenameLocation: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[RenameLocation with Rejection]
    ]
  ] = js.native
  def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit with Rejection] = js.native
}

object RenameProvider {
  @scala.inline
  def apply(
    provideRenameEdits: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection]
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
    __obj.asInstanceOf[RenameProvider]
  }
  @scala.inline
  implicit class RenameProviderOps[Self <: RenameProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideRenameEdits(
      value: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideRenameEdits")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withResolveRenameLocation(
      value: (/* model */ ITextModel, /* position */ Position, /* token */ CancellationToken) => ProviderResult[RenameLocation with Rejection]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRenameLocation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResolveRenameLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRenameLocation")(js.undefined)
        ret
    }
  }
  
}

