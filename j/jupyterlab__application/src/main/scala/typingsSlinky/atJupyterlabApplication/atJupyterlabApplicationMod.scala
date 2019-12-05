package typingsSlinky.atJupyterlabApplication

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IOptions
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", JSImport.Namespace)
@js.native
object atJupyterlabApplicationMod extends js.Object {
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, _]) = this()
  }
  
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab ()
    extends typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab {
    def this(options: typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab.IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typingsSlinky.atJupyterlabApplication.libShellMod.LabShell
  
  @js.native
  class LayoutRestorer protected ()
    extends typingsSlinky.atJupyterlabApplication.libLayoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typingsSlinky.atJupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @js.native
  class Router protected ()
    extends typingsSlinky.atJupyterlabApplication.libRouterMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typingsSlinky.atJupyterlabApplication.libRouterMod.Router.IOptions) = this()
  }
  
  val ConnectionLost: typingsSlinky.atJupyterlabApplication.libTokensMod.IConnectionLost = js.native
  val IConnectionLost: Token[typingsSlinky.atJupyterlabApplication.libTokensMod.IConnectionLost] = js.native
  val ILabStatus: Token[typingsSlinky.atJupyterlabApplication.libStatusMod.ILabStatus] = js.native
  val ILayoutRestorer: Token[typingsSlinky.atJupyterlabApplication.libLayoutrestorerMod.ILayoutRestorer] = js.native
  val IMimeDocumentTracker: Token[typingsSlinky.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  @js.native
  object ILabShell
    extends TopLevel[Token[typingsSlinky.atJupyterlabApplication.libShellMod.ILabShell]]
  
  @js.native
  object IRouter
    extends TopLevel[Token[typingsSlinky.atJupyterlabApplication.libTokensMod.IRouter]]
  
  @js.native
  object JupyterFrontEnd extends js.Object {
    /**
      * The application paths dictionary token.
      */
    val IPaths: Token[typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths] = js.native
  }
  
  @js.native
  object JupyterLab extends js.Object {
    /**
      * The layout restorer token.
      */
    val IInfo: Token[typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab.IInfo] = js.native
    /**
      * The default JupyterLab application info.
      */
    val defaultInfo: typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab.IInfo = js.native
    /**
      * The default JupyterLab application paths.
      */
    val defaultPaths: IPaths = js.native
  }
  
}

