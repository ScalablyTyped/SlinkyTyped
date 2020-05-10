package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorConstructionOptions extends IEditorOptions {
  /**
    * An URL to open when Ctrl+H (Windows and Linux) or Cmd+H (OSX) is pressed in
    * the accessibility help dialog in the editor.
    *
    * Defaults to "https://go.microsoft.com/fwlink/?linkid=852450"
    */
  var accessibilityHelpUrl: js.UndefOr[String] = js.native
  /**
    * The initial language of the auto created model in the editor.
    * To not create automatically a model, use `model: null`.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The initial model associated with this code editor.
    */
  var model: js.UndefOr[ITextModel | Null] = js.native
  /**
    * Initial theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * The initial value of the auto created model in the editor.
    * To not create automatically a model, use `model: null`.
    */
  var value: js.UndefOr[String] = js.native
}

object IEditorConstructionOptions {
  @scala.inline
  def apply(): IEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorConstructionOptions]
  }
  @scala.inline
  implicit class IEditorConstructionOptionsOps[Self <: IEditorConstructionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityHelpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHelpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityHelpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHelpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: ITextModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withModelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(null)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

