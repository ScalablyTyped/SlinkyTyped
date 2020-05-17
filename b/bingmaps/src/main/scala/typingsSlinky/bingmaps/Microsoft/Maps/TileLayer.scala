package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayer extends ILayer {
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any = js.native
  /**
    * Gets the opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    * @returns The opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    */
  def getOpacity(): Double = js.native
  /**
    * Gets the tile source of the tile layer.
    * @returns The tile source of the tile layer.
    */
  def getTileSource(): TileSource = js.native
  /**
    * Gets a boolean that indicates if the tile layer is visible or not.
    * @returns A boolean that indicates if the tile layer is visible or not.
    */
  def getVisible(): Boolean = js.native
  /**
    * Gets the zIndex of the tile layer.
    * @returns The zIndex of the tile layer.
    */
  def getZIndex(): Double = js.native
  /**
    * Sets the opacity of the tile layer. Value must be a number between 0 and 1.
    * @param opacity The opacity of the tile layer. Value must be a number between 0 and 1.
    */
  def setOpacity(opacity: Double): Unit = js.native
  /**
    * Sets options for the tile layer.
    * @param options The options for the tile layer.
    */
  def setOptions(options: ITileLayerOptions): Unit = js.native
  /**
    * Sets the visibility of the tile layer.
    * @param show A boolean indicating if the tile layer should be visible or not.
    */
  def setVisible(show: Boolean): Unit = js.native
  /**
    * Sets the zIndex of the tile layer.
    * @param idx The zIndex of the tile layer.
    */
  def setZIndex(idx: Double): Unit = js.native
}

object TileLayer {
  @scala.inline
  def apply(
    getOpacity: () => Double,
    getTileSource: () => TileSource,
    getVisible: () => Boolean,
    getZIndex: () => Double,
    metadata: js.Any,
    setOpacity: Double => Unit,
    setOptions: ITileLayerOptions => Unit,
    setVisible: Boolean => Unit,
    setZIndex: Double => Unit
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getOpacity = js.Any.fromFunction0(getOpacity), getTileSource = js.Any.fromFunction0(getTileSource), getVisible = js.Any.fromFunction0(getVisible), getZIndex = js.Any.fromFunction0(getZIndex), metadata = metadata.asInstanceOf[js.Any], setOpacity = js.Any.fromFunction1(setOpacity), setOptions = js.Any.fromFunction1(setOptions), setVisible = js.Any.fromFunction1(setVisible), setZIndex = js.Any.fromFunction1(setZIndex))
    __obj.asInstanceOf[TileLayer]
  }
  @scala.inline
  implicit class TileLayerOps[Self <: TileLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTileSource(value: () => TileSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: ITileLayerOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetZIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

