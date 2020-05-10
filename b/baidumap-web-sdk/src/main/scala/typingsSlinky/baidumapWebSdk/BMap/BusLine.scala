package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusLine extends js.Object {
  var company: String = js.native
  var endTime: String = js.native
  var name: String = js.native
  var startTime: String = js.native
  def getBusStation(i: Double): BusStation = js.native
  def getNumBusStations(): String = js.native
  def getPath(): js.Array[Point] = js.native
  def getPolyline(): Polyline = js.native
}

object BusLine {
  @scala.inline
  def apply(
    company: String,
    endTime: String,
    getBusStation: Double => BusStation,
    getNumBusStations: () => String,
    getPath: () => js.Array[Point],
    getPolyline: () => Polyline,
    name: String,
    startTime: String
  ): BusLine = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], getBusStation = js.Any.fromFunction1(getBusStation), getNumBusStations = js.Any.fromFunction0(getNumBusStations), getPath = js.Any.fromFunction0(getPath), getPolyline = js.Any.fromFunction0(getPolyline), name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusLine]
  }
  @scala.inline
  implicit class BusLineOps[Self <: BusLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBusStation(value: Double => BusStation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBusStation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumBusStations(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumBusStations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPath(value: () => js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPolyline(value: () => Polyline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolyline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

