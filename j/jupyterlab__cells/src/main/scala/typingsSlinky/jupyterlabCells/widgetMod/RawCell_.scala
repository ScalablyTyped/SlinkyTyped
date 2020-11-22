package typingsSlinky.jupyterlabCells.widgetMod

import typingsSlinky.jupyterlabCells.modelMod.IRawCellModel
import typingsSlinky.jupyterlabCells.widgetMod.Cell.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/widget", "RawCell")
@js.native
class RawCell_ protected () extends Cell {
  /**
    * Construct a raw cell widget.
    */
  def this(options: IOptions) = this()
  
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_FRawCell_ : IRawCellModel = js.native
}
