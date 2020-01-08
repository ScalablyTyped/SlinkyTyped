package typingsSlinky.atJupyterlabNotebook

import typingsSlinky.atJupyterlabApputils.libVdomMod.VDomModel
import typingsSlinky.atJupyterlabApputils.libVdomMod.VDomRenderer
import typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookMod.Notebook
import typingsSlinky.atJupyterlabNotebook.libModestatusMod.CommandEditStatus.Model
import typingsSlinky.atJupyterlabNotebook.libWidgetMod.NotebookMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/modestatus", JSImport.Namespace)
@js.native
object libModestatusMod extends js.Object {
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
        * Set the current notebook for the model.
        */
      var notebook: Notebook | Null = js.native
      /**
        * The current mode of the current notebook.
        */
      val notebookMode: NotebookMode = js.native
    }
    
  }
  
}

