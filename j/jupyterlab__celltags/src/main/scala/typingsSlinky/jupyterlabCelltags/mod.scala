package typingsSlinky.jupyterlabCelltags

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabNotebook.tokensMod.INotebookTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/celltags", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Construct a new tag widget.
    */
  class AddWidget ()
    extends typingsSlinky.jupyterlabCelltags.addwidgetMod.AddWidget
  
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
  
  @js.native
  class TagWidget protected ()
    extends typingsSlinky.jupyterlabCelltags.widgetMod.TagWidget {
    /**
      * Construct a new tag widget.
      */
    def this(name: String) = this()
  }
}
