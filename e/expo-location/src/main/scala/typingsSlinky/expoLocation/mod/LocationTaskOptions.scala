package typingsSlinky.expoLocation.mod

import typingsSlinky.expoLocation.AnonNotificationBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationTaskOptions extends js.Object {
  var accuracy: js.UndefOr[LocationAccuracy] = js.native
  var activityType: js.UndefOr[LocationActivityType] = js.native
  var deferredUpdatesDistance: js.UndefOr[Double] = js.native
  var deferredUpdatesInterval: js.UndefOr[Double] = js.native
  var deferredUpdatesTimeout: js.UndefOr[Double] = js.native
  var distanceInterval: js.UndefOr[Double] = js.native
  var foregroundService: js.UndefOr[AnonNotificationBody] = js.native
  var pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.native
  var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.native
  var timeInterval: js.UndefOr[Double] = js.native
}

object LocationTaskOptions {
  @scala.inline
  def apply(): LocationTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationTaskOptions]
  }
  @scala.inline
  implicit class LocationTaskOptionsOps[Self <: LocationTaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: LocationAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityType(value: LocationActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredUpdatesDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredUpdatesDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredUpdatesDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredUpdatesDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredUpdatesInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredUpdatesInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredUpdatesInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredUpdatesInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredUpdatesTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredUpdatesTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredUpdatesTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredUpdatesTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withForegroundService(value: AnonNotificationBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundService")(js.undefined)
        ret
    }
    @scala.inline
    def withPausesUpdatesAutomatically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausesUpdatesAutomatically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPausesUpdatesAutomatically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausesUpdatesAutomatically")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsBackgroundLocationIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsBackgroundLocationIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsBackgroundLocationIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsBackgroundLocationIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(js.undefined)
        ret
    }
  }
  
}

