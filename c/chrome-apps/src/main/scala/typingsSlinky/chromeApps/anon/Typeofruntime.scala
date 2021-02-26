package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.AppView.EmbedRequest
import typingsSlinky.chromeApps.chrome.app.runtime.LaunchData
import typingsSlinky.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofruntime extends StObject {
  
  /** @enum */
  val ActionType: NEWNOTE = js.native
  
  /** @enum */
  val LaunchSource: ABOUTPAGE = js.native
  
  /** @enum */
  val PlayStoreStatus: AVAILABLE = js.native
  
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
    ActionType: NEWNOTE,
    LaunchSource: ABOUTPAGE,
    PlayStoreStatus: AVAILABLE,
    onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]],
    onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]],
    onRestarted: Event[js.Function0[Unit]]
  ): Typeofruntime = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], LaunchSource = LaunchSource.asInstanceOf[js.Any], PlayStoreStatus = PlayStoreStatus.asInstanceOf[js.Any], onEmbedRequested = onEmbedRequested.asInstanceOf[js.Any], onLaunched = onLaunched.asInstanceOf[js.Any], onRestarted = onRestarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofruntime]
  }
  
  @scala.inline
  implicit class TypeofruntimeMutableBuilder[Self <: Typeofruntime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: NEWNOTE): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchSource(value: ABOUTPAGE): Self = StObject.set(x, "LaunchSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEmbedRequested(value: Event[js.Function1[/* request */ EmbedRequest, Unit]]): Self = StObject.set(x, "onEmbedRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLaunched(value: Event[js.Function1[/* launchData */ LaunchData, Unit]]): Self = StObject.set(x, "onLaunched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRestarted(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onRestarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayStoreStatus(value: AVAILABLE): Self = StObject.set(x, "PlayStoreStatus", value.asInstanceOf[js.Any])
  }
}
