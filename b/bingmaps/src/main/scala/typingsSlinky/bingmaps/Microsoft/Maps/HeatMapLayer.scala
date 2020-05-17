package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMapLayer extends IDataLayer {
  /** Disposes the heat map layer. */
  def dispose(): Unit = js.native
  /**
    * Gets a boolean indicating if the heat map layer is visible or not.
    * @returns A boolean indicating if the heat map layer is visible or not.
    */
  def getVisible(): Boolean = js.native
  /** 
    * @deprecated
    * Hides the heat map layer.
    */
  def hide(): Unit = js.native
  /**
    * Specifies the locations to use when generating the heat map.
    * @param locations Set of locations.
    */
  def setLocations(locations: js.Array[Location | Pushpin]): Unit = js.native
  /**
    * Sets the options to use with the heat map layer.
    * @param options Set of heat map layer options.
    */
  def setOptions(options: IHeatMapLayerOptions): Unit = js.native
  /**
    * Sets the visibility of the heat map layer.
    * @param visible A boolean indicating if the heat map layer is visible or not.
    */
  def setVisible(visible: Boolean): Unit = js.native
  /** 
    * @deprecated
    * Shows the heat map layer.
    */
  def show(): Unit = js.native
}

object HeatMapLayer {
  @scala.inline
  def apply(
    clear: () => Unit,
    dispose: () => Unit,
    getVisible: () => Boolean,
    hide: () => Unit,
    setLocations: js.Array[Location | Pushpin] => Unit,
    setOptions: IHeatMapLayerOptions => Unit,
    setVisible: Boolean => Unit,
    show: () => Unit
  ): HeatMapLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), getVisible = js.Any.fromFunction0(getVisible), hide = js.Any.fromFunction0(hide), setLocations = js.Any.fromFunction1(setLocations), setOptions = js.Any.fromFunction1(setOptions), setVisible = js.Any.fromFunction1(setVisible), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[HeatMapLayer]
  }
  @scala.inline
  implicit class HeatMapLayerOps[Self <: HeatMapLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLocations(value: js.Array[Location | Pushpin] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: IHeatMapLayerOptions => Unit): Self = {
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
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

