package typingsSlinky.atJupyterlabDocregistry

import typingsSlinky.atJupyterlabDocregistry.libContextMod.Context.IOptions
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typingsSlinky.atJupyterlabObservables.libModeldbMod.IModelDB
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry", JSImport.Namespace)
@js.native
object atJupyterlabDocregistryMod extends js.Object {
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typingsSlinky.atJupyterlabDocregistry.libDefaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @js.native
  class Base64ModelFactory ()
    extends typingsSlinky.atJupyterlabDocregistry.libDefaultMod.Base64ModelFactory
  
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typingsSlinky.atJupyterlabDocregistry.libContextMod.Context[T] {
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
    extends typingsSlinky.atJupyterlabDocregistry.libDefaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry {
    def this(options: typingsSlinky.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOptions) = this()
  }
  
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typingsSlinky.atJupyterlabDocregistry.libDefaultMod.DocumentWidget[T, U] {
    def this(options: typingsSlinky.atJupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @js.native
  class MimeContent protected ()
    extends typingsSlinky.atJupyterlabDocregistry.libMimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typingsSlinky.atJupyterlabDocregistry.libMimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @js.native
  class MimeDocument ()
    extends typingsSlinky.atJupyterlabDocregistry.libMimedocumentMod.MimeDocument
  
  @js.native
  class MimeDocumentFactory protected ()
    extends typingsSlinky.atJupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typingsSlinky.atJupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions[typingsSlinky.atJupyterlabDocregistry.libMimedocumentMod.MimeDocument]) = this()
  }
  
  @js.native
  class TextModelFactory ()
    extends typingsSlinky.atJupyterlabDocregistry.libDefaultMod.TextModelFactory
  
  @js.native
  object DocumentRegistry extends js.Object {
    /**
      * The default directory file type used by the document registry.
      */
    val defaultDirectoryFileType: IFileType = js.native
    /**
      * The default file types used by the document registry.
      */
    val defaultFileTypes: js.Array[Partial[IFileType]] = js.native
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

