package typingsSlinky.jupyterlabDocmanager

import typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/docmanager", "DocumentManager")
  @js.native
  class DocumentManager protected ()
    extends typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "DocumentWidgetManager")
  @js.native
  class DocumentWidgetManager protected ()
    extends typingsSlinky.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typingsSlinky.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "IDocumentManager")
  @js.native
  val IDocumentManager: Token[typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager] = js.native
  
  @JSImport("@jupyterlab/docmanager", "PathStatus")
  @js.native
  class PathStatus protected ()
    extends typingsSlinky.jupyterlabDocmanager.pathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typingsSlinky.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions) = this()
  }
  object PathStatus {
    
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @JSImport("@jupyterlab/docmanager", "PathStatus.Model")
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
  
  @JSImport("@jupyterlab/docmanager", "SaveHandler")
  @js.native
  class SaveHandler protected ()
    extends typingsSlinky.jupyterlabDocmanager.savehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typingsSlinky.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "SavingStatus")
  @js.native
  class SavingStatus protected ()
    extends typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions) = this()
  }
  object SavingStatus {
    
    /**
      * A VDomModel for the SavingStatus item.
      */
    @JSImport("@jupyterlab/docmanager", "SavingStatus.Model")
    @js.native
    class Model protected ()
      extends typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
  }
  
  @JSImport("@jupyterlab/docmanager", "isValidFileName")
  @js.native
  def isValidFileName(name: String): Boolean = js.native
  
  @JSImport("@jupyterlab/docmanager", "renameDialog")
  @js.native
  def renameDialog(manager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  
  @JSImport("@jupyterlab/docmanager", "renameFile")
  @js.native
  def renameFile(
    manager: typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager,
    oldPath: String,
    newPath: String
  ): js.Promise[IModel | Null] = js.native
  
  @JSImport("@jupyterlab/docmanager", "shouldOverwrite")
  @js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
}
