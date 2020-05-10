package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotebookContents extends js.Object {
  val cells: js.Array[ICellContents] = js.native
  val metadata: INotebookMetadata = js.native
  val nbformat: Double = js.native
  val nbformat_minor: Double = js.native
}

object INotebookContents {
  @scala.inline
  def apply(
    cells: js.Array[ICellContents],
    metadata: INotebookMetadata,
    nbformat: Double,
    nbformat_minor: Double
  ): INotebookContents = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContents]
  }
  @scala.inline
  implicit class INotebookContentsOps[Self <: INotebookContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[ICellContents]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: INotebookMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbformat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbformat_minor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbformat_minor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

