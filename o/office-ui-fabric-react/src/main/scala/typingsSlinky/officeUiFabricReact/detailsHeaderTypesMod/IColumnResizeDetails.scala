package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnResizeDetails extends js.Object {
  var columnIndex: Double = js.native
  var columnMinWidth: Double = js.native
  var originX: js.UndefOr[Double] = js.native
}

object IColumnResizeDetails {
  @scala.inline
  def apply(columnIndex: Double, columnMinWidth: Double): IColumnResizeDetails = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnResizeDetails]
  }
  @scala.inline
  implicit class IColumnResizeDetailsOps[Self <: IColumnResizeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(js.undefined)
        ret
    }
  }
  
}

