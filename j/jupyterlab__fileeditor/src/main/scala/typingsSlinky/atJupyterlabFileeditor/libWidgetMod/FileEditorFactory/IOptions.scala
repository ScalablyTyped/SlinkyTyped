package typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory

import typingsSlinky.atJupyterlabCodeeditor.libTokensMod.IEditorServices
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor services used by the factory.
    */
  var editorServices: IEditorServices
  /**
    * The factory options associated with the factory.
    */
  var factoryOptions: IWidgetFactoryOptions[IDocumentWidget[FileEditor, IModel]]
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
}

