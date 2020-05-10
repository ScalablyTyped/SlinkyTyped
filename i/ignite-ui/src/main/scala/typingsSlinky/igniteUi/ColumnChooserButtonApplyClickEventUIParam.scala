package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnChooserButtonApplyClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the Column Chooser element. This is a jQuery object.
  	 */
  var columnChooserElement: js.UndefOr[String] = js.native
  /**
  	 * Gets the array of columns identifiers which should be hidden.
  	 */
  var columnsToHide: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets the array of columns identifiers which should be shown.
  	 */
  var columnsToShow: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnChooserButtonApplyClickEventUIParam {
  @scala.inline
  def apply(): ColumnChooserButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooserButtonApplyClickEventUIParam]
  }
  @scala.inline
  implicit class ColumnChooserButtonApplyClickEventUIParamOps[Self <: ColumnChooserButtonApplyClickEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnChooserElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserElement")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsToHide(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsToHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsToHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsToHide")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsToShow(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsToShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsToShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

