package typingsSlinky.openseadragon.anon

import typingsSlinky.openseadragon.openseadragonStrings.horizontal
import typingsSlinky.openseadragon.openseadragonStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  var columns: js.UndefOr[Double] = js.native
  var immediately: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[horizontal | vertical] = js.native
  var rows: js.UndefOr[Double] = js.native
  var tileMargin: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
}

object Columns {
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediately")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
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
    @scala.inline
    def withTileMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
  }
  
}

