package typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook

import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a static notebook.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * A factory for creating content.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * A configuration object for the cell editor settings.
    */
  var editorConfig: js.UndefOr[IEditorConfig] = js.native
  /**
    * The language preference for the model.
    */
  var languagePreference: js.UndefOr[String] = js.native
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  /**
    * A configuration object for notebook settings.
    */
  var notebookConfig: js.UndefOr[INotebookConfig] = js.native
  /**
    * The rendermime instance used by the widget.
    */
  var rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(mimeTypeService: IEditorMimeTypeService, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeTypeService(value: IEditorMimeTypeService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentFactory(value: IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorConfig(value: IEditorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguagePreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languagePreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguagePreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languagePreference")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookConfig(value: INotebookConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookConfig")(js.undefined)
        ret
    }
  }
  
}

