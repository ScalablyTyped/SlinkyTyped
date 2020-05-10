package typingsSlinky.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import typingsSlinky.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGoogleAnalyticsBridge extends js.Object {
  def allowIDFA(trackerId: String, enabled: Boolean): Unit = js.native
  def dispatch(): js.Promise[Boolean] = js.native
  def getClientId(trackerId: String): js.Promise[String] = js.native
  def setAnonymizeIp(trackerId: String, enabled: Boolean): Unit = js.native
  def setAppName(trackerId: String, appName: String): Unit = js.native
  def setAppVersion(trackerId: String, appVersion: String): Unit = js.native
  def setClient(trackerId: String, clientId: String): Unit = js.native
  def setCurrency(trackerId: String, currencyCode: String): Unit = js.native
  def setSamplingRate(trackerId: String, sampleRate: Double): Unit = js.native
  def setTrackUncaughtExceptions(trackerId: String, enabled: Boolean): Unit = js.native
  def setUser(trackerId: String, userId: String): Unit = js.native
  def trackEvent(
    trackerId: String,
    category: String,
    action: String,
    label: String,
    value: String,
    payload: HitPayload
  ): Unit = js.native
  def trackException(trackerId: String, error: String, fatal: Boolean, payload: HitPayload): Unit = js.native
  def trackScreenView(trackerId: String, screenName: String, payload: HitPayload): Unit = js.native
  def trackSocialInteraction(trackerId: String, network: String, action: String, targetUrl: String, payload: HitPayload): Unit = js.native
  def trackTiming(
    trackerId: String,
    category: String,
    interval: Double,
    name: String,
    label: String,
    payload: HitPayload
  ): Unit = js.native
}

object IGoogleAnalyticsBridge {
  @scala.inline
  def apply(
    allowIDFA: (String, Boolean) => Unit,
    dispatch: () => js.Promise[Boolean],
    getClientId: String => js.Promise[String],
    setAnonymizeIp: (String, Boolean) => Unit,
    setAppName: (String, String) => Unit,
    setAppVersion: (String, String) => Unit,
    setClient: (String, String) => Unit,
    setCurrency: (String, String) => Unit,
    setSamplingRate: (String, Double) => Unit,
    setTrackUncaughtExceptions: (String, Boolean) => Unit,
    setUser: (String, String) => Unit,
    trackEvent: (String, String, String, String, String, HitPayload) => Unit,
    trackException: (String, String, Boolean, HitPayload) => Unit,
    trackScreenView: (String, String, HitPayload) => Unit,
    trackSocialInteraction: (String, String, String, String, HitPayload) => Unit,
    trackTiming: (String, String, Double, String, String, HitPayload) => Unit
  ): IGoogleAnalyticsBridge = {
    val __obj = js.Dynamic.literal(allowIDFA = js.Any.fromFunction2(allowIDFA), dispatch = js.Any.fromFunction0(dispatch), getClientId = js.Any.fromFunction1(getClientId), setAnonymizeIp = js.Any.fromFunction2(setAnonymizeIp), setAppName = js.Any.fromFunction2(setAppName), setAppVersion = js.Any.fromFunction2(setAppVersion), setClient = js.Any.fromFunction2(setClient), setCurrency = js.Any.fromFunction2(setCurrency), setSamplingRate = js.Any.fromFunction2(setSamplingRate), setTrackUncaughtExceptions = js.Any.fromFunction2(setTrackUncaughtExceptions), setUser = js.Any.fromFunction2(setUser), trackEvent = js.Any.fromFunction6(trackEvent), trackException = js.Any.fromFunction4(trackException), trackScreenView = js.Any.fromFunction3(trackScreenView), trackSocialInteraction = js.Any.fromFunction5(trackSocialInteraction), trackTiming = js.Any.fromFunction6(trackTiming))
    __obj.asInstanceOf[IGoogleAnalyticsBridge]
  }
  @scala.inline
  implicit class IGoogleAnalyticsBridgeOps[Self <: IGoogleAnalyticsBridge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowIDFA(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIDFA")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispatch(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClientId(value: String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAnonymizeIp(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnonymizeIp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAppName(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAppVersion(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppVersion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetClient(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClient")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCurrency(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrency")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSamplingRate(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSamplingRate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTrackUncaughtExceptions(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrackUncaughtExceptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetUser(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrackEvent(value: (String, String, String, String, String, HitPayload) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEvent")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withTrackException(value: (String, String, Boolean, HitPayload) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackException")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTrackScreenView(value: (String, String, HitPayload) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackScreenView")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTrackSocialInteraction(value: (String, String, String, String, HitPayload) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSocialInteraction")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withTrackTiming(value: (String, String, Double, String, String, HitPayload) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTiming")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

