package typingsSlinky.jupyterlabDocregistry

import typingsSlinky.jupyterlabDocregistry.contextMod.Context.IOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @js.native
  class Base64ModelFactory ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.Base64ModelFactory
  
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typingsSlinky.jupyterlabDocregistry.contextMod.Context[T] {
    /**
      * Construct a new document context.
      */
    def this(options: IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new document model.
    */
  class DocumentModel ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry {
    def this(options: typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IOptions) = this()
  }
  
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget[T, U] {
    def this(options: typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @js.native
  class MimeContent protected ()
    extends typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @js.native
  class MimeDocument ()
    extends typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocument
  
  @js.native
  class MimeDocumentFactory protected ()
    extends typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocument]) = this()
  }
  
  @js.native
  class TextModelFactory ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.TextModelFactory
  
  @js.native
  object DocumentRegistry extends js.Object {
    /**
      * The default directory file type used by the document registry.
      */
    val defaultDirectoryFileType: IFileType = js.native
    /**
      * The default file types used by the document registry.
      */
    val defaultFileTypes: js.Array[PartialIFileType] = js.native
    /**
      * The default notebook file type used by the document registry.
      */
    val defaultNotebookFileType: IFileType = js.native
    /**
      * The default text file type used by the document registry.
      */
    val defaultTextFileType: IFileType = js.native
    /**
      * The defaults used for a file type.
      */
    val fileTypeDefaults: IFileType = js.native
  }
  
}

