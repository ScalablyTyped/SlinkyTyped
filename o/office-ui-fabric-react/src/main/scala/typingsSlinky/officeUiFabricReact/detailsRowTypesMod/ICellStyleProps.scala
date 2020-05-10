package typingsSlinky.officeUiFabricReact.detailsRowTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellStyleProps extends js.Object {
  var cellExtraRightPadding: Double = js.native
  var cellLeftPadding: Double = js.native
  var cellRightPadding: Double = js.native
}

object ICellStyleProps {
  @scala.inline
  def apply(cellExtraRightPadding: Double, cellLeftPadding: Double, cellRightPadding: Double): ICellStyleProps = {
    val __obj = js.Dynamic.literal(cellExtraRightPadding = cellExtraRightPadding.asInstanceOf[js.Any], cellLeftPadding = cellLeftPadding.asInstanceOf[js.Any], cellRightPadding = cellRightPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellStyleProps]
  }
  @scala.inline
  implicit class ICellStylePropsOps[Self <: ICellStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellExtraRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellExtraRightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellLeftPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLeftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRightPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

