package typingsSlinky.jupyterlabApplication

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IOptions
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/application", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ConnectionLost: typingsSlinky.jupyterlabApplication.tokensMod.IConnectionLost = js.native
  
  val IConnectionLost: Token[typingsSlinky.jupyterlabApplication.tokensMod.IConnectionLost] = js.native
  
  val ILabStatus: Token[typingsSlinky.jupyterlabApplication.statusMod.ILabStatus] = js.native
  
  val ILayoutRestorer: Token[typingsSlinky.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer] = js.native
  
  val IMimeDocumentTracker: Token[typingsSlinky.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  
  @js.native
  object ILabShell
    extends TopLevel[Token[typingsSlinky.jupyterlabApplication.shellMod.ILabShell]]
  
  @js.native
  object IRouter
    extends TopLevel[Token[typingsSlinky.jupyterlabApplication.tokensMod.IRouter]]
  
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, _]) = this()
  }
  @js.native
  object JupyterFrontEnd extends js.Object {
    
    /**
      * The application paths dictionary token.
      */
    val IPaths: Token[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths] = js.native
    
    /**
      * A namespace for tree resolver types.
      */
    @js.native
    object ITreeResolver
      extends TopLevel[
              Token[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver]
            ]
  }
  
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab ()
    extends typingsSlinky.jupyterlabApplication.labMod.JupyterLab {
    def this(options: typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IOptions) = this()
  }
  @js.native
  object JupyterLab extends js.Object {
    
    /**
      * The layout restorer token.
      */
    val IInfo: Token[typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IInfo] = js.native
    
    /**
      * The default JupyterLab application info.
      */
    val defaultInfo: typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IInfo = js.native
    
    /**
      * The default JupyterLab application paths.
      */
    val defaultPaths: IPaths = js.native
  }
  
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typingsSlinky.jupyterlabApplication.shellMod.LabShell
  
  @js.native
  class LayoutRestorer protected ()
    extends typingsSlinky.jupyterlabApplication.layoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typingsSlinky.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @js.native
  class Router protected ()
    extends typingsSlinky.jupyterlabApplication.routerMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typingsSlinky.jupyterlabApplication.routerMod.Router.IOptions) = this()
  }
}
