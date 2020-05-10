package typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
     with IContentFactory

/**
  * A namespace for the console panel content factory.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the code console content factory.
    */
  type IOptions = typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory.IOptions
}

