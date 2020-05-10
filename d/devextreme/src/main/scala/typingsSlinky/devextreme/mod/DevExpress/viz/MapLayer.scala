package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayer extends js.Object {
  /** The type of the layer elements. */
  var elementType: String = js.native
  /** The layer index in the layers array. */
  var index: Double = js.native
  /** The name of the layer. */
  var name: String = js.native
  /** The layer type. Can be "area", "line" or "marker". */
  var `type`: String = js.native
  /** Deselects all layer elements. */
  def clearSelection(): Unit = js.native
  /** Returns the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets all layer elements. */
  def getElements(): js.Array[MapLayerElement] = js.native
}

object MapLayer {
  @scala.inline
  def apply(
    clearSelection: () => Unit,
    elementType: String,
    getDataSource: () => DataSource,
    getElements: () => js.Array[MapLayerElement],
    index: Double,
    name: String,
    `type`: String
  ): MapLayer = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), elementType = elementType.asInstanceOf[js.Any], getDataSource = js.Any.fromFunction0(getDataSource), getElements = js.Any.fromFunction0(getElements), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayer]
  }
  @scala.inline
  implicit class MapLayerOps[Self <: MapLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSelection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDataSource(value: () => DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElements(value: () => js.Array[MapLayerElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

