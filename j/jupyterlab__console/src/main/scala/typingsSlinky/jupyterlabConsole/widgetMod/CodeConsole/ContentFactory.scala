package typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.jupyterlabCells.mod.Cell.ContentFactory
     with IContentFactory

/**
  * A namespace for the code console content factory.
  */
@JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * An initialize options for `ContentFactory`.
    */
  type IOptions = typingsSlinky.jupyterlabCells.widgetMod.Cell.IContentFactory
}

