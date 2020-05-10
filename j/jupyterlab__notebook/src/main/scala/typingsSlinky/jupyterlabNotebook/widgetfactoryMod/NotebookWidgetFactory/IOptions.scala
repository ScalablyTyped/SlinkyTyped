package typingsSlinky.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory

import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a `NotebookWidgetFactory`.
  */
@js.native
trait IOptions[T /* <: NotebookPanel */] extends IWidgetFactoryOptions[T] {
  /**
    * A notebook panel content factory.
    */
  var contentFactory: IContentFactory = js.native
  /**
    * The notebook cell editor configuration.
    */
  var editorConfig: js.UndefOr[IEditorConfig] = js.native
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  /**
    * The notebook configuration.
    */
  var notebookConfig: js.UndefOr[INotebookConfig] = js.native
  var rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply[T](
    contentFactory: IContentFactory,
    fileTypes: js.Array[String],
    mimeTypeService: IEditorMimeTypeService,
    name: String,
    rendermime: IRenderMimeRegistry
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContentFactory(value: IContentFactory): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeTypeService(value: IEditorMimeTypeService): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorConfig(value: IEditorConfig): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorConfig: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookConfig(value: INotebookConfig): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookConfig: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookConfig")(js.undefined)
        ret
    }
  }
  
}

