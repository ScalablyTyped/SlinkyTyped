package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpProvider extends js.Object {
  val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[String]] = js.native
  val signatureHelpTriggerCharacters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provide help for the signature at the given position and document.
    */
  def provideSignatureHelp(model: ITextModel, position: Position, token: CancellationToken, context: SignatureHelpContext): ProviderResult[SignatureHelpResult] = js.native
}

object SignatureHelpProvider {
  @scala.inline
  def apply(
    provideSignatureHelp: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal(provideSignatureHelp = js.Any.fromFunction4(provideSignatureHelp))
    __obj.asInstanceOf[SignatureHelpProvider]
  }
  @scala.inline
  implicit class SignatureHelpProviderOps[Self <: SignatureHelpProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideSignatureHelp(
      value: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideSignatureHelp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSignatureHelpRetriggerCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelpRetriggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureHelpRetriggerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelpRetriggerCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureHelpTriggerCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelpTriggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureHelpTriggerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelpTriggerCharacters")(js.undefined)
        ret
    }
  }
  
}

