package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceMotionService extends js.Object {
  def clearWatch(watchId: Double): Unit = js.native
  def getCurrentAcceleration(): IPromise[IDeviceMotionAcceleration] = js.native
  def watchAcceleration(options: IDeviceMotionAccelerometerOptions): IDeviceMotionWatchPromise = js.native
}

object IDeviceMotionService {
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentAcceleration: () => IPromise[IDeviceMotionAcceleration],
    watchAcceleration: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise
  ): IDeviceMotionService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentAcceleration = js.Any.fromFunction0(getCurrentAcceleration), watchAcceleration = js.Any.fromFunction1(watchAcceleration))
    __obj.asInstanceOf[IDeviceMotionService]
  }
  @scala.inline
  implicit class IDeviceMotionServiceOps[Self <: IDeviceMotionService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearWatch(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearWatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentAcceleration(value: () => IPromise[IDeviceMotionAcceleration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentAcceleration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWatchAcceleration(value: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchAcceleration")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

