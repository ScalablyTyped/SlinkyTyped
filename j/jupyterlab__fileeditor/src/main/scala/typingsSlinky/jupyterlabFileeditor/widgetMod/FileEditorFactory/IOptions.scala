package typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory

import typingsSlinky.jupyterlabCodeeditor.tokensMod.IEditorServices
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEditorServices(value: IEditorServices): Self = this.set("editorServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryOptions(value: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]]): Self = this.set("factoryOptions", value.asInstanceOf[js.Any])
  }
}
