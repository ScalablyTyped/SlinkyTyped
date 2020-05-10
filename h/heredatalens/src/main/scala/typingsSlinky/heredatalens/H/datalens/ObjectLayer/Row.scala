package typingsSlinky.heredatalens.H.datalens.ObjectLayer

import typingsSlinky.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is translated to map objects with the rowToMapObject callback. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
@js.native
trait Row extends js.Object {
  var lat: Double = js.native
  var lng: Double = js.native
  def getPosition(): Point = js.native
  def isCluster(): Boolean = js.native
}

object Row {
  @scala.inline
  def apply(getPosition: () => Point, isCluster: () => Boolean, lat: Double, lng: Double): Row = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), isCluster = js.Any.fromFunction0(isCluster), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPosition(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCluster(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCluster")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLng(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

