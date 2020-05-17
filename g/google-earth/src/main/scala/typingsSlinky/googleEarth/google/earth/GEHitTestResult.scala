package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEHitTestResult extends js.Object {
  /**
    * Altitude of sampled point.
    */
  def getAltitude(): Double = js.native
  /**
    * Latitude of sampled point.
    */
  def getLatitude(): Double = js.native
  /**
    * Longitude of sampled point.
    */
  def getLongitude(): Double = js.native
  /**
    * Altitude of sampled point.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Latitude of sampled point.
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * Longitude of sampled point.
    */
  def setLongitude(longitude: Double): Unit = js.native
}

object GEHitTestResult {
  @scala.inline
  def apply(
    getAltitude: () => Double,
    getLatitude: () => Double,
    getLongitude: () => Double,
    setAltitude: Double => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit
  ): GEHitTestResult = {
    val __obj = js.Dynamic.literal(getAltitude = js.Any.fromFunction0(getAltitude), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), setAltitude = js.Any.fromFunction1(setAltitude), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude))
    __obj.asInstanceOf[GEHitTestResult]
  }
  @scala.inline
  implicit class GEHitTestResultOps[Self <: GEHitTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAltitude(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAltitude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLatitude(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLatitude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLongitude(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLongitude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAltitude(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAltitude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLatitude(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLatitude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLongitude(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLongitude")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

