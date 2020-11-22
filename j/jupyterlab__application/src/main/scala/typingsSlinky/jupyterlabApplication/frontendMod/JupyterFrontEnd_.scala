package typingsSlinky.jupyterlabApplication.frontendMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IOptions
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApputils.mod.CommandLinker
import typingsSlinky.jupyterlabDocregistry.mod.DocumentRegistry
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import typingsSlinky.jupyterlabUiComponents.mod.ContextMenuSvg
import typingsSlinky.luminoApplication.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd")
@js.native
abstract class JupyterFrontEnd_[T /* <: IShell */] protected () extends Application[T] {
  /**
    * Construct a new JupyterFrontEnd object.
    */
  def this(options: IOptions[T, _]) = this()
  
  var _contextMenuEvent: js.Any = js.native
  
  /**
    * The command linker used by the application.
    */
  val commandLinker: CommandLinker = js.native
  
  /**
    * Walks up the DOM hierarchy of the target of the active `contextmenu`
    * event, testing each HTMLElement ancestor for a user-supplied funcion. This can
    * be used to find an HTMLElement on which to operate, given a context menu click.
    *
    * @param fn - a function that takes an `HTMLElement` and returns a
    *   boolean for whether it is the element the requester is seeking.
    *
    * @returns an HTMLElement or undefined, if none is found.
    */
  def contextMenuHitTest(fn: js.Function1[/* node */ HTMLElement, Boolean]): js.UndefOr[HTMLElement] = js.native
  
  @JSName("contextMenu")
  val contextMenu_JupyterFrontEnd_ : ContextMenuSvg = js.native
  
  /**
    * The document registry instance used by the application.
    */
  val docRegistry: DocumentRegistry = js.native
  
  /**
    * The name of this Jupyter front-end application.
    */
  val name: String = js.native
  
  /**
    * A namespace/prefix plugins may use to denote their provenance.
    */
  val namespace: String = js.native
  
  /**
    * Promise that resolves when state is first restored.
    */
  val restored: js.Promise[Unit] = js.native
  
  /**
    * The service manager used by the application.
    */
  val serviceManager: ServiceManager = js.native
  
  /**
    * The version of this Jupyter front-end application.
    */
  val version: String = js.native
}
