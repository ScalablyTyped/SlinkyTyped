package typingsSlinky.jupyterlabNotebook.mod

import typingsSlinky.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookWidgetFactory")
@js.native
class NotebookWidgetFactory protected ()
  extends typingsSlinky.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory {
  /**
    * Construct a new notebook widget factory.
    *
    * @param options - The options used to construct the factory.
    */
  def this(options: IOptions[typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel]) = this()
}

