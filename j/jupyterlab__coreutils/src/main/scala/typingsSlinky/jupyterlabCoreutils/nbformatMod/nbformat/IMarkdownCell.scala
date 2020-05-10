package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A markdown cell.
  */
@js.native
trait IMarkdownCell
  extends IBaseCell
     with _ICell {
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.native
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IMarkdownCell: markdown = js.native
}

object IMarkdownCell {
  @scala.inline
  def apply(cell_type: markdown, metadata: Partial[ICellMetadata], source: MultilineString): IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownCell]
  }
  @scala.inline
  implicit class IMarkdownCellOps[Self <: IMarkdownCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_type(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_type")(value.asInstanceOf[js.Any])
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

