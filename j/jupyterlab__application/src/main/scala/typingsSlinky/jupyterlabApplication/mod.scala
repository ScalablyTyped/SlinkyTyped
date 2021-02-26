package typingsSlinky.jupyterlabApplication

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IOptions
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/application", "ConnectionLost")
  @js.native
  val ConnectionLost: typingsSlinky.jupyterlabApplication.tokensMod.IConnectionLost = js.native
  
  @JSImport("@jupyterlab/application", "IConnectionLost")
  @js.native
  val IConnectionLost: Token[typingsSlinky.jupyterlabApplication.tokensMod.IConnectionLost] = js.native
  
  object ILabShell extends Shortcut {
    
    @JSImport("@jupyterlab/application", "ILabShell")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabApplication.shellMod.ILabShell] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabApplication.shellMod.ILabShell]
    
    /* This means you don't have to write `^`, but can instead just say `ILabShell.foo` */
    override def _to: Token[typingsSlinky.jupyterlabApplication.shellMod.ILabShell] = ^
  }
  
  @JSImport("@jupyterlab/application", "ILabStatus")
  @js.native
  val ILabStatus: Token[typingsSlinky.jupyterlabApplication.statusMod.ILabStatus] = js.native
  
  @JSImport("@jupyterlab/application", "ILayoutRestorer")
  @js.native
  val ILayoutRestorer: Token[typingsSlinky.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer] = js.native
  
  @JSImport("@jupyterlab/application", "IMimeDocumentTracker")
  @js.native
  val IMimeDocumentTracker: Token[typingsSlinky.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  
  object IRouter extends Shortcut {
    
    @JSImport("@jupyterlab/application", "IRouter")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabApplication.tokensMod.IRouter] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabApplication.tokensMod.IRouter]
    
    /* This means you don't have to write `^`, but can instead just say `IRouter.foo` */
    override def _to: Token[typingsSlinky.jupyterlabApplication.tokensMod.IRouter] = ^
  }
  
  @JSImport("@jupyterlab/application", "JupyterFrontEnd")
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, _]) = this()
  }
  object JupyterFrontEnd {
    
    /**
      * The application paths dictionary token.
      */
    @JSImport("@jupyterlab/application", "JupyterFrontEnd.IPaths")
    @js.native
    val IPaths: Token[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths] = js.native
    
    /**
      * A namespace for tree resolver types.
      */
    object ITreeResolver extends Shortcut {
      
      @JSImport("@jupyterlab/application", "JupyterFrontEnd.ITreeResolver")
      @js.native
      val ^ : Token[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver] = js.native
      
      type _To = Token[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver]
      
      /* This means you don't have to write `^`, but can instead just say `ITreeResolver.foo` */
      override def _to: Token[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver] = ^
    }
  }
  
  @JSImport("@jupyterlab/application", "JupyterLab")
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab ()
    extends typingsSlinky.jupyterlabApplication.labMod.JupyterLab {
    def this(options: typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IOptions) = this()
  }
  object JupyterLab {
    
    /**
      * The layout restorer token.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.IInfo")
    @js.native
    val IInfo: Token[typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IInfo] = js.native
    
    /**
      * The default JupyterLab application info.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.defaultInfo")
    @js.native
    val defaultInfo: typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IInfo = js.native
    
    /**
      * The default JupyterLab application paths.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.defaultPaths")
    @js.native
    val defaultPaths: IPaths = js.native
  }
  
  @JSImport("@jupyterlab/application", "LabShell")
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typingsSlinky.jupyterlabApplication.shellMod.LabShell
  
  @JSImport("@jupyterlab/application", "LayoutRestorer")
  @js.native
  class LayoutRestorer protected ()
    extends typingsSlinky.jupyterlabApplication.layoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typingsSlinky.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/application", "Router")
  @js.native
  class Router protected ()
    extends typingsSlinky.jupyterlabApplication.routerMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typingsSlinky.jupyterlabApplication.routerMod.Router.IOptions) = this()
  }
}
