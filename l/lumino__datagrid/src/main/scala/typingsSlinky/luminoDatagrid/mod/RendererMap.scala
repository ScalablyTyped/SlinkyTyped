package typingsSlinky.luminoDatagrid.mod

import typingsSlinky.luminoDatagrid.renderermapMod.RendererMap.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid", "RendererMap")
@js.native
/**
  * Construct a new renderer map.
  *
  * @param values - The initial values for the map.
  *
  * @param fallback - The renderer of last resort.
  */
class RendererMap ()
  extends typingsSlinky.luminoDatagrid.renderermapMod.RendererMap {
  def this(values: Values) = this()
  def this(
    values: js.UndefOr[scala.Nothing],
    fallback: typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer
  ) = this()
  def this(values: Values, fallback: typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer) = this()
}

