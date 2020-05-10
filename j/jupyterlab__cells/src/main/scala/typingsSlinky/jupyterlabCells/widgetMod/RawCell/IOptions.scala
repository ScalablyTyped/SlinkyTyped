package typingsSlinky.jupyterlabCells.widgetMod.RawCell

import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a base cell widget.
  */
@js.native
trait IOptions
  extends typingsSlinky.jupyterlabCells.widgetMod.Cell.IOptions

object IOptions {
  @scala.inline
  def apply(model: ICellModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

