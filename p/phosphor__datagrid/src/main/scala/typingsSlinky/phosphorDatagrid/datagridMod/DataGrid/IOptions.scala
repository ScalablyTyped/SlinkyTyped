package typingsSlinky.phosphorDatagrid.datagridMod.DataGrid

import typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer
import typingsSlinky.phosphorDatagrid.renderermapMod.RendererMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a data grid.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The base size for column headers in the data grid.
    *
    * The default is `20`.
    */
  var baseColumnHeaderSize: js.UndefOr[Double] = js.native
  /**
    * The base size for columns in the data grid.
    *
    * The default is `64`.
    */
  var baseColumnSize: js.UndefOr[Double] = js.native
  /**
    * The base size for row headers in the data grid.
    *
    * The default is `64`.
    */
  var baseRowHeaderSize: js.UndefOr[Double] = js.native
  /**
    * The base size for rows in the data grid.
    *
    * The default is `20`.
    */
  var baseRowSize: js.UndefOr[Double] = js.native
  /**
    * The cell renderer map for the data grid.
    *
    * The default is an empty renderer map.
    */
  var cellRenderers: js.UndefOr[RendererMap] = js.native
  /**
    * The default cell renderer for the data grid.
    *
    * The default is a new `TextRenderer`.
    */
  var defaultRenderer: js.UndefOr[CellRenderer] = js.native
  /**
    * The header visibility for the data grid.
    *
    * The default is `'all'`.
    */
  var headerVisibility: js.UndefOr[HeaderVisibility] = js.native
  /**
    * The style for the data grid.
    *
    * The default is `DataGrid.defaultStyle`.
    */
  var style: js.UndefOr[IStyle] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseColumnHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumnHeaderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColumnHeaderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumnHeaderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseColumnSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColumnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseRowHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRowHeaderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseRowHeaderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRowHeaderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseRowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRenderers(value: RendererMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderers")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRenderer(value: CellRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderVisibility(value: HeaderVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

