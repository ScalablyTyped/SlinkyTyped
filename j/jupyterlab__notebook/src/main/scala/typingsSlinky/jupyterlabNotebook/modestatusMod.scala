package typingsSlinky.jupyterlabNotebook

import typingsSlinky.jupyterlabApputils.mod.VDomRenderer
import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabNotebook.mod.Notebook
import typingsSlinky.jupyterlabNotebook.modestatusMod.CommandEditStatus.Model
import typingsSlinky.jupyterlabNotebook.widgetMod.NotebookMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook/lib/modestatus", JSImport.Namespace)
@js.native
object modestatusMod extends js.Object {
  
  @js.native
  /**
    * Construct a new CommandEdit status item.
    */
  class CommandEditStatus () extends VDomRenderer[Model]
  @js.native
  object CommandEditStatus extends js.Object {
    
    /**
      * A VDomModle for the CommandEdit renderer.
      */
    @js.native
    class Model () extends VDomModel {
      
      var _notebook: js.Any = js.native
      
      var _notebookMode: js.Any = js.native
      
      /**
        * On a change to the notebook, update the mode.
        */
      var _onChanged: js.Any = js.native
      
      /**
        * Trigger a state change for the renderer.
        */
      var _triggerChange: js.Any = js.native
      
      /**
        * The current mode of the current notebook.
        */
      def notebookMode: NotebookMode = js.native
      
      /**
        * Set the current notebook for the model.
        */
      def notebook_=(notebook: Notebook | Null): Unit = js.native
    }
  }
}
