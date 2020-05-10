package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceOrientationService extends js.Object {
  def clearWatch(watchID: Double): Unit = js.native
  def getCurrentHeading(): IPromise[IDeviceOrientationHeading] = js.native
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise = js.native
}

object IDeviceOrientationService {
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentHeading: () => IPromise[IDeviceOrientationHeading],
    watchHeading: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentHeading = js.Any.fromFunction0(getCurrentHeading), watchHeading = js.Any.fromFunction1(watchHeading))
    __obj.asInstanceOf[IDeviceOrientationService]
  }
  @scala.inline
  implicit class IDeviceOrientationServiceOps[Self <: IDeviceOrientationService] (val x: Self) extends AnyVal {
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
    def withGetCurrentHeading(value: () => IPromise[IDeviceOrientationHeading]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentHeading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWatchHeading(value: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchHeading")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

