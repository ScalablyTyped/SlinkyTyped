package typingsSlinky.leafletAreaselect.mod

import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaSelect_ extends js.Object {
  def addTo(map: Map_): Map_ = js.native
  def getBounds(): LatLngBounds_ = js.native
  def remove(): Unit = js.native
  def setDimensions(dim: Dimension): Unit = js.native
}

object AreaSelect_ {
  @scala.inline
  def apply(
    addTo: Map_ => Map_,
    getBounds: () => LatLngBounds_,
    remove: () => Unit,
    setDimensions: Dimension => Unit
  ): AreaSelect_ = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), getBounds = js.Any.fromFunction0(getBounds), remove = js.Any.fromFunction0(remove), setDimensions = js.Any.fromFunction1(setDimensions))
    __obj.asInstanceOf[AreaSelect_]
  }
  @scala.inline
  implicit class AreaSelect_Ops[Self <: AreaSelect_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTo(value: Map_ => Map_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBounds(value: () => LatLngBounds_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDimensions(value: Dimension => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDimensions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

