package typingsSlinky.luminoDatagrid.renderermapMod

import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typingsSlinky.luminoDatagrid.renderermapMod.RendererMap.Values
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/renderermap", "RendererMap")
@js.native
/**
  * Construct a new renderer map.
  *
  * @param values - The initial values for the map.
  *
  * @param fallback - The renderer of last resort.
  */
class RendererMap_ () extends js.Object {
  def this(values: Values) = this()
  def this(values: js.UndefOr[scala.Nothing], fallback: CellRenderer) = this()
  def this(values: Values, fallback: CellRenderer) = this()
  
  var _changed: js.Any = js.native
  
  var _fallback: js.Any = js.native
  
  var _values: js.Any = js.native
  
  /**
    * A signal emitted when the renderer map has changed.
    */
  val changed: ISignal[this.type, Unit] = js.native
  
  /**
    * Get the cell renderer to use for the given cell config.
    *
    * @param config - The cell config of interest.
    *
    * @returns The renderer to use for the cell.
    */
  def get(config: CellConfig): CellRenderer = js.native
  
  /**
    * Update the renderer map with new values
    *
    * @param values - The updated values for the map.
    *
    * @param fallback - The renderer of last resort.
    *
    * #### Notes
    * This method always emits the `changed` signal.
    */
  def update(): Unit = js.native
  def update(values: js.UndefOr[scala.Nothing], fallback: CellRenderer): Unit = js.native
  def update(values: Values): Unit = js.native
  def update(values: Values, fallback: CellRenderer): Unit = js.native
}
