package typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory

import typingsSlinky.jupyterlabCodeeditor.tokensMod.IEditorServices
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget factory.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The editor services used by the factory.
    */
  var editorServices: IEditorServices = js.native
  /**
    * The factory options associated with the factory.
    */
  var factoryOptions: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]] = js.native
}

object IOptions {
  @scala.inline
  def apply(
    editorServices: IEditorServices,
    factoryOptions: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]]
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorServices = editorServices.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorServices(value: IEditorServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactoryOptions(value: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

