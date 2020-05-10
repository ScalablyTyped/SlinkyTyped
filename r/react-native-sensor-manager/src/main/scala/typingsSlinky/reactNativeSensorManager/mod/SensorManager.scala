package typingsSlinky.reactNativeSensorManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensorManager extends js.Object {
  def startAccelerometer(delay: Double): Unit = js.native
  def startGyroscope(delay: Double): Unit = js.native
  def startLightSensor(delay: Double): Unit = js.native
  def startMagnetometer(delay: Double): Unit = js.native
  def startMotionValue(delay: Double): Unit = js.native
  def startOrientation(delay: Double): Unit = js.native
  def startProximity(delay: Double): Unit = js.native
  def startStepCounter(delay: Double): Unit = js.native
  def startThermometer(delay: Double): Unit = js.native
  def stopAccelerometer(): Unit = js.native
  def stopGyroscope(): Unit = js.native
  def stopLightSensor(): Unit = js.native
  def stopMagnetometer(): Unit = js.native
  def stopMotionValue(): Unit = js.native
  def stopOrientation(): Unit = js.native
  def stopProximity(): Unit = js.native
  def stopStepCounter(): Unit = js.native
  def stopThermometer(): Unit = js.native
}

object SensorManager {
  @scala.inline
  def apply(
    startAccelerometer: Double => Unit,
    startGyroscope: Double => Unit,
    startLightSensor: Double => Unit,
    startMagnetometer: Double => Unit,
    startMotionValue: Double => Unit,
    startOrientation: Double => Unit,
    startProximity: Double => Unit,
    startStepCounter: Double => Unit,
    startThermometer: Double => Unit,
    stopAccelerometer: () => Unit,
    stopGyroscope: () => Unit,
    stopLightSensor: () => Unit,
    stopMagnetometer: () => Unit,
    stopMotionValue: () => Unit,
    stopOrientation: () => Unit,
    stopProximity: () => Unit,
    stopStepCounter: () => Unit,
    stopThermometer: () => Unit
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1(startAccelerometer), startGyroscope = js.Any.fromFunction1(startGyroscope), startLightSensor = js.Any.fromFunction1(startLightSensor), startMagnetometer = js.Any.fromFunction1(startMagnetometer), startMotionValue = js.Any.fromFunction1(startMotionValue), startOrientation = js.Any.fromFunction1(startOrientation), startProximity = js.Any.fromFunction1(startProximity), startStepCounter = js.Any.fromFunction1(startStepCounter), startThermometer = js.Any.fromFunction1(startThermometer), stopAccelerometer = js.Any.fromFunction0(stopAccelerometer), stopGyroscope = js.Any.fromFunction0(stopGyroscope), stopLightSensor = js.Any.fromFunction0(stopLightSensor), stopMagnetometer = js.Any.fromFunction0(stopMagnetometer), stopMotionValue = js.Any.fromFunction0(stopMotionValue), stopOrientation = js.Any.fromFunction0(stopOrientation), stopProximity = js.Any.fromFunction0(stopProximity), stopStepCounter = js.Any.fromFunction0(stopStepCounter), stopThermometer = js.Any.fromFunction0(stopThermometer))
    __obj.asInstanceOf[SensorManager]
  }
  @scala.inline
  implicit class SensorManagerOps[Self <: SensorManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartAccelerometer(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAccelerometer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartGyroscope(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startGyroscope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartLightSensor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLightSensor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartMagnetometer(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMagnetometer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartMotionValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMotionValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartOrientation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOrientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartProximity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startProximity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartStepCounter(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStepCounter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartThermometer(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startThermometer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopAccelerometer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAccelerometer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopGyroscope(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopGyroscope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopLightSensor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopLightSensor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopMagnetometer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopMagnetometer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopMotionValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopMotionValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopOrientation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopProximity(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopProximity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopStepCounter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopStepCounter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopThermometer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopThermometer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

