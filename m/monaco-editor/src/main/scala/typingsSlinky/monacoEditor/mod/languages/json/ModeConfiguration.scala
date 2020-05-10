package typingsSlinky.monacoEditor.mod.languages.json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModeConfiguration extends js.Object {
  /**
    * Defines whether the built-in color provider is enabled.
    */
  val colors: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in completionItemProvider is enabled.
    */
  val completionItems: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in diagnostic provider is enabled.
    */
  val diagnostics: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in documentFormattingEdit provider is enabled.
    */
  val documentFormattingEdits: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in documentRangeFormattingEdit provider is enabled.
    */
  val documentRangeFormattingEdits: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in documentSymbolProvider is enabled.
    */
  val documentSymbols: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in foldingRange provider is enabled.
    */
  val foldingRanges: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in hoverProvider is enabled.
    */
  val hovers: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in tokens provider is enabled.
    */
  val tokens: js.UndefOr[Boolean] = js.native
}

object ModeConfiguration {
  @scala.inline
  def apply(): ModeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeConfiguration]
  }
  @scala.inline
  implicit class ModeConfigurationOps[Self <: ModeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionItems")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnostics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentFormattingEdits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentFormattingEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentFormattingEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentFormattingEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentRangeFormattingEdits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRangeFormattingEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentRangeFormattingEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRangeFormattingEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withFoldingRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldingRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withHovers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovers")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
  }
  
}

