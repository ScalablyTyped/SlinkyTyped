package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTableOptions extends ListOptions[StyleListTable] {
  var data: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * Do not draw inner cells.
    */
  var noCellBorders: js.UndefOr[Boolean] = js.native
  /**
    * Spaces to attempt to pad on the sides of each cell. 2 by default: one space on each side
    * (only useful if the width is shrunken).
    */
  var pad: js.UndefOr[Double] = js.native
  /**
    * Array of array of strings representing rows.
    */
  var rows: js.UndefOr[js.Array[String]] = js.native
}

object ListTableOptions {
  @scala.inline
  def apply(): ListTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTableOptions]
  }
  @scala.inline
  implicit class ListTableOptionsOps[Self <: ListTableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCellBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCellBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCellBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCellBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

