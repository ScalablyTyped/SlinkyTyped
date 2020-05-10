package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base cell interface.
  */
@js.native
trait IBaseCell extends JSONObject {
  /**
    * String identifying the type of cell.
    */
  var cell_type: String = js.native
  /**
    * Cell-level metadata.
    */
  var metadata: Partial[ICellMetadata] = js.native
  /**
    * Contents of the cell, represented as an array of lines.
    */
  var source: MultilineString = js.native
}

object IBaseCell {
  @scala.inline
  def apply(cell_type: String, metadata: Partial[ICellMetadata], source: MultilineString): IBaseCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCell]
  }
  @scala.inline
  implicit class IBaseCellOps[Self <: IBaseCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Partial[ICellMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: MultilineString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

