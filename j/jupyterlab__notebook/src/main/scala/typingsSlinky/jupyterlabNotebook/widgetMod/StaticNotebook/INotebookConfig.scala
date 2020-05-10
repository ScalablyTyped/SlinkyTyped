package typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A config object for the notebook widget
  */
@js.native
trait INotebookConfig extends js.Object {
  /**
    * The default type for new notebook cells.
    */
  var defaultCell: CellType = js.native
  /**
    * Enable scrolling past the last cell
    */
  var scrollPastEnd: Boolean = js.native
}

object INotebookConfig {
  @scala.inline
  def apply(defaultCell: CellType, scrollPastEnd: Boolean): INotebookConfig = {
    val __obj = js.Dynamic.literal(defaultCell = defaultCell.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookConfig]
  }
  @scala.inline
  implicit class INotebookConfigOps[Self <: INotebookConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCell(value: CellType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPastEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPastEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

