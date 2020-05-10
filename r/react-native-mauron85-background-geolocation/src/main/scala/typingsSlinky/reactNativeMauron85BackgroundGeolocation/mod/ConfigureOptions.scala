package typingsSlinky.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureOptions extends js.Object {
  /**
    * Rate in milliseconds at which activity recognition occurs.
    * Larger values will result in fewer activity detections while improving battery life.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 10000
    */
  var activitiesInterval: js.UndefOr[Double] = js.native
  /**
    * Activity type.
    * Presumably, this affects iOS GPS algorithm.
    *
    * Possible values:
    * "AutomotiveNavigation", "OtherNavigation", "Fitness", "Other"
    *
    * Platform: iOS
    * Provider: all
    *
    * @default "OtherNavigation"
    * @see {@link https://apple.co/2oHofpH|Apple docs}
    */
  var activityType: js.UndefOr[iOSActivityType] = js.native
  /**
    * When enabled, the plugin will emit sounds for life-cycle events of background-geolocation! See debugging sounds table.
    *
    * Platform: all
    * Provider: all
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Desired accuracy in meters.
    *
    * Platform: all
    * Provider: all
    * Possible values:
    *  HIGH_ACCURACY,
    *  MEDIUM_ACCURACY,
    *  LOW_ACCURACY,
    *  PASSIVE_ACCURACY
    * Note: Accuracy has direct effect on power drain. Lower accuracy = lower power drain.
    *
    * @default MEDIUM_ACCURACY
    * @example
    * { desiredAccuracy: BackgroundGeolocation.LOW_ACCURACY }
    */
  var desiredAccuracy: js.UndefOr[AccuracyLevel] = js.native
  /**
    * The minimum distance (measured in meters) a device must move horizontally before an update event is generated.
    *
    * Platform: all
    * Provider: DISTANCE_FILTER, RAW
    *
    * @default 500
    * @see {@link https://apple.co/2oHo2CV|Apple docs}
    */
  var distanceFilter: js.UndefOr[Double] = js.native
  /**
    * Fastest rate in milliseconds at which your app can handle location updates.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 120000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var fastestInterval: js.UndefOr[Double] = js.native
  /**
    * Optional HTTP headers sent along in HTTP request.
    *
    * Platform: all
    * Provider: all
    */
  var httpHeaders: js.UndefOr[js.Any] = js.native
  /**
    * The minimum time interval between location updates in milliseconds.
    *
    * Platform: Android
    * Provider: all
    *
    * @default 60000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Set location provider
    *
    * Platform: all
    * Available providers:
    *  DISTANCE_FILTER_PROVIDER,
    *  ACTIVITY_PROVIDER
    *  RAW_PROVIDER
    *
    * @default DISTANCE_FILTER_PROVIDER
    * @example
    * { locationProvider: BackgroundGeolocation.RAW_PROVIDER }
    */
  var locationProvider: js.UndefOr[LocationProvider] = js.native
  /**
    * Limit maximum number of locations stored into db.
    *
    * Platform: all
    * Provider: all
    *
    * @default 10000
    */
  var maxLocations: js.UndefOr[Double] = js.native
  /**
    * The accent color (hex triplet) to use for notification.
    * Eg. <code>#4CAF50</code>.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconColor: js.UndefOr[String] = js.native
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconLarge: js.UndefOr[String] = js.native
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconSmall: js.UndefOr[String] = js.native
  /**
    * Custom notification text in the drawer.
    *
    * Platform: Android
    * Provider: all
    *
    * @default "ENABLED"
    */
  var notificationText: js.UndefOr[String] = js.native
  /**
    * Custom notification title in the drawer.
    *
    * Platform: Android
    * Provider: all
    * @default "Background tracking"
    */
  var notificationTitle: js.UndefOr[String] = js.native
  /**
    * Enable/disable local notifications when tracking and syncing locations.
    *
    * Platform: Android
    * Provider: all
    *
    * @default true
    */
  var notificationsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Pauses location updates when app is paused.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    * @see {@link https://apple.co/2CbjEW2|Apple docs}
    */
  var pauseLocationUpdates: js.UndefOr[Boolean] = js.native
  /**
    * Customization post template.
    *
    * Platform: all
    * Provider: all
    */
  var postTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Switch to less accurate significant changes and region monitory when in background.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    */
  var saveBatteryOnBackground: js.UndefOr[Boolean] = js.native
  /**
    * Allow location sync service to run in foreground state.
    * Foreground state also requires a notification to be presented to the user.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startForeground: js.UndefOr[Boolean] = js.native
  /**
    * Start background service on device boot.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * Stationary radius in meters.
    *
    * When stopped, the minimum distance the device must move beyond the stationary location for aggressive background-tracking to engage.
    * Platform: all
    * Provider: DISTANCE_FILTER
    *
    * @default 50
    */
  var stationaryRadius: js.UndefOr[Double] = js.native
  /**
    * @deprecated Stop location updates, when the STILL activity is detected.
    */
  var stopOnStillActivity: js.UndefOr[Boolean] = js.native
  /**
    * Enable this in order to force a stop() when the application terminated.
    * E.g. on iOS, double-tap home button, swipe away the app.
    *
    * Platform: all
    * Provider: all
    *
    * @default true
    */
  var stopOnTerminate: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how many previously failed locations will be sent to server at once.
    *
    * Platform: all
    * Provider: all
    *
    * @default 100
    */
  var syncThreshold: js.UndefOr[String] = js.native
  /**
    * Server url where to send fail to post locations
    *
    * Platform: all
    * Provider: all
    */
  var syncUrl: js.UndefOr[String] = js.native
  /**
    * Server url where to send HTTP POST with recorded locations
    *
    * Platform: all
    * Provider: all
    */
  var url: js.UndefOr[String] = js.native
}

object ConfigureOptions {
  @scala.inline
  def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivitiesInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activitiesInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivitiesInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activitiesInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityType(value: iOSActivityType): Self = {
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
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredAccuracy(value: AccuracyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFastestInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastestInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastestInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastestInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationProvider(value: LocationProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLocations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationIconLarge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIconLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationIconLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIconLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationIconSmall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIconSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationIconSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationIconSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationText")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseLocationUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseLocationUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseLocationUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseLocationUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withPostTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveBatteryOnBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBatteryOnBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveBatteryOnBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBatteryOnBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withStartForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startForeground")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOnBoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOnBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withStationaryRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stationaryRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStationaryRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stationaryRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnStillActivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnStillActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnStillActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnStillActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnTerminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncThreshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

