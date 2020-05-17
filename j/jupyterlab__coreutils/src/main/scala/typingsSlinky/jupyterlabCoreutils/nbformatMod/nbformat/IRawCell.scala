package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.anon.PartialIRawCellMetadata
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A raw cell.
  */
@js.native
trait IRawCell
  extends IBaseCell
     with ICell {
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.native
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IRawCell: raw = js.native
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_IRawCell: PartialIRawCellMetadata = js.native
}

object IRawCell {
  @scala.inline
  def apply(cell_type: raw, metadata: PartialIRawCellMetadata, source: MultilineString): IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCell]
  }
  @scala.inline
  implicit class IRawCellOps[Self <: IRawCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_type(value: raw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: PartialIRawCellMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachments(value: IAttachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
  }
  
}

