package typingsSlinky.phosphorDatagrid.datagridMod.DataGrid

import typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer
import typingsSlinky.phosphorDatagrid.renderermapMod.RendererMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a data grid.
  */
trait IOptions extends js.Object {
  /**
    * The base size for column headers in the data grid.
    *
    * The default is `20`.
    */
  var baseColumnHeaderSize: js.UndefOr[Double] = js.undefined
  /**
    * The base size for columns in the data grid.
    *
    * The default is `64`.
    */
  var baseColumnSize: js.UndefOr[Double] = js.undefined
  /**
    * The base size for row headers in the data grid.
    *
    * The default is `64`.
    */
  var baseRowHeaderSize: js.UndefOr[Double] = js.undefined
  /**
    * The base size for rows in the data grid.
    *
    * The default is `20`.
    */
  var baseRowSize: js.UndefOr[Double] = js.undefined
  /**
    * The cell renderer map for the data grid.
    *
    * The default is an empty renderer map.
    */
  var cellRenderers: js.UndefOr[RendererMap] = js.undefined
  /**
    * The default cell renderer for the data grid.
    *
    * The default is a new `TextRenderer`.
    */
  var defaultRenderer: js.UndefOr[CellRenderer] = js.undefined
  /**
    * The header visibility for the data grid.
    *
    * The default is `'all'`.
    */
  var headerVisibility: js.UndefOr[HeaderVisibility] = js.undefined
  /**
    * The style for the data grid.
    *
    * The default is `DataGrid.defaultStyle`.
    */
  var style: js.UndefOr[IStyle] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    baseColumnHeaderSize: js.UndefOr[Double] = js.undefined,
    baseColumnSize: js.UndefOr[Double] = js.undefined,
    baseRowHeaderSize: js.UndefOr[Double] = js.undefined,
    baseRowSize: js.UndefOr[Double] = js.undefined,
    cellRenderers: RendererMap = null,
    defaultRenderer: CellRenderer = null,
    headerVisibility: HeaderVisibility = null,
    style: IStyle = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseColumnHeaderSize)) __obj.updateDynamic("baseColumnHeaderSize")(baseColumnHeaderSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseColumnSize)) __obj.updateDynamic("baseColumnSize")(baseColumnSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseRowHeaderSize)) __obj.updateDynamic("baseRowHeaderSize")(baseRowHeaderSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseRowSize)) __obj.updateDynamic("baseRowSize")(baseRowSize.get.asInstanceOf[js.Any])
    if (cellRenderers != null) __obj.updateDynamic("cellRenderers")(cellRenderers.asInstanceOf[js.Any])
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(defaultRenderer.asInstanceOf[js.Any])
    if (headerVisibility != null) __obj.updateDynamic("headerVisibility")(headerVisibility.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

