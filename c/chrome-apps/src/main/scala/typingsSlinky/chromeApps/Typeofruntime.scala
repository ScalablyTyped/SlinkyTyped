package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.AppView.EmbedRequest
import typingsSlinky.chromeApps.chrome.app.runtime.LaunchData
import typingsSlinky.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofruntime extends js.Object {
  /** @enum */
  val ActionType: AnonNEWNOTE = js.native
  /** @enum */
  val LaunchSource: AnonABOUTPAGE = js.native
  /** @enum */
  val PlayStoreStatus: AnonAVAILABLE = js.native
  /**
    * Fired when an embedding app requests to embed this app.
    * @since Chrome 43.
    * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
    */
  val onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]] = js.native
  /**
    * Fired when an app is launched from the launcher.
    */
  val onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]] = js.native
  /**
    * Fired at Chrome startup to apps that were running when Chrome last shut down,
    * or when apps have been requested to restart from their previous state for other reasons
    * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
    * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
    */
  val onRestarted: Event[js.Function0[Unit]] = js.native
}

object Typeofruntime {
  @scala.inline
  def apply(
    ActionType: AnonNEWNOTE,
    LaunchSource: AnonABOUTPAGE,
    PlayStoreStatus: AnonAVAILABLE,
    onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]],
    onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]],
    onRestarted: Event[js.Function0[Unit]]
  ): Typeofruntime = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], LaunchSource = LaunchSource.asInstanceOf[js.Any], PlayStoreStatus = PlayStoreStatus.asInstanceOf[js.Any], onEmbedRequested = onEmbedRequested.asInstanceOf[js.Any], onLaunched = onLaunched.asInstanceOf[js.Any], onRestarted = onRestarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofruntime]
  }
  @scala.inline
  implicit class TypeofruntimeOps[Self <: Typeofruntime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: AnonNEWNOTE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchSource(value: AnonABOUTPAGE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayStoreStatus(value: AnonAVAILABLE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayStoreStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEmbedRequested(value: Event[js.Function1[/* request */ EmbedRequest, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmbedRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLaunched(value: Event[js.Function1[/* launchData */ LaunchData, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRestarted(value: Event[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRestarted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

