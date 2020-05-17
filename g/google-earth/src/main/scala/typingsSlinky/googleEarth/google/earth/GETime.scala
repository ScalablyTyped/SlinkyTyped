package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GETime extends js.Object {
  /**
    * Returns the GETimeControl object; this is the time slider.
    */
  def getControl(): GETimeControl = js.native
  /**
    * Whether or not historical imagery is enabled.
    */
  def getHistoricalImageryEnabled(): Boolean = js.native
  /**
    * Get the current plugin clock rate.
    */
  def getRate(): Double = js.native
  /**
    * Returns the current computer clock time as a KmlTimeStamp object.
    */
  def getSystemTime(): KmlTimeStamp = js.native
  /**
    * Get the current plugin time as a KmlTimeStamp or KmlTimeSpan.
    */
  def getTimePrimitive(): KmlTimePrimitive = js.native
  /**
    * Turn historical imagery on or off.
    * For more information, read the Time chapter of the Developer's Guide.
    */
  def setHistoricalImageryEnabled(historicalImageryEnabled: Boolean): Unit = js.native
  /**
    * Set the plugin's clock rate.
    * A value of 1 corresponds with real time; to pass one year in the plugin for every real second, set the rate to 31536000 (60 times 60 times 24 times 365).
    */
  def setRate(rate: Double): Unit = js.native
  /**
    * Sets the current plugin time.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit = js.native
}

object GETime {
  @scala.inline
  def apply(
    getControl: () => GETimeControl,
    getHistoricalImageryEnabled: () => Boolean,
    getRate: () => Double,
    getSystemTime: () => KmlTimeStamp,
    getTimePrimitive: () => KmlTimePrimitive,
    setHistoricalImageryEnabled: Boolean => Unit,
    setRate: Double => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit
  ): GETime = {
    val __obj = js.Dynamic.literal(getControl = js.Any.fromFunction0(getControl), getHistoricalImageryEnabled = js.Any.fromFunction0(getHistoricalImageryEnabled), getRate = js.Any.fromFunction0(getRate), getSystemTime = js.Any.fromFunction0(getSystemTime), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), setHistoricalImageryEnabled = js.Any.fromFunction1(setHistoricalImageryEnabled), setRate = js.Any.fromFunction1(setRate), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive))
    __obj.asInstanceOf[GETime]
  }
  @scala.inline
  implicit class GETimeOps[Self <: GETime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetControl(value: () => GETimeControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHistoricalImageryEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHistoricalImageryEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRate(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSystemTime(value: () => KmlTimeStamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSystemTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimePrimitive(value: () => KmlTimePrimitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimePrimitive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetHistoricalImageryEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHistoricalImageryEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTimePrimitive(value: KmlTimePrimitive => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimePrimitive")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

