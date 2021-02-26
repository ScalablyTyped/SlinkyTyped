package typingsSlinky.jupyterlabCelltags

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabNotebook.tokensMod.INotebookTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/celltags", "AddWidget")
  @js.native
  /**
    * Construct a new tag widget.
    */
  class AddWidget ()
    extends typingsSlinky.jupyterlabCelltags.addwidgetMod.AddWidget
  
  @JSImport("@jupyterlab/celltags", "TagTool")
  @js.native
  class TagTool protected ()
    extends typingsSlinky.jupyterlabCelltags.toolMod.TagTool {
    /**
      * Construct a new tag Tool.
      *
      * @param tracker - The notebook tracker.
      */
    def this(tracker: INotebookTracker, app: JupyterFrontEnd[IShell]) = this()
  }
  
  @JSImport("@jupyterlab/celltags", "TagWidget")
  @js.native
  class TagWidget protected ()
    extends typingsSlinky.jupyterlabCelltags.widgetMod.TagWidget {
    /**
      * Construct a new tag widget.
      */
    def this(name: String) = this()
  }
}
