package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndoorMap extends js.Object {
  def getOpacity(): Double = js.native
  def getSelectedBuilding(): String = js.native
  def getSelectedBuildingId(): String = js.native
  def hide(): Unit = js.native
  def hideFloorBar(): Unit = js.native
  def hideLabels(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOpacity(alpha: Double): Unit = js.native
  def setzIndex(): Unit = js.native
  def show(): Unit = js.native
  def showFloor(floor: Double, noMove: Boolean): Unit = js.native
  def showFloorBar(): Unit = js.native
  def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit = js.native
  def showLabels(): Unit = js.native
}

object IndoorMap {
  @scala.inline
  def apply(
    getOpacity: () => Double,
    getSelectedBuilding: () => String,
    getSelectedBuildingId: () => String,
    hide: () => Unit,
    hideFloorBar: () => Unit,
    hideLabels: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setzIndex: () => Unit,
    show: () => Unit,
    showFloor: (Double, Boolean) => Unit,
    showFloorBar: () => Unit,
    showIndoorMap: (String, Double, String) => Unit,
    showLabels: () => Unit
  ): IndoorMap = {
    val __obj = js.Dynamic.literal(getOpacity = js.Any.fromFunction0(getOpacity), getSelectedBuilding = js.Any.fromFunction0(getSelectedBuilding), getSelectedBuildingId = js.Any.fromFunction0(getSelectedBuildingId), hide = js.Any.fromFunction0(hide), hideFloorBar = js.Any.fromFunction0(hideFloorBar), hideLabels = js.Any.fromFunction0(hideLabels), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setzIndex = js.Any.fromFunction0(setzIndex), show = js.Any.fromFunction0(show), showFloor = js.Any.fromFunction2(showFloor), showFloorBar = js.Any.fromFunction0(showFloorBar), showIndoorMap = js.Any.fromFunction3(showIndoorMap), showLabels = js.Any.fromFunction0(showLabels))
    __obj.asInstanceOf[IndoorMap]
  }
  @scala.inline
  implicit class IndoorMapOps[Self <: IndoorMap] (val x: Self) extends AnyVal {
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
    def withGetSelectedBuilding(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedBuilding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedBuildingId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedBuildingId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideFloorBar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFloorBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideLabels(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMap(value: Map => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetzIndex(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setzIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowFloor(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFloor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowFloorBar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFloorBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowIndoorMap(value: (String, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndoorMap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShowLabels(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

