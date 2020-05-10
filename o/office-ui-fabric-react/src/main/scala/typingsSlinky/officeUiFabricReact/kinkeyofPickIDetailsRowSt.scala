package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ k in keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowStyles, 'isMultiline' | 'isRowHeader' | 'cell' | 'cellAnimation' | 'cellPadded' | 'cellUnpadded' | 'fields'> ]: string} */
@js.native
trait kinkeyofPickIDetailsRowSt extends js.Object {
  var cell: String = js.native
  var cellAnimation: String = js.native
  var cellPadded: String = js.native
  var cellUnpadded: String = js.native
  var fields: String = js.native
  var isMultiline: String = js.native
  var isRowHeader: String = js.native
}

object kinkeyofPickIDetailsRowSt {
  @scala.inline
  def apply(
    cell: String,
    cellAnimation: String,
    cellPadded: String,
    cellUnpadded: String,
    fields: String,
    isMultiline: String,
    isRowHeader: String
  ): kinkeyofPickIDetailsRowSt = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellAnimation = cellAnimation.asInstanceOf[js.Any], cellPadded = cellPadded.asInstanceOf[js.Any], cellUnpadded = cellUnpadded.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any], isRowHeader = isRowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[kinkeyofPickIDetailsRowSt]
  }
  @scala.inline
  implicit class kinkeyofPickIDetailsRowStOps[Self <: kinkeyofPickIDetailsRowSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellPadded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellUnpadded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellUnpadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRowHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

