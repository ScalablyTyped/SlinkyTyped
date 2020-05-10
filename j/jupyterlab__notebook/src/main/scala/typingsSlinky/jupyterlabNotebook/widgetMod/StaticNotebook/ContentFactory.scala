package typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.jupyterlabCells.mod.Cell.ContentFactory
     with IContentFactory

/**
  * A namespace for the staic notebook content factory.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the content factory.
    */
  type IOptions = typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions
}

