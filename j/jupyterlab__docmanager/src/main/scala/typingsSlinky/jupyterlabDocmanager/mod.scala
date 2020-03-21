package typingsSlinky.jupyterlabDocmanager

import typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DocumentManager protected ()
    extends typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DocumentWidgetManager protected ()
    extends typingsSlinky.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typingsSlinky.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @js.native
  class PathStatus protected ()
    extends typingsSlinky.jupyterlabDocmanager.pathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typingsSlinky.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions) = this()
  }
  
  @js.native
  class SaveHandler protected ()
    extends typingsSlinky.jupyterlabDocmanager.savehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typingsSlinky.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @js.native
  class SavingStatus protected ()
    extends typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions) = this()
  }
  
  val IDocumentManager: Token[typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager] = js.native
  def isValidFileName(name: String): Boolean = js.native
  def renameDialog(manager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  def renameFile(
    manager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager,
    oldPath: String,
    newPath: String
  ): js.Promise[IModel | Null] = js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
  @js.native
  object PathStatus extends js.Object {
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @js.native
    class Model protected ()
      extends typingsSlinky.jupyterlabDocmanager.pathstatusMod.PathStatus.Model {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
    
  }
  
  @js.native
  object SavingStatus extends js.Object {
    /**
      * A VDomModel for the SavingStatus item.
      */
    @js.native
    class Model protected ()
      extends typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
    
  }
  
}

