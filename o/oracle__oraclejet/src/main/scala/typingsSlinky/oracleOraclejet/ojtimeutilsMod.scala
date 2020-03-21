package typingsSlinky.oracleOraclejet

import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojtimeutils", JSImport.Namespace)
@js.native
object ojtimeutilsMod extends js.Object {
  def getDate(pos: Double, rangeStartTime: String, rangeEndTime: String, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: String, rangeEndTime: Double, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: String, rangeEndTime: Date, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Double, rangeEndTime: String, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Double, rangeEndTime: Double, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Double, rangeEndTime: Date, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Date, rangeEndTime: String, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Date, rangeEndTime: Double, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Date, rangeEndTime: Date, rangeWidth: Double): Double = js.native
  def getLength(
    startTime: js.Date | String | Double,
    endTime: js.Date | String | Double,
    rangeStartTime: js.Date | String | Double,
    rangeEndTime: js.Date | String | Double,
    rangeWidth: Double
  ): Double = js.native
  def getPosition(
    time: js.Date | String | Double,
    rangeStartTime: js.Date | String | Double,
    rangeEndTime: js.Date | String | Double,
    rangeWidth: Double
  ): Double = js.native
}

