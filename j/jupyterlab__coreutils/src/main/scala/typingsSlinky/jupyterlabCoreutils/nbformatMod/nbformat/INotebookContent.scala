package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The notebook content.
  */
@js.native
trait INotebookContent extends JSONObject {
  var cells: js.Array[ICell] = js.native
  var metadata: INotebookMetadata = js.native
  var nbformat: Double = js.native
  var nbformat_minor: Double = js.native
}

object INotebookContent {
  @scala.inline
  def apply(cells: js.Array[ICell], metadata: INotebookMetadata, nbformat: Double, nbformat_minor: Double): INotebookContent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContent]
  }
  @scala.inline
  implicit class INotebookContentOps[Self <: INotebookContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[ICell]): Self = {
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

