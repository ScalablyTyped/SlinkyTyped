package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.IDisposable
import typingsSlinky.monacoEditor.mod.IEvent
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensProvider extends js.Object {
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.native
  var resolveCodeLens: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      ProviderResult[CodeLens]
    ]
  ] = js.native
  def provideCodeLenses(model: ITextModel, token: CancellationToken): ProviderResult[CodeLensList] = js.native
}

object CodeLensProvider {
  @scala.inline
  def apply(provideCodeLenses: (ITextModel, CancellationToken) => ProviderResult[CodeLensList]): CodeLensProvider = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider]
  }
  @scala.inline
  implicit class CodeLensProviderOps[Self <: CodeLensProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideCodeLenses(value: (ITextModel, CancellationToken) => ProviderResult[CodeLensList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCodeLenses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnDidChange(
      value: (/* listener */ js.Function1[CodeLensProvider, js.Any], /* thisArg */ js.UndefOr[js.Any]) => IDisposable
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDidChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChange")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveCodeLens(
      value: (/* model */ ITextModel, /* codeLens */ CodeLens, /* token */ CancellationToken) => ProviderResult[CodeLens]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCodeLens")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResolveCodeLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCodeLens")(js.undefined)
        ret
    }
  }
  
}

