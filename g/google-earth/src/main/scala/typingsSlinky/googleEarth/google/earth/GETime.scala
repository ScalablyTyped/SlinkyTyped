package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GETime extends StObject {
  
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
  implicit class GETimeMutableBuilder[Self <: GETime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetControl(value: () => GETimeControl): Self = StObject.set(x, "getControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHistoricalImageryEnabled(value: () => Boolean): Self = StObject.set(x, "getHistoricalImageryEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRate(value: () => Double): Self = StObject.set(x, "getRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSystemTime(value: () => KmlTimeStamp): Self = StObject.set(x, "getSystemTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimePrimitive(value: () => KmlTimePrimitive): Self = StObject.set(x, "getTimePrimitive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHistoricalImageryEnabled(value: Boolean => Unit): Self = StObject.set(x, "setHistoricalImageryEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRate(value: Double => Unit): Self = StObject.set(x, "setRate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimePrimitive(value: KmlTimePrimitive => Unit): Self = StObject.set(x, "setTimePrimitive", js.Any.fromFunction1(value))
  }
}
