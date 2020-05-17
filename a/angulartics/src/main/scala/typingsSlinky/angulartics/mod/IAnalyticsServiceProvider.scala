package typingsSlinky.angulartics.mod

import typingsSlinky.angular.mod.ILocationService
import typingsSlinky.angular.mod.IServiceProvider
import typingsSlinky.angulartics.anon.BufferFlushDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnalyticsServiceProvider extends IServiceProvider {
  var settings: BufferFlushDelay = js.native
  def developerMode(value: Boolean): Unit = js.native
  def excludeRoutes(value: js.Array[String]): Unit = js.native
  def firstPageview(value: Boolean): Unit = js.native
  def queryKeysBlacklist(keys: js.Array[String]): Unit = js.native
  def queryKeysWhitelist(keys: js.Array[String]): Unit = js.native
  def registerClearCookies(callback: js.Any): Unit = js.native
  def registerEventTrack(callback: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], _]): Unit = js.native
  def registerIncrementProperty(callback: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], _]): Unit = js.native
  def registerPageTrack(callback: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], _]): Unit = js.native
  def registerSetAlias(callback: js.Function1[/* alias */ String, _]): Unit = js.native
  def registerSetSuperProperties(callback: js.Function1[/* superProperties */ js.Any, _]): Unit = js.native
  def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ js.Any, _]): Unit = js.native
  def registerSetUserProperties(callback: js.Function1[/* userProperties */ js.Any, _]): Unit = js.native
  def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ js.Any, _]): Unit = js.native
  def registerSetUsername(callback: js.Function1[/* username */ String, _]): Unit = js.native
  def registerTransactionTrack(callback: js.Any): Unit = js.native
  def registerUserTimings(callback: js.Function1[/* properties */ js.Any, _]): Unit = js.native
  def trackExceptions(value: Boolean): Unit = js.native
  def trackRoutes(value: Boolean): Unit = js.native
  def trackStates(value: Boolean): Unit = js.native
  def virtualPageviews(value: Boolean): Unit = js.native
  def withAutoBase(value: Boolean): Unit = js.native
  def withBase(value: Boolean): Unit = js.native
}

object IAnalyticsServiceProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    developerMode: Boolean => Unit,
    excludeRoutes: js.Array[String] => Unit,
    firstPageview: Boolean => Unit,
    queryKeysBlacklist: js.Array[String] => Unit,
    queryKeysWhitelist: js.Array[String] => Unit,
    registerClearCookies: js.Any => Unit,
    registerEventTrack: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], _] => Unit,
    registerIncrementProperty: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], _] => Unit,
    registerPageTrack: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], _] => Unit,
    registerSetAlias: js.Function1[/* alias */ String, _] => Unit,
    registerSetSuperProperties: js.Function1[/* superProperties */ js.Any, _] => Unit,
    registerSetSuperPropertiesOnce: js.Function1[/* superProperties */ js.Any, _] => Unit,
    registerSetUserProperties: js.Function1[/* userProperties */ js.Any, _] => Unit,
    registerSetUserPropertiesOnce: js.Function1[/* userProperties */ js.Any, _] => Unit,
    registerSetUsername: js.Function1[/* username */ String, _] => Unit,
    registerTransactionTrack: js.Any => Unit,
    registerUserTimings: js.Function1[/* properties */ js.Any, _] => Unit,
    settings: BufferFlushDelay,
    trackExceptions: Boolean => Unit,
    trackRoutes: Boolean => Unit,
    trackStates: Boolean => Unit,
    virtualPageviews: Boolean => Unit,
    withAutoBase: Boolean => Unit,
    withBase: Boolean => Unit
  ): IAnalyticsServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], developerMode = js.Any.fromFunction1(developerMode), excludeRoutes = js.Any.fromFunction1(excludeRoutes), firstPageview = js.Any.fromFunction1(firstPageview), queryKeysBlacklist = js.Any.fromFunction1(queryKeysBlacklist), queryKeysWhitelist = js.Any.fromFunction1(queryKeysWhitelist), registerClearCookies = js.Any.fromFunction1(registerClearCookies), registerEventTrack = js.Any.fromFunction1(registerEventTrack), registerIncrementProperty = js.Any.fromFunction1(registerIncrementProperty), registerPageTrack = js.Any.fromFunction1(registerPageTrack), registerSetAlias = js.Any.fromFunction1(registerSetAlias), registerSetSuperProperties = js.Any.fromFunction1(registerSetSuperProperties), registerSetSuperPropertiesOnce = js.Any.fromFunction1(registerSetSuperPropertiesOnce), registerSetUserProperties = js.Any.fromFunction1(registerSetUserProperties), registerSetUserPropertiesOnce = js.Any.fromFunction1(registerSetUserPropertiesOnce), registerSetUsername = js.Any.fromFunction1(registerSetUsername), registerTransactionTrack = js.Any.fromFunction1(registerTransactionTrack), registerUserTimings = js.Any.fromFunction1(registerUserTimings), settings = settings.asInstanceOf[js.Any], trackExceptions = js.Any.fromFunction1(trackExceptions), trackRoutes = js.Any.fromFunction1(trackRoutes), trackStates = js.Any.fromFunction1(trackStates), virtualPageviews = js.Any.fromFunction1(virtualPageviews), withAutoBase = js.Any.fromFunction1(withAutoBase), withBase = js.Any.fromFunction1(withBase))
    __obj.asInstanceOf[IAnalyticsServiceProvider]
  }
  @scala.inline
  implicit class IAnalyticsServiceProviderOps[Self <: IAnalyticsServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperMode(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRoutes(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRoutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstPageview(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueryKeysBlacklist(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKeysBlacklist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueryKeysWhitelist(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKeysWhitelist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterClearCookies(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerClearCookies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterEventTrack(value: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEventTrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterIncrementProperty(value: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerIncrementProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterPageTrack(value: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerPageTrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSetAlias(value: js.Function1[/* alias */ String, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSetAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSetSuperProperties(value: js.Function1[/* superProperties */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSetSuperProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSetSuperPropertiesOnce(value: js.Function1[/* superProperties */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSetSuperPropertiesOnce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSetUserProperties(value: js.Function1[/* userProperties */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSetUserProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSetUserPropertiesOnce(value: js.Function1[/* userProperties */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSetUserPropertiesOnce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSetUsername(value: js.Function1[/* username */ String, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSetUsername")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterTransactionTrack(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTransactionTrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterUserTimings(value: js.Function1[/* properties */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerUserTimings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: BufferFlushDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackExceptions(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackExceptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackRoutes(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRoutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackStates(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVirtualPageviews(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualPageviews")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithAutoBase(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAutoBase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithBase(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBase")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

