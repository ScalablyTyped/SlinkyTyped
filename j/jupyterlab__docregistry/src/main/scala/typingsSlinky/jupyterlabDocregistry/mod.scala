package typingsSlinky.jupyterlabDocregistry

import typingsSlinky.jupyterlabDocregistry.anon.PartialIFileType
import typingsSlinky.jupyterlabDocregistry.contextMod.Context.IOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/docregistry", "ABCWidgetFactory")
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.ABCWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "Base64ModelFactory")
  @js.native
  class Base64ModelFactory ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.Base64ModelFactory
  
  @JSImport("@jupyterlab/docregistry", "Context")
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends typingsSlinky.jupyterlabDocregistry.contextMod.Context[T] {
    /**
      * Construct a new document context.
      */
    def this(options: IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentModel")
  @js.native
  /**
    * Construct a new document model.
    */
  class DocumentModel ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: js.UndefOr[scala.Nothing], modelDB: IModelDB) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentRegistry")
  @js.native
  /**
    * Construct a new document registry.
    */
  class DocumentRegistry ()
    extends typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry {
    def this(options: typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IOptions) = this()
  }
  object DocumentRegistry {
    
    /**
      * The default directory file type used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultDirectoryFileType")
    @js.native
    val defaultDirectoryFileType: IFileType = js.native
    
    /**
      * The default file types used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultFileTypes")
    @js.native
    val defaultFileTypes: js.Array[PartialIFileType] = js.native
    
    /**
      * The default notebook file type used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultNotebookFileType")
    @js.native
    val defaultNotebookFileType: IFileType = js.native
    
    /**
      * The default text file type used by the document registry.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.defaultTextFileType")
    @js.native
    val defaultTextFileType: IFileType = js.native
    
    /**
      * The defaults used for a file type.
      */
    @JSImport("@jupyterlab/docregistry", "DocumentRegistry.fileTypeDefaults")
    @js.native
    val fileTypeDefaults: IFileType = js.native
  }
  
  @JSImport("@jupyterlab/docregistry", "DocumentWidget")
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget[T, U] {
    def this(options: typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[T, U]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeContent")
  @js.native
  class MimeContent protected ()
    extends typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeContent {
    /**
      * Construct a new widget.
      */
    def this(options: typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeDocument")
  @js.native
  class MimeDocument protected ()
    extends typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocument {
    def this(options: typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeContent, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "MimeDocumentFactory")
  @js.native
  class MimeDocumentFactory protected ()
    extends typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory.IOptions[typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocument]) = this()
  }
  
  @JSImport("@jupyterlab/docregistry", "TextModelFactory")
  @js.native
  class TextModelFactory ()
    extends typingsSlinky.jupyterlabDocregistry.defaultMod.TextModelFactory
}
